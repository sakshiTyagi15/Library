
import java.sql.*;
import java.sql.Statement; 
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class statics extends javax.swing.JFrame {

    /**
     * Creates new form statics
     */
    public statics() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("ISSUE  BOOK TABLE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 6, 129, 32));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "STUDENT ID", "BOOK ID", "ISSUE DATE", "DUE DATE", "Return"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 50, 640, 117));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("RETURN BOOK TABLE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 134, 31));

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "STDENT ID", "BOOK ID", "ISSUE DATE", "DUE DATE", "RETURN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 228, 640, 123));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButton1.setText("CANCEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WhatsApp Image 2024-08-07 at 2.53.17 AM.jpeg"))); // NOI18N
        jButton3.setText("jButton3");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        try
        { 
          Connection hon = coonector.getCon();
          Statement sm = hon.createStatement();
 ResultSet rs=sm.executeQuery("select issuebook.Id,studentdata.Name,issuebook.Bookid,newbook.Name,issuebook.Issuedate,issuebook.Duedate from studentdata inner join newbook inner join issuebook where newbook.Bookid=issuebook.Bookid and studentdata.Id=issuebook.Id and issuebook.ReturnBook='NO'");
        tb1.setModel(DbUtils.resultSetToTableModel(rs));
 ResultSet rst=sm.executeQuery("select issuebook.Id,studentdata.Name,issuebook.Bookid,newbook.Name,issuebook.Issuedate,issuebook.Duedate from studentdata inner join newbook inner join issuebook where newbook.Bookid=issuebook.Bookid and studentdata.Id=issuebook.Id and issuebook.ReturnBook='YES'");
        tb2.setModel(DbUtils.resultSetToTableModel(rst));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"COONECTION ERROR");
            
        }
        
        
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(statics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(statics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(statics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(statics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new statics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    // End of variables declaration//GEN-END:variables
}
