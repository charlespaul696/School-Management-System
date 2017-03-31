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
        
          String sq = "Select id from department";
           try{
          PreparedStatement   p = con.prepareStatement(sq);
           ResultSet  r = p.executeQuery();
          while(r.next()){
               
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) dd.getModel();
                 String add1 = r.getString("id");
                 data.add(add1);
                 model.addRow(data);
             }
          }catch(Exception e){
             e.printStackTrace();
         }
            String sql = "Select id from student";
         try{
             pre = con.prepareStatement(sql);
             ree = pre.executeQuery();
         
             
             while(ree.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) upt.getModel();
                 String add1 = ree.getString("id");
                 data.add(add1);
                 model.addRow(data);
             }
              
             
         }catch(Exception e){
             e.printStackTrace();
         }
         String sqll = "Select * from tests";
         try{
             pre = con.prepareStatement(sqll);
             ree = pre.executeQuery();
             
             while(ree.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) tt.getModel();
                 String add1 = ree.getString("id");
                 data.add(add1);
                 model.addRow(data);
             }
             
         }catch(Exception e){
             e.printStackTrace();
         }
         String sqlll = "Select id from department";
         try{
             pre = con.prepareStatement(sqlll);
             ree = pre.executeQuery();
             
             while(ree.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) dt.getModel();
                 String add1 = ree.getString("id");
                 data.add(add1);
                 model.addRow(data);
             }
             
         }catch(Exception e){
             e.printStackTrace();
         }
         String sqllll = "Select id from faculty";
         try{
             pre = con.prepareStatement(sqllll);
             ree = pre.executeQuery();
             
             while(ree.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) ft.getModel();
                 String add1 = ree.getString("id");
                 data.add(add1);
                 model.addRow(data);
             }
             
         }catch(Exception e){
             e.printStackTrace();
         }
         String sqlllll = "Select id from sbuject";
         try{
             pre = con.prepareStatement(sqlllll);
             ree = pre.executeQuery();
             
             while(ree.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) sbt.getModel();
                 String add1 = ree.getString("id");
                 data.add(add1);
                 model.addRow(data);
             }
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
         
         String s = "Select * from student";
         String subj = "Select * from sbuject";
         String clas = "Select * from class";
         String tts = "Select * from tests";
         try{
             pre = con.prepareStatement(s);
             ree = pre.executeQuery();
             
             pree = con.prepareStatement(subj);
             reee = pree.executeQuery();
             
             preee = con.prepareStatement(clas);
             reeee = preee.executeQuery();
             
             preeee = con.prepareStatement(tts);
             reeeee = preeee.executeQuery();
             
             while(ree.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) student.getModel();
                 String add1 = ree.getString("id");
                 data.add(add1);
                 String add2 = ree.getString("firstName");
                 data.add(add2);
                 String add3 = ree.getString("lastName");
                 data.add(add3);
                 model.addRow(data);
             }
             
              while(reee.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) subjectta.getModel();
                 String add1 = reee.getString("id");
                 data.add(add1);
                
                 model.addRow(data);
             }
             
               while(reeee.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) classta.getModel();
                 String add1 = reeee.getString("id");
                 data.add(add1);
                
                 model.addRow(data);
             }
               
                while(reeeee.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) testta.getModel();
                 String add1 = reeeee.getString("id");
                 data.add(add1);
                
                 model.addRow(data);
             }
             
         }catch(Exception e){
             e.printStackTrace();
         }
         
         
          String pay = "Select id from marksstore";
          String pa = "Select id from class";
         try{
             pre = con.prepareStatement(pay);
             ree = pre.executeQuery();
          PreparedStatement    pr = con.prepareStatement(pa);
            ResultSet re = pr.executeQuery();
             
             while(ree.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) payt.getModel();
                 String add1 = ree.getString("id");
                 data.add(add1);
                 model.addRow(data);
             }
              while(re.next()){
                 Vector<Object> data = new Vector<>();
                 model = (DefaultTableModel) payt.getModel();
                 String add1 = ree.getString("id");
                 data.add(add1);
                 model.addRow(data);
             }
             
         }catch(Exception e){
             e.printStackTrace();
         }

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
        back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        on = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        st = new javax.swing.JTextField();
        re = new javax.swing.JTextField();
        ad = new javax.swing.JTextField();
        did = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        upt = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        regist = new javax.swing.JButton();
        jScrollPane22 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        email = new javax.swing.JFormattedTextField();
        ph = new javax.swing.JFormattedTextField();
        ma = new javax.swing.JRadioButton();
        fe = new javax.swing.JCheckBox();
        com = new javax.swing.JComboBox<>();
        jScrollPane25 = new javax.swing.JScrollPane();
        dd = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        payt = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        cid = new javax.swing.JTextField();
        ts = new javax.swing.JTextField();
        am = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        makclear = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tt = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        stid = new javax.swing.JTextField();
        clid = new javax.swing.JTextField();
        deid = new javax.swing.JTextField();
        suid = new javax.swing.JTextField();
        classsid = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        testinterface = new javax.swing.JButton();
        testcancel = new javax.swing.JButton();
        testUpdate = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        stu = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        sub = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cla = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tes = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        classta = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        student = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        subjectta = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        testta = new javax.swing.JTable();
        scoreupd = new javax.swing.JButton();
        cance = new javax.swing.JButton();
        scorere = new javax.swing.JButton();
        exam = new javax.swing.JFormattedTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        subjectid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        subjectname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        subjectunits = new javax.swing.JTextField();
        SubApply = new javax.swing.JButton();
        close = new javax.swing.JButton();
        subupdate = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        sbt = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fid = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        fdeparid = new javax.swing.JTextField();
        facultyApply = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ft = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TableStudent = new javax.swing.JTable();
        StuTable = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        TableScore = new javax.swing.JTable();
        scoreView = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane16 = new javax.swing.JScrollPane();
        TableClass = new javax.swing.JTable();
        classview = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        Tabledepartment = new javax.swing.JTable();
        classview1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane18 = new javax.swing.JScrollPane();
        TableSection = new javax.swing.JTable();
        Sectionview = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        TableFaculty = new javax.swing.JTable();
        facultyview = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        Financialview = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        TableFinancial = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jScrollPane12 = new javax.swing.JScrollPane();
        TableSubject = new javax.swing.JTable();
        SubView = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        depart = new javax.swing.JTextField();
        dname = new javax.swing.JTextField();
        okdepartment = new javax.swing.JButton();
        cancelDepatment = new javax.swing.JButton();
        updateDepartment = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        dt = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        help = new javax.swing.JMenuItem();
        logoutf = new javax.swing.JMenuItem();
        cl = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 50, 0, 0));
        setResizable(false);

        back.setBackground(new java.awt.Color(204, 204, 255));
        back.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Back.png"))); // NOI18N
        back.setText("Logout");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Activity Font Page", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18))); // NOI18N
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1187, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Welcome Salutation", jPanel2);

        jLayeredPane1.setBackground(new java.awt.Color(51, 51, 51));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UpDate Form", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("FirstName : ");

        jLabel30.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("LastName : ");

        jLabel31.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("OtherName : ");

        jLabel32.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Gender : ");

        jLabel33.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Age : ");

        fn.setBackground(new java.awt.Color(255, 255, 255));
        fn.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fn.setForeground(new java.awt.Color(0, 0, 0));
        fn.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        fn.setPreferredSize(new java.awt.Dimension(200, 30));

        ln.setBackground(new java.awt.Color(255, 255, 255));
        ln.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ln.setForeground(new java.awt.Color(0, 0, 0));
        ln.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        ln.setPreferredSize(new java.awt.Dimension(200, 30));

        on.setBackground(new java.awt.Color(255, 255, 255));
        on.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        on.setForeground(new java.awt.Color(0, 0, 0));
        on.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        on.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel34.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("State : ");

        jLabel35.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Religion : ");

        jLabel36.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Address : ");

        jLabel37.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Phone No  : ");

        jLabel38.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Email   : ");

        jLabel39.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Department ID : ");

        st.setBackground(new java.awt.Color(255, 255, 255));
        st.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        st.setForeground(new java.awt.Color(0, 0, 0));
        st.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        st.setPreferredSize(new java.awt.Dimension(200, 30));

        re.setBackground(new java.awt.Color(255, 255, 255));
        re.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        re.setForeground(new java.awt.Color(0, 0, 0));
        re.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        re.setPreferredSize(new java.awt.Dimension(200, 30));

        ad.setBackground(new java.awt.Color(255, 255, 255));
        ad.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ad.setForeground(new java.awt.Color(0, 0, 0));
        ad.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        ad.setPreferredSize(new java.awt.Dimension(200, 30));
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });

        did.setBackground(new java.awt.Color(255, 255, 255));
        did.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        did.setForeground(new java.awt.Color(0, 0, 0));
        did.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        did.setPreferredSize(new java.awt.Dimension(200, 30));

        update.setBackground(new java.awt.Color(153, 153, 153));
        update.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(153, 153, 153));
        cancel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Delete.png"))); // NOI18N
        cancel.setText("Clear Text");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        upt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student id"
            }
        ));
        jScrollPane10.setViewportView(upt);

        jLabel28.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Student ID :");

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(204, 204, 204), null));
        id.setPreferredSize(new java.awt.Dimension(200, 30));

        regist.setBackground(new java.awt.Color(204, 204, 204));
        regist.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        regist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        regist.setText("Register");
        regist.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 153, 153)));
        regist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Fname", "Lname", "Oname", "Gender", "Age", "State", "Religion", "Address", "Phone", "Email", "Department"
            }
        ));
        jScrollPane22.setViewportView(table);

        email.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        ph.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ph.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        gg.add(ma);
        ma.setText("Male");

        gg.add(fe);
        fe.setText("Female");

        com.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        com.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36" }));

        dd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departmemt id"
            }
        ));
        jScrollPane25.setViewportView(dd);

        jLayeredPane1.setLayer(jLabel29, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel30, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel31, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel33, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(fn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ln, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(on, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel34, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel35, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel36, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel37, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel38, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel39, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(st, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(re, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(did, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(cancel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel28, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(id, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(regist, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane22, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(email, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ph, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(ma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(fe, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(com, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(regist, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(update)
                        .addGap(55, 55, 55)
                        .addComponent(cancel))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(on, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(ma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fe))
                                    .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(re, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(email)
                                            .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addGap(18, 18, 18)
                                        .addComponent(did, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28))
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34)
                                .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel36)
                                    .addComponent(ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(ph, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(did, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(on, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(ma)
                                    .addComponent(fe))
                                .addGap(18, 18, 18)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel33)
                                    .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(update)
                            .addComponent(cancel)
                            .addComponent(regist, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jScrollPane21.setViewportView(jLayeredPane1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 1113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab(" Student", jPanel5);

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Make Payment", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18))); // NOI18N

        payt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Class Id"
            }
        ));
        jScrollPane9.setViewportView(payt);

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel24.setText("Student ID :");

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel25.setText("Class ID :");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel26.setText("TermSection :");

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel27.setText("Amount :");

        sid.setPreferredSize(new java.awt.Dimension(200, 30));

        cid.setPreferredSize(new java.awt.Dimension(200, 30));

        ts.setPreferredSize(new java.awt.Dimension(200, 30));

        am.setPreferredSize(new java.awt.Dimension(200, 30));

        submit.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        submit.setText("Submit");
        submit.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        makclear.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        makclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Close.png"))); // NOI18N
        makclear.setText("Clear Text");
        makclear.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        makclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makclearActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        jButton11.setText("Update");
        jButton11.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(102, 102, 102)));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(37, 37, 37)
                        .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                            .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(makclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel25))
                                .addComponent(jLabel27))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(sid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(ts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submit)
                            .addComponent(makclear)
                            .addComponent(jButton11)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Make Payment", jPanel6);

        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Test Activity", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        tt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Id"
            }
        ));
        jScrollPane8.setViewportView(tt);

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel16.setText("Student Id :");

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel17.setText("Class Id : ");

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel18.setText("Department Id :");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel19.setText("Subject Id :");

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel20.setText("Class Section Id :");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel21.setText("CAT 1 :");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel22.setText("CAT 2 :");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel23.setText("CAT 3 :");

        stid.setMinimumSize(new java.awt.Dimension(200, 30));
        stid.setPreferredSize(new java.awt.Dimension(200, 30));

        clid.setMinimumSize(new java.awt.Dimension(200, 30));
        clid.setPreferredSize(new java.awt.Dimension(200, 30));

        deid.setMinimumSize(new java.awt.Dimension(200, 30));
        deid.setPreferredSize(new java.awt.Dimension(200, 30));

        suid.setMinimumSize(new java.awt.Dimension(200, 30));
        suid.setPreferredSize(new java.awt.Dimension(200, 30));

        classsid.setMinimumSize(new java.awt.Dimension(200, 30));
        classsid.setPreferredSize(new java.awt.Dimension(200, 30));

        c1.setMinimumSize(new java.awt.Dimension(200, 30));
        c1.setPreferredSize(new java.awt.Dimension(200, 30));

        c2.setMinimumSize(new java.awt.Dimension(200, 30));
        c2.setPreferredSize(new java.awt.Dimension(200, 30));

        c3.setMinimumSize(new java.awt.Dimension(200, 30));
        c3.setPreferredSize(new java.awt.Dimension(200, 30));

        testinterface.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        testinterface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        testinterface.setText("Apply");
        testinterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testinterfaceActionPerformed(evt);
            }
        });

        testcancel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        testcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Refresh.png"))); // NOI18N
        testcancel.setText("Reset");
        testcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testcancelActionPerformed(evt);
            }
        });

        testUpdate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        testUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        testUpdate.setText("Update");
        testUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(testinterface, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(testUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(testcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(stid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(clid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(deid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(suid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(classsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testinterface)
                            .addComponent(testcancel)
                            .addComponent(testUpdate)))))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tests", jPanel8);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Student id");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Subject id");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Class id");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setText("Test id ");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Exam Score");

        classta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class Id"
            }
        ));
        jScrollPane2.setViewportView(classta);

        student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "FirstName", "Lastname"
            }
        ));
        jScrollPane3.setViewportView(student);

        subjectta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Id"
            }
        ));
        jScrollPane4.setViewportView(subjectta);

        testta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Test Id"
            }
        ));
        jScrollPane5.setViewportView(testta);

        scoreupd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        scoreupd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        scoreupd.setText("Update");
        scoreupd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreupdActionPerformed(evt);
            }
        });

        cance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Undo.png"))); // NOI18N
        cance.setText("Clear Text");

        scorere.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        scorere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        scorere.setText("Register");
        scorere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scorereActionPerformed(evt);
            }
        });

        exam.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(stu, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cla, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tes, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(scorere)
                                .addGap(29, 29, 29)
                                .addComponent(scoreupd))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exam, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(1, 1, 1)))
                .addComponent(cance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(stu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(cla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(exam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scoreupd)
                            .addComponent(cance)
                            .addComponent(scorere))
                        .addGap(44, 44, 44))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(" Score", jPanel9);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject Update Page", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Subject Id ");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Name ");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Units");

        SubApply.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        SubApply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        SubApply.setText("Apply");
        SubApply.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 153, 153)));
        SubApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubApplyActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        close.setText("Clear Text");
        close.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 153, 153)));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        subupdate.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        subupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        subupdate.setText("Update");
        subupdate.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 153, 153)));
        subupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(SubApply, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(subupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(subjectunits, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(subjectid, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(subjectname, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subjectid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(subjectname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subjectunits, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 32, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubApply)
                    .addComponent(close)
                    .addComponent(subupdate))
                .addGap(24, 24, 24))
        );

        sbt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject Id"
            }
        ));
        jScrollPane7.setViewportView(sbt);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(" Subject", jPanel10);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Faculty Udate Page", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 2, 18))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Faculty  Id :");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Faculty Name  :");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Department Id :");

        fid.setPreferredSize(new java.awt.Dimension(200, 36));

        fname.setPreferredSize(new java.awt.Dimension(200, 36));

        fdeparid.setPreferredSize(new java.awt.Dimension(200, 36));

        facultyApply.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        facultyApply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        facultyApply.setText("Apply");
        facultyApply.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        facultyApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyApplyActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        clear.setText("Clear Text ");
        clear.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        jButton15.setText("Update");
        jButton15.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(153, 153, 153)));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(fdeparid, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(171, 171, 171))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(facultyApply, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fid, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fdeparid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facultyApply, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        ft.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Faculty Id"
            }
        ));
        jScrollPane1.setViewportView(ft);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Faculty", jPanel7);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1187, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 634, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", jPanel16);

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
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1355, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jScrollPane13.setViewportView(jPanel26);

        StuTable.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        StuTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        StuTable.setText("View Data");
        StuTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StuTableActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton9.setText("Clear Text");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton9)
                        .addGap(29, 29, 29)
                        .addComponent(StuTable, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StuTable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Students", jPanel17);

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

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jButton6)
                        .addGap(105, 105, 105)
                        .addComponent(scoreView))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scoreView, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Score", jPanel19);

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

        classview.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        classview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        classview.setText("View Data");
        classview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classviewActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton4.setText("Clear Text");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jButton4)
                        .addGap(37, 37, 37)
                        .addComponent(classview, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classview, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Class", jPanel20);

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

        classview1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        classview1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        classview1.setText("View Data");
        classview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classview1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton3.setText("Clear Text");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jButton3)
                        .addGap(72, 72, 72)
                        .addComponent(classview1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(classview1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Department", jPanel21);

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

        Sectionview.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Sectionview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        Sectionview.setText("View Data");
        Sectionview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SectionviewActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton14.setText("Clear Text");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jButton14)
                        .addGap(40, 40, 40)
                        .addComponent(Sectionview, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sectionview, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Class Section", jPanel22);

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

        facultyview.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        facultyview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        facultyview.setText("View Data");
        facultyview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyviewActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton16.setText("Clear Text");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jButton16)
                        .addGap(18, 18, 18)
                        .addComponent(facultyview, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(406, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(facultyview, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Faculty", jPanel23);

        Financialview.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Financialview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        Financialview.setText("View Data");
        Financialview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinancialviewActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jButton17)
                        .addGap(42, 42, 42)
                        .addComponent(Financialview, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(356, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Financialview, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Paid Fees", jPanel24);

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

        SubView.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        SubView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Download.png"))); // NOI18N
        SubView.setText("View Data");
        SubView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubViewActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Erase.png"))); // NOI18N
        jButton18.setText("Clear Text");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton18)
                        .addGap(33, 33, 33)
                        .addComponent(SubView, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SubView, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Subjects", jPanel18);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Department", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Department Id :");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Name  : ");

        depart.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        okdepartment.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        okdepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        okdepartment.setText("Apply");
        okdepartment.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 153, 153)));
        okdepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okdepartmentActionPerformed(evt);
            }
        });

        cancelDepatment.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cancelDepatment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Close.png"))); // NOI18N
        cancelDepatment.setText("Cl,ear Text");
        cancelDepatment.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 153, 153)));
        cancelDepatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelDepatmentActionPerformed(evt);
            }
        });

        updateDepartment.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        updateDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Apply.png"))); // NOI18N
        updateDepartment.setText("Update");
        updateDepartment.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(153, 153, 153)));
        updateDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(depart, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(101, Short.MAX_VALUE)
                        .addComponent(okdepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelDepatment, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(depart, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okdepartment)
                    .addComponent(cancelDepatment)
                    .addComponent(updateDepartment))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        dt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department Id"
            }
        ));
        jScrollPane6.setViewportView(dt);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(396, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Department", jPanel11);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane23.setViewportView(jTable);

        jScrollPane24.setViewportView(jScrollPane23);

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 844, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Tests", jPanel25);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Help book.png"))); // NOI18N
        jMenu1.setText("File");

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

        cl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/Close.png"))); // NOI18N
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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(544, 544, 544)
                .addComponent(back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Loginpage ind = new Loginpage();
        ind.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
        System.exit(0);
    }//GEN-LAST:event_clMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
         id.setText("");
       fn.setText("");
         ln.setText("");
         on.setText("");
       // (ma.isSelected() ? "Male" : "Fmale");
         com.setSelectedItem("");
        st.setText("");
         re.setText("");
        ad.setText("");
         ph.setText("");
        email.setText("");
        did.setText("");
    }//GEN-LAST:event_cancelActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String idnumber =  id.getText();
        String fname = fn.getText();
        String lname = ln.getText();
        String oname = on.getText();
        String gender = (ma.isSelected() ? "Male" : "Fmale");
        String ag = com.getSelectedItem().toString();
        String State = st.getText();
        String relig = re.getText();
        String address = ad.getText();
        String phone = ph.getText();
        String em = email.getText();
        String depart = did.getText();

        getstudent.setId(idnumber);
        getstudent.setFname(fname);
        getstudent.setLname(lname);
        getstudent.setOname(oname);
        getstudent.setGender(gender);
        getstudent.setAge(ag);
        getstudent.setState(State);
        getstudent.setReligion(relig);
        getstudent.setAddress(address);
        getstudent.setPhone(phone);
        getstudent.setEmail(em);
        getstudent.setDepartmentid(depart);

        studentcreate.update(getstudent);
        Vector<Object> data = new Vector<Object>();
                 model = (DefaultTableModel) table.getModel();
                 data.add("student"+id.getText());
                data.add( fn.getText());
                data.add( ln.getText());
                data.add( on.getText());
                data.add(gender);
                data.add( ag);
                data.add(st.getText());
                data.add( re.getText());
                data.add( ad.getText());
                data.add( ph.getText());
                data.add( email.getText());
                data.add( did.getText());
                model.addRow(data);
    }//GEN-LAST:event_updateActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adActionPerformed

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

    private void registActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registActionPerformed
        try {
            String idnumber = "student" + id.getText();
            String fname = fn.getText();
            String lname = ln.getText();
            String oname = on.getText();
            String gender = (ma.isSelected() ? "Male" : "Fmale");
            String ag = com.getSelectedItem().toString();
            String State = st.getText();
            String relig = re.getText();
            String address = ad.getText();
            String phone = ph.getText();
            String em = email.getText();
            String depart = did.getText();
            
            getstudent.setId(idnumber);
            getstudent.setFname(fname);
            getstudent.setLname(lname);
            getstudent.setOname(oname);
            getstudent.setGender(gender);
            getstudent.setAge(ag);
            getstudent.setState(State);
            getstudent.setReligion(relig);
            getstudent.setAddress(address);
            getstudent.setPhone(phone);
            getstudent.setEmail(em);
            getstudent.setDepartmentid(depart);
            
            studentcreate.create(getstudent);
            
            Vector<Object> data = new Vector<Object>();
            model = (DefaultTableModel) table.getModel();
            data.add("student" + id.getText());
            data.add(fn.getText());
            data.add(ln.getText());
            data.add(on.getText());
            data.add(gender);
            data.add(ag);
            data.add(st.getText());
            data.add(re.getText());
            data.add(ad.getText());
            data.add(ph.getText());
            data.add(email.getText());
            data.add(did.getText());
            model.addRow(data);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Massage "+e.getMessage());
        }
    }//GEN-LAST:event_registActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
         String idnumber = sid.getText();
        String fname = cid.getText();
        String lname = ts.getText();
        String oname = am.getText();
         

        getfinacial.setStudentid(idnumber);
        getfinacial.setClasid(fname);
        getfinacial.setTerns(lname);
        getfinacial.setAmount(oname);
        

       finacialcreate.create(getfinacial);
    }//GEN-LAST:event_submitActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String idnumber = sid.getText();
        String fname = cid.getText();
        String lname = ts.getText();
        String oname = am.getText();
         

        getfinacial.setStudentid(idnumber);
        getfinacial.setClasid(fname);
        getfinacial.setTerns(lname);
        getfinacial.setAmount(oname);
        

       finacialcreate.update(getfinacial);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void makclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makclearActionPerformed
       sid.setText("");
        cid.setText("");
        ts.setText("");
        am.setText("");
    }//GEN-LAST:event_makclearActionPerformed

    private void okdepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okdepartmentActionPerformed
       String departmentid = depart.getText();
       String departmentname = dname.getText();
       
       getdepartment.setId(departmentid);
       getdepartment.setName(departmentname);
       
       Departmentcreate.create(getdepartment);
       
       
    }//GEN-LAST:event_okdepartmentActionPerformed

    private void updateDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDepartmentActionPerformed
       String departmentid = depart.getText();
       String departmentname = dname.getText();
       
       getdepartment.setId(departmentid);
       getdepartment.setName(departmentname);
       
       Departmentcreate.update(getdepartment);
    }//GEN-LAST:event_updateDepartmentActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       model.setRowCount(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
      model.setRowCount(0);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
     model.setRowCount(0);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        model.setRowCount(0);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void testinterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testinterfaceActionPerformed
       
        try {
            String student00 = stid.getText();
            String clssid = clid.getText();
            String deparid = deid.getText();
            String subjid = suid.getText();
            String clasS = classsid.getText();
            int cc1 = Integer.parseInt(c1.getText());
            int cc2 = Integer.parseInt(c2.getText());
            int cc3 = Integer.parseInt(c3.getText());
            
            getTest.setStudentid(student00);
            getTest.setClassid(clssid);
            getTest.setDepartid(deparid);
            getTest.setSubid(subjid);
            getTest.setClassSection(clasS);
            getTest.setCa1(cc1);
            getTest.setCa2(cc2);
            getTest.setC3(cc3);
            
            if (stid.getText().isEmpty() && classsid.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in the Spaces provided to you before you Submit..");
            } else if (!stid.getText().isEmpty() && !classsid.getText().isEmpty()) {
                testcreate.create(getTest);
            }
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Invalid Format...   number Format Exception..");
        } catch (HeadlessException headlessException) {
            JOptionPane.showMessageDialog(null, "Invalid headless Exception...");
        }
    }//GEN-LAST:event_testinterfaceActionPerformed

    private void testUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testUpdateActionPerformed
           try {
            String student00 = stid.getText();
            String clssid = clid.getText();
            String deparid = deid.getText();
            String subjid = suid.getText();
            String clasS = classsid.getText();
            int cc1 = Integer.parseInt(c1.getText());
            int cc2 = Integer.parseInt(c2.getText());
            int cc3 = Integer.parseInt(c3.getText());
            
            getTest.setStudentid(student00);
            getTest.setClassid(clssid);
            getTest.setDepartid(deparid);
            getTest.setSubid(subjid);
            getTest.setClassSection(clasS);
            getTest.setCa1(cc1);
            getTest.setCa2(cc2);
            getTest.setC3(cc3);
            
            if (stid.getText().isEmpty() && classsid.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in the Spaces provided to you before you Submit..");
            } else if (!stid.getText().isEmpty() && !classsid.getText().isEmpty()) {
                testcreate.update(getTest);
            }
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(null, "Invalid Format...   number Format Exception..");
        } catch (HeadlessException headlessException) {
            JOptionPane.showMessageDialog(null, "Invalid headless Exception...");
        }
    }//GEN-LAST:event_testUpdateActionPerformed

    private void testcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testcancelActionPerformed
        stid.setText("");
          clid.setText("");
            deid.setText("");
              suid.setText("");
                classsid.setText("");
                  c1.setText("");
                    c2.setText("");
                      c3.setText("");
    }//GEN-LAST:event_testcancelActionPerformed

    private void scorereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scorereActionPerformed
          
             try {
            String studentid = stu.getText();
            String subjectid = sub.getText();
            String classid = cla.getText();
            String testid = tes.getText();
            String ex = exam.getText();
            
            getmark.setStudentid(studentid);
            getmark.setSubjectid(subjectid);
            getmark.setClasid(classid);
            getmark.setTestid(testid);
            getmark.setExams(ex);
            
            if (!stu.getText().isEmpty() && !cla.getText().isEmpty()) {
                markcreate.create(getmark);
            } else if (stu.getText().isEmpty() && cla.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in the Space provided to you..");
            }
        } catch (HeadlessException headlessException) {
            JOptionPane.showMessageDialog(null, "Sorry headless Exception...");
        }
    }//GEN-LAST:event_scorereActionPerformed

    private void scoreupdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreupdActionPerformed
       
             try {
            String studentid = stu.getText();
            String subjectid = sub.getText();
            String classid = cla.getText();
            String testid = tes.getText();
            String ex = exam.getText();
            
            getmark.setStudentid(studentid);
            getmark.setSubjectid(subjectid);
            getmark.setClasid(classid);
            getmark.setTestid(testid);
            getmark.setExams(ex);
            
            if (!stu.getText().isEmpty() && !cla.getText().isEmpty()) {
                markcreate.update(getmark);
            } else if (stu.getText().isEmpty() && cla.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in the Space provided to you..");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Sorry headless Exception..."+ e.getMessage());
        }
    }//GEN-LAST:event_scoreupdActionPerformed

    private void SubApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubApplyActionPerformed
        try {
            String subj = subjectid.getText();
            String name = subjectname.getText();
            String unit = subjectunits.getText();
            
            getsubject.setId(subj);
            getsubject.setName(name);
            getsubject.setUnit(unit);
            
            if (!subjectid.getText().isEmpty() && !subjectname.getText().isEmpty()) {
                subjectcreate.create(getsubject);
            } else if (subjectid.getText().isEmpty() && subjectname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in the Space provided to you..");
            }
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Sorry!!!! headless Exception" + e.getMessage());
        }
    }//GEN-LAST:event_SubApplyActionPerformed

    private void subupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subupdateActionPerformed
       try {
            String subj = subjectid.getText();
            String name = subjectname.getText();
            String unit = subjectunits.getText();
            
            getsubject.setId(subj);
            getsubject.setName(name);
            getsubject.setUnit(unit);
            
            if (!subjectid.getText().isEmpty() && !subjectname.getText().isEmpty()) {
                subjectcreate.update(getsubject);
            } else if (subjectid.getText().isEmpty() && subjectname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in the Space provided to you..");
            }
            
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Sorry!!!! headless Exception" + e.getMessage());
        }
    }//GEN-LAST:event_subupdateActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
           subjectid.setText("");
           subjectname.setText("");
           subjectunits.setText("");
    }//GEN-LAST:event_closeActionPerformed

    private void facultyApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyApplyActionPerformed
        try {
            String faculty = fid.getText();
            String facultyname = fname.getText();
            String facultyid = fdeparid.getText();
            
            getfaculty.setId(faculty);
            getfaculty.setName(facultyname);
            getfaculty.setDeparidf(facultyid);
            
            if (!fid.getText().isEmpty() && !fname.getText().isEmpty()) {
                facultycreate.create(getfaculty);
            } else if (fid.getText().isEmpty() && fname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in the Space provided to you..");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Sorry Error Massage ..."+ e.getMessage());
        }
       
    }//GEN-LAST:event_facultyApplyActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       try {
            String faculty = fid.getText();
            String facultyname = fname.getText();
            String facultyid = fdeparid.getText();
            
            getfaculty.setId(faculty);
            getfaculty.setName(facultyname);
            getfaculty.setDeparidf(facultyid);
            
            if (!fid.getText().isEmpty() && !fname.getText().isEmpty()) {
                facultycreate.update(getfaculty);
            } else if (fid.getText().isEmpty() && fname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill in the Space provided to you..");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Sorry Error Massage ..."+ e.getMessage());
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
         fid.setText("");
         fname.setText("");
         fdeparid.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void cancelDepatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelDepatmentActionPerformed
       depart.setText("");
       dname.setText("");
    }//GEN-LAST:event_cancelDepatmentActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Financialview;
    private javax.swing.JButton Sectionview;
    private javax.swing.JButton StuTable;
    private javax.swing.JButton SubApply;
    private javax.swing.JButton SubView;
    private javax.swing.JTable TableClass;
    private javax.swing.JTable TableFaculty;
    private javax.swing.JTable TableFinancial;
    private javax.swing.JTable TableScore;
    private javax.swing.JTable TableSection;
    private javax.swing.JTable TableStudent;
    private javax.swing.JTable TableSubject;
    private javax.swing.JTable Tabledepartment;
    private javax.swing.JTextField ad;
    private javax.swing.JTextField am;
    private javax.swing.JButton back;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JButton cance;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancelDepatment;
    private javax.swing.JTextField cid;
    private javax.swing.JMenu cl;
    private javax.swing.JTextField cla;
    private javax.swing.JTextField classsid;
    private javax.swing.JTable classta;
    private javax.swing.JButton classview;
    private javax.swing.JButton classview1;
    private javax.swing.JButton clear;
    private javax.swing.JTextField clid;
    private javax.swing.JButton close;
    private javax.swing.JComboBox<String> com;
    private javax.swing.JTable dd;
    private javax.swing.JTextField deid;
    private javax.swing.JTextField depart;
    private javax.swing.JTextField did;
    private javax.swing.JTextField dname;
    private javax.swing.JTable dt;
    private javax.swing.JFormattedTextField email;
    private javax.swing.JFormattedTextField exam;
    private javax.swing.JButton facultyApply;
    private javax.swing.JButton facultyview;
    private javax.swing.JTextField fdeparid;
    private javax.swing.JCheckBox fe;
    private javax.swing.JTextField fid;
    private javax.swing.JTextField fn;
    private javax.swing.JTextField fname;
    private javax.swing.JTable ft;
    private javax.swing.ButtonGroup gg;
    private javax.swing.JMenuItem help;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField ln;
    private javax.swing.JMenuItem logoutf;
    private javax.swing.JRadioButton ma;
    private javax.swing.JButton makclear;
    private javax.swing.JButton okdepartment;
    private javax.swing.JTextField on;
    private javax.swing.JTable payt;
    private javax.swing.JFormattedTextField ph;
    private javax.swing.JTextField re;
    private javax.swing.JButton regist;
    private javax.swing.JTable sbt;
    private javax.swing.JButton scoreView;
    private javax.swing.JButton scorere;
    private javax.swing.JButton scoreupd;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField st;
    private javax.swing.JTextField stid;
    private javax.swing.JTextField stu;
    private javax.swing.JTable student;
    private javax.swing.JTextField sub;
    private javax.swing.JTextField subjectid;
    private javax.swing.JTextField subjectname;
    private javax.swing.JTable subjectta;
    private javax.swing.JTextField subjectunits;
    private javax.swing.JButton submit;
    private javax.swing.JButton subupdate;
    private javax.swing.JTextField suid;
    private javax.swing.JTable table;
    private javax.swing.JTextField tes;
    private javax.swing.JButton testUpdate;
    private javax.swing.JButton testcancel;
    private javax.swing.JButton testinterface;
    private javax.swing.JTable testta;
    private javax.swing.JTextField ts;
    private javax.swing.JTable tt;
    private javax.swing.JButton update;
    private javax.swing.JButton updateDepartment;
    private javax.swing.JTable upt;
    // End of variables declaration//GEN-END:variables
}
