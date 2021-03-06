/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.school;

import MasterInfor.HelpPage;
import javax.swing.JOptionPane;

/**
 *
 * @author charles
 */
public class AdminPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
    RegisterStudent regis = new RegisterStudent();
    Loginpage ind = new Loginpage();
    public AdminPage() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registerStudent = new javax.swing.JButton();
        getoneStudent = new javax.swing.JButton();
        getAllStudent = new javax.swing.JButton();
        registerScore = new javax.swing.JButton();
        updateStudent = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Payment = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ex = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setBounds(new java.awt.Rectangle(300, 50, 0, 0));
        setMinimumSize(new java.awt.Dimension(785, 670));
        setPreferredSize(new java.awt.Dimension(700, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        registerStudent.setBackground(new java.awt.Color(204, 204, 255));
        registerStudent.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registerStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/adds.jpg"))); // NOI18N
        registerStudent.setText("Register Student");
        registerStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 255)));
        registerStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerStudent.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        registerStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registerStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerStudentActionPerformed(evt);
            }
        });
        getContentPane().add(registerStudent);
        registerStudent.setBounds(100, 180, 160, 180);

        getoneStudent.setBackground(new java.awt.Color(204, 204, 255));
        getoneStudent.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getoneStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/school/schoolimage/onestudent.jpg"))); // NOI18N
        getoneStudent.setText("Get one Student");
        getoneStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 255)));
        getoneStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getoneStudent.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getoneStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getoneStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getoneStudentActionPerformed(evt);
            }
        });
        getContentPane().add(getoneStudent);
        getoneStudent.setBounds(330, 180, 153, 177);

        getAllStudent.setBackground(new java.awt.Color(204, 204, 255));
        getAllStudent.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        getAllStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/getall.jpg"))); // NOI18N
        getAllStudent.setText("Get All Student");
        getAllStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 255)));
        getAllStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getAllStudent.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getAllStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getAllStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllStudentActionPerformed(evt);
            }
        });
        getContentPane().add(getAllStudent);
        getAllStudent.setBounds(560, 180, 150, 178);

        registerScore.setBackground(new java.awt.Color(204, 204, 255));
        registerScore.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registerScore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/school/schoolimage/score.jpg"))); // NOI18N
        registerScore.setText("Register Score");
        registerScore.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 255)));
        registerScore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerScore.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        registerScore.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registerScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerScoreActionPerformed(evt);
            }
        });
        getContentPane().add(registerScore);
        registerScore.setBounds(100, 380, 160, 160);

        updateStudent.setBackground(new java.awt.Color(204, 204, 255));
        updateStudent.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        updateStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/school/schoolimage/fpage.jpg"))); // NOI18N
        updateStudent.setText("Update Student");
        updateStudent.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 255)));
        updateStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateStudent.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        updateStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        updateStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentActionPerformed(evt);
            }
        });
        getContentPane().add(updateStudent);
        updateStudent.setBounds(560, 380, 150, 160);

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Back.png"))); // NOI18N
        back.setText("Logout");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(340, 570, 140, 43);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("You are Welcome to Student Information System Font Page");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 6, 721, 24);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("This are the activities you have privilege to Manipulate on");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 36, 721, 26);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Please make sure you manage this system properly ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 68, 721, 24);

        Payment.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Dollar1.jpg"))); // NOI18N
        Payment.setText("Make Payment");
        Payment.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 255)));
        Payment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Payment.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Payment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentActionPerformed(evt);
            }
        });
        getContentPane().add(Payment);
        Payment.setBounds(340, 380, 150, 170);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 100, 790, 520);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 790, 100);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        ex.setText("Close App");
        ex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exMouseClicked(evt);
            }
        });
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jMenuBar1.add(ex);

        jMenu2.setText("Logout");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerStudentActionPerformed
        regis.setVisible(true);
    }//GEN-LAST:event_registerStudentActionPerformed

    private void updateStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentActionPerformed
      StudentUpdate update = new StudentUpdate();
      update.setVisible(true);
    }//GEN-LAST:event_updateStudentActionPerformed

    private void getoneStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getoneStudentActionPerformed
        GetOneStudent getone = new GetOneStudent();
        getone.setVisible(true);
                
    }//GEN-LAST:event_getoneStudentActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        ind.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void registerScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerScoreActionPerformed
        RegisterScore objj = new RegisterScore();
        objj.setVisible(true);
    }//GEN-LAST:event_registerScoreActionPerformed

    private void getAllStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllStudentActionPerformed
        GetAllStudent ko = new GetAllStudent();
        ko.setVisible(true);
    }//GEN-LAST:event_getAllStudentActionPerformed

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
     
    }//GEN-LAST:event_exActionPerformed

    private void PaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentActionPerformed
       MakePayment.main(new String[] {});
    }//GEN-LAST:event_PaymentActionPerformed

    private void exMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exMouseClicked
          CloseApp.main(new String[] {});
    }//GEN-LAST:event_exMouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
         ind.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        HelpPage.main(new String[] {});
    }//GEN-LAST:event_jMenu3MouseClicked

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Payment;
    private javax.swing.JButton back;
    private javax.swing.JMenu ex;
    private javax.swing.JButton getAllStudent;
    private javax.swing.JButton getoneStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton registerScore;
    private javax.swing.JButton registerStudent;
    private javax.swing.JButton updateStudent;
    // End of variables declaration//GEN-END:variables
}
