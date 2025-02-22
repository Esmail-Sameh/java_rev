
package forms;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCalcDB = new javax.swing.JButton();
        btnSaveEmpData = new javax.swing.JButton();
        btnSimpleCalc = new javax.swing.JButton();
        btnMessageBoxWithName = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnSound = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Main Form");

        btnCalcDB.setText("Calc date of birth");
        btnCalcDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcDBActionPerformed(evt);
            }
        });

        btnSaveEmpData.setText("Save Employee Data");
        btnSaveEmpData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveEmpDataActionPerformed(evt);
            }
        });

        btnSimpleCalc.setText("Simple Calclator");
        btnSimpleCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpleCalcActionPerformed(evt);
            }
        });

        btnMessageBoxWithName.setText("Message box with name");
        btnMessageBoxWithName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMessageBoxWithNameActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnSound.setText("Display Sound");
        btnSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoundActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSaveEmpData, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcDB, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSimpleCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMessageBoxWithName, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSound, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(btnCalcDB)
                .addGap(18, 18, 18)
                .addComponent(btnSaveEmpData)
                .addGap(18, 18, 18)
                .addComponent(btnSimpleCalc)
                .addGap(18, 18, 18)
                .addComponent(btnMessageBoxWithName)
                .addGap(18, 18, 18)
                .addComponent(btnSound)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnCalcDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcDBActionPerformed
        CalcDateOfBirth frmcalc = new CalcDateOfBirth();
        frmcalc.setVisible(true);
        frmcalc.setLocationRelativeTo(null);
        frmcalc.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnCalcDBActionPerformed

    private void btnSaveEmpDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveEmpDataActionPerformed
        SaveEmpData sed = new SaveEmpData();
        sed.setVisible(true);
        sed.setLocationRelativeTo(null);
        sed.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnSaveEmpDataActionPerformed

    private void btnSimpleCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpleCalcActionPerformed
        SimpleCalc sc = new SimpleCalc();
        sc.setVisible(true);
        sc.setLocationRelativeTo(null);
        sc.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnSimpleCalcActionPerformed

    private void btnMessageBoxWithNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMessageBoxWithNameActionPerformed
        create_message_box_with_name cmbwn = new create_message_box_with_name();
        cmbwn.setVisible(true);
        cmbwn.setLocationRelativeTo(null);
        cmbwn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnMessageBoxWithNameActionPerformed

    private void btnSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoundActionPerformed
        DisplaySound ds = new DisplaySound();
        ds.setVisible(true);
        ds.setLocationRelativeTo(null);
        ds.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnSoundActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcDB;
    private javax.swing.JButton btnMessageBoxWithName;
    private javax.swing.JButton btnSaveEmpData;
    private javax.swing.JButton btnSimpleCalc;
    private javax.swing.JButton btnSound;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
