/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Payslip.java
 *
 * Created on Dec 14, 2011, 9:17:15 AM
 */

package payrollsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Wycliffe
 */
public class Payslip extends javax.swing.JFrame
{  
    ResultSet resultset,resultset2;
    Statement statement,statement2;
    public String search1;
    //String sql = "select * from employees where EmployeeID='"+search+"'";

    /** Creates new form Payslip */
    public Payslip(String search) {

        initComponents();
        search1=search;
        
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Loaded");
           Connection connection  = DriverManager.getConnection("jdbc:mysql://localhost/payroll");
           System.out.println("Database connected");
           statement = connection.createStatement(resultset.TYPE_SCROLL_SENSITIVE,resultset.CONCUR_UPDATABLE );
           resultset = statement.executeQuery("select * from employees where EmployeeID='"+search+"'");
           System.out.print("Querry is executed\n");
           
                if(resultset.next())
                {
                    jtxtpayslipName.setText(resultset.getString("Surname"));
                    jtxtName2.setText(resultset.getString("FirstName"));
                    jtxtSlipAccount.setText(resultset.getString("AccountNumber"));
                    jtxtBasicSalary.setText(resultset.getString("BasicSalary"));
                    jtxtDeductions.setText(resultset.getString("Deductions"));
                    jtxtSalary.setText(resultset.getString("NetSalary"));
                }
          
        }
        catch(SQLException e)
        {
        }
        catch(ClassNotFoundException cl)
        {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlblLoginTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jbtnGoHome = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtxtpayslipName = new javax.swing.JTextField();
        jtxtName2 = new javax.swing.JTextField();
        jtxtSlipAccount = new javax.swing.JTextField();
        jtxtDeductions = new javax.swing.JTextField();
        jtxtSalary = new javax.swing.JTextField();
        jtxtBasicSalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblLoginTitle.setFont(new java.awt.Font("Times New Roman", 1, 36));
        jlblLoginTitle.setForeground(new java.awt.Color(51, 0, 255));
        jlblLoginTitle.setText("Wybosoft University College");
        jlblLoginTitle.setToolTipText(" Wybosoft inc. Login");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jLabel1.setText("Employee Pay Slip");

        jbtnGoHome.setText("ReturnHome");
        jbtnGoHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGoHomeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("Tax Deducted");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setText("Net Salary");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Account Number");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("Employee name");

        jtxtpayslipName.setBackground(new java.awt.Color(240, 240, 240));
        jtxtpayslipName.setBorder(null);

        jtxtName2.setBackground(new java.awt.Color(240, 240, 240));
        jtxtName2.setBorder(null);

        jtxtSlipAccount.setBackground(new java.awt.Color(240, 240, 240));
        jtxtSlipAccount.setBorder(null);

        jtxtDeductions.setBackground(new java.awt.Color(240, 240, 240));
        jtxtDeductions.setBorder(null);

        jtxtSalary.setBackground(new java.awt.Color(240, 240, 240));
        jtxtSalary.setBorder(null);

        jtxtBasicSalary.setBackground(new java.awt.Color(240, 240, 240));
        jtxtBasicSalary.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtDeductions, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jtxtpayslipName, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtName2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                    .addComponent(jtxtSlipAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jtxtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                    .addComponent(jtxtBasicSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtpayslipName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jtxtSlipAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtBasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jtxtDeductions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtxtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Basic Salary");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(68, 68, 68)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PRINT.PNG"))); // NOI18N
        jButton1.setText("Print Pay Slip");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnGoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jlblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblLoginTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGoHome)
                    .addComponent(jButton1))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGoHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGoHomeActionPerformed
        // This code returns use to the home form
        new PayrollHome().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jbtnGoHomeActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbtnGoHome;
    private javax.swing.JLabel jlblLoginTitle;
    private javax.swing.JTextField jtxtBasicSalary;
    private javax.swing.JTextField jtxtDeductions;
    private javax.swing.JTextField jtxtName2;
    private javax.swing.JTextField jtxtSalary;
    private javax.swing.JTextField jtxtSlipAccount;
    private javax.swing.JTextField jtxtpayslipName;
    // End of variables declaration//GEN-END:variables

}
