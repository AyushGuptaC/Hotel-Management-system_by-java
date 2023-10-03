/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hotelmanagementsystem;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aaush
 */
public class NewJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public NewJFrame2() {
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

        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Roomno = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Roomnum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tables = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hotelmanagementsystem/modern-luxury-bedroom-suite-bathroom.jpg"))); // NOI18N

        Roomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomnoActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hotelmanagementsystem/luxury-bedroom-interior-with-rich-furniture-scenic-view-from-walkout-deck (2).jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("See the detais of room below:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 60, 330, 24);

        jLabel2.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jLabel2.setText("Room no :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(580, 90, 70, 19);

        jLabel3.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jLabel3.setText("Room type ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 150, 100, 30);

        jLabel4.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jLabel4.setText("beds");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(580, 190, 60, 29);

        jLabel5.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jLabel5.setText("price :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(610, 290, 60, 30);

        jButton1.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("ADD RECORDS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 380, 170, 31);

        jButton2.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 0));
        jButton2.setText("SEE RECORDS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(740, 380, 170, 31);

        Price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceActionPerformed(evt);
            }
        });
        getContentPane().add(Price);
        Price.setBounds(690, 290, 184, 22);

        jLabel9.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jLabel9.setText("Status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(600, 240, 70, 19);

        Roomnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoomnumActionPerformed(evt);
            }
        });
        getContentPane().add(Roomnum);
        Roomnum.setBounds(690, 90, 170, 22);

        Tables.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Room no", "Room type", "beds", "Status", "Price"
            }
        ));
        jScrollPane1.setViewportView(Tables);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 90, 452, 402);

        jCheckBox1.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jCheckBox1.setText("AC");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(690, 150, 85, 23);

        jCheckBox2.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jCheckBox2.setText("NON AC");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(780, 150, 85, 23);

        jCheckBox3.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jCheckBox3.setText("BOOKED");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(690, 240, 80, 23);

        jCheckBox4.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jCheckBox4.setText("NON-BOOKED");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(800, 240, 110, 23);

        jRadioButton1.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jRadioButton1.setText("SINGLE  BED");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(660, 190, 120, 24);

        jRadioButton2.setFont(new java.awt.Font("Algerian", 2, 14)); // NOI18N
        jRadioButton2.setText("DOUBLE BED");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(798, 190, 140, 24);

        jLabel7.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("-: MANAGE OUR ROOM :-");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(400, 10, 220, 30);

        jButton3.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jButton3.setText("SEE ALL OPTIONs");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(690, 460, 190, 31);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/hotelmanagementsystem/luxury-bedroom-interior-with-rich-furniture-scenic-view-from-walkout-deck (2).jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(-210, -90, 1190, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
        String sql = "insert into addrecord values (?,?,?,?,?)";
        PreparedStatement a = conn.prepareStatement (sql);
        a.setString(1,Roomnum.getText()) ;
        a.setString(2,roomtype);
        a.setString(3,bed);
        a.setString(4,status);
        a.setString(5,Price.getText()); 
        a.executeUpdate();
         JOptionPane.showMessageDialog(this,"RECORDS INSERTED SUCCESSFULLY");
         conn.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     try{   
        Class.forName("com.mysql.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","");
       Statement st = conn.createStatement();
        String sql = "select * from addrecord" ;
       PreparedStatement a = conn.prepareStatement(sql);
       ResultSet rs = a.executeQuery();
        DefaultTableModel tm =(DefaultTableModel)Tables.getModel();
        tm.setRowCount(0);
       while (rs.next()){
           Object o[]={rs.getInt("Roomnum"),rs.getString("roomtype"),rs.getString("bed"),rs.getString("Status"),rs.getInt("Price")};
           tm.addRow(o);
        }
     }  catch (Exception e) {
           JOptionPane.showMessageDialog(this, e);
        }
             // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceActionPerformed

    private void RoomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomnoActionPerformed

    private void RoomnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoomnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoomnumActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        roomtype = "Ac";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
 roomtype = "Non-Ac";         // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
       status = "booked"; // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
status = "non booked";        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
  bed = "single bed";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
bed = "double bed";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  NewJFrame1 jf1 = new NewJFrame1();
       jf1.show();
       dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Price;
    private javax.swing.JTextField Roomno;
    private javax.swing.JTextField Roomnum;
    private javax.swing.JTable Tables;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
private String roomtype;
private String status;
private String bed;

}
