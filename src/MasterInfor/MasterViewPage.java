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
public class MasterViewPage extends javax.swing.JFrame {

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
   
    public MasterViewPage() {
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TableStudent = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        StuTable = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        scoreView = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        TableScore = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        classview = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        TableClass = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        Tabledepartment = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        classview1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        TableSection = new javax.swing.JTable();
        jButton14 = new javax.swing.JButton();
        Sectionview = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        TableFaculty = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        facultyview = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane20 = new javax.swing.JScrollPane();
        TableFinancial = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        Financialview = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        TableSubject = new javax.swing.JTable();
        jButton18 = new javax.swing.JButton();
        SubView = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        testv = new javax.swing.JTable();
        cleart = new javax.swing.JButton();
        getdata = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        help = new javax.swing.JMenuItem();
        cl = new javax.swing.JMenu();
        logoutfield = new javax.swing.JMenu();

        setBounds(new java.awt.Rectangle(300, 50, 0, 0));
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Welcome page", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("   \n    Welcome To School Management System\n                      \n         \n            Peaceman International School\n                    Aspiring for Excellency \n");
        jScrollPane26.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(348, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Welcome Page ", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        TableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "FirstName", "LastName", "OtherName", "Gender", "Age", "State", "Religion", "Address", "Phone No", "Email", "Department Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane11.setViewportView(TableStudent);

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
        );

        jButton9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton9.setText("Clear Text");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        StuTable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        StuTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        StuTable.setText("View Data");
        StuTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jButton9)
                        .addGap(64, 64, 64)
                        .addComponent(StuTable, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StuTable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Student Data", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        scoreView.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        scoreView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        scoreView.setText("View Data");
        scoreView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreViewActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton6.setText("Clear Text");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jScrollPane15.setBackground(new java.awt.Color(204, 204, 204));

        TableScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Student Id", "Subject Id", "Class Id", "Tests Id", "Exam Score"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(TableScore);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(73, 73, 73)
                        .addComponent(scoreView)
                        .addGap(203, 203, 203)))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreView, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Score Data", jPanel4);

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        classview.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        classview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        classview.setText("View Data");
        classview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classviewActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton4.setText("Clear Text");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TableClass.setAutoCreateRowSorter(true);
        TableClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(TableClass);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton4)
                        .addGap(35, 35, 35)
                        .addComponent(classview, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(232, 232, 232))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classview, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Class Data ", jPanel5);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        Tabledepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane17.setViewportView(Tabledepartment);

        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton3.setText("Clear Text");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        classview1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        classview1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        classview1.setText("View Data");
        classview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classview1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton3)
                        .addGap(48, 48, 48)
                        .addComponent(classview1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(265, 265, 265))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classview1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Department Data", jPanel6);

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));

        TableSection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "Student ID", "Class ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(TableSection);

        jButton14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton14.setText("Clear Text");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        Sectionview.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Sectionview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        Sectionview.setText("View Data");
        Sectionview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(306, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addGap(32, 32, 32)
                        .addComponent(Sectionview, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(374, 374, 374))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sectionview, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ClassSection Data", jPanel7);

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));

        TableFaculty.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "Faculty Name", "Department ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane19.setViewportView(TableFaculty);

        jButton16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton16.setText("Clear Text");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        facultyview.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        facultyview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        facultyview.setText("View Data");
        facultyview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(27, 27, 27)
                .addComponent(facultyview, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(405, 405, 405))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyview, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Faculty Data", jPanel8);

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));

        TableFinancial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ID", "Student ID", "Class ID", "TermSection ID", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane20.setViewportView(TableFinancial);

        jButton17.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton17.setText("Clear Text");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        Financialview.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Financialview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        Financialview.setText("View Data");
        Financialview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinancialviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jButton17)
                        .addGap(26, 26, 26)
                        .addComponent(Financialview, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(266, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Financialview, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Paid Fees", jPanel9);

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        jScrollPane14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject Table", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 18))); // NOI18N

        TableSubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Id ", "Name", "Units"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(TableSubject);

        jScrollPane14.setViewportView(jScrollPane12);

        jButton18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton18.setText("Clear Text");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        SubView.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SubView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        SubView.setText("View Data");
        SubView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jButton18)
                        .addGap(33, 33, 33)
                        .addComponent(SubView, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(343, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubView, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Subject Data", jPanel10);

        jPanel11.setBackground(new java.awt.Color(153, 153, 153));

        testv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Student Id ", "Class  Id", "Department Id", "Subject Id", "Class Section Id", "CAT 1", "CAT 2", "CAT 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane23.setViewportView(testv);

        jScrollPane24.setViewportView(jScrollPane23);

        cleart.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cleart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        cleart.setText("Clear Text");
        cleart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleartActionPerformed(evt);
            }
        });

        getdata.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getdata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        getdata.setText("Get Data");
        getdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getdataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(cleart, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(getdata, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cleart, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getdata, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Test Data", jPanel11);

        jMenu1.setText("File");
        jMenu1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        help.setText("Help");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });
        jMenu1.add(help);

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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
      HelpPage.main(new String[] {});
    }//GEN-LAST:event_helpActionPerformed

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
       System.exit(0);
    }//GEN-LAST:event_clActionPerformed

    private void clMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clMouseClicked
         CloseApp.main(new String[] {});
    }//GEN-LAST:event_clMouseClicked

    private void logoutfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutfieldMouseClicked
         MasterPage ind = new MasterPage();
        ind.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_logoutfieldMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void StuTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StuTableActionPerformed
        String sql = "Select * from student";
        try{
            pre = con.prepareStatement(sql);
            ree = pre.executeQuery();

            while(ree.next()){
                Vector<Object> data = new Vector<Object>();
                model = (DefaultTableModel) TableStudent.getModel();
                String add1 = ree.getString("id");
                data.add(add1);
                String add2 = ree.getString("firstName");
                data.add(add2);
                String add3 = ree.getString("lastName");
                data.add(add3);
                String add4 = ree.getString("otherName");
                data.add(add4);
                String add5 = ree.getString("gender");
                data.add(add5);
                String add6 = ree.getString("age");
                data.add(add6);
                String add7 = ree.getString("state");
                data.add(add7);
                String add8 = ree.getString("religion");
                data.add(add8);
                String add9 = ree.getString("address");
                data.add(add9);
                String add10 = ree.getString("phonenumber");
                data.add(add10);
                String add11 = ree.getString("email");
                data.add(add11);
                String add12 = ree.getString("Department_id");
                data.add(add12);
                model.addRow(data);

            }

        }catch(Exception e){

        }
    }//GEN-LAST:event_StuTableActionPerformed

    private void scoreViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreViewActionPerformed
        try {
            String sql = "select * from marksstore";
            pre = con.prepareStatement(sql);
            ree = pre.executeQuery();

            while(ree.next()){
                Vector<Object> data = new Vector<>();
                model = (DefaultTableModel) TableScore.getModel();

                String add = (String) ree.getObject(1);
                data.add(add);
                String add1 = (String) ree.getObject(2);
                data.add(add1);
                String add2 = (String) ree.getObject(3);
                data.add(add2);
                String add3 = (String) ree.getObject(4);
                data.add(add3);
                String add4 = (String) ree.getObject(5);
                data.add(add4);
                String add5 = (String) ree.getObject(6);
                data.add(add5);
                model.addRow(data);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_scoreViewActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void classviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classviewActionPerformed
        try {
            String sql = "select * from class";
            pre = con.prepareStatement(sql);
            ree = pre.executeQuery();

            while(ree.next()){
                Vector<Object> data = new Vector<>();
                model = (DefaultTableModel) TableClass.getModel();

                String add = (String) ree.getObject(1);
                data.add(add);
                String add1 = (String) ree.getObject(2);
                data.add(add1);

                model.addRow(data);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_classviewActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void classview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classview1ActionPerformed

        try {
            String sql = "select * from department";
            pre = con.prepareStatement(sql);
            ree = pre.executeQuery();

            while(ree.next()){
                Vector<Object> data = new Vector<>();
                model = (DefaultTableModel) Tabledepartment.getModel();

                String add = (String) ree.getObject(1);
                data.add(add);
                String add1 = (String) ree.getObject(2);
                data.add(add1);

                model.addRow(data);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_classview1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void SectionviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SectionviewActionPerformed
        try {
            String sql = "select * from classsection";
            pre = con.prepareStatement(sql);
            ree = pre.executeQuery();

            while(ree.next()){
                Vector<Object> data = new Vector<>();
                model = (DefaultTableModel) TableSection.getModel();

                String add = (String) ree.getObject(1);
                data.add(add);
                String add1 = (String) ree.getObject(2);
                data.add(add1);
                String add2 = (String) ree.getObject(3);
                data.add(add2);

                model.addRow(data);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_SectionviewActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void facultyviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyviewActionPerformed
        try {
            String sql = "select * from faculty";
            pre = con.prepareStatement(sql);
            ree = pre.executeQuery();

            while(ree.next()){
                Vector<Object> data = new Vector<>();
                model = (DefaultTableModel) TableFaculty.getModel();

                String add = (String) ree.getObject(1);
                data.add(add);
                String add1 = (String) ree.getObject(2);
                data.add(add1);
                String add2 = (String) ree.getObject(3);
                data.add(add2);

                model.addRow(data);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_facultyviewActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void FinancialviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinancialviewActionPerformed
        try {
            String sql = "select * from finacial";
            pre = con.prepareStatement(sql);
            ree = pre.executeQuery();

            while(ree.next()){
                Vector<Object> data = new Vector<>();
                model = (DefaultTableModel) TableFinancial.getModel();

                String add = (String) ree.getObject(1);
                data.add(add);
                String add1 = (String) ree.getObject(2);
                data.add(add1);
                String add2 = (String) ree.getObject(3);
                data.add(add2);
                String add11 = (String) ree.getObject(4);
                data.add(add11);
                String add22 = (String) ree.getObject(5);
                data.add(add22);

                model.addRow(data);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_FinancialviewActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void SubViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubViewActionPerformed
        String sql = "Select * from sbuject";
        try{
            pre = con.prepareStatement(sql);
            ree = pre.executeQuery();

            while(ree.next()){
                Vector<Object> data = new Vector<Object>();
                model = (DefaultTableModel) TableSubject.getModel();
                String add1 = ree.getString("id");
                data.add(add1);
                String add2 = ree.getString("name");
                data.add(add2);
                String add3 = ree.getString("units");
                data.add(add3);

                model.addRow(data);

            }

        }catch(Exception e){

        }
    }//GEN-LAST:event_SubViewActionPerformed

    private void cleartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleartActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_cleartActionPerformed

    private void getdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getdataActionPerformed
        try {
            String sql = "select * from tests";
            pre = con.prepareStatement(sql);
            ree = pre.executeQuery();

            while(ree.next()){
                Vector<Object> data = new Vector<>();
                model = (DefaultTableModel) testv.getModel();

                String add = (String) ree.getObject(1);
                data.add(add);
                String add1 = (String) ree.getObject(2);
                data.add(add1);
                String add2 = (String) ree.getObject(3);
                data.add(add2);
                String add3 = (String) ree.getObject(4);
                data.add(add3);
                String add11 = (String) ree.getObject(5);
                data.add(add11);
                String add22 = (String) ree.getObject(6);
                data.add(add22);
                String add33 = (String) ree.getObject(7);
                data.add(add33);
                String add12 = (String) ree.getObject(8);
                data.add(add12);
                String add23 = (String) ree.getObject(9);
                data.add(add23);

                model.addRow(data);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_getdataActionPerformed

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
            java.util.logging.Logger.getLogger(MasterViewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterViewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterViewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterViewPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterViewPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Financialview;
    private javax.swing.JButton Sectionview;
    private javax.swing.JButton StuTable;
    private javax.swing.JButton SubView;
    private javax.swing.JTable TableClass;
    private javax.swing.JTable TableFaculty;
    private javax.swing.JTable TableFinancial;
    private javax.swing.JTable TableScore;
    private javax.swing.JTable TableSection;
    private javax.swing.JTable TableStudent;
    private javax.swing.JTable TableSubject;
    private javax.swing.JTable Tabledepartment;
    private javax.swing.JMenu cl;
    private javax.swing.JButton classview;
    private javax.swing.JButton classview1;
    private javax.swing.JButton cleart;
    private javax.swing.JButton facultyview;
    private javax.swing.JButton getdata;
    private javax.swing.ButtonGroup gg;
    private javax.swing.JMenuItem help;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu logoutfield;
    private javax.swing.JButton scoreView;
    private javax.swing.JTable testv;
    // End of variables declaration//GEN-END:variables
}
