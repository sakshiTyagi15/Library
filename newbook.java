/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author NNN
 */
 import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
public class newbook extends javax.swing.JFrame {

    /**
     * Creates new form newbook
     */
    public newbook() {
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

        bookl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        saveb = new javax.swing.JButton();
        closeb = new javax.swing.JButton();
        bookt = new javax.swing.JTextField();
        namet = new javax.swing.JTextField();
        publishert = new javax.swing.JTextField();
        pricet = new javax.swing.JTextField();
        yeart = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookl.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bookl.setText("BOOK ID");
        getContentPane().add(bookl, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 82, 87, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 134, 75, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("PUBLISHER");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 190, 99, 22));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("PRICE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 70, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("PUBLISING YEAR");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 135, -1));

        saveb.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        saveb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/isuue.jpeg"))); // NOI18N
        saveb.setText("SAVE");
        saveb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebActionPerformed(evt);
            }
        });
        getContentPane().add(saveb, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 110, 60));

        closeb.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        closeb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancel.png"))); // NOI18N
        closeb.setText("CLOSE");
        closeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebActionPerformed(evt);
            }
        });
        getContentPane().add(closeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 120, 60));
        getContentPane().add(bookt, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 82, 320, -1));
        getContentPane().add(namet, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 134, 320, -1));
        getContentPane().add(publishert, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 320, 30));
        getContentPane().add(pricet, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 320, -1));
        getContentPane().add(yeart, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 320, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2024-08-07 at 2.53.17 AM.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebActionPerformed
         setVisible(false);       // TODO add your handling code here:
    }//GEN-LAST:event_closebActionPerformed

    private void savebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebActionPerformed
        // TODO add your handling code here:
           try
         {
             String bookid=bookt.getText();
          String username=namet.getText();
          String publisher=publishert.getText();
          String price=pricet.getText();
          String year=yeart.getText();
           
          Connection con=coonector.getCon();
          Statement st=con.createStatement();
          st.executeUpdate("insert into newbook values('"+bookid+"','"+username+"','"+publisher+"','"+price+"','"+year+"')");
          JOptionPane.showMessageDialog(null,"SUCESSFULLY UPDATE");
          setVisible(false);
          new newbook().setVisible(true);
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,"book alraedy exists");
             setVisible(false);
             new registrationform().setVisible(true);
         }
    }//GEN-LAST:event_savebActionPerformed

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
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bookl;
    private javax.swing.JTextField bookt;
    private javax.swing.JButton closeb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField namet;
    private javax.swing.JTextField pricet;
    private javax.swing.JTextField publishert;
    private javax.swing.JButton saveb;
    private javax.swing.JTextField yeart;
    // End of variables declaration//GEN-END:variables
}
