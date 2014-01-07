/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

/**
 *
 * @author DELL
 */
public class ManagersMainForm extends javax.swing.JFrame {

    /**
     * Creates new form ManagersMainForm
     */
    public ManagersMainForm() {
        initComponents();
        myInitComponnent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bGetReceptorInfo = new javax.swing.JButton();
        lNoOfReceptors = new javax.swing.JLabel();
        lNoOfDonors = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lNoOfOP = new javax.swing.JLabel();
        lNoOfBN = new javax.swing.JLabel();
        lNoOfAP = new javax.swing.JLabel();
        lNoOfON = new javax.swing.JLabel();
        lNoOfAN = new javax.swing.JLabel();
        lNoOfBP = new javax.swing.JLabel();
        lNoOfABP = new javax.swing.JLabel();
        lNoOfABN = new javax.swing.JLabel();
        bGetDonorInfo = new javax.swing.JButton();
        lWelcome = new javax.swing.JLabel();
        bCreateNewUser = new javax.swing.JButton();
        bRegisterHospital = new javax.swing.JButton();
        bDeleteAccount = new javax.swing.JButton();
        bRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Blood bank-manager");
        setResizable(false);

        bGetReceptorInfo.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bGetReceptorInfo.setText("Get Info");
        bGetReceptorInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetReceptorInfoActionPerformed(evt);
            }
        });

        lNoOfReceptors.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNoOfReceptors.setText("You have m Hospitals");

        lNoOfDonors.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNoOfDonors.setText("You have n donors registered under you");

        lNoOfOP.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNoOfOP.setText("No. of O+   : ");

        lNoOfBN.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNoOfBN.setText("No. of B-   : ");

        lNoOfAP.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNoOfAP.setText("No. of A+   : ");

        lNoOfON.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNoOfON.setText("No. of O-   : ");

        lNoOfAN.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNoOfAN.setText("No. of A-   : ");

        lNoOfBP.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNoOfBP.setText("No. of B+   : ");

        lNoOfABP.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNoOfABP.setText("No. of AB+ : ");

        lNoOfABN.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lNoOfABN.setText("No. of AB- : ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNoOfAP)
                    .addComponent(lNoOfBP)
                    .addComponent(lNoOfOP)
                    .addComponent(lNoOfABP))
                .addGap(145, 145, 145)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lNoOfBN)
                    .addComponent(lNoOfAN)
                    .addComponent(lNoOfON)
                    .addComponent(lNoOfABN))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNoOfAP)
                    .addComponent(lNoOfAN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNoOfBN)
                    .addComponent(lNoOfBP))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNoOfON)
                    .addComponent(lNoOfOP))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNoOfABN)
                    .addComponent(lNoOfABP))
                .addContainerGap())
        );

        bGetDonorInfo.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bGetDonorInfo.setText("Get Info");
        bGetDonorInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetDonorInfoActionPerformed(evt);
            }
        });

        lWelcome.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        lWelcome.setText("Welcome, Manager");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(lWelcome))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lNoOfReceptors)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bGetReceptorInfo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lNoOfDonors)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bGetDonorInfo)))
                        .addGap(33, 33, 33))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bGetDonorInfo, bGetReceptorInfo});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lWelcome)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNoOfDonors)
                    .addComponent(bGetDonorInfo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNoOfReceptors)
                    .addComponent(bGetReceptorInfo))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bGetDonorInfo, bGetReceptorInfo});

        bCreateNewUser.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bCreateNewUser.setText("Create A New User");
        bCreateNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreateNewUserActionPerformed(evt);
            }
        });

        bRegisterHospital.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bRegisterHospital.setText("Add New Hospital");
        bRegisterHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisterHospitalActionPerformed(evt);
            }
        });

        bDeleteAccount.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bDeleteAccount.setText("Logout");
        bDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteAccountActionPerformed(evt);
            }
        });

        bRefresh.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bCreateNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(bRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bRegisterHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCreateNewUser, bDeleteAccount, bRefresh, bRegisterHospital});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCreateNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegisterHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDeleteAccount)
                    .addComponent(bRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bCreateNewUser, bDeleteAccount, bRegisterHospital});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCreateNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreateNewUserActionPerformed
        DonorRegistrationForm donorRegister = new DonorRegistrationForm();
        donorRegister.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_bCreateNewUserActionPerformed

    private void bRegisterHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterHospitalActionPerformed
        HospitalOrderForm hospitalRegister = new HospitalOrderForm();
        hospitalRegister.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_bRegisterHospitalActionPerformed

    private void bDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteAccountActionPerformed
        FirstPageForm first = new FirstPageForm();
        first.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bDeleteAccountActionPerformed

    private void bGetDonorInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetDonorInfoActionPerformed
        FindDonorForm donorRecords = new FindDonorForm();
        donorRecords.setVisible(true);
    }//GEN-LAST:event_bGetDonorInfoActionPerformed

    private void bGetReceptorInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetReceptorInfoActionPerformed
        FindHospitalForm find = new FindHospitalForm();
        find.setVisible(true);
    }//GEN-LAST:event_bGetReceptorInfoActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
        myInitComponnent();
    }//GEN-LAST:event_bRefreshActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagersMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagersMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagersMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagersMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ManagersMainForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCreateNewUser;
    private javax.swing.JButton bDeleteAccount;
    private javax.swing.JButton bGetDonorInfo;
    private javax.swing.JButton bGetReceptorInfo;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bRegisterHospital;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lNoOfABN;
    private javax.swing.JLabel lNoOfABP;
    private javax.swing.JLabel lNoOfAN;
    private javax.swing.JLabel lNoOfAP;
    private javax.swing.JLabel lNoOfBN;
    private javax.swing.JLabel lNoOfBP;
    private javax.swing.JLabel lNoOfDonors;
    private javax.swing.JLabel lNoOfON;
    private javax.swing.JLabel lNoOfOP;
    private javax.swing.JLabel lNoOfReceptors;
    private javax.swing.JLabel lWelcome;
    // End of variables declaration//GEN-END:variables

    private void myInitComponnent() {
        setLocation(200, 100);
        BusinessLogic.fillMgrMainBL fillPage = new BusinessLogic.fillMgrMainBL();
        fillPage.getNoOfDonors();
        fillPage.getNoOfHospitals();
        fillPage.getEachBloodData();
        fillPage.getNameOfTheMgr();
        lWelcome.setText("Welcome, " + fillPage.getsNameOftheMgr());
        lNoOfDonors.setText("You have " + Integer.toString(fillPage.getDonorCount()) + " donors registered under you");
        lNoOfReceptors.setText("You have " + Integer.toString(fillPage.getHospitalCount()) + " Registered");
        lNoOfAP.setText("No. of A+   : " + Integer.toString(fillPage.getAPcount()));
        lNoOfAN.setText("No. of A-   : " + Integer.toString(fillPage.getANcount()));
        lNoOfBP.setText("No. of B+   : " + Integer.toString(fillPage.getBPcount()));
        lNoOfBN.setText("No. of B-   : " + Integer.toString(fillPage.getBNcount()));
        lNoOfOP.setText("No. of O+   : " + Integer.toString(fillPage.getOPcount()));
        lNoOfON.setText("No. of O-   : " + Integer.toString(fillPage.getONcount()));
        lNoOfABP.setText("No. of AB+ : " + Integer.toString(fillPage.getABPcount()));
        lNoOfABN.setText("No. of AB- : " + Integer.toString(fillPage.getABNcount()));
    }
}
