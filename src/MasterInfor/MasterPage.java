/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MasterInfor;

import com.infor.ClassDAO;
import com.infor.ClassSection;
import com.infor.ClassSectionDAO;
import com.infor.Classs;
import com.infor.Department;
import com.infor.DepartmentDAO;
import com.infor.Faculty;
import com.infor.FacultyDAO;
import com.infor.Finacial;
import com.infor.FinacialDAO;
import com.infor.IClassSection;
import com.infor.IDepartment;
import com.infor.IFaculty;
import com.infor.IMarks;
import com.infor.IRoll;
import com.infor.ISignup;
import com.infor.ISubject;
import com.infor.ITest;
import com.infor.Iclass;
import com.infor.Ifinacial;
import com.infor.Istudent;
import com.infor.Marks;
import com.infor.MarksDAO;
import com.infor.Roll;
import com.infor.RollDAO;
import com.infor.Signup;
import com.infor.SignupDAO;
import com.infor.Studentimp;
import com.infor.Students;
import com.infor.Subject;
import com.infor.SubjectDAO;
import com.infor.Test;
import com.infor.TestDAO;
import com.school.*;
import connect.MySqLConnection;
import java.awt.HeadlessException;
import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author charles
 */
public class MasterPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminPage
     */
     private PreparedStatement pre;
    private ResultSet ree;
     private PreparedStatement pree;
    private ResultSet reee;
     private PreparedStatement preee;
    private ResultSet reeee;
     private PreparedStatement preeee;
    private ResultSet reeeee;
    MySqLConnection my = new MySqLConnection();
     Connection con = my.getConnect();
   private DefaultTableModel model;
    RegisterStudent regis = new RegisterStudent();
    
    //<editor-fold defaultstate="collapsed" desc="My Getters and Setters Creation Methods">
    Istudent studentcreate = new Studentimp();
    Students getstudent = new Students();
    
    IMarks markcreate = new MarksDAO();
    Marks getmark = new Marks();
    
    Ifinacial finacialcreate = new FinacialDAO();
    Finacial getfinacial = new Finacial();
    
    Iclass classcreate = new ClassDAO();
    Classs getclass = new Classs();
    
    ITest testcreate = new TestDAO();
    Test getTest = new Test();
    
    ISubject subjectcreate = new SubjectDAO();
    Subject getsubject = new Subject();
    
    IDepartment Departmentcreate = new DepartmentDAO();
    Department getdepartment = new Department();
    
    IFaculty facultycreate =  new FacultyDAO();
    Faculty getfaculty = new Faculty();
    
    IClassSection classSectioncreate = new ClassSectionDAO();
    ClassSection getClassSection = new ClassSection();
    
    ISignup signupcreate = new SignupDAO();
    Signup getsignup = new Signup();
    
    IRoll  rollcreate =  new RollDAO();
    Roll getroll= new Roll();
