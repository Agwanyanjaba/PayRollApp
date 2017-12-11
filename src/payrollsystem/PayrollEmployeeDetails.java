package payrollsystem;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/*
 * Author is Wycliffe
 */
public class PayrollEmployeeDetails extends javax.swing.JFrame
{
    String empid,gender,position,surname,dateOfBirth,empType,dateOfHire,basicSal1,netSal1,netTax1,NetSal1;//declares the vairiables for the table viewing
    String strGender,strDateOfBirth,strDateOfHire,strEmpType,strNetTax,strPosition,strNetSal,strEmpPin,strEmpID,strDeptID,strAccountName,strAcademicQual,
            strFirstName,strSurname,strPhoneNum,strAddress,strJobGroup,strHouseAllowance,strTravelAll,strDeductions,strTotalTax,strBasicSal,strInstitute;
    String sql = "select * from employees";
    public String Search,searchID;
    ResultSet resultset;
    Statement statement,st;
    int currentRow = 0;
    float mothlybasicSal,AnnualBasicSal,basicSal;
  
    float travelAllowance = 3000,AnnualTravelAll;

    float NHIF = 240,NSSF = 3600,relief = 13944,deductions;//These values are Calculated per annum
    double GrossTax,NetTax,GrossSalary, netSalary,houseAll,netTax,netSal;
    private Object Object;

