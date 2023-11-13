package TragaMonedas;


import ClaseRecuadros.Recuadro1;
import ClaseRecuadros.Recuadro2;
import ClaseRecuadros.Recuadro3;
import ClaseRecuadros.Recuadro4;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DiseñoMaquina extends javax.swing.JFrame {

    // Dinero Inicial
    private int DineroInicial = 0; 
    // Primera Apuesta
    private int ApuestaInicial = 0;   
    
    Recuadro1 r1;
    Recuadro2 r2;
    Recuadro3 r3;
    Recuadro4 r4;
    
    boolean Resultador1 = false;
    boolean Resultador2 = false;
    boolean Resultador3 = false;
    boolean Resultador4 = false;
    
    public DiseñoMaquina() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ico1 = new javax.swing.JLabel();
        Ico2 = new javax.swing.JLabel();
        Ico3 = new javax.swing.JLabel();
        Ico4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BotonIniciar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        DineroApostado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        IngresoDinero = new javax.swing.JTextField();
        Recuadro1 = new javax.swing.JLabel();
        Recuadro2 = new javax.swing.JLabel();
        Recuadro3 = new javax.swing.JLabel();
        Recuadro4 = new javax.swing.JLabel();
        Detener1 = new javax.swing.JButton();
        Detener2 = new javax.swing.JButton();
        Detener3 = new javax.swing.JButton();
        Detener4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 0, 255));
        jPanel1.setForeground(new java.awt.Color(255, 204, 0));

        Ico1.setBackground(new java.awt.Color(255, 255, 255));
        Ico1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel6.setText("Tragamonedas...");

        BotonIniciar.setBackground(new java.awt.Color(102, 0, 255));
        BotonIniciar.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        BotonIniciar.setText("Iniciar...");
        BotonIniciar.setToolTipText("");
        BotonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel7.setText("Dinero a apostar");

        DineroApostado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DineroApostadoActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(51, 255, 153));
        jLabel8.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel8.setText("Dinero Inicial");

        IngresoDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoDineroActionPerformed(evt);
            }
        });

        Detener1.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        Detener1.setText("Detener");
        Detener1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Detener1ActionPerformed(evt);
            }
        });

        Detener2.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        Detener2.setText("Detener");
        Detener2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Detener2ActionPerformed(evt);
            }
        });

        Detener3.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        Detener3.setText("Detener");
        Detener3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Detener3ActionPerformed(evt);
            }
        });

        Detener4.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        Detener4.setText("Detener");
        Detener4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Detener4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Ico1)
                        .addGap(18, 18, 18)
                        .addComponent(Ico2)
                        .addGap(18, 18, 18)
                        .addComponent(Ico3)
                        .addGap(18, 18, 18)
                        .addComponent(Ico4)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Detener1)
                                    .addComponent(Recuadro1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(BotonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Recuadro2)
                                        .addGap(18, 18, 18)
                                        .addComponent(Recuadro3)
                                        .addGap(18, 18, 18)
                                        .addComponent(Recuadro4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addComponent(jLabel8)
                                                .addGap(49, 49, 49)
                                                .addComponent(jLabel7))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Detener2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Detener3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Detener4))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(IngresoDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DineroApostado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Recuadro1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Recuadro3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Recuadro4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Recuadro2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Ico3)
                        .addComponent(Ico4)
                        .addComponent(Ico1)
                        .addComponent(Ico2)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Detener1)
                    .addComponent(Detener2)
                    .addComponent(Detener3)
                    .addComponent(Detener4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DineroApostado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngresoDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BotonIniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarActionPerformed
        
        DineroInicial = Integer.parseInt(IngresoDinero.getText()); // Otra opción es asignar un valor inicial aquí
        ApuestaInicial = Integer.parseInt(DineroApostado.getText()); 
        if (DineroInicial >= ApuestaInicial) {
            
            int timems = 100;
        
            r1 = new Recuadro1(timems);
            r2 = new Recuadro2(timems);
            r3 = new Recuadro3(timems);
            r4 = new Recuadro4(timems);
        
            Resultador1 = false;
            Resultador2 = false;
            Resultador3 = false;
            Resultador4 = false;

            BotonIniciar.setEnabled(false);
        
            r1.start();
            r2.start();
            r3.start();
            r4.start();   
                   
        } else {
            JOptionPane.showMessageDialog(null, "No tienes fondos suficientes para realizar la apuesta.");
    }
        
    }//GEN-LAST:event_BotonIniciarActionPerformed

    private void Detener1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Detener1ActionPerformed
        // TODO add your handling code here:
        r1.DetenerRecuadro();
        Resultador1 = true;
        DarResultado();
    }//GEN-LAST:event_Detener1ActionPerformed

    private void Detener2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Detener2ActionPerformed
        // TODO add your handling code here:
        r2.DetenerRecuadro();
        Resultador2 = true;
        DarResultado();
    }//GEN-LAST:event_Detener2ActionPerformed

    private void Detener3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Detener3ActionPerformed
        // TODO add your handling code here:
        r3.DetenerRecuadro();
        Resultador3 = true;
        DarResultado();
    }//GEN-LAST:event_Detener3ActionPerformed

    private void Detener4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Detener4ActionPerformed
        // TODO add your handling code here:
        r4.DetenerRecuadro();
        Resultador4 = true;
        DarResultado();
    }//GEN-LAST:event_Detener4ActionPerformed

    private void IngresoDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoDineroActionPerformed
        // TODO add your handling code here:
        try {
            DineroInicial = Integer.parseInt(IngresoDinero.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un valor válido para los fondos.");
        }
    }//GEN-LAST:event_IngresoDineroActionPerformed

    private void DineroApostadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DineroApostadoActionPerformed
        // TODO add your handling code here:
        try {
            ApuestaInicial = Integer.parseInt(DineroApostado.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingresa un valor válido para la apuesta.");
    }
    }//GEN-LAST:event_DineroApostadoActionPerformed

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
            java.util.logging.Logger.getLogger(DiseñoMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiseñoMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiseñoMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiseñoMaquina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiseñoMaquina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIniciar;
    private javax.swing.JButton Detener1;
    private javax.swing.JButton Detener2;
    private javax.swing.JButton Detener3;
    private javax.swing.JButton Detener4;
    private javax.swing.JTextField DineroApostado;
    private javax.swing.JLabel Ico1;
    private javax.swing.JLabel Ico2;
    private javax.swing.JLabel Ico3;
    private javax.swing.JLabel Ico4;
    private javax.swing.JTextField IngresoDinero;
    public static javax.swing.JLabel Recuadro1;
    public static javax.swing.JLabel Recuadro2;
    public static javax.swing.JLabel Recuadro3;
    public static javax.swing.JLabel Recuadro4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

private void DarResultado(){
    if(Resultador1 && Resultador2 && Resultador3 && Resultador4){
        
        try{
            Thread.sleep(100);
        }catch(InterruptedException ex){
            Logger.getLogger(Recuadro1.class.getName()).log(Level.SEVERE, null, ex);
        }
        BotonIniciar.setEnabled(true);
        if(Recuadro1.getIcon().toString().equals(Recuadro2.getIcon().toString()) && 
                Recuadro1.getIcon().toString().equals(Recuadro3.getIcon().toString()) && 
                Recuadro1.getIcon().toString().equals(Recuadro4.getIcon().toString())){
            
            DineroInicial += ApuestaInicial * 2;
            JOptionPane.showMessageDialog(null, "Has Ganado!!!");   
        }else{
            
            DineroInicial = DineroInicial - ApuestaInicial;
            JOptionPane.showMessageDialog(null, "Perdiste :( ¿Quieres volver a intentarlo?");
        }
        
        IngresoDinero.setText(Integer.toString(DineroInicial));
        DineroApostado.setText(Integer.toString(ApuestaInicial));
        BotonIniciar.setEnabled(true);
    }
}


}

