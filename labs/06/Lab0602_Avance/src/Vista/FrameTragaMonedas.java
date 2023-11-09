package Vista;

import ClasesRecuadro.Recuadro1;
import ClasesRecuadro.Recuadro2;
import ClasesRecuadro.Recuadro3;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class FrameTragaMonedas extends javax.swing.JFrame {

    Recuadro1 r1;
    Recuadro2 r2;
    Recuadro3 r3;
    
    boolean Respuesta1 = false;
    boolean Respuesta2 = false;
    boolean Respuesta3 = false;
 
    public FrameTragaMonedas() {
        initComponents();
         this.setTitle("Tragamonedas =D....");
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblRecuadro1 = new javax.swing.JLabel();
        lblRecuadro2 = new javax.swing.JLabel();
        lblRecuadro3 = new javax.swing.JLabel();
        BotonDetener1 = new javax.swing.JButton();
        BotonDetener2 = new javax.swing.JButton();
        BotonDetener3 = new javax.swing.JButton();
        BotonIniciar = new javax.swing.JButton();
        cbDificultad = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 48)); // NOI18N
        jLabel1.setText("Tragamonedas...");

        lblRecuadro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono 1.PNG"))); // NOI18N

        lblRecuadro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono 3.PNG"))); // NOI18N

        lblRecuadro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono 6.PNG"))); // NOI18N

        BotonDetener1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        BotonDetener1.setText("Detener");
        BotonDetener1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener1ActionPerformed(evt);
            }
        });

        BotonDetener2.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        BotonDetener2.setText("Detener");
        BotonDetener2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener2ActionPerformed(evt);
            }
        });

        BotonDetener3.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        BotonDetener3.setText("Detener");
        BotonDetener3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetener3ActionPerformed(evt);
            }
        });

        BotonIniciar.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        BotonIniciar.setText("Iniciar!!!");
        BotonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarActionPerformed(evt);
            }
        });

        cbDificultad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Facil", "Normal", "Dificil" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonDetener1)
                    .addComponent(lblRecuadro1))
                .addGap(198, 198, 198)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRecuadro2)
                    .addComponent(BotonDetener2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRecuadro3)
                    .addComponent(BotonDetener3))
                .addGap(116, 116, 116))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(403, 403, 403)
                .addComponent(BotonIniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(291, 291, 291)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(cbDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbDificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRecuadro3)
                    .addComponent(lblRecuadro2)
                    .addComponent(lblRecuadro1))
                .addGap(164, 164, 164)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonDetener1)
                    .addComponent(BotonDetener2)
                    .addComponent(BotonDetener3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(BotonIniciar)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarActionPerformed
         int TiempoMilisegundos = 0;
        switch (cbDificultad.getSelectedIndex()) {
            case 0:
                TiempoMilisegundos = 0;
                break;
            case 1:
                TiempoMilisegundos = 100;
                break;
            case 2:
                TiempoMilisegundos = 500;
                break;
            default:
                TiempoMilisegundos = 0;
        }
        r1 = new Recuadro1(TiempoMilisegundos);
        r2 = new Recuadro2(TiempoMilisegundos);
        r3 = new Recuadro3(TiempoMilisegundos);
        Respuesta1 = false;
        Respuesta2 = false;
        Respuesta3 = false;
        BotonIniciar.setEnabled(false);
        r1.start();
        r2.start();
        r3.start();
    }//GEN-LAST:event_BotonIniciarActionPerformed

    private void BotonDetener1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener1ActionPerformed
        r1.stop();
        Respuesta1 = true;
        ComprobarResultado();
    }//GEN-LAST:event_BotonDetener1ActionPerformed

    private void BotonDetener2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener2ActionPerformed
        r2.stop();
        Respuesta2 = true;
        ComprobarResultado();
    }//GEN-LAST:event_BotonDetener2ActionPerformed

    private void BotonDetener3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetener3ActionPerformed
        r3.stop();
        Respuesta3 = true;
        ComprobarResultado();
    }//GEN-LAST:event_BotonDetener3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTragaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTragaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTragaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTragaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrameTragaMonedas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonDetener1;
    private javax.swing.JButton BotonDetener2;
    private javax.swing.JButton BotonDetener3;
    private javax.swing.JButton BotonIniciar;
    private javax.swing.JComboBox<String> cbDificultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JLabel lblRecuadro1;
    public static javax.swing.JLabel lblRecuadro2;
    public static javax.swing.JLabel lblRecuadro3;
    // End of variables declaration//GEN-END:variables

    
 private void ComprobarResultado() {
        if (Respuesta1 && Respuesta2 && Respuesta3) 
        {
            try 
            {
                Thread.sleep(100);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(FrameTragaMonedas.class.getName()).log(Level.SEVERE, null, ex);
            }
            BotonIniciar.setEnabled(true);
            if (lblRecuadro1.getIcon().toString().equals(lblRecuadro2.getIcon().toString()) && lblRecuadro1.getIcon().toString().equals(lblRecuadro3.getIcon().toString())) 
            {
                JOptionPane.showMessageDialog(null, "Felicitaciones, has ganado!");
            } else {
                JOptionPane.showMessageDialog(null, "Vuelve a intentarlo");
            }
        }
    }
}