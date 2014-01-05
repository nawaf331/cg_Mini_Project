/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package forms;

/**
 *
 * @author Administrator
 */
public class Hospitalform extends javax.swing.JFrame {

    /**
     * Creates new form Hospitalform
     */
    public Hospitalform() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tTime = new javax.swing.JTextField();
        lBloodtype = new javax.swing.JLabel();
        tDate = new javax.swing.JTextField();
        tPhone_no = new javax.swing.JTextField();
        tHospital = new javax.swing.JTextField();
        lTime = new javax.swing.JLabel();
        lQuantity = new javax.swing.JLabel();
        cQuantity = new javax.swing.JComboBox();
        lHospital = new javax.swing.JLabel();
        lPhone_no = new javax.swing.JLabel();
        lDate = new javax.swing.JLabel();
        lAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAddress = new javax.swing.JTextArea();
        cBloodtype = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setText("Hospital Record");

        tTime.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        lBloodtype.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lBloodtype.setText("Blood Type");

        tDate.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        tPhone_no.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        tHospital.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        lTime.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lTime.setText("Time");

        lQuantity.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lQuantity.setText("Quantity");

        cQuantity.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        cQuantity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lHospital.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lHospital.setText("Hospital Name");

        lPhone_no.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lPhone_no.setText("Phone_no");

        lDate.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lDate.setText("Date");

        lAddress.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        lAddress.setText("Address");

        tAddress.setColumns(20);
        tAddress.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        tAddress.setRows(5);
        jScrollPane1.setViewportView(tAddress);

        cBloodtype.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        cBloodtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "AB-", "A-", "B+", "B-", "O+", "O-", "AB+", " ", " " }));
        cBloodtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBloodtypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lHospital)
                    .addComponent(lPhone_no)
                    .addComponent(lAddress)
                    .addComponent(lBloodtype)
                    .addComponent(lQuantity)
                    .addComponent(lDate)
                    .addComponent(lTime))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tHospital)
                    .addComponent(tPhone_no)
                    .addComponent(jScrollPane1)
                    .addComponent(cBloodtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cQuantity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tDate)
                    .addComponent(tTime, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lHospital)
                            .addComponent(tHospital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lPhone_no))
                    .addComponent(tPhone_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lAddress)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lBloodtype)
                            .addComponent(cBloodtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lQuantity)
                            .addComponent(cQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lDate))
                    .addComponent(tDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTime)
                    .addComponent(tTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBloodtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBloodtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBloodtypeActionPerformed

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
            java.util.logging.Logger.getLogger(Hospitalform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospitalform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospitalform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospitalform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospitalform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cBloodtype;
    private javax.swing.JComboBox cQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lAddress;
    private javax.swing.JLabel lBloodtype;
    private javax.swing.JLabel lDate;
    private javax.swing.JLabel lHospital;
    private javax.swing.JLabel lPhone_no;
    private javax.swing.JLabel lQuantity;
    private javax.swing.JLabel lTime;
    private javax.swing.JTextArea tAddress;
    private javax.swing.JTextField tDate;
    private javax.swing.JTextField tHospital;
    private javax.swing.JTextField tPhone_no;
    private javax.swing.JTextField tTime;
    // End of variables declaration//GEN-END:variables
}
