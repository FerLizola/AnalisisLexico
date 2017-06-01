/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisislexico;

import java.awt.Color;
import java.awt.Event;
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
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.DefaultEditorKit;

/**
 *
 * @author Bryan
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        
        ActionMap acciones;    
        
    
        initComponents();
        
        acciones = jtxtCode.getActionMap();
        Action accionCopiar = acciones.get(DefaultEditorKit.copyAction);
        Action accionPegar = acciones.get(DefaultEditorKit.pasteAction);
        Action accionCortar = acciones.get(DefaultEditorKit.cutAction);
        
        accionCopiar.putValue(Action.NAME, "Copiar");
        accionCopiar.putValue(
        Action.ACCELERATOR_KEY,
        KeyStroke.getAWTKeyStroke('C', Event.CTRL_MASK)); 
        
        accionPegar.putValue(Action.NAME, "Pegar");
        accionPegar.putValue(
        Action.ACCELERATOR_KEY,
        KeyStroke.getAWTKeyStroke('V', Event.CTRL_MASK)); 
        
        accionCortar.putValue(Action.NAME, "Cortar");
        accionCortar.putValue(
        Action.ACCELERATOR_KEY,
        KeyStroke.getAWTKeyStroke('X', Event.CTRL_MASK)); 
        
        
        
        jtxtCode.setWrapStyleWord(true);
        jtxtCode.setLineWrap(true);
        jtxtCode.setText("");
        scroll.setRowHeaderView(new LineNumber(jtxtCode));
        
        jMenu2.add(accionCopiar);
        jMenu2.add(accionPegar);
        jMenu2.add(accionCortar);
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtError = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnOpen = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnAbrir = new javax.swing.JMenuItem();
        btnGuardar = new javax.swing.JMenuItem();
        btnNuevo = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jtxtCode.setColumns(20);
        jtxtCode.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jtxtCode.setRows(5);
        scroll.setViewportView(jtxtCode);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compile.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

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

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abril\\Pictures\\1496284061_edit-cut.png")); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abril\\Pictures\\1496284600_Paste.png")); // NOI18N

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abril\\Pictures\\1496284828_Copy.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abril\\Pictures\\1496304248_document_16.png")); // NOI18N

        jMenu1.setText("Archivo");

        btnAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        btnAbrir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abril\\Pictures\\1496303800_Open.png")); // NOI18N
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
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abril\\Pictures\\1496304285_save.png")); // NOI18N
        btnGuardar.setText("Guardar");
        jMenu1.add(btnGuardar);

        btnNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        btnNuevo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abril\\Pictures\\1496304248_document_16.png")); // NOI18N
        btnNuevo.setText("Nuevo");
        jMenu1.add(btnNuevo);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abril\\Pictures\\1496284828_Copy.png")); // NOI18N
        jMenuItem1.setText("Copiar");
        jMenu2.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abril\\Pictures\\1496284600_Paste.png")); // NOI18N
        jMenuItem2.setText("Pegar");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abril\\Pictures\\1496284061_edit-cut.png")); // NOI18N
        jMenuItem3.setText("Cortar");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Compilar");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                    .addComponent(scroll, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        StringReader cad= new StringReader(jtxtCode.getText());
        Reader red= new BufferedReader(cad);
        TablaSimbolos t=new TablaSimbolos();
        Lexer lex = new Lexer(red,t);
        //jtxtTokens.setText("");
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
                    //jtxtTokens.setText(jtxtTokens.getText()+"TOKEN: "+token+" "+lex.lexeme+"\n");
                    
                    //System.out.println("TOKEN: "+token+" "+lexer.lexeme);
                break;
                case ERROR:
                    //jtxtTokens.setText(jtxtTokens.getText()+"TOKEN: "+token+" "+lex.lexeme+"\n");
                    jtxtError.setText(jtxtError.getText()+"Error en la línea "+(lex.linea+1)+" en la "
                            + "cadena "+(lex.lexeme)+". La cadena no es válida para el lenguaje."+"\n");
                    break;
                default:
                    //jtxtTokens.setText(jtxtTokens.getText()+"TOKEN: "+token+"\n");
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
    }//GEN-LAST:event_formComponentResized

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JMenuItem btnGuardar;
    private javax.swing.JMenuItem btnNuevo;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jtxtCode;
    private javax.swing.JTextArea jtxtError;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
