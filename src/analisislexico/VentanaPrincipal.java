/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Bryan
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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
        initComponents();
        jtxtCode.setWrapStyleWord(true);
        jtxtCode.setLineWrap(true);
        jtxtCode.setText("");
        scroll.setRowHeaderView(new LineNumber(jtxtCode));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        jtxtCode = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtTokens = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtError = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAbrir = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();
        btnNuevo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnCopiar = new javax.swing.JMenuItem();
        btnPegar = new javax.swing.JMenuItem();
        btnCortar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jtxtCode.setColumns(20);
        jtxtCode.setRows(5);
        scroll.setViewportView(jtxtCode);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compile.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jtxtTokens.setEditable(false);
        jtxtTokens.setColumns(20);
        jtxtTokens.setRows(5);
        jScrollPane2.setViewportView(jtxtTokens);

        jtxtError.setColumns(20);
        jtxtError.setRows(5);
        jScrollPane3.setViewportView(jtxtError);

        jLabel1.setText("Salida:");

        btnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/open.png"))); // NOI18N
        btnOpen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOpenMouseClicked(evt);
            }
        });
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        btnAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        btnAbrir.setText("Abrir");
        btnAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAbrirMouseClicked(evt);
            }
        });
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(btnAbrir);

        btnGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnGuardar.setText("Guardar");
        jMenu1.add(btnGuardar);

        btnNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        btnNuevo.setText("Nuevo");
        jMenu1.add(btnNuevo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        btnCopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        btnCopiar.setText("Copiar");
        jMenu2.add(btnCopiar);

        btnPegar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        btnPegar.setText("Pegar");
        jMenu2.add(btnPegar);

        btnCortar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        btnCortar.setText("Cortar");
        jMenu2.add(btnCortar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                    .addComponent(scroll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        StringReader cad= new StringReader(jtxtCode.getText());
        Reader red= new BufferedReader(cad);
        TablaSimbolos t=new TablaSimbolos();
        Lexer lex = new Lexer(red,t);
        jtxtTokens.setText("");
        jtxtError.setText("");
        jtxtError.setForeground(Color.red);
        Token token=null;
        do{
            try {
                token = lex.yylex();
            } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(token!=null){
               // jtxtTokens.setText(jtxtTokens.getText()+"EOF"+"\n");
                //System.out.println("EOF");
               
            
            switch(token){
      case ID:case INT:case OPARIT:case OPLOG:case OPREL:case FLOAT:case PALRES: case OPASIG: case OPAGR: case ENDLN:
                    jtxtTokens.setText(jtxtTokens.getText()+"TOKEN: "+token+" "+lex.lexeme+"\n");
                    
                    //System.out.println("TOKEN: "+token+" "+lexer.lexeme);
                break;
                case ERROR:
                    jtxtTokens.setText(jtxtTokens.getText()+"TOKEN: "+token+" "+lex.lexeme+"\n");
                    jtxtError.setText(jtxtError.getText()+"Error en la línea "+(lex.linea+1)+" en la "
                            + "cadena "+(lex.lexeme)+". La cadena no es válida para el lenguaje."+"\n");
                    break;
                default:
                    jtxtTokens.setText(jtxtTokens.getText()+"TOKEN: "+token+"\n");
                    //System.out.println("TOKEN: "+token);
            }
            }
        }while(token!=null);
        
        t.imprimir();
        if(!jtxtError.getText().isEmpty()){
            jtxtError.setForeground(Color.red);
            jtxtError.setText(jtxtError.getText());
        }
        else{
            jtxtError.setForeground(Color.blue);
            jtxtError.setText("Compilación correcta!");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    public void abrirArchivo() throws FileNotFoundException, IOException{
        String aux="";  
        String texto = "";
        FileInputStream archivo = null;
        
        JFileChooser fc=new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.hp", "hp");
        fc.setFileFilter(filtro);
        fc.showOpenDialog(fc);       
      try{
        
        aux = fc.getSelectedFile().getAbsolutePath();
        File abre = fc.getSelectedFile();
         
        archivo = new FileInputStream(aux); 
        DataInputStream dis = new DataInputStream(archivo);
        
        jtxtCode.setText("");
        BufferedReader in = new BufferedReader(new FileReader(abre));
        String line = in.readLine();
        while(line != null){
          jtxtCode.append(line + "\n");
          line = in.readLine();
        }
      }catch(Exception ex){
          //System.out.println("Cancelado");
      }
      finally{
          if (archivo == null){
              
          }else{
            archivo.close();
          }
      }

    }
    
    
    public void guardarArchivo() throws IOException{
        
      final JFileChooser SaveAs = new JFileChooser();
      SaveAs.setApproveButtonText("Save");
      int actionDialog = SaveAs.showOpenDialog(this);
      if (actionDialog != JFileChooser.APPROVE_OPTION) {
         return;
      }

      File fileName = new File(SaveAs.getSelectedFile() + ".hp");
      BufferedWriter outFile = null;
      outFile = new BufferedWriter(new FileWriter(fileName));
      jtxtCode.write(outFile);   // *** here: ***
      if (outFile != null) {
          try {
              outFile.close();
          } catch (IOException e) {
              // one of the few times that I think that it's OK
              // to leave this blank
          }
      }
    }
    
    
    private void btnOpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOpenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOpenMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void btnAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAbrirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAbrirMouseClicked

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        try {
            abrirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        try {
            abrirArchivo();
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:
            guardarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        System.out.println("Resizeble");
    }//GEN-LAST:event_formComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //generarLexer();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    public static void generarLexer(){
        File file= new File("src/analisislexico/lexer.flex");
        jflex.Main.generate(file);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAbrir;
    private javax.swing.JMenuItem btnCopiar;
    private javax.swing.JMenuItem btnCortar;
    private javax.swing.JMenuItem btnGuardar;
    private javax.swing.JMenuItem btnNuevo;
    private javax.swing.JButton btnOpen;
    private javax.swing.JMenuItem btnPegar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jtxtCode;
    private javax.swing.JTextArea jtxtError;
    private javax.swing.JTextArea jtxtTokens;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
