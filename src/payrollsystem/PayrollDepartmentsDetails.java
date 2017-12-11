package payrollsystem;

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

public class PayrollDepartmentsDetails extends javax.swing.JFrame {

    public String username, Search;
    public String StrDeptID , StrDeptName,deptID,deptName;
    public ResultSet resultset,resulset2;
    public Statement statement;
    int currentRow = 0;
    String sql = "select * from department";
    /** Creates new form DepartmentsDetails */
    public PayrollDepartmentsDetails()
    {
        initComponents();
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
           jtfDeptID.setText(resultset.getString(1));
           jtfDeptName.setText(resultset.getString(2));
        }
        }
        catch(SQLException e)
        {
        }
        catch(ClassNotFoundException cl)
        {
        }
    }
    public void ExitWindow()
    {
     new PayrollHome().setVisible(true);
     this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jusername = new javax.swing.JLabel();
        jtfDeptName = new javax.swing.JTextField();
        jemail = new javax.swing.JLabel();
        jtfDeptID = new javax.swing.JTextField();
        jpanelView = new javax.swing.JPanel();
        jnext = new javax.swing.JButton();
        jfirst = new javax.swing.JButton();
        jprevious = new javax.swing.JButton();
        jlast = new javax.swing.JButton();
        jbtnSearch = new javax.swing.JButton();
        jbtnDeptUpdate = new javax.swing.JButton();
        jpanelModify = new javax.swing.JPanel();
        jbtnDeptDelete = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();
        jexit = new javax.swing.JButton();
        jSave = new javax.swing.JButton();
        jAddNew = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlblMotto = new javax.swing.JLabel();
        jPanelDesignBar = new javax.swing.JPanel();
        jmnuBarDept = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jbtnPayrollHome = new javax.swing.JMenuItem();
        jmnuEmpDetails = new javax.swing.JMenuItem();
        jmnuPaymentDetails = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmnuExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Wybosoft Payroll System_2011");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departments Details Form", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 0, 255))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jusername.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jusername.setText("Department Name");

        jtfDeptName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDeptNameActionPerformed(evt);
            }
        });

        jemail.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jemail.setText("DepartmentID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jemail)
                        .addGap(65, 65, 65)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfDeptName)
                    .addComponent(jtfDeptID, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jusername)
                    .addComponent(jtfDeptName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDeptID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jemail))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpanelView.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scroll Department names", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 0, 255))); // NOI18N
        jpanelView.setFont(new java.awt.Font("Tahoma", 1, 11));

        jnext.setFont(new java.awt.Font("Tahoma", 1, 11));
        jnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Next-01.png"))); // NOI18N
        jnext.setText("Next");
        jnext.setToolTipText("Moves to next record");
        jnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnextActionPerformed(evt);
            }
        });

        jfirst.setFont(new java.awt.Font("Tahoma", 1, 11));
        jfirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button First-01.png"))); // NOI18N
        jfirst.setText("First");
        jfirst.setToolTipText("Moves to first record in database");
        jfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jfirstActionPerformed(evt);
            }
        });

        jprevious.setFont(new java.awt.Font("Tahoma", 1, 11));
        jprevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Previous-01.png"))); // NOI18N
        jprevious.setText("Previous");
        jprevious.setToolTipText("Moves to previous record");
        jprevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpreviousActionPerformed(evt);
            }
        });

        jlast.setFont(new java.awt.Font("Tahoma", 1, 11));
        jlast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Last-01.png"))); // NOI18N
        jlast.setText("Last");
        jlast.setToolTipText("Moves to last record in databse");
        jlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlastActionPerformed(evt);
            }
        });

        jbtnSearch.setFont(new java.awt.Font("Tahoma", 1, 11));
        jbtnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Lens-01.png"))); // NOI18N
        jbtnSearch.setText("Search");
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });

        jbtnDeptUpdate.setFont(new java.awt.Font("Tahoma", 1, 11));
        jbtnDeptUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Refresh-01.png"))); // NOI18N
        jbtnDeptUpdate.setText("Update");
        jbtnDeptUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelViewLayout = new javax.swing.GroupLayout(jpanelView);
        jpanelView.setLayout(jpanelViewLayout);
        jpanelViewLayout.setHorizontalGroup(
            jpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jfirst)
                .addGap(10, 10, 10)
                .addComponent(jnext)
                .addGap(10, 10, 10)
                .addComponent(jprevious, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlast, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jbtnDeptUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );
        jpanelViewLayout.setVerticalGroup(
            jpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeptUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jnext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlast, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jpanelModify.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modify Department Database", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 0, 255))); // NOI18N

        jbtnDeptDelete.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jbtnDeptDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Delete-01.png"))); // NOI18N
        jbtnDeptDelete.setText("Delete");
        jbtnDeptDelete.setToolTipText("Deletes a Department from database");
        jbtnDeptDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptDeleteActionPerformed(evt);
            }
        });

        jCancel.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Cancel-01.png"))); // NOI18N
        jCancel.setText("Cancel");
        jCancel.setToolTipText("Cancels record entry");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        jexit.setFont(new java.awt.Font("Times New Roman", 1, 12));
        jexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Turn Off-01.png"))); // NOI18N
        jexit.setText("Exit");
        jexit.setToolTipText("Exits current form ");
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });

        jSave.setFont(new java.awt.Font("Tahoma", 1, 11));
        jSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/ICO/save.png"))); // NOI18N
        jSave.setText("Save");
        jSave.setToolTipText("Updates departments' database");
        jSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaveActionPerformed(evt);
            }
        });

        jAddNew.setFont(new java.awt.Font("Tahoma", 1, 11));
        jAddNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button New-01.png"))); // NOI18N
        jAddNew.setText("Add New");
        jAddNew.setToolTipText("Adds new database record to database");
        jAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelModifyLayout = new javax.swing.GroupLayout(jpanelModify);
        jpanelModify.setLayout(jpanelModifyLayout);
        jpanelModifyLayout.setHorizontalGroup(
            jpanelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModifyLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jAddNew)
                .addGap(28, 28, 28)
                .addComponent(jCancel)
                .addGap(38, 38, 38)
                .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jbtnDeptDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jpanelModifyLayout.setVerticalGroup(
            jpanelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelModifyLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpanelModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeptDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jpanelModify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpanelView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpanelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpanelModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel23.setBackground(new java.awt.Color(204, 0, 0));
        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 12));
        jLabel23.setForeground(new java.awt.Color(204, 0, 0));
        jLabel23.setText("Wybosoft University College...A completely integreted Payroll system                                           P.O Box 2222-60999, Nairobi-Kenya; E-Mail  Wybosoft@education.edu.ke");
        jLabel23.setToolTipText("Bank Payment details");

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1366, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jlblMotto.setFont(new java.awt.Font("Times New Roman", 3, 14));
        jlblMotto.setForeground(new java.awt.Color(204, 0, 0));
        jlblMotto.setText("Strategic innovation and invention   Institution...");

        jPanelDesignBar.setBackground(new java.awt.Color(51, 0, 255));
        jPanelDesignBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelDesignBarLayout = new javax.swing.GroupLayout(jPanelDesignBar);
        jPanelDesignBar.setLayout(jPanelDesignBarLayout);
        jPanelDesignBarLayout.setHorizontalGroup(
            jPanelDesignBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1382, Short.MAX_VALUE)
        );
        jPanelDesignBarLayout.setVerticalGroup(
            jPanelDesignBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jMenu1.setText("Navigate");

        jbtnPayrollHome.setText("Payroll Home");
        jbtnPayrollHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPayrollHomeActionPerformed(evt);
            }
        });
        jMenu1.add(jbtnPayrollHome);

        jmnuEmpDetails.setText("Employees Details Form");
        jmnuEmpDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuEmpDetailsActionPerformed(evt);
            }
        });
        jMenu1.add(jmnuEmpDetails);

        jmnuPaymentDetails.setText("Bank Payments Details Form");
        jmnuPaymentDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuPaymentDetailsActionPerformed(evt);
            }
        });
        jMenu1.add(jmnuPaymentDetails);
        jMenu1.add(jSeparator1);

        jmnuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/Button Close-01.png"))); // NOI18N
        jmnuExit.setText("Exit ");
        jmnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuExitActionPerformed(evt);
            }
        });
        jMenu1.add(jmnuExit);

        jmnuBarDept.add(jMenu1);

        jMenu2.setText("Help");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Help");
        jMenu2.add(jMenuItem1);

        jmnuBarDept.add(jMenu2);

        setJMenuBar(jmnuBarDept);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblMotto)
                        .addGap(318, 318, 318))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanelDesignBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDesignBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jlblMotto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDeptNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDeptNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDeptNameActionPerformed

    private void jnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnextActionPerformed
        // This code moves next record
        try {
            if(resultset.next())
            {
                jtfDeptID.setText(resultset.getString(1));
                jtfDeptName.setText(resultset.getString(2));
            }
            else
            {
                resultset.previous();
                JOptionPane.showMessageDialog(null, "Reached the end of Records","Departments Details",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch(SQLException e)
        {

        }
    }//GEN-LAST:event_jnextActionPerformed

    private void jfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jfirstActionPerformed
        // This code moves to the first record in the relation
        try
        {
          resultset.first();
          jtfDeptID.setText(resultset.getString(1));
          jtfDeptName.setText(resultset.getString(2));
        }
       catch(SQLException e)
       {
       }

    }//GEN-LAST:event_jfirstActionPerformed

    private void jpreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpreviousActionPerformed
        // This code moves to previous record of the database
        try
        {
            if(resultset.previous())
            {
                jtfDeptID.setText(resultset.getString(1));
                jtfDeptName.setText(resultset.getString(2));
            }
            else
            {
                resultset.next();
                JOptionPane.showMessageDialog(null, "Reached the end of Records","Departments Details",JOptionPane.INFORMATION_MESSAGE);
            }
        }
       catch(SQLException e)
       {
       }
    }//GEN-LAST:event_jpreviousActionPerformed

    private void jlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlastActionPerformed
        // This code moves to the last record of the databse
        try
        {
          resultset.last();
          jtfDeptID.setText(resultset.getString(1));
          jtfDeptName.setText(resultset.getString(2));
        }
       catch(SQLException e)
       {
       }
    }//GEN-LAST:event_jlastActionPerformed

    private void jbtnDeptDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptDeleteActionPerformed
        // this code deletes a record parmanently from the relation
     try
        {
           String ObjButtons[] = {"Yes","No"};
		int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure you want to Delete the Record","Wybosoft Payroll System",
                        JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);
		if(PromptResult==0)
                {
                    resultset.deleteRow();
                    JOptionPane.showMessageDialog(null, "Record has been Deleted successfully!","Departments Details",JOptionPane.INFORMATION_MESSAGE);

                    resultset = statement.executeQuery(sql);
                    resultset.next();
                    jtfDeptID.setText(resultset.getString(1));
                    jtfDeptName.setText(resultset.getString(2));

		}
            
            
        }
           catch(SQLException e)
     {

           }
    }//GEN-LAST:event_jbtnDeptDeleteActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        // This code cancels additioon of new department
         try
        {
        resultset.absolute(currentRow++);
        jtfDeptID.setText(resultset.getString(1));
        jtfDeptName.setText(resultset.getString(2));
        jfirst.setEnabled(true);
        jnext.setEnabled(true);
        jprevious.setEnabled(true);
        jlast.setEnabled(true);
        jexit.setEnabled(true);
        jbtnDeptDelete.setEnabled(true);
        jCancel.setEnabled(true);
        jSave.setEnabled(true);
        jAddNew.setEnabled(true);
        JOptionPane.showMessageDialog(null, "You have Cancelled Addition of new Department","Departments Details",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e)
        {

        }
    }//GEN-LAST:event_jCancelActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
        // This code exits the form
        new PayrollHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jexitActionPerformed

    private void jSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaveActionPerformed
        // This codes saves to the database
       try
       {
        StrDeptID =jtfDeptID.getText();
        StrDeptName  = jtfDeptName.getText();

        resultset.moveToInsertRow();
        statement.executeUpdate("insert into department values('" +StrDeptID+ "','" +StrDeptName+ "')");

        JOptionPane.showMessageDialog(null, "Record has been saved successfully!","Departments Details",JOptionPane.INFORMATION_MESSAGE);
            //'"+strPosition+"','"+strEmpType+"','"+strInstitute+"'
        resultset = statement.executeQuery(sql);
        resultset.next();
        jfirst.setEnabled(true);
        jnext.setEnabled(true);
        jprevious.setEnabled(true);
        jlast.setEnabled(true);
        jexit.setEnabled(true);
        jbtnDeptDelete.setEnabled(true);
        jCancel.setEnabled(true);
        jSave.setEnabled(true);
        jAddNew.setEnabled(true);
        }
        catch(SQLException e)
       {
         System.out.print(e);
           //JOptionPane.showMessageDialog(this,e);
       }
    }//GEN-LAST:event_jSaveActionPerformed

    private void jAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddNewActionPerformed
        // This code adds a new record to the database
        try
        {
            currentRow = resultset.getRow();
            jtfDeptID.setText(null);
            jtfDeptName.setText(null);
            jfirst.setEnabled(false);
            jnext.setEnabled(false);
            jprevious.setEnabled(false);
            jlast.setEnabled(false);
            jexit.setEnabled(false);
            jbtnDeptDelete.setEnabled(false);
            jCancel.setEnabled(true);
            jSave.setEnabled(true);
            jAddNew.setEnabled(true);

        }
        catch(SQLException e)
        {
           JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jAddNewActionPerformed

    private void jbtnPayrollHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPayrollHomeActionPerformed
        // This code hides the deprments form but opens the payroll home interface:
         new PayrollHome().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jbtnPayrollHomeActionPerformed

    private void jbtnDeptUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptUpdateActionPerformed
        // This cod updates the records in the database.
         try
         {
            deptID =jtfDeptID.getText();
            deptName = jtfDeptName.getText();

            resultset.updateString( "DepartmentID", deptID );
            resultset.updateString( "DepartmentName", deptName );
            resultset.updateRow( );
            JOptionPane.showMessageDialog(null,"The Record has been Updated","Employee Upadate",JOptionPane.INFORMATION_MESSAGE);
        }
         catch (SQLException err)
        {
            System.out.println(err.getMessage() );
        }
    }//GEN-LAST:event_jbtnDeptUpdateActionPerformed

    private void jmnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuExitActionPerformed
        // This code exits the current form and launhes home
        new PayrollHome().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnuExitActionPerformed

    private void jmnuEmpDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuEmpDetailsActionPerformed
        // This code launches the employess details form
        new PayrollEmployeeDetails().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnuEmpDetailsActionPerformed

    private void jmnuPaymentDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuPaymentDetailsActionPerformed
        // This code launches the employess bank details form
        new PaymentsBankForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jmnuPaymentDetailsActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // Provides context Sensitive help
        new payrollHelp().setVisible(true);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        // this code searches department using its ID and returns the results to text Fields
           Search=JOptionPane.showInputDialog("Enter the Department ID");
           try
           {
                resultset = statement.executeQuery("SELECT * FROM department WHERE DepartmentID ='"+Search+"'");
                if(resultset.next())
                {
                jtfDeptID.setText(resultset.getString("DepartmentID"));
                jtfDeptName.setText(resultset.getString("DepartmentName"));
                resultset = statement.executeQuery(sql);
                
                }
                else
                {
                JOptionPane.showMessageDialog(null,"Record Not Found!","Department Search",JOptionPane.ERROR_MESSAGE);
                resultset = statement.executeQuery(sql);
                resultset.next();
                jtfDeptID.setText(resultset.getString("DepartmentID"));
                jtfDeptName.setText(resultset.getString("DepartmentName"));
               }
                
             }

  catch (SQLException ex)
           {
                 JOptionPane.showMessageDialog(null, "Record does not Exist", "Department Search", JOptionPane.ERROR_MESSAGE);
           }
    
    }//GEN-LAST:event_jbtnSearchActionPerformed

    /**
    * @param args the command line arguments
    */
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
        PayrollDepartmentsDetails close = new PayrollDepartmentsDetails();
        close.setDefaultCloseOperation(PayrollDepartmentsDetails.DISPOSE_ON_CLOSE);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PayrollDepartmentsDetails().setVisible(true);
         
          }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddNew;
    private javax.swing.JButton jCancel;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelDesignBar;
    private javax.swing.JButton jSave;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton jbtnDeptDelete;
    private javax.swing.JButton jbtnDeptUpdate;
    private javax.swing.JMenuItem jbtnPayrollHome;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JLabel jemail;
    private javax.swing.JButton jexit;
    private javax.swing.JButton jfirst;
    private javax.swing.JButton jlast;
    private javax.swing.JLabel jlblMotto;
    private javax.swing.JMenuBar jmnuBarDept;
    private javax.swing.JMenuItem jmnuEmpDetails;
    private javax.swing.JMenuItem jmnuExit;
    private javax.swing.JMenuItem jmnuPaymentDetails;
    private javax.swing.JButton jnext;
    private javax.swing.JPanel jpanelModify;
    private javax.swing.JPanel jpanelView;
    private javax.swing.JButton jprevious;
    private javax.swing.JTextField jtfDeptID;
    private javax.swing.JTextField jtfDeptName;
    private javax.swing.JLabel jusername;
    // End of variables declaration//GEN-END:variables

}
