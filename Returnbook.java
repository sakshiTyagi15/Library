
//import java.beans.Statement;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author NNN
 */
public class Returnbook extends javax.swing.JFrame {

    /**
     * Creates new form Returnbook
     */
    public Returnbook() {
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

        bookidl = new javax.swing.JLabel();
        studentidl = new javax.swing.JLabel();
        dataiss = new javax.swing.JLabel();
        duedatel = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        bookid = new javax.swing.JTextField();
        studentid = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        issuedate = new javax.swing.JTextField();
        duedate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookidl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bookidl.setText("BOOK ID ");
        getContentPane().add(bookidl, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 88, 90, -1));

        studentidl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        studentidl.setText("STUDENT ID");
        getContentPane().add(studentidl, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 146, 120, -1));

        dataiss.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        dataiss.setText("ISSUE DATE ");
        getContentPane().add(dataiss, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 202, 100, 20));

        duedatel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        duedatel.setText("DUE DATE ");
        getContentPane().add(duedatel, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 254, 100, -1));

        save.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.jpeg"))); // NOI18N
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, 40));

        cancel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 140, 40));

        bookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookidActionPerformed(evt);
            }
        });
        getContentPane().add(bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 240, -1));
        getContentPane().add(studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 240, -1));

        search.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search icon.JPG"))); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 130, 40));
        getContentPane().add(issuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 240, -1));
        getContentPane().add(duedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 240, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2024-08-07 at 2.53.17 AM.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookidActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
                    // TODO add your handling code here:
                   String Bookid=bookid.getText();
                    String Studentid=studentid.getText();
                    try
                    {
                     Connection con=coonector.getCon();
                    Statement st=con.createStatement();
                    st.execute("update issuebook set returnbook ='yes' where ID='"+Studentid+"' and Bookid='"+Bookid+"'");
                         JOptionPane.showMessageDialog(null,"BOOK RETURNED");
                         setVisible(false);
                         new Returnbook().setVisible(true);
                    }
                    catch(Exception e)
                    {
                      JOptionPane.showMessageDialog(null,"COONECTION ERROR");  
                    }
                    
    }//GEN-LAST:event_saveActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
              setVisible(false);      // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here: 
                     String Bookid=bookid.getText();
                    String Studentid=studentid.getText();
                    try
                    {
                    Connection con=coonector.getCon();
                    Statement st=con.createStatement();
                     ResultSet rs=st.executeQuery("select *from  issuebook where ID='"+Studentid+"' and Bookid='"+Bookid+"'");
                    if(rs.next())
                    {
                        issuedate.setText(rs.getString(3));
                        duedate.setText(rs.getString(4));
                        bookid.setEditable(false);
                        studentid.setEditable(false);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"BOOK NOT ISSUED");
                        setVisible(false);
                        new Returnbook().setVisible(true);
                        
                    }
                     }
                    catch(Exception e)
                    {
                       JOptionPane.showMessageDialog(null, "CONNECTION ERROR");
                    }
        
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(Returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Returnbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookid;
    private javax.swing.JLabel bookidl;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel dataiss;
    private javax.swing.JTextField duedate;
    private javax.swing.JLabel duedatel;
    private javax.swing.JTextField issuedate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField studentid;
    private javax.swing.JLabel studentidl;
    // End of variables declaration//GEN-END:variables
}
