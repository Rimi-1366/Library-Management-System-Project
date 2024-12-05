
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author Hafiza Shadaf Rimi
 */
public class IssueBook extends javax.swing.JFrame {
        PreparedStatement pst;
        ResultSet rs;
        Connection c=Connect.ConnectToDB();
    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
        SimpleDateFormat  dat=new SimpleDateFormat("dd/MM/yyyy ");
         Date d=new Date();
         txtissuedate.setText(dat.format(d));
         
    }
    
     void clear(){
        txtbookname.setText("");
        txtduedate.setText("");
        txtissuedate.setText("");
        txtstudentid.setText("");
        txtid.setText("");
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnissue = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        txtstudentid = new javax.swing.JTextField();
        txtbookname = new javax.swing.JTextField();
        txtissuedate = new javax.swing.JTextField();
        txtduedate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/isue.jpg"))); // NOI18N
        jLabel1.setText("Issue Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 250, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Student ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 240, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Book Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 250, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 240, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Due Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 240, 40));

        btnissue.setBackground(new java.awt.Color(204, 0, 0));
        btnissue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnissue.setForeground(new java.awt.Color(242, 242, 242));
        btnissue.setText("Issue Book");
        btnissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissueActionPerformed(evt);
            }
        });
        getContentPane().add(btnissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 630, 130, 40));

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 350, 40));

        txtstudentid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 350, 40));

        txtbookname.setEditable(false);
        txtbookname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtbookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 350, 40));

        txtissuedate.setEditable(false);
        txtissuedate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 350, 40));

        txtduedate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 350, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close icon.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 51, 40));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 204, -1, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/All Page Backgraound.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     dispose();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissueActionPerformed
        if(txtid.getText().equals("")){
                JOptionPane.showMessageDialog(rootPane, "Please enter Book ID and Search it again");
                txtid.requestFocus();
        }
        else{
            try{
            pst = c.prepareStatement("UPDATE BOOK SET STATUS=?, ISSUEDATE=?, DUEDATE=?, STUDENTID=? WHERE id=?");
pst.setString(1, "ISSUED");
pst.setString(2, txtissuedate.getText());
pst.setString(3, txtduedate.getText());
pst.setString(4, txtstudentid.getText());
pst.setString(5, txtid.getText()); // Specify the Book ID
pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Book Issued");
            txtid.setText("");
            txtbookname.setText("");
            txtstudentid.setText("");
            txtissuedate.setText("");
            txtduedate.setText("");
            
            
            clear();
            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnissueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            pst=c.prepareStatement("SELECT * FROM library.book where id=?");
            pst.setString(1, txtid.getText());
            rs=pst.executeQuery();
            if(rs.next())
                    txtbookname.setText(rs.getString("name"));
            else
                JOptionPane.showMessageDialog(this, "Please Enter Valied Book ID");
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnissue;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtduedate;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JTextField txtstudentid;
    // End of variables declaration//GEN-END:variables
}
