/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import model.operationModel;
import service.operationInterface;

/**
 *
 * @author 25078
 */
public class OperationsMovie extends javax.swing.JFrame {
    

    /**
     * Creates new form RegisterMovie
     */
    public OperationsMovie() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSerialnumber = new javax.swing.JTextField();
        txtMovieName = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        txtProductionCompany = new javax.swing.JTextField();
        txtSiteName = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("MovieName");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 115, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Director");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 187, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("ProductionCompany");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 249, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("WatchSite");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 314, -1, -1));
        jPanel1.add(txtSerialnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 61, 197, -1));
        jPanel1.add(txtMovieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 112, 197, -1));
        jPanel1.add(txtDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 171, 197, -1));

        txtProductionCompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductionCompanyActionPerformed(evt);
            }
        });
        jPanel1.add(txtProductionCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 234, 197, -1));
        jPanel1.add(txtSiteName, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 300, 197, -1));

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 379, -1, -1));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 379, -1, -1));

        btnView.setBackground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 379, -1, -1));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 379, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Serial Number");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 64, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\25078\\Desktop\\AUCA\\SMSTR6\\JAVA\\ProjectPic\\6394ed51de3644052eefa55b296eb9cd.jpg")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 460));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel1.setText("Movie Operations");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductionCompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductionCompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductionCompanyActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        try{
//            Connection con = DriverManager.getConnection(db_url,db_username,db_passwd);
//            PreparedStatement statement = con.prepareStatement("insert into moviedetails values(?,?,?,?,?)");
//            statement.setString(1,txtSerialnumber.getText());
//            statement.setString(2,txtMovieName.getText());
//            statement.setString(3, txtDirector.getText());
//            statement.setString(4, txtProductionCompany.getText());
//            statement.setString(5, txtSiteName.getText());
//            int rowsAffected = statement.executeUpdate();
//            if(rowsAffected>=1){
//                JOptionPane.showMessageDialog(this, "Data saved");
//            }
//            else{
//                JOptionPane.showMessageDialog(this, "Data not saved");
//            }
               operationModel register = new operationModel();
               register.setSerial_Num(txtSerialnumber.getText());
               register.setProdCompany(txtProductionCompany.getText());
               register.setDirector(txtDirector.getText());
               register.setMovieName(txtMovieName.getText());
               register.setSite(txtSiteName.getText());
               Registry registry = LocateRegistry.getRegistry("127.0.0.1",5000);
               operationInterface operation = (operationInterface)registry.lookup("operation");
               String feedback = operation.registerOperation(register);
            JOptionPane.showMessageDialog(this, feedback);

        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
     try{
//            Connection con = DriverManager.getConnection(db_url,db_username,db_passwd);
//            PreparedStatement statement = con.prepareStatement("update moviedetails set movieName=?, directedBy=?,productionCompany=?,watchSite =? where serialNumber = ?");
//            statement.setString(1, txtMovieName.getText());
//            statement.setString(2, txtDirector.getText());
//            statement.setString(3,txtProductionCompany.getText());
//            statement.setString(4, txtSiteName.getText());
//            statement.setString(5, txtSerialnumber.getText());
//            int rowsAffected = statement.executeUpdate();
//            if(rowsAffected>=1){
//                JOptionPane.showMessageDialog(this, "Data updated");
//            }
//            else{
//                JOptionPane.showMessageDialog(this, "Data not saved");
//            }
               operationModel update = new operationModel();
               update.setSerial_Num(txtSerialnumber.getText());
               //if((txtSerialnumber.getText()).equals(update.getSerial_Num())){
               update.setProdCompany(txtProductionCompany.getText());
               update.setDirector(txtDirector.getText());
               update.setMovieName(txtMovieName.getText());
               update.setSite(txtSiteName.getText());
               Registry registry = LocateRegistry.getRegistry("127.0.0.1",5000);
               operationInterface operation = (operationInterface)registry.lookup("operation");
               String feedback = operation.updateOperation(update);
            JOptionPane.showMessageDialog(this, feedback);//}
               //else{
                   //JOptionPane.showMessageDialog(this,"id does not exist","ERROR",JOptionPane.ERROR_MESSAGE);
               //}
              
        }catch(Exception ex){
            ex.printStackTrace();
        }       
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
          
        operationModel op = new operationModel();
            MovieDisplay displ = new MovieDisplay(op);
            this.dispose();
            displ.setVisible(true);
//            try{
//          //operationModel view = new operationModel();
//          //view.setSerial_Num(txtSerialnumber.getText());
////          Registry registry = LocateRegistry.getRegistry("127.0.0.1",5000);
////          operationInterface operation = (operationInterface)registry.lookup("operation");
////          List<operationModel>feedback = operation.allMoviesOperations();
////          JOptionPane.showMessageDialog(this, feedback);
////          
//          }catch(Exception ex){
//            ex.printStackTrace();
//        } 
          
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
//            Connection con = DriverManager.getConnection(db_url,db_username,db_passwd);
//            PreparedStatement statement = con.prepareStatement("delete from moviedetails where serialNumber = ?");
//            statement.setString(1,txtSerialnumber.getText());
//            int rowsAffected = statement.executeUpdate();
//            if(rowsAffected>=1){
//                JOptionPane.showMessageDialog(this, "Data deleted");
//            }
//            else{
//                JOptionPane.showMessageDialog(this, "Data not deleted");
//            }
               operationModel delete = new operationModel();
               delete.setSerial_Num(txtSerialnumber.getText());
               Registry registry = LocateRegistry.getRegistry("127.0.0.1",5000);
               operationInterface operation = (operationInterface)registry.lookup("operation");
               String feedback = operation.deleteOperation(delete);
            JOptionPane.showMessageDialog(this, feedback);
               
        }catch(Exception ex){
            ex.printStackTrace();
        }        
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(OperationsMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperationsMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperationsMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperationsMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperationsMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtMovieName;
    private javax.swing.JTextField txtProductionCompany;
    private javax.swing.JTextField txtSerialnumber;
    private javax.swing.JTextField txtSiteName;
    // End of variables declaration//GEN-END:variables
}
