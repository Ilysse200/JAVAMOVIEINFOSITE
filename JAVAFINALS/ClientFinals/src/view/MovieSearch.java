/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.operationModel;
import service.operationInterface;

/**
 *
 * @author 25078
 */
public class MovieSearch extends javax.swing.JFrame {
//    private String db_url="jdbc:mysql://localhost:3306/explore_movie_site_db";
//    private String db_username="root";
//    private String db_passwd=":@12ERgu#Oli";

    /**
     * Creates new form MovieSearch
     */
    public MovieSearch() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSearchMovie = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\25078\\Desktop\\AUCA\\SMSTR6\\JAVA\\ProjectPic\\df00d72954d282702871c698c18ee5c4.jpg")); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 153));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(3, 0));
        setSize(new java.awt.Dimension(700, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bored? Looking for a new movie?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 30, 408, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("You are in the right place !!");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 150, 245, 22);

        btnSearchMovie.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSearchMovie.setText("Search");
        btnSearchMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchMovieActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearchMovie);
        btnSearchMovie.setBounds(280, 300, 87, 29);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(110, 300, 77, 31);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(270, 230, 120, 26);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter Id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 230, 70, 22);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\25078\\Desktop\\AUCA\\SMSTR6\\JAVA\\ProjectPic\\Search.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(-20, -10, 530, 480);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 450, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginFr back = new LoginFr();
        dispose();
        back.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchMovieActionPerformed
        // TODO add your handling code here:
          try {

            operationModel op = new operationModel();
            Integer search = Integer.parseInt(jTextField1.getText());
            op.setMovieId(search);
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
            operationInterface operateM = (operationInterface) registry.lookup("operation");
            operationModel ops = operateM.getMovieById(op);
//            //set table to 0 rows
//            MovieDisplay.setRowCount(0);
//            if (ops != null) {
//                mov.addRow(new Object[]{
//                    ops.getMovieId(),
//                    ops.getProdCompany(),
//                    ops.getDirector(),
//                    ops.getMovieName(),
//                    ops.getSerial_Num(),
//                    ops.getSite(),
//                });
                  MovieDisplay disp = new MovieDisplay(op);
                  disp.dispose();
                  disp.setVisible(true);

        } catch (Exception exe) {
            exe.printStackTrace();}
//        MovieDisplay visit = new MovieDisplay();
//        dispose();
//        visit.setVisible(true);
    }//GEN-LAST:event_btnSearchMovieActionPerformed

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
            java.util.logging.Logger.getLogger(MovieSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchMovie;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
