
package POO;

/**
 *
 * @author HECTOR MAURICIO
 */
public class frmIngreso extends javax.swing.JFrame {
        
    Usuario[] usuario = new Usuario[5];

    public frmIngreso() 
    {
        initComponents();
        
        usuario[0] = new Usuario("Hector","12345678");
        usuario[1] = new Usuario("Carlos","12345678");
        usuario[2] = new Usuario("Luis","12345678");
        usuario[3] = new Usuario("Alex","12345678");
        usuario[4] = new Usuario("Christofer","12345678");   
        
        
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jbnAceptar = new javax.swing.JButton();
        jbnSalir = new javax.swing.JButton();
        jtfUsuario = new javax.swing.JTextField();
        jtfContraseña = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña");

        jbnAceptar.setText("Aceptar");
        jbnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAceptarActionPerformed(evt);
            }
        });

        jbnSalir.setText("Salir");
        jbnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnSalirActionPerformed(evt);
            }
        });

        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jtfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUsuarioKeyTyped(evt);
            }
        });

        jtfContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfContraseñaKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Programa Informativo");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        jlbMensaje.setText("mensaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(303, 303, 303)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jbnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jbnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbMensaje)
                .addGap(353, 353, 353))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jlbMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnAceptar)
                    .addComponent(jbnSalir))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAceptarActionPerformed
        //Obtener los textos de caja de texto y caja de contraseña
        String usr = jtfUsuario.getText();
        String con = jtfContraseña.getText();
        
        
        //Bandera para determinar si es usuario valido
        boolean valido = false;
        
        for(int i = 0; i < usuario.length ; i++){
            if(usuario[i].getUsuario().equals(usr) && usuario[i].getContraseña().equals(con))
            {
                       
                //Se pasa como parametros: Usuario y ventana actual
                frmRegistro abrir = new frmRegistro();
                abrir.setVisible(true); //Muestra la ventana de Formula
                this.setVisible(false);  //Hace invisible la ventana
                
                valido = true;
            }
            else if(valido)
            {
               jlbMensaje.setVisible(true);
               jlbMensaje.setText("Usuario Invalido");
            } 
        }
           
       
        
    }//GEN-LAST:event_jbnAceptarActionPerformed

    private void jbnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbnSalirActionPerformed

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed

    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jtfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsuarioKeyTyped
       
        char tam = 12;

        char caracter = evt.getKeyChar();

        if(!Character.isLetter(caracter))
        {
            getToolkit().beep();
            evt.consume();
        }

        if(jtfUsuario.getText().length()>=tam)
        {
            getToolkit().beep();
            evt.consume();
        }
        /*if(caracter == KeyEvent.VK_ENTER)
        {
            jtfContraseña.requestFocus();
        }*/
        
    }//GEN-LAST:event_jtfUsuarioKeyTyped

    private void jtfContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfContraseñaKeyTyped
        
        char tam = 8;

        char caracter = evt.getKeyChar();

        if(Character.isLetter(caracter))
        {
            getToolkit().beep();
            evt.consume();
        }

        if(jtfContraseña.getText().length()>=tam)
        {
            getToolkit().beep();
            evt.consume();
        }
        
    }//GEN-LAST:event_jtfContraseñaKeyTyped

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
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbnAceptar;
    private javax.swing.JButton jbnSalir;
    private javax.swing.JLabel jlbMensaje;
    private javax.swing.JTextField jtfContraseña;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
