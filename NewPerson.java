/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Orc 9
 */
public class NewPerson extends javax.swing.JFrame {

    //private global variables
    private boolean isEmployee;
    private Statement stmt;
    
    //only constructor
    public NewPerson(boolean isEmployee, Statement stmt) {
        //initialize GUI
        initComponents();
        //initialize global variables
        this.isEmployee = isEmployee;
        this.stmt = stmt;
        //set window name
        if(isEmployee)
            setTitle("Add New Employee");
        else
        {
            setTitle("Add New Customer");
            //if adding new customer, don't show extra fields
            jTextField6.setVisible(false);
            jTextField7.setVisible(false);
            jLabel1.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextField1.setText("Full Name");

        jTextField2.setText("SSN");

        jTextField4.setText("DD");

        jTextField5.setText("YYYY");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jTextField6.setText("Position");

        jTextField7.setText("Hourly Wage");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton1.setText("Add Person");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sex", "M", "F" }));

        jLabel1.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6)
                    .addComponent(jTextField1)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Add Person button pressed
        //initialize all fields to NULL
        String name = "'NULL'";
        String SSN = "'NULL'";
        String sex = "'NULL'";
        String birthdate = "'NULL'";
        String position = "'NULL'";
        String wage = "'NULL'";
        String sql;
        
        //error checking -- is SSN 9 characters long?
        if(jTextField2.getText().length() != 9)
        {
            JOptionPane.showMessageDialog(null, "ERROR: SSN is not 9 characters long");//throw error
            return;
        }
        //error checking -- is year 4 characters long?
        else if(jTextField5.getText().length() != 4)
        {
            JOptionPane.showMessageDialog(null, "ERROR: year must be 4 numbers long");//throw error
            return;
        }
        //error checking -- is day 2 characters long?
        else if(jTextField4.getText().length() != 2)
        {
            JOptionPane.showMessageDialog(null, "ERROR: day must be 2 numbers long");//throw error
            return;
        }
        else
        {
            try {
                //error checking -- is Employee pay a number?
                if(isEmployee)
                    Double.parseDouble(jTextField7.getText());
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: hourly wage must be a number");//throw error
                return;
            }
            try {
                //error checking -- is year a number?
                Integer.parseInt(jTextField5.getText());
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: year must be a number");//throw error
                return;
            }
            try {
                //error checking -- is day a number?
                Integer.parseInt(jTextField4.getText());
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: day must be a number");//throw error
                return;
            }
            try {
                //error checking -- is SSN a number?
                Integer.parseInt(jTextField2.getText());
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, "ERROR: SSN must be a number");//throw error
                return;
            }
        }
        //if no errors, add person to database
        //fill variables based on their text fields
        if(jTextField1.getText().trim().length() > 0)
            name = "'"+jTextField1.getText()+"'";
        SSN = "'"+jTextField2.getText()+"'";
        if(jComboBox2.getSelectedItem().toString() != "Sex")
            sex = "'"+jComboBox2.getSelectedItem().toString()+"'";
        //combine YYYY-MM-DD into one string
        if(jComboBox1.getSelectedIndex()+1 < 10)
            birthdate = "'"+jTextField5.getText()+"-0"+(jComboBox1.getSelectedIndex()+1)+"-"+jTextField4.getText()+"'";
        //add to appropriate table
        if(!isEmployee)
            sql = "INSERT INTO CUSTOMER (SSN, Full_Name, Birthdate, Sex) " +
                  "VALUES ("+SSN+", "+ //SSN
                             name+", "+ //Full name
                             birthdate+", "+ //Birthdate
                             sex+");"; //Sex
        else
        {
            //get position and wage
            position = "'"+jTextField6.getText()+"'";
            wage = "'"+jTextField7.getText()+"'";
            //add to appropriate table
            sql = "INSERT INTO EMPLOYEE (SSN, Full_Name, Birthdate, Sex, Position, Hourly_wage) " +
                  "VALUES ("+SSN+", "+ //SSN
                             name+", "+ //Full name
                             birthdate+", "+ //Birthdate
                             sex+", "+ //Sex
                             position+", "+ //Position
                             wage+");"; //Hourly_wage
        }
                
        try {
             //execute SQL insert and close this window
             stmt.executeUpdate(sql);
             this.setVisible(false);
        } catch (SQLException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

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
            java.util.logging.Logger.getLogger(NewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new NewPerson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
