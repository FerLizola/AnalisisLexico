package analisislexico;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;
import javax.swing.text.JTextComponent;


public class LineNumber extends JPanel implements CaretListener, DocumentListener {
    
    public final static float LEFT = 0.0f;
    public final static float CENTER = 0.5f;
    public final static float RIGHT = 1.0f;
    private final static Border OUTER = new MatteBorder(0, 0, 0, 2, Color.GRAY);
    private final static int HEIGHT = Integer.MAX_VALUE - 1000000;
    private JTextComponent component;
    private int borderGap;
    private Color currentLineForeground;
    private float digitAlignment;
    private int minimumDisplayDigits;
    private int lastDigits;
    private int lastHeight;
    private int lastLine;
    
    public LineNumber(final JTextComponent component) {
        this(component, 3);
    }
    
    public LineNumber(final JTextComponent component, final int minimumDisplayDigits) {
        this.component = component;
        setFont(component.getFont());
        setBorderGap(5);
        setCurrentLineForeground(Color.RED);
        setDigitAlignment(RIGHT);
        setMinimumDisplayDigits(minimumDisplayDigits);
        component.getDocument().addDocumentListener(this);
        component.addCaretListener(this);
    }
    
    public int getBorderGap() {
        return this.borderGap;
    }
    
    public void setBorderGap(final int borderGap) {
        this.borderGap = borderGap;
        Border inner = new EmptyBorder(0, borderGap, 0, borderGap);
        setBorder(new CompoundBorder(OUTER, inner));
        this.lastDigits = 0;
        setPreferredWidth();
    }
    
    public Color getCurrentLineForeground() {
        return this.currentLineForeground == null ? getForeground() : this.currentLineForeground;
    }
    
    public void setCurrentLineForeground(final Color currentLineForeground) {
        this.currentLineForeground = currentLineForeground;
    }
    
    public float getDigitAlignment() {
        return this.digitAlignment;
    }
    
    public void setDigitAlignment(final float digitAlignment) {
        this.digitAlignment = digitAlignment > 1.0f ? 1.0f : digitAlignment < 0.0f ? -1.0f : digitAlignment;
    }
    
    public int getMinimumDisplayDigits() {
        return this.minimumDisplayDigits;
    }
    
    public void setMinimumDisplayDigits(final int minimumDisplayDigits) {
        this.minimumDisplayDigits = minimumDisplayDigits;
        setPreferredWidth();
    }
    
    private void setPreferredWidth() {
        Element root = this.component.getDocument().getDefaultRootElement();
        int lines = root.getElementCount();
        int digits = Math.max(String.valueOf(lines).length(), this.minimumDisplayDigits);

        if (this.lastDigits != digits) {
            this.lastDigits = digits;
            FontMetrics fontMetrics = getFontMetrics(getFont());
            int width = fontMetrics.charWidth('0') * digits;
            Insets insets = getInsets();
            int preferredWidth = insets.left + insets.right + width;
            Dimension d = getPreferredSize();
            d.setSize(preferredWidth, HEIGHT);
            setPreferredSize(d);
            setSize(d);
        }
    }

    @Override
    public void paintComponent(final Graphics g) {
        super.paintComponent(g);

        FontMetrics fontMetrics = getFontMetrics(getFont());
        Insets insets = getInsets();
        int availableWidth = getSize().width - insets.left - insets.right;

        Rectangle clip = g.getClipBounds();
        int lineHeight = fontMetrics.getHeight();
        int startOffset = this.component.getInsets().top + fontMetrics.getAscent();
        int linesToDraw = clip.height / lineHeight + 1;
        int y = (clip.y / lineHeight) * lineHeight + startOffset;

        Point viewPoint = new Point(0, y);
        int preferredHeight = this.component.getPreferredSize().height;

        for (int i = 0; i <= linesToDraw; i++) {
	if (isCurrentLine(viewPoint))
                    g.setColor(getCurrentLineForeground());
                else
                    g.setColor(getForeground());

        String lineNumber = getLineNumber(viewPoint, preferredHeight);
        int stringWidth = fontMetrics.stringWidth(lineNumber);
        int x = getOffsetX(availableWidth, stringWidth) + insets.left;
        g.drawString(lineNumber, x, y);

        y += lineHeight;
        viewPoint.y = y;

        if (y > preferredHeight)
            break;
        }
    }
        
    private boolean isCurrentLine(final Point viewPoint) {
        int offset = this.component.viewToModel(viewPoint);
        int caretPosition = this.component.getCaretPosition();
        Element root = this.component.getDocument().getDefaultRootElement();
        if (root.getElementIndex(offset) == root.getElementIndex(caretPosition))
            return true;
        else
            return false;
    }
    
    protected String getLineNumber(final Point viewPoint, final int preferredHeight) {
        int offset = this.component.viewToModel(viewPoint);
        Element root = this.component.getDocument().getDefaultRootElement();
        int index = root.getElementIndex(offset);
        Element line = root.getElement(index);
        if (line.getStartOffset() == offset)
            return String.valueOf(index + 1);
        else
            return "";
    }
    
    private int getOffsetX(final int availableWidth, final int stringWidth) {
        return (int) ((availableWidth - stringWidth) * this.digitAlignment);
    }
    
    @Override
    public void caretUpdate(final CaretEvent e) {
        int caretPosition = this.component.getCaretPosition();
        Element root = this.component.getDocument().getDefaultRootElement();
        int currentLine = root.getElementIndex(caretPosition);
        if (this.lastLine != currentLine) {
            repaint();
            this.lastLine = currentLine;
        }
    }
    
    @Override
    public void changedUpdate(final DocumentEvent e) {}

    @Override
    public void insertUpdate(final DocumentEvent e) {
        documentChanged();
    }

    @Override
    public void removeUpdate(final DocumentEvent e) {
        documentChanged();
    }
    
    private void documentChanged() {
        SwingUtilities.invokeLater(new Runnable() {
        public void run() {
            int preferredHeight = LineNumber.this.component.getPreferredSize().height;
                if (LineNumber.this.lastHeight != preferredHeight) {
                    setPreferredWidth();
                    repaint();
                    LineNumber.this.lastHeight = preferredHeight;
                }
        }
        });
    }
    
    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                /*JFrame f = new JFrame();
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JTextArea jta = new JTextArea();
                jta.setWrapStyleWord(true);
                jta.setLineWrap(true);
                jta.setText("");
                JScrollPane scroll = new JScrollPane(jta);
                scroll.setRowHeaderView(new LineNumber(jta));
                f.getContentPane().add(scroll);
                f.setSize(350, 350);
                f.setVisible(true);*/
            }
        });
    }
}