//</editor-fold>
     
    DataInputStream out = new DataInputStream(System.in);
   
    public MasterPage() {
        initComponents();
         setLocationRelativeTo(null);
         //<editor-fold defaultstate="collapsed" desc="My Tables Invokations">
        
//          String sq = "Select id from department";
//           try{
//          PreparedStatement   p = con.prepareStatement(sq);
//           ResultSet  r = p.executeQuery();
//          while(r.next()){
//               
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) dd.getModel();
//                 String add1 = r.getString("id");
//                 data.add(add1);
//                 model.addRow(data);
//             }
//          }catch(Exception e){
//             e.printStackTrace();
//         }
//            String sql = "Select id from student";
//         try{
//             pre = con.prepareStatement(sql);
//             ree = pre.executeQuery();
//         
//             
//             while(ree.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) upt.getModel();
//                 String add1 = ree.getString("id");
//                 data.add(add1);
//                 model.addRow(data);
//             }
//              
//             
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//         String sqll = "Select * from tests";
//         try{
//             pre = con.prepareStatement(sqll);
//             ree = pre.executeQuery();
//             
//             while(ree.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) tt.getModel();
//                 String add1 = ree.getString("id");
//                 data.add(add1);
//                 model.addRow(data);
//             }
//             
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//         String sqlll = "Select id from department";
//         try{
//             pre = con.prepareStatement(sqlll);
//             ree = pre.executeQuery();
//             
//             while(ree.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) dt.getModel();
//                 String add1 = ree.getString("id");
//                 data.add(add1);
//                 model.addRow(data);
//             }
//             
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//         String sqllll = "Select id from faculty";
//         try{
//             pre = con.prepareStatement(sqllll);
//             ree = pre.executeQuery();
//             
//             while(ree.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) ft.getModel();
//                 String add1 = ree.getString("id");
//                 data.add(add1);
//                 model.addRow(data);
//             }
//             
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//         String sqlllll = "Select id from sbuject";
//         try{
//             pre = con.prepareStatement(sqlllll);
//             ree = pre.executeQuery();
//             
//             while(ree.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) sbt.getModel();
//                 String add1 = ree.getString("id");
//                 data.add(add1);
//                 model.addRow(data);
//             }
//             
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//         
//         
//         String s = "Select * from student";
//         String subj = "Select * from sbuject";
//         String clas = "Select * from class";
//         String tts = "Select * from tests";
//         try{
//             pre = con.prepareStatement(s);
//             ree = pre.executeQuery();
//             
//             pree = con.prepareStatement(subj);
//             reee = pree.executeQuery();
//             
//             preee = con.prepareStatement(clas);
//             reeee = preee.executeQuery();
//             
//             preeee = con.prepareStatement(tts);
//             reeeee = preeee.executeQuery();
//             
//             while(ree.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) student.getModel();
//                 String add1 = ree.getString("id");
//                 data.add(add1);
//                 String add2 = ree.getString("firstName");
//                 data.add(add2);
//                 String add3 = ree.getString("lastName");
//                 data.add(add3);
//                 model.addRow(data);
//             }
//             
//              while(reee.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) subjectta.getModel();
//                 String add1 = reee.getString("id");
//                 data.add(add1);
//                
//                 model.addRow(data);
//             }
//             
//               while(reeee.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) classta.getModel();
//                 String add1 = reeee.getString("id");
//                 data.add(add1);
//                
//                 model.addRow(data);
//             }
//               
//                while(reeeee.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) testta.getModel();
//                 String add1 = reeeee.getString("id");
//                 data.add(add1);
//                
//                 model.addRow(data);
//             }
//             
//         }catch(Exception e){
//             e.printStackTrace();
//         }
//         
//         
//          String pay = "Select id from marksstore";
//          String pa = "Select id from class";
//         try{
//             pre = con.prepareStatement(pay);
//             ree = pre.executeQuery();
//          PreparedStatement    pr = con.prepareStatement(pa);
//            ResultSet re = pr.executeQuery();
//             
//             while(ree.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) payt.getModel();
//                 String add1 = ree.getString("id");
//                 data.add(add1);
//                 model.addRow(data);
//             }
//              while(re.next()){
//                 Vector<Object> data = new Vector<>();
//                 model = (DefaultTableModel) payt.getModel();
//                 String add1 = ree.getString("id");
//                 data.add(add1);
//                 model.addRow(data);
//             }
//             
//         }catch(Exception e){
//             e.printStackTrace();
//         }

//</editor-fold>
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gg = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        regpage = new javax.swing.JToggleButton();
        varpage = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        help = new javax.swing.JMenuItem();
        logoutf = new javax.swing.JMenuItem();
        cl = new javax.swing.JMenu();
        logoutfield = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 50, 0, 0));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Make your Selection Here", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        regpage.setBackground(new java.awt.Color(153, 153, 153));
        regpage.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        regpage.setText("Registration Page");
        regpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regpageActionPerformed(evt);
            }
        });

        varpage.setBackground(new java.awt.Color(153, 153, 153));
        varpage.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        varpage.setText("Data View Page");
        varpage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varpageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(regpage, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(varpage, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(regpage, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(varpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        jMenu1.add(help);

        logoutf.setText("Logout");
        logoutf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutfActionPerformed(evt);
            }
        });
        jMenu1.add(logoutf);

        jMenuBar1.add(jMenu1);

        cl.setText("Close App");
        cl.setToolTipText("");
        cl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clMouseClicked(evt);
            }
        });
        cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clActionPerformed(evt);
            }
        });
        jMenuBar1.add(cl);

        logoutfield.setText("Logout");
        logoutfield.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        logoutfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutfieldMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutfield);

        jMenu2.setText("Help");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutfActionPerformed
        Loginpage obj = new Loginpage();
        obj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutfActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
       JOptionPane.showMessageDialog(null, "To get the next paage, you have to select a field provided\n"
               + "To you and make sure that you follow the instructions\n"
               + "And if you fail to understand functionality of this program\n"
               + "please contact a software engineer near you ");
    }//GEN-LAST:event_helpActionPerformed

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
       System.exit(0);
    }//GEN-LAST:event_clActionPerformed

    private void clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clMouseClicked
         CloseApp.main(new String[] {});
    }//GEN-LAST:event_clMouseClicked

    private void logoutfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutfieldMouseClicked
         Loginpage ind = new Loginpage();
        ind.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutfieldMouseClicked

    private void regpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regpageActionPerformed
       MasterRegistrationPage.main(new String[] {});
       setVisible(false);
    }//GEN-LAST:event_regpageActionPerformed

    private void varpageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varpageActionPerformed
        MasterViewPage.main(new String[] {});
        setVisible(false);
    }//GEN-LAST:event_varpageActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        HelpPage.main(new String[] {});
       
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new MasterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cl;
    private javax.swing.ButtonGroup gg;
    private javax.swing.JMenuItem help;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem logoutf;
    private javax.swing.JMenu logoutfield;
    private javax.swing.JToggleButton regpage;
    private javax.swing.JToggleButton varpage;
    // End of variables declaration//GEN-END:variables
}