    public PayrollEmployeeDetails()
    {
     initComponents();
     jNetSal.setEditable(false);
     jTotalTax.setEditable(false);
     jDeductions.setEditable(false);
     jTravelAllowance.setEditable(false);
     jHouseAllowance.setEditable(false);
     jtxtNumOfHours.setEditable(false);
     jtxtOvertime.setEditable(false);
     try
       {
       Class.forName("com.mysql.jdbc.Driver");
       System.out.println("Driver Loaded");

       Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost/payroll","root","prof1989*");
       System.out.println("Database connected");
       statement = connection.createStatement(resultset.TYPE_SCROLL_SENSITIVE,resultset.CONCUR_UPDATABLE );
       resultset = statement.executeQuery(sql);
       System.out.print("Querry is executed\n");

        if(resultset.next())
        {

                jEmpID.setText(resultset.getString("EmployeeID"));
                jEmpDeptID.setText(resultset.getString("DepartmentID"));
                jAccountNum.setText(resultset.getString("AccountNumber"));
                jEmpSurname.setText(resultset.getString("Surname"));
                jEmpFirstName.setText(resultset.getString("FirstName"));
                jEmpGender.setText(resultset.getString("Gender"));
                jPhoneNumber.setText(resultset.getString("PhoneNumber"));
                jDateOfBirth.setText(resultset.getString("DateOfBirth"));
                jDateOfHire.setText(resultset.getString("DateOfHire"));
                jAddress.setText(resultset.getString("Address"));
                jJobGroup.setText(resultset.getString("JobGroup"));
                jBasicSal.setText(resultset.getString("BasicSalary"));
                jHouseAllowance.setText(resultset.getString("HouseAllowance"));
                jTravelAllowance.setText(resultset.getString("TravelAllowance"));
                jDeductions.setText(resultset.getString("Deductions"));
                jTotalTax.setText(resultset.getString("Tax"));
                jNetSal.setText(resultset.getString("NetSalary"));
                jEmpPIN.setText(resultset.getString("SSN"));
                jtxtAcademicQual.setText(resultset.getString("AcademicQualification"));
                jtxtPosition.setText(resultset.getString("CurrentPosition"));
                jtxtInst.setText(resultset.getString("LatestSchool"));
                jtxtEmpType.setText(resultset.getString("EmployeeCategory"));
                
           }

// model.addRow(new Object[]{id,surname,b,netTaxTable,netSalTable});
       }
       catch(SQLException e)
       {
       }
       catch(ClassNotFoundException e)
       {
       }

       DefaultTableModel model=(DefaultTableModel) jtblViewEmp.getModel();
       try
       {
       model.setNumRows(0);
       for(int i=model.getRowCount()-1;1>=0;i++)
	{
           resultset.insertRow();
        }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
         //JOptionPane.showConfirmDialog(null,"continue","click any button to continue",JOptionPane.DEFAULT_OPTION);
        }
        catch(SQLException e)
        {
         //JOptionPane.showConfirmDialog(null,"continue","click any button to continue",JOptionPane.DEFAULT_OPTION);
        }
        try
	{
            resultset = statement.executeQuery(sql);
            while(resultset.next())
            {
                empid =(resultset.getString(1));
                surname =(resultset.getString(4));
                gender = (resultset.getString(6));
                dateOfBirth = (resultset.getString(8));
                dateOfHire = (resultset.getString(9));
                basicSal1 = (resultset.getString(12));
                basicSal = Float.parseFloat(basicSal1);
                netTax1 = (resultset.getString(16));
                netTax = Double.parseDouble(netTax1);
                NetSal1 = (resultset.getString(17));
                netSal = Double.parseDouble(NetSal1);
                position = (resultset.getString(20));
                empType = (resultset.getString(21));
                model.addRow(new Object[]{empid,surname,gender,dateOfBirth,dateOfHire,empType,position,basicSal,netTax1,netSal});
            }
        }
	catch (SQLException ex)
	{
            Logger.getLogger(PayrollEmployeeDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelEmployees = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jusername = new javax.swing.JLabel();
        jEmpFirstName = new javax.swing.JTextField();
        jemail = new javax.swing.JLabel();
        jEmpSurname = new javax.swing.JTextField();
        jEmpGender = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jEmpID = new javax.swing.JTextField();
        jDateOfBirth = new javax.swing.JTextField();
        jDateOfHire = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jEmpDeptID = new javax.swing.JTextField();
        jJobGroup = new javax.swing.JTextField();
        jEmpPIN = new javax.swing.JTextField();
        jAddress = new javax.swing.JTextField();
        jAccountNum = new javax.swing.JTextField();
        jPhoneNumber = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBasicSal = new javax.swing.JTextField();
        jTravelAllowance = new javax.swing.JTextField();
        jHouseAllowance = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDeductions = new javax.swing.JTextField();
        jTotalTax = new javax.swing.JTextField();
        jNetSal = new javax.swing.JTextField();
        jpanelView = new javax.swing.JPanel();
        jEmpNext = new javax.swing.JButton();
        jEmpFirst = new javax.swing.JButton();
        jEmpPrevious = new javax.swing.JButton();
        jEmpLast = new javax.swing.JButton();
        jEmpSearch = new javax.swing.JButton();
        jEmpUpdate = new javax.swing.JButton();
        jpanelModify = new javax.swing.JPanel();
        jEmpDelete = new javax.swing.JButton();
        jexit = new javax.swing.JButton();
        jEmpSave = new javax.swing.JButton();
        jEmpCancel = new javax.swing.JButton();
        jEmpReport = new javax.swing.JButton();
        jAddEmpButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtxtAcademicQual = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtxtNumOfHours = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jtxtPosition = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jtxtInst = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jtxtOvertime = new javax.swing.JTextField();
        jtxtEmpType = new javax.swing.JTextField();
        jlblMotto = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel23 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblViewEmp = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jbtnAddnew = new javax.swing.JButton();
        jbtnLoadRecords = new javax.swing.JButton();
        jbtnFirst = new javax.swing.JButton();
        jbtnNext = new javax.swing.JButton();
        jbtnPrev = new javax.swing.JButton();
        jbtnLast = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jbtnSearch = new javax.swing.JButton();
        jbtnHelp = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmnuItemAppLock = new javax.swing.JMenuItem();
        jmnuExit = new javax.swing.JMenuItem();
        jmnuHelp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmnuOnlineHelp = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wybosoft Payroll System_2011");

        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.setToolTipText("Empoloyee Details");
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jusername.setText("Surname");

        jemail.setText("First Name");

        jLabel1.setText("Gender");

        jLabel2.setText("Employee ID");

        jLabel3.setText("Date Of Hire");

        jLabel4.setText("Date of Birth");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jemail)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jEmpGender)
                    .addComponent(jEmpFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(jEmpSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jEmpID)
                    .addComponent(jDateOfBirth, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateOfHire, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jusername)
                    .addComponent(jEmpSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jemail)
                    .addComponent(jEmpFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDateOfHire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jEmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Other Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel5.setText("Address");

        jLabel6.setText("Phone Number(#)");

        jLabel7.setText("Account Number");

        jLabel8.setText("Department ID");

        jLabel9.setText("Job Group");

        jLabel10.setText("PIN Number(#)");

        jEmpPIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpPINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPhoneNumber)
                    .addComponent(jAccountNum)
                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jJobGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jEmpPIN, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jEmpDeptID, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jEmpDeptID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jAccountNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jJobGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel10))
                    .addComponent(jEmpPIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel11.setText("Basic Salary");

        jLabel12.setText("Travel Allowance");

        jLabel13.setText("House Alowance");

        jBasicSal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                calulateAllowance(evt);
                jBasicSalFocusLost(evt);
            }
        });

        jLabel14.setText("Deductions");

        jLabel15.setText("Total tax");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel16.setText("Net Salary");

        jNetSal.setBackground(new java.awt.Color(240, 240, 240));
        jNetSal.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jNetSal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jHouseAllowance, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jBasicSal, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jTravelAllowance, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jNetSal)
                        .addComponent(jDeductions, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                    .addComponent(jTotalTax, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTravelAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jTotalTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jHouseAllowance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBasicSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jDeductions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jNetSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanelView.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View java Users", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N
        jpanelView.setFont(new java.awt.Font("Tahoma", 1, 11));

        jEmpNext.setFont(new java.awt.Font("Tahoma", 1, 11));
        jEmpNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Next-01.png"))); // NOI18N
        jEmpNext.setText("Next");
        jEmpNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpNextActionPerformed(evt);
            }
        });

        jEmpFirst.setFont(new java.awt.Font("Tahoma", 1, 11));
        jEmpFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button First-01.png"))); // NOI18N
        jEmpFirst.setText("First");
        jEmpFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpFirstActionPerformed(evt);
            }
        });

        jEmpPrevious.setFont(new java.awt.Font("Tahoma", 1, 11));
        jEmpPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Previous-01.png"))); // NOI18N
        jEmpPrevious.setText("Previous");
        jEmpPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpPreviousActionPerformed(evt);
            }
        });

        jEmpLast.setFont(new java.awt.Font("Tahoma", 1, 11));
        jEmpLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Last-01.png"))); // NOI18N
        jEmpLast.setText("Last");
        jEmpLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpLastActionPerformed(evt);
            }
        });

        jEmpSearch.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jEmpSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Lens-01.png"))); // NOI18N
        jEmpSearch.setText("Search");
        jEmpSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpSearchActionPerformed(evt);
            }
        });

        jEmpUpdate.setFont(new java.awt.Font("Tahoma", 1, 11));
        jEmpUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Refresh-01.png"))); // NOI18N
        jEmpUpdate.setText("Upadate");
        jEmpUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelViewLayout = new javax.swing.GroupLayout(jpanelView);
        jpanelView.setLayout(jpanelViewLayout);
        jpanelViewLayout.setHorizontalGroup(
            jpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEmpFirst)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEmpNext, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jEmpPrevious)
                .addGap(18, 18, 18)
                .addComponent(jEmpLast, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEmpUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jEmpSearch))
        );
        jpanelViewLayout.setVerticalGroup(
            jpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEmpUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmpSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmpFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmpNext, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmpPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmpLast, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jpanelModify.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "View java Users", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jEmpDelete.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jEmpDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Delete-01.png"))); // NOI18N
        jEmpDelete.setText("Delete");
        jEmpDelete.setToolTipText("Deletes record ");
        jEmpDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpDeleteActionPerformed(evt);
            }
        });

        jexit.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Turn Off-01.png"))); // NOI18N
        jexit.setText("Exit");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });

        jEmpSave.setFont(new java.awt.Font("Tahoma", 1, 11));
        jEmpSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/ICO/save.png"))); // NOI18N
        jEmpSave.setText("Save");
        jEmpSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpSaveActionPerformed(evt);
            }
        });

        jEmpCancel.setFont(new java.awt.Font("Times New Roman", 1, 11));
        jEmpCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Cancel-01.png"))); // NOI18N
        jEmpCancel.setText("Cancel");
        jEmpCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEmpCancelActionPerformed(evt);
            }
        });

        jEmpReport.setFont(new java.awt.Font("Tahoma", 1, 11));
        jEmpReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Folder Blue-01.png"))); // NOI18N
        jEmpReport.setText("Report");
        jEmpReport.setToolTipText("Gives a report ");

        jAddEmpButton.setFont(new java.awt.Font("Tahoma", 1, 11));
        jAddEmpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Add-01.png"))); // NOI18N
        jAddEmpButton.setText("Add New");
        jAddEmpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddEmpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelModifyLayout = new javax.swing.GroupLayout(jpanelModify);
        jpanelModify.setLayout(jpanelModifyLayout);
        jpanelModifyLayout.setHorizontalGroup(
            jpanelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelModifyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jAddEmpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addComponent(jEmpSave, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jEmpCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jEmpDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jEmpReport)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelModifyLayout.setVerticalGroup(
            jpanelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModifyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jAddEmpButton)
                    .addComponent(jEmpReport, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmpDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmpCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEmpSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Academic qualification", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel17.setText("Academic Qualification");

        jLabel18.setText("Employee Type");

        jLabel19.setText("Number of Worked");

        jLabel20.setText("Current Position");

        jLabel21.setText("Latest Institution");

        jtxtInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtInstActionPerformed(evt);
            }
        });

        jLabel22.setText("Overtime Hours");

        jtxtEmpType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEmpTypeActionPerformed(evt);
            }
        });
        jtxtEmpType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                NewEmployeeRegiter(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtEmpType)
                    .addComponent(jtxtInst)
                    .addComponent(jtxtAcademicQual, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtNumOfHours, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jtxtOvertime, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxtAcademicQual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jtxtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jtxtInst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jtxtNumOfHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jtxtOvertime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtEmpType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jlblMotto.setFont(new java.awt.Font("Times New Roman", 3, 14));
        jlblMotto.setForeground(new java.awt.Color(255, 51, 51));
        jlblMotto.setText("Strategic innovation and invention   Institution...");

        jToolBar2.setBackground(new java.awt.Color(204, 0, 0));
        jToolBar2.setRollover(true);

        jLabel23.setBackground(new java.awt.Color(204, 0, 0));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 12));
        jLabel23.setForeground(new java.awt.Color(204, 0, 0));
        jLabel23.setText("Wybosoft University College...A completely integreted Payroll system                                  P.O Box 2222-60999, Nairobi-Kenya; E-Mail  Wybosoft@education.edu.ke");
        jLabel23.setToolTipText("Bank Payment details");

        javax.swing.GroupLayout jPanelEmployeesLayout = new javax.swing.GroupLayout(jPanelEmployees);
        jPanelEmployees.setLayout(jPanelEmployeesLayout);
        jPanelEmployeesLayout.setHorizontalGroup(
            jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployeesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmployeesLayout.createSequentialGroup()
                        .addGroup(jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(295, Short.MAX_VALUE))
                    .addGroup(jPanelEmployeesLayout.createSequentialGroup()
                        .addGroup(jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jpanelModify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jpanelView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(jlblMotto)
                        .addGap(101, 101, 101))))
            .addGroup(jPanelEmployeesLayout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 1276, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelEmployeesLayout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 1276, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelEmployeesLayout.setVerticalGroup(
            jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmployeesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, 0, 127, Short.MAX_VALUE))
                .addGroup(jPanelEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmployeesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jpanelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEmployeesLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jlblMotto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Employees details", jPanelEmployees);

        jtblViewEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Surname", "Gender", "Date of Birth", "Date of Hire", "Employee Type", "Position", "Basic Salary", "Net Tax", "Net Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblViewEmp.setColumnSelectionAllowed(true);
        jtblViewEmp.setEnabled(false);
        jtblViewEmp.setRowHeight(20);
        jtblViewEmp.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(jtblViewEmp);
        jtblViewEmp.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtblViewEmp.getColumnModel().getColumn(0).setMaxWidth(80);
        jtblViewEmp.getColumnModel().getColumn(1).setMaxWidth(1100);
        jtblViewEmp.getColumnModel().getColumn(2).setMaxWidth(70);
        jtblViewEmp.getColumnModel().getColumn(3).setMaxWidth(80);
        jtblViewEmp.getColumnModel().getColumn(4).setMaxWidth(80);
        jtblViewEmp.getColumnModel().getColumn(5).setMaxWidth(800);
        jtblViewEmp.getColumnModel().getColumn(6).setMaxWidth(1200);
        jtblViewEmp.getColumnModel().getColumn(7).setMaxWidth(110);
        jtblViewEmp.getColumnModel().getColumn(8).setMaxWidth(90);
        jtblViewEmp.getColumnModel().getColumn(9).setMaxWidth(100);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(346, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View All Employees", jPanel6);

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setRollover(true);
        jToolBar1.setToolTipText("Employees form toolbar");
        jToolBar1.setAlignmentX(1);

        jbtnAddnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button New-01.png"))); // NOI18N
        jbtnAddnew.setToolTipText("Add new Employee");
        jbtnAddnew.setFocusable(false);
        jbtnAddnew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnAddnew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnAddnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddnewActionPerformed(evt);
            }
        });
        jbtnAddnew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbtnAddnewKeyPressed(evt);
            }
        });
        jToolBar1.add(jbtnAddnew);

        jbtnLoadRecords.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Database Download Data-01.png"))); // NOI18N
        jbtnLoadRecords.setToolTipText("View Employees Record");
        jbtnLoadRecords.setFocusable(false);
        jbtnLoadRecords.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnLoadRecords.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnLoadRecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLoadRecordsActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnLoadRecords);

        jbtnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button First-01.png"))); // NOI18N
        jbtnFirst.setToolTipText("Move to First Record");
        jbtnFirst.setFocusable(false);
        jbtnFirst.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnFirst.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbtnFirst);

        jbtnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Next-01.png"))); // NOI18N
        jbtnNext.setToolTipText("Move to Next Record");
        jbtnNext.setFocusable(false);
        jbtnNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnNext.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNextActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnNext);

        jbtnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Previous-01.png"))); // NOI18N
        jbtnPrev.setToolTipText("Move to Previous Reccord");
        jbtnPrev.setFocusable(false);
        jbtnPrev.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPrev.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbtnPrev);

        jbtnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Last-01.png"))); // NOI18N
        jbtnLast.setToolTipText("Move to Last Record");
        jbtnLast.setFocusable(false);
        jbtnLast.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnLast.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbtnLast);

        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton6);

        jbtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Lens-01.png"))); // NOI18N
        jbtnSearch.setToolTipText("Serach a given  record");
        jbtnSearch.setFocusable(false);
        jbtnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnSearch);

        jbtnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Help-01.png"))); // NOI18N
        jbtnHelp.setToolTipText("Employees Form Help");
        jbtnHelp.setFocusable(false);
        jbtnHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnHelp.setIconTextGap(8);
        jbtnHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnHelpActionPerformed(evt);
            }
        });
        jToolBar1.add(jbtnHelp);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setMnemonic('E');
        jMenu1.setText("Employees");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setMnemonic('D');
        jMenuItem3.setText("View Employee Details");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jmnuItemAppLock.setText("Lock Application");
        jmnuItemAppLock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuItemAppLockActionPerformed(evt);
            }
        });
        jMenu1.add(jmnuItemAppLock);

        jmnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmnuExit.setMnemonic('E');
        jmnuExit.setText("Exit");
        jmnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(jmnuExit);

        jMenuBar1.add(jMenu1);

        jmnuHelp.setMnemonic('H');
        jmnuHelp.setText("Help");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Help-01.png"))); // NOI18N
        jMenuItem1.setMnemonic('H');
        jMenuItem1.setText("Off-Line Help");
        jMenuItem1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/ICO/wybosoft.gif"))); // NOI18N
        jmnuHelp.add(jMenuItem1);

        jmnuOnlineHelp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        jmnuOnlineHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/World-01.png"))); // NOI18N
        jmnuOnlineHelp.setText("Online Help");
        jmnuOnlineHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuOnlineHelpActionPerformed(evt);
            }
        });
        jmnuHelp.add(jmnuOnlineHelp);

        jMenuBar1.add(jmnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1583, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(286, 286, 286))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(834, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddnewActionPerformed
        // TODO add your handling code here:
        try
        {
            currentRow = resultset.getRow();
            jEmpID.setText(null);
            jEmpDeptID.setText(null);
            jAccountNum.setText(null);
            jEmpSurname.setText(null);
            jEmpFirstName.setText(null);
            jEmpGender.setText(null);
            jPhoneNumber.setText(null);
            jDateOfBirth.setText(null);
            jDateOfHire.setText(null);
            jAddress.setText(null);
            jJobGroup.setText(null);
            jBasicSal.setText(null);
            jHouseAllowance.setText(null);
            jTravelAllowance.setText(null);
            jDeductions.setText(null);
            jTotalTax.setText(null);
            jNetSal.setText(null);
            jEmpPIN.setText(null);
            //jEmpView.setEnabled(false);
            jEmpFirst.setEnabled(false);
            jEmpNext.setEnabled(false);
            jEmpPrevious.setEnabled(false);
            jEmpLast.setEnabled(false);
            jexit.setEnabled(false);
            jEmpDelete.setEnabled(false);
            jEmpCancel.setEnabled(true);
            jEmpSave.setEnabled(true);
            jAddEmpButton.setEnabled(true);
        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jbtnAddnewActionPerformed

    private void jbtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNextActionPerformed
        // TODO add your handling code here:
        try {
            if(resultset.next()) {
            jEmpID.setText(resultset.getString(1));
            jEmpDeptID.setText(resultset.getString(2));
            jAccountNum.setText(resultset.getString(3));
            jEmpSurname.setText(resultset.getString(4));
            jEmpFirstName.setText(resultset.getString(5));
            jEmpGender.setText(resultset.getString(6));
            jPhoneNumber.setText(resultset.getString(7));
            jDateOfBirth.setText(resultset.getString(8));
            jDateOfHire.setText(resultset.getString(9));
            jAddress.setText(resultset.getString(10));
            jJobGroup.setText(resultset.getString(11));
            jBasicSal.setText(resultset.getString(12));
            jHouseAllowance.setText(resultset.getString(13));
            jTravelAllowance.setText(resultset.getString(14));
            jDeductions.setText(resultset.getString(15));
            jTotalTax.setText(resultset.getString(16));
            jNetSal.setText(resultset.getString(17));
            jEmpPIN.setText(resultset.getString(18));
            jtxtAcademicQual.setText(resultset.getString(19));
            jtxtPosition.setText(resultset.getString(20));
            jtxtInst.setText(resultset.getString(21));
            } 
            else
            {
                resultset.previous();
                JOptionPane.showMessageDialog(null, "Reached the end of Records","Employee Details",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(SQLException e) {

        }
    }//GEN-LAST:event_jbtnNextActionPerformed

    private void jbtnAddnewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbtnAddnewKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnAddnewKeyPressed

    private void jmnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuExitActionPerformed
        //Exits the epmloyee details form to the home page form
        new PayrollHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnuExitActionPerformed

    private void jbtnLoadRecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoadRecordsActionPerformed
        // This code loads all the epmloyee details.
    }//GEN-LAST:event_jbtnLoadRecordsActionPerformed

    private void NewEmployeeRegiter(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NewEmployeeRegiter
        // This code enables addition of new casual employee
        if(jtxtEmpType.getText().equals("Casual")) {
            jtxtNumOfHours.setEditable(true);
            jtxtOvertime.setEditable(true);
        }
}//GEN-LAST:event_NewEmployeeRegiter

    private void jtxtEmpTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEmpTypeActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jtxtEmpTypeActionPerformed

    private void jtxtInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtInstActionPerformed

}//GEN-LAST:event_jtxtInstActionPerformed

    private void jAddEmpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddEmpButtonActionPerformed
        // TODO add your handling code here:
        try {

            currentRow = resultset.getRow();
            jEmpID.setText(null);
            jEmpDeptID.setText(null);
            jAccountNum.setText(null);
            jEmpSurname.setText(null);
            jEmpFirstName.setText(null);
            jEmpGender.setText(null);
            jPhoneNumber.setText(null);
            jDateOfBirth.setText(null);
            jDateOfHire.setText(null);
            jAddress.setText(null);
            jJobGroup.setText(null);
            jBasicSal.setText(null);
            jHouseAllowance.setText(null);
            jTravelAllowance.setText(null);
            jDeductions.setText(null);
            jTotalTax.setText(null);
            jNetSal.setText(null);
            jEmpPIN.setText(null);
            jtxtEmpType.setText(null);
            jtxtNumOfHours.setText(null);
            jtxtOvertime.setText(null);
            jtxtAcademicQual.setText(null);
            jtxtInst.setText(null);
            jtxtPosition.setText(null);
            jtxtEmpType.setText(null);

            jEmpFirst.setEnabled(false);
            jEmpNext.setEnabled(false);
            jEmpPrevious.setEnabled(false);
            jEmpLast.setEnabled(false);
            jexit.setEnabled(false);
            jEmpDelete.setEnabled(false);
            jEmpCancel.setEnabled(true);
            jEmpSave.setEnabled(true);
            jAddEmpButton.setEnabled(true);
            jEmpSearch.setEnabled(false);
            jEmpReport.setEnabled(false);
            jEmpUpdate.setEnabled(false);

        } catch(SQLException e) {
            JOptionPane.showMessageDialog(this,e);
        }
}//GEN-LAST:event_jAddEmpButtonActionPerformed

    private void jEmpCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpCancelActionPerformed
        // TODO add your handling code here:
        try {
            resultset.absolute(currentRow++);

            jEmpID.setText(resultset.getString(1));
            jEmpDeptID.setText(resultset.getString(2));
            jAccountNum.setText(resultset.getString(3));
            jEmpSurname.setText(resultset.getString(4));
            jEmpFirstName.setText(resultset.getString(5));
            jEmpGender.setText(resultset.getString(6));
            jPhoneNumber.setText(resultset.getString(7));
            jDateOfBirth.setText(resultset.getString(8));
            jDateOfHire.setText(resultset.getString(9));
            jAddress.setText(resultset.getString(10));
            jJobGroup.setText(resultset.getString(11));
            jBasicSal.setText(resultset.getString(12));
            jHouseAllowance.setText(resultset.getString(13));
            jTravelAllowance.setText(resultset.getString(14));
            jDeductions.setText(resultset.getString(15));
            jTotalTax.setText(resultset.getString(16));
            jNetSal.setText(resultset.getString(17));
            jEmpPIN.setText(resultset.getString(18));
            jtxtAcademicQual.setText(resultset.getString(19));
            jtxtPosition.setText(resultset.getString(20));
            jtxtInst.setText(resultset.getString(21));
            jtxtEmpType.setText(resultset.getString(22));

            //jEmpView.setEnabled(true);
            jEmpFirst.setEnabled(true);
            jEmpNext.setEnabled(true);
            jEmpPrevious.setEnabled(true);
            jEmpLast.setEnabled(true);
            jexit.setEnabled(true);
            jEmpDelete.setEnabled(true);
            jEmpCancel.setEnabled(false);
            jEmpSave.setEnabled(true);
            jAddEmpButton.setEnabled(true);
            jtxtNumOfHours.setEditable(false);
            jtxtOvertime.setEditable(false);
            jEmpSearch.setEnabled(true);
            jEmpReport.setEnabled(true);
            jEmpUpdate.setEnabled(true);
            jEmpCancel.setEnabled(true);
            
        } catch(SQLException e) {

        }
}//GEN-LAST:event_jEmpCancelActionPerformed

    private void jEmpSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpSaveActionPerformed
        // This code saves records to the database

        try {
            strEmpID =jEmpID.getText();
            strDeptID  = jEmpDeptID.getText();
            strAccountName = jAccountNum.getText();
            surname = jEmpSurname.getText();
            strFirstName = jEmpFirstName.getText();
            strGender = jEmpGender.getText();
            strPhoneNum = jPhoneNumber.getText();
            strDateOfBirth = jDateOfBirth.getText();
            strDateOfHire = jDateOfHire.getText();
            strAddress = jAddress.getText();
            strJobGroup = jJobGroup.getText();
            strBasicSal  = jBasicSal.getText();
            strHouseAllowance = jHouseAllowance.getText();
            strTravelAll = jTravelAllowance.getText();
            strDeductions  = jDeductions.getText();
            strTotalTax = jTotalTax.getText();
            strNetSal = jNetSal.getText();
            strEmpPin = jEmpPIN.getText();
            strPosition = jtxtPosition.getText();
            strEmpType = jtxtEmpType.getText();
            strInstitute = jtxtInst.getText();
            strAcademicQual = jtxtAcademicQual.getText();

            resultset.moveToInsertRow();
            statement.executeUpdate("insert into employees values('" + strEmpID + "','" + strDeptID + "','"+strAccountName+"','"+strSurname+
                    "','"+strFirstName+"','"+strGender+"','"+strPhoneNum+"','"+strDateOfBirth+"','"+strDateOfHire+"','"+strAddress+"','"+strJobGroup+
                    "','"+strBasicSal+"','"+strHouseAllowance+"','"+strTravelAll+"','"+strDeductions+"','"+strTotalTax+"','"+strNetSal+"','"+strEmpPin+"','"+strAcademicQual+
                    "','"+strPosition+"','"+strEmpType+"','"+strInstitute+"')");

            //jEmpView.setEnabled(true);
            jEmpFirst.setEnabled(true);
            jEmpNext.setEnabled(true);
            jEmpPrevious.setEnabled(true);
            jEmpLast.setEnabled(true);
            jexit.setEnabled(true);
            jEmpDelete.setEnabled(true);
            jEmpCancel.setEnabled(false);
            jEmpSave.setEnabled(false);
            jAddEmpButton.setEnabled(true);

            JOptionPane.showMessageDialog(null, "Record has been saved successfully!");
            resultset = statement.executeQuery(sql);

            resultset.next();
            jEmpID.setText(resultset.getString(1));
            jEmpDeptID.setText(resultset.getString(2));
            jAccountNum.setText(resultset.getString(3));
            jEmpSurname.setText(resultset.getString(4));
            jEmpFirstName.setText(resultset.getString(5));
            jEmpGender.setText(resultset.getString(6));
            jPhoneNumber.setText(resultset.getString(7));
            jDateOfBirth.setText(resultset.getString(8));
            jDateOfHire.setText(resultset.getString(9));
            jAddress.setText(resultset.getString(10));
            jJobGroup.setText(resultset.getString(11));
            jBasicSal.setText(resultset.getString(12));
            jHouseAllowance.setText(resultset.getString(13));
            jTravelAllowance.setText(resultset.getString(14));
            jDeductions.setText(resultset.getString(15));
            jTotalTax.setText(resultset.getString(16));
            jNetSal.setText(resultset.getString(17));
            jEmpPIN.setText(resultset.getString(18));
            jtxtAcademicQual.setText(resultset.getString(19));
            jtxtPosition.setText(resultset.getString(20));
            jtxtInst.setText(resultset.getString(21));

            
            
            jEmpFirst.setEnabled(true);
            jEmpNext.setEnabled(true);
            jEmpPrevious.setEnabled(true);
            jEmpLast.setEnabled(true);
            jexit.setEnabled(true);
            jEmpDelete.setEnabled(true);
            jEmpCancel.setEnabled(true);
            jEmpSave.setEnabled(true);
            jAddEmpButton.setEnabled(true);
            jEmpSearch.setEnabled(true);
            jEmpReport.setEnabled(true);
            jEmpUpdate.setEnabled(true);

        } catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,"Duplicate primary key entered, Retry entering new key"+e+"\n");
            System.out.print(e);
            
        }



    }//GEN-LAST:event_jEmpSaveActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        // TODO add your handling code here:
                String ObjButtons[] = {"Yes","No"};
		int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Wybosoft Payroll System",
                        JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,ObjButtons,ObjButtons[1]);
		if(PromptResult==0)
                {
			new PayrollHome().setVisible(true);
                        this.dispose();

                 }
        
}//GEN-LAST:event_jexitActionPerformed

    private void jEmpDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpDeleteActionPerformed
        // This code Deletes records from the database
       
        try {
                String ObjButtons[] = {"Yes","No"};
		int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to Delete the Record","Wybosoft Payroll System",
                        JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);
		if(PromptResult==0)
                {
                resultset.deleteRow();
                JOptionPane.showMessageDialog(null, "Record has been Deleted successfully!","Wybosoft Payroll System",JOptionPane.INFORMATION_MESSAGE);
                //statement.close();
                //resultset.close();
                resultset = statement.executeQuery(sql);
                resultset.next();
                jEmpID.setText(resultset.getString("EmployeeID"));
                jEmpDeptID.setText(resultset.getString("DepartmentID"));
                jAccountNum.setText(resultset.getString("AccountNumber"));
                jEmpSurname.setText(resultset.getString("Surname"));
                jEmpFirstName.setText(resultset.getString("FirstName"));
                jEmpGender.setText(resultset.getString("Gender"));
                jPhoneNumber.setText(resultset.getString("PhoneNumber"));
                jDateOfBirth.setText(resultset.getString("DateOfBirth"));
                jDateOfHire.setText(resultset.getString("DateOfHire"));
                jAddress.setText(resultset.getString("Address"));
                jJobGroup.setText(resultset.getString("JobGroup"));
                jBasicSal.setText(resultset.getString("BasicSalary"));
                jHouseAllowance.setText(resultset.getString("HouseAllowance"));
                jTravelAllowance.setText(resultset.getString("TravelAllowance"));
                jDeductions.setText(resultset.getString("Deductions"));
                jTotalTax.setText(resultset.getString("Tax"));
                jNetSal.setText(resultset.getString("NetSalary"));
                jEmpPIN.setText(resultset.getString("SSN"));
                jtxtAcademicQual.setText(resultset.getString("AcademicQualification"));
                jtxtPosition.setText(resultset.getString("CurrentPosition"));
                jtxtInst.setText(resultset.getString("LatestSchool"));
                jtxtEmpType.setText(resultset.getString("EmployeeCategory"));
            }
        } 
        catch(SQLException e)
        {
           System.out.print(e);
            //JOptionPane.showMessageDialog(null, "Delete the emloyee's Bank Details First", "Employee Delete", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jEmpDeleteActionPerformed

    private void jEmpUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpUpdateActionPerformed
        // This code updates changes made to records in the database
        try {
           
            strEmpID = jEmpID.getText();
            strDeptID  = jEmpDeptID.getText();
            strAccountName = jAccountNum.getText();
            strSurname = jEmpSurname.getText();
            strFirstName = jEmpFirstName.getText();
            strGender = jEmpGender.getText();
            strPhoneNum = jPhoneNumber.getText();
            strDateOfBirth = jDateOfBirth.getText();
            strDateOfHire = jDateOfHire.getText();
            strAddress = jAddress.getText();
            strJobGroup = jJobGroup.getText();
            strBasicSal  = jBasicSal.getText();
            strHouseAllowance = jHouseAllowance.getText();
            strTravelAll = jTravelAllowance.getText();
            strDeductions  = jDeductions.getText();
            strTotalTax = jTotalTax.getText();
            strNetSal = jNetSal.getText();
            strEmpPin = jEmpPIN.getText();
            strPosition = jtxtPosition.getText();
            strEmpType = jtxtEmpType.getText();
            strInstitute = jtxtInst.getText();

            //resultset.updateString("EmployeeID",strEmpID );
            resultset.updateString("DepartmentID",strDeptID);
            resultset.updateString("AccountNumber",strAccountName);
            resultset.updateString("Surname",strSurname);
            resultset.updateString("FirstName",strFirstName);
            //resultset.updateString("Gender",strGender);
            resultset.updateString("PhoneNumber",strPhoneNum);
            resultset.updateString("DateOfBirth",strDateOfBirth);
            resultset.updateString("DateOfHire",strDateOfHire);
            resultset.updateString("Address",strAddress);
            resultset.updateString("JobGroup",strJobGroup);
            resultset.updateString("BasicSalary",strBasicSal);
            resultset.updateString("HouseAllowance",strHouseAllowance);
            resultset.updateString("TravelAllowance",strTravelAll);
            resultset.updateString("Deductions",strDeductions);
            resultset.updateString("Tax",strTotalTax);
            resultset.updateString("NetSalary",strNetSal);
            resultset.updateString("SSN",strEmpPin);
            resultset.updateString("AcademicQualification",strAcademicQual);
            resultset.updateString("CurrentPosition", strPosition);
            resultset.updateString("EmployeeCategory", strEmpType);
            resultset.updateString("LatestSchool", strInstitute);

            resultset.updateRow();
            JOptionPane.showMessageDialog(null,"The Record has been Updated","Employee Upadate",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException err)
        {
            System.out.println(err.getMessage() );
        }
    }//GEN-LAST:event_jEmpUpdateActionPerformed

    private void jEmpSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpSearchActionPerformed

        Search =  JOptionPane.showInputDialog("Enter employeeID of the Employee");
        try
        {
            resultset = statement.executeQuery("select * from employees where EmployeeID ='"+ Search +"'");
            if(resultset.next())
            {
                jEmpID.setText(resultset.getString("EmployeeID"));
                jEmpDeptID.setText(resultset.getString("DepartmentID"));
                jAccountNum.setText(resultset.getString("AccountNumber"));
                jEmpSurname.setText(resultset.getString("Surname"));
                jEmpFirstName.setText(resultset.getString("FirstName"));
                jEmpGender.setText(resultset.getString("Gender"));
                jPhoneNumber.setText(resultset.getString("PhoneNumber"));
                jDateOfBirth.setText(resultset.getString("DateOfBirth"));
                jDateOfHire.setText(resultset.getString("DateOfHire"));
                jAddress.setText(resultset.getString("Address"));
                jJobGroup.setText(resultset.getString("JobGroup"));
                jBasicSal.setText(resultset.getString("BasicSalary"));
                jHouseAllowance.setText(resultset.getString("HouseAllowance"));
                jTravelAllowance.setText(resultset.getString("TravelAllowance"));
                jDeductions.setText(resultset.getString("Deductions"));
                jTotalTax.setText(resultset.getString("Tax"));
                jNetSal.setText(resultset.getString("NetSalary"));
                jEmpPIN.setText(resultset.getString("SSN"));
                jtxtAcademicQual.setText(resultset.getString("AcademicQualification"));
                jtxtPosition.setText(resultset.getString("CurrentPosition"));
                jtxtInst.setText(resultset.getString("LatestSchool"));
                jtxtEmpType.setText(resultset.getString("EmployeeCategory"));
                
                resultset = statement.executeQuery(sql);
           }
            else
                {
                JOptionPane.showMessageDialog(null,"Record Not Found!","Employee Search",JOptionPane.ERROR_MESSAGE);
                resultset = statement.executeQuery(sql);
                resultset.next();
                }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Record does not Exist", "Employee Search", JOptionPane.ERROR_MESSAGE);
        }
        
 
    }//GEN-LAST:event_jEmpSearchActionPerformed

    private void jEmpLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpLastActionPerformed
        try {
            {
                resultset.last();
                  jEmpID.setText(resultset.getString("EmployeeID"));
                jEmpDeptID.setText(resultset.getString("DepartmentID"));
                jAccountNum.setText(resultset.getString("AccountNumber"));
                jEmpSurname.setText(resultset.getString("Surname"));
                jEmpFirstName.setText(resultset.getString("FirstName"));
                jEmpGender.setText(resultset.getString("Gender"));
                jPhoneNumber.setText(resultset.getString("PhoneNumber"));
                jDateOfBirth.setText(resultset.getString("DateOfBirth"));
                jDateOfHire.setText(resultset.getString("DateOfHire"));
                jAddress.setText(resultset.getString("Address"));
                jJobGroup.setText(resultset.getString("JobGroup"));
                jBasicSal.setText(resultset.getString("BasicSalary"));
                jHouseAllowance.setText(resultset.getString("HouseAllowance"));
                jTravelAllowance.setText(resultset.getString("TravelAllowance"));
                jDeductions.setText(resultset.getString("Deductions"));
                jTotalTax.setText(resultset.getString("Tax"));
                jNetSal.setText(resultset.getString("NetSalary"));
                jEmpPIN.setText(resultset.getString("SSN"));
                jtxtAcademicQual.setText(resultset.getString("AcademicQualification"));
                jtxtPosition.setText(resultset.getString("CurrentPosition"));
                jtxtInst.setText(resultset.getString("LatestSchool"));
                jtxtEmpType.setText(resultset.getString("EmployeeCategory"));


            }
        } catch(SQLException e) {
        }
}//GEN-LAST:event_jEmpLastActionPerformed

    private void jEmpPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpPreviousActionPerformed
        // TODO add your handling code here:
        try {
            if(resultset.previous()) {
                  jEmpID.setText(resultset.getString("EmployeeID"));
                jEmpDeptID.setText(resultset.getString("DepartmentID"));
                jAccountNum.setText(resultset.getString("AccountNumber"));
                jEmpSurname.setText(resultset.getString("Surname"));
                jEmpFirstName.setText(resultset.getString("FirstName"));
                jEmpGender.setText(resultset.getString("Gender"));
                jPhoneNumber.setText(resultset.getString("PhoneNumber"));
                jDateOfBirth.setText(resultset.getString("DateOfBirth"));
                jDateOfHire.setText(resultset.getString("DateOfHire"));
                jAddress.setText(resultset.getString("Address"));
                jJobGroup.setText(resultset.getString("JobGroup"));
                jBasicSal.setText(resultset.getString("BasicSalary"));
                jHouseAllowance.setText(resultset.getString("HouseAllowance"));
                jTravelAllowance.setText(resultset.getString("TravelAllowance"));
                jDeductions.setText(resultset.getString("Deductions"));
                jTotalTax.setText(resultset.getString("Tax"));
                jNetSal.setText(resultset.getString("NetSalary"));
                jEmpPIN.setText(resultset.getString("SSN"));
                jtxtAcademicQual.setText(resultset.getString("AcademicQualification"));
                jtxtPosition.setText(resultset.getString("CurrentPosition"));
                jtxtInst.setText(resultset.getString("LatestSchool"));
                jtxtEmpType.setText(resultset.getString("EmployeeCategory"));

            } else {
                resultset.next();
                JOptionPane.showMessageDialog(null, "Reached the end of Records");
            }
        }
        catch(SQLException e)
        {
        }


}//GEN-LAST:event_jEmpPreviousActionPerformed

    private void jEmpFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpFirstActionPerformed
        // TODO add your handling code here:
        try {

            resultset.first();
              jEmpID.setText(resultset.getString("EmployeeID"));
                jEmpDeptID.setText(resultset.getString("DepartmentID"));
                jAccountNum.setText(resultset.getString("AccountNumber"));
                jEmpSurname.setText(resultset.getString("Surname"));
                jEmpFirstName.setText(resultset.getString("FirstName"));
                jEmpGender.setText(resultset.getString("Gender"));
                jPhoneNumber.setText(resultset.getString("PhoneNumber"));
                jDateOfBirth.setText(resultset.getString("DateOfBirth"));
                jDateOfHire.setText(resultset.getString("DateOfHire"));
                jAddress.setText(resultset.getString("Address"));
                jJobGroup.setText(resultset.getString("JobGroup"));
                jBasicSal.setText(resultset.getString("BasicSalary"));
                jHouseAllowance.setText(resultset.getString("HouseAllowance"));
                jTravelAllowance.setText(resultset.getString("TravelAllowance"));
                jDeductions.setText(resultset.getString("Deductions"));
                jTotalTax.setText(resultset.getString("Tax"));
                jNetSal.setText(resultset.getString("NetSalary"));
                jEmpPIN.setText(resultset.getString("SSN"));
                jtxtAcademicQual.setText(resultset.getString("AcademicQualification"));
                jtxtPosition.setText(resultset.getString("CurrentPosition"));
                jtxtInst.setText(resultset.getString("LatestSchool"));
                jtxtEmpType.setText(resultset.getString("EmployeeCategory"));
        } catch(SQLException e) {
        }
}//GEN-LAST:event_jEmpFirstActionPerformed

    private void jEmpNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpNextActionPerformed
        try {
            if(resultset.next()) {
                  jEmpID.setText(resultset.getString("EmployeeID"));
                jEmpDeptID.setText(resultset.getString("DepartmentID"));
                jAccountNum.setText(resultset.getString("AccountNumber"));
                jEmpSurname.setText(resultset.getString("Surname"));
                jEmpFirstName.setText(resultset.getString("FirstName"));
                jEmpGender.setText(resultset.getString("Gender"));
                jPhoneNumber.setText(resultset.getString("PhoneNumber"));
                jDateOfBirth.setText(resultset.getString("DateOfBirth"));
                jDateOfHire.setText(resultset.getString("DateOfHire"));
                jAddress.setText(resultset.getString("Address"));
                jJobGroup.setText(resultset.getString("JobGroup"));
                jBasicSal.setText(resultset.getString("BasicSalary"));
                jHouseAllowance.setText(resultset.getString("HouseAllowance"));
                jTravelAllowance.setText(resultset.getString("TravelAllowance"));
                jDeductions.setText(resultset.getString("Deductions"));
                jTotalTax.setText(resultset.getString("Tax"));
                jNetSal.setText(resultset.getString("NetSalary"));
                jEmpPIN.setText(resultset.getString("SSN"));
                jtxtAcademicQual.setText(resultset.getString("AcademicQualification"));
                jtxtPosition.setText(resultset.getString("CurrentPosition"));
                jtxtInst.setText(resultset.getString("LatestSchool"));
                jtxtEmpType.setText(resultset.getString("EmployeeCategory"));

            } else {
                resultset.previous();
                JOptionPane.showMessageDialog(null, "Reached the end of Records");
            }
        } catch(SQLException e) {

        }
}//GEN-LAST:event_jEmpNextActionPerformed

    private void calulateAllowance(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_calulateAllowance
        // TODO add your handling code here:


        String travelAll = String.format("%s",travelAllowance);
        jTravelAllowance.setText(travelAll);

        deductions = NHIF + NSSF;
        String StrDeductions = String.format("%s",deductions);
        jDeductions.setText(StrDeductions);
        String StrBasicPay = jBasicSal.getText();

        mothlybasicSal  = Integer.parseInt(StrBasicPay);
        AnnualBasicSal = mothlybasicSal*12;
        houseAll = AnnualBasicSal * 0.15;
        jHouseAllowance.setText(String.format("%.2f", houseAll));
        AnnualTravelAll = travelAllowance*12;
        GrossSalary = AnnualBasicSal + houseAll + AnnualTravelAll;
        System.out.print("Anual GrossSalary is "+GrossSalary+"\n");
        
        if(GrossSalary <= 121968)
        {
            GrossTax  = (10*121968)/100;
            System.out.print(GrossTax);
        } 
        else if(GrossSalary<= 236880)
        {
            GrossTax = GrossTax +(236880 * 15)/(100);
            System.out.print(GrossTax);
        } 
        else if(GrossSalary <= 351792)
        {
            GrossTax = GrossTax + (351792 * 20)/(100);
            System.out.print(GrossTax);
        } 
        else if(GrossSalary <= 466704) {
            GrossTax = GrossTax + (466704 * 25)/(100);
            System.out.print(GrossTax);
        } 
        else if(GrossSalary > 466704)
        {
            GrossTax = GrossTax + (GrossSalary - 466704)*30/100;
            System.out.print(GrossTax);
        }
        NetTax = (GrossTax - relief);
        System.out.print(GrossTax);
        jTotalTax.setText(String.format("%.2f",NetTax));
        netSalary = AnnualBasicSal + travelAllowance-NetTax-deductions;
        jNetSal.setText(String.format("%.2f",netSalary));

}//GEN-LAST:event_calulateAllowance

    private void jBasicSalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jBasicSalFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_jBasicSalFocusLost

    private void jEmpPINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEmpPINActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jEmpPINActionPerformed

    private void jbtnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnHelpActionPerformed
        // provides context senitive help
        new payrollHelp().setVisible(true);
    }//GEN-LAST:event_jbtnHelpActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        // *This is the main method that enables the excecution of this project
        try {

            String searchID = JOptionPane.showInputDialog("Enter employeeID or Surname of thhe Employee");
            if(searchID == null) {
                JOptionPane.showMessageDialog(null,"Serch is cancelled");
            } else
                resultset = statement.executeQuery("select * from employees where EmployeeID OR Surname='"+searchID+"'");
            while(resultset.next()) {
                jEmpID.setText(resultset.getString(1));
                jEmpDeptID.setText(resultset.getString(2));
                jAccountNum.setText(resultset.getString(3));
                jEmpSurname.setText(resultset.getString(4));
                jEmpFirstName.setText(resultset.getString(5));
                jEmpGender.setText(resultset.getString(6));
                jPhoneNumber.setText(resultset.getString(7));
                jDateOfBirth.setText(resultset.getString(8));
                jDateOfHire.setText(resultset.getString(9));
                jAddress.setText(resultset.getString(10));
                jJobGroup.setText(resultset.getString(11));
                jBasicSal.setText(resultset.getString(12));
                jHouseAllowance.setText(resultset.getString(13));
                jTravelAllowance.setText(resultset.getString(14));
                jDeductions.setText(resultset.getString(15));
                jTotalTax.setText(resultset.getString(16));
                jNetSal.setText(resultset.getString(17));
                jEmpPIN.setText(resultset.getString(18));
                jNetSal.setText(resultset.getString(17));
                jEmpPIN.setText(resultset.getString(18));
                jtxtAcademicQual.setText(resultset.getString(19));
                jtxtPosition.setText(resultset.getString(20));
                jtxtInst.setText(resultset.getString(21));
                jtxtEmpType.setText(resultset.getString(22));
            }

        } catch(SQLException e) {
            System.out.print(e);
        }
        
    }//GEN-LAST:event_jbtnSearchActionPerformed

    private void jmnuOnlineHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuOnlineHelpActionPerformed
        // This code helps user to get online help
        try {
             Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost/wybosoft./ac.ke/index.php");   //open the file chart.pdf
            } catch (IOException ex)
            {
             Logger.getLogger(PayrollHome.class.getName()).log(Level.SEVERE, null, ex);
           }
    }//GEN-LAST:event_jmnuOnlineHelpActionPerformed

    private void jmnuItemAppLockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuItemAppLockActionPerformed
        // This code locks the system
        new PayAdminLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnuItemAppLockActionPerformed
   

    public static void main(String args[]) throws ClassNotFoundException
    {
         try
        {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (InstantiationException ex)
        {
            Logger.getLogger(PayrollHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PayrollHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(PayrollHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       java.awt.EventQueue.invokeLater(new Runnable()
        {
        public void run()
        {
          new PayrollEmployeeDetails().setVisible(true);
          //com.sun.java.swing.plaf.windows.WindowsLookAndFeel
        }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jAccountNum;
    private javax.swing.JButton jAddEmpButton;
    private javax.swing.JTextField jAddress;
    private javax.swing.JTextField jBasicSal;
    private javax.swing.JButton jButton6;
    private javax.swing.JTextField jDateOfBirth;
    private javax.swing.JTextField jDateOfHire;
    private javax.swing.JTextField jDeductions;
    private javax.swing.JButton jEmpCancel;
    private javax.swing.JButton jEmpDelete;
    private javax.swing.JTextField jEmpDeptID;
    private javax.swing.JButton jEmpFirst;
    private javax.swing.JTextField jEmpFirstName;
    private javax.swing.JTextField jEmpGender;
    private javax.swing.JTextField jEmpID;
    private javax.swing.JButton jEmpLast;
    private javax.swing.JButton jEmpNext;
    private javax.swing.JTextField jEmpPIN;
    private javax.swing.JButton jEmpPrevious;
    private javax.swing.JButton jEmpReport;
    private javax.swing.JButton jEmpSave;
    private javax.swing.JButton jEmpSearch;
    private javax.swing.JTextField jEmpSurname;
    private javax.swing.JButton jEmpUpdate;
    private javax.swing.JTextField jHouseAllowance;
    private javax.swing.JTextField jJobGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField jNetSal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelEmployees;
    private javax.swing.JTextField jPhoneNumber;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTextField jTotalTax;
    private javax.swing.JTextField jTravelAllowance;
    private javax.swing.JButton jbtnAddnew;
    private javax.swing.JButton jbtnFirst;
    private javax.swing.JButton jbtnHelp;
    private javax.swing.JButton jbtnLast;
    private javax.swing.JButton jbtnLoadRecords;
    private javax.swing.JButton jbtnNext;
    private javax.swing.JButton jbtnPrev;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JLabel jemail;
    private javax.swing.JButton jexit;
    private javax.swing.JLabel jlblMotto;
    private javax.swing.JMenuItem jmnuExit;
    private javax.swing.JMenu jmnuHelp;
    private javax.swing.JMenuItem jmnuItemAppLock;
    private javax.swing.JMenuItem jmnuOnlineHelp;
    private javax.swing.JPanel jpanelModify;
    private javax.swing.JPanel jpanelView;
    private javax.swing.JTable jtblViewEmp;
    private javax.swing.JTextField jtxtAcademicQual;
    private javax.swing.JTextField jtxtEmpType;
    private javax.swing.JTextField jtxtInst;
    private javax.swing.JTextField jtxtNumOfHours;
    private javax.swing.JTextField jtxtOvertime;
    private javax.swing.JTextField jtxtPosition;
    private javax.swing.JLabel jusername;
    // End of variables declaration//GEN-END:variables
}
