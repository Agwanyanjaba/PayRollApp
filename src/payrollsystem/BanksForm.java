package payrollsystem;
import java.sql.*;
import javax.swing.JOptionPane;

public class BanksForm extends javax.swing.JFrame {
    public String bankID, bankName, accountNum, dateOfOpening, strAccountType, Search;
    public Object objectDate;
    ResultSet resultset, resultset2;
    Statement statement, statement2;
    int currentRow = 0;
    String sql = "select * from banks";

    /** Creates new form BanksForm */
    public BanksForm() {
        initComponents();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/payroll");
            System.out.println("Database connected");
            statement = connection.createStatement(resultset.TYPE_SCROLL_SENSITIVE, resultset.CONCUR_UPDATABLE);
            resultset = statement.executeQuery(sql);
            System.out.print("Querry is executed\n");

            if (resultset.next())
            {
                jtxtAccNum.setText(resultset.getString("AccountNumber"));
                jtxtBankID.setText(resultset.getString("BankID"));
                jtxtBankName.setText(resultset.getString("BankName"));
                jtxtAccountType.setText(resultset.getString("AccountType"));
                jtxtDate.setText(resultset.getString("DateOpened"));
            }

        } catch (SQLException e) {
        } catch (ClassNotFoundException cl) {
        }

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDesignBar2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jbtnDeptFirst = new javax.swing.JButton();
        jbtnDeptNext = new javax.swing.JButton();
        jbtnDeptPrev = new javax.swing.JButton();
        jbtnDeptLast = new javax.swing.JButton();
        jbtnDeptSearch = new javax.swing.JButton();
        jpanelBank2 = new javax.swing.JPanel();
        jtxtAccountType = new javax.swing.JTextField();
        jtxtDate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnDeptUpdate = new javax.swing.JButton();
        jbtnDeptCancel = new javax.swing.JButton();
        jbtnDeptAddNew = new javax.swing.JButton();
        jbtnDeptBankSave = new javax.swing.JButton();
        jbtnDeptDel = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jpanelBank = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtBankName = new javax.swing.JTextField();
        jtxtBankID = new javax.swing.JTextField();
        jtxtAccNum = new javax.swing.JTextField();
        jLabelTitleHome = new javax.swing.JLabel();
        jMenuBarBanksPayments = new javax.swing.JMenuBar();
        jmnuBanks = new javax.swing.JMenu();
        jmnuHome = new javax.swing.JMenuItem();
        jmnuDept = new javax.swing.JMenuItem();
        jmnuBankDetails = new javax.swing.JMenuItem();
        jmnuEmployees = new javax.swing.JMenuItem();
        jmnuItemExit = new javax.swing.JMenuItem();
        jmnuHelp = new javax.swing.JMenu();
        jmnuPayrollHelp = new javax.swing.JMenuItem();
        jmnuReport = new javax.swing.JMenu();
        jmnuBankReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDesignBar2.setBackground(new java.awt.Color(51, 0, 255));
        jPanelDesignBar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelDesignBar2Layout = new javax.swing.GroupLayout(jPanelDesignBar2);
        jPanelDesignBar2.setLayout(jPanelDesignBar2Layout);
        jPanelDesignBar2Layout.setHorizontalGroup(
            jPanelDesignBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1082, Short.MAX_VALUE)
        );
        jPanelDesignBar2Layout.setVerticalGroup(
            jPanelDesignBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bank Payments Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 102, 255)));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scroll Bank Paymnts Detils", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 0, 0)));
        jPanel2.setFont(new java.awt.Font("Agency FB", 1, 10));
        jPanel2.setMaximumSize(new java.awt.Dimension(754, 92));

        jbtnDeptFirst.setFont(new java.awt.Font("Tahoma", 1, 11));
        jbtnDeptFirst.setText("First");
        jbtnDeptFirst.setToolTipText("Moves to first record");
        jbtnDeptFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptFirstActionPerformed(evt);
            }
        });

        jbtnDeptNext.setFont(new java.awt.Font("Tahoma", 1, 11));
        jbtnDeptNext.setText("Next");
        jbtnDeptNext.setToolTipText("Movres to  the next record");
        jbtnDeptNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptNextActionPerformed(evt);
            }
        });

        jbtnDeptPrev.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbtnDeptPrev.setText("Previous");
        jbtnDeptPrev.setToolTipText("Moves to the prevous record");
        jbtnDeptPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptPrevActionPerformed(evt);
            }
        });

        jbtnDeptLast.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbtnDeptLast.setText("Last ");
        jbtnDeptLast.setToolTipText("Moves to the last record");
        jbtnDeptLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptLastActionPerformed(evt);
            }
        });

        jbtnDeptSearch.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbtnDeptSearch.setMnemonic('C');
        jbtnDeptSearch.setText("Search");
        jbtnDeptSearch.setToolTipText("Serchres a record in database");
        jbtnDeptSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbtnDeptFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jbtnDeptNext, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDeptPrev, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDeptLast, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDeptSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDeptFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeptNext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeptPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeptLast, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDeptSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jpanelBank2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Additional Employee Bank Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 0, 0)));
        jpanelBank2.setFont(new java.awt.Font("Agency FB", 1, 10));

        jtxtAccountType.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtAccountTypeFocusLost(evt);
            }
        });

        jLabel1.setText("Account Type");

        jLabel2.setText("Date of Openning");

        javax.swing.GroupLayout jpanelBank2Layout = new javax.swing.GroupLayout(jpanelBank2);
        jpanelBank2.setLayout(jpanelBank2Layout);
        jpanelBank2Layout.setHorizontalGroup(
            jpanelBank2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBank2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelBank2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(jpanelBank2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(jtxtAccountType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        jpanelBank2Layout.setVerticalGroup(
            jpanelBank2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBank2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelBank2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxtAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelBank2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jtxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data modofications", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 0, 0)));

        jbtnDeptUpdate.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbtnDeptUpdate.setText("Update");
        jbtnDeptUpdate.setToolTipText("Updates a record");
        jbtnDeptUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptUpdateActionPerformed(evt);
            }
        });

        jbtnDeptCancel.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbtnDeptCancel.setText("Cancel");
        jbtnDeptCancel.setToolTipText("Cancels Saving of a record");
        jbtnDeptCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptCancelActionPerformed(evt);
            }
        });

        jbtnDeptAddNew.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbtnDeptAddNew.setText("Add New  ");
        jbtnDeptAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptAddNewActionPerformed(evt);
            }
        });

        jbtnDeptBankSave.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbtnDeptBankSave.setText("Save");
        jbtnDeptBankSave.setToolTipText("Saves rcord to database");
        jbtnDeptBankSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptBankSaveActionPerformed(evt);
            }
        });

        jbtnDeptDel.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbtnDeptDel.setText("Delete");
        jbtnDeptDel.setToolTipText("Deletes a record");
        jbtnDeptDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeptDelActionPerformed(evt);
            }
        });

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 12));
        jbtnExit.setText("Exit");
        jbtnExit.setToolTipText("Exit the bank details form");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnDeptAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDeptBankSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDeptCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDeptUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbtnDeptDel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnDeptAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDeptBankSave, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDeptCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDeptUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnDeptDel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        jpanelBank.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Bank Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(204, 0, 0)));
        jpanelBank.setToolTipText("Payment Banks Details");
        jpanelBank.setFont(new java.awt.Font("Agency FB", 1, 10));

        jLabel4.setText("Bank Name");

        jLabel5.setText("Bank ID");

        jLabel3.setText("Account Number:");

        jtxtBankName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtBankNamefindRecord(evt);
            }
        });

        javax.swing.GroupLayout jpanelBankLayout = new javax.swing.GroupLayout(jpanelBank);
        jpanelBank.setLayout(jpanelBankLayout);
        jpanelBankLayout.setHorizontalGroup(
            jpanelBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBankLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtAccNum)
                    .addComponent(jtxtBankID)
                    .addComponent(jtxtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jpanelBankLayout.setVerticalGroup(
            jpanelBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelBankLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jpanelBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtBankID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelBankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jpanelBank, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jpanelBank2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jpanelBank2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpanelBank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelTitleHome.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabelTitleHome.setForeground(new java.awt.Color(51, 0, 255));
        jLabelTitleHome.setText("Wybosoft University College Banks Details Form ");
        jLabelTitleHome.setToolTipText(" Wybosoft inc. Login");

        jmnuBanks.setText("Bank Details");

        jmnuHome.setText("Payroll Home");
        jmnuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuHomeActionPerformed(evt);
            }
        });
        jmnuBanks.add(jmnuHome);

        jmnuDept.setText("Open Payroll System Departments ");
        jmnuBanks.add(jmnuDept);

        jmnuBankDetails.setText("Add New Bank Details");
        jmnuBankDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuBankDetailsActionPerformed(evt);
            }
        });
        jmnuBanks.add(jmnuBankDetails);

        jmnuEmployees.setText("Open Payroll Employee Deatails");
        jmnuBanks.add(jmnuEmployees);

        jmnuItemExit.setText("Exit");
        jmnuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuItemExitActionPerformed(evt);
            }
        });
        jmnuBanks.add(jmnuItemExit);

        jMenuBarBanksPayments.add(jmnuBanks);

        jmnuHelp.setText("Help");
        jmnuHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuHelpActionPerformed(evt);
            }
        });

        jmnuPayrollHelp.setText("Payroll Help");
        jmnuPayrollHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuPayrollHelpActionPerformed(evt);
            }
        });
        jmnuHelp.add(jmnuPayrollHelp);

        jMenuBarBanksPayments.add(jmnuHelp);

        jmnuReport.setText("Report");

        jmnuBankReport.setText("Bank Details Report");
        jmnuBankReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnuBankReportActionPerformed(evt);
            }
        });
        jmnuReport.add(jmnuBankReport);

        jMenuBarBanksPayments.add(jmnuReport);

        setJMenuBar(jMenuBarBanksPayments);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDesignBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabelTitleHome)
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDesignBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTitleHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmnuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuHomeActionPerformed
        // This code enables the user to go the the home interface
        new PayrollHome().setVisible(true);
        this.dispose();
}//GEN-LAST:event_jmnuHomeActionPerformed

    private void jmnuBankDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuBankDetailsActionPerformed
        // This code takes the user to the departments form
        new PayrollDepartmentsDetails().setVisible(true);
        this.dispose();
}//GEN-LAST:event_jmnuBankDetailsActionPerformed

    private void jmnuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuItemExitActionPerformed
        // The code exits to login form
        new PayAdminLogin().setVisible(true);
        this.dispose();
}//GEN-LAST:event_jmnuItemExitActionPerformed

    private void jmnuPayrollHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuPayrollHelpActionPerformed
        // This code provides the user with thencontex sensitive help
        new payrollHelp().setVisible(true);
    }//GEN-LAST:event_jmnuPayrollHelpActionPerformed

    private void jmnuHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuHelpActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jmnuHelpActionPerformed

    private void jmnuBankReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnuBankReportActionPerformed
        // This code generates a bank details reports.
}//GEN-LAST:event_jmnuBankReportActionPerformed

    private void jbtnDeptFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptFirstActionPerformed
        // Moves to the first record in the relation
        try {
            resultset.first();
            jtxtAccNum.setText(resultset.getString("AccountNumber"));
            jtxtBankID.setText(resultset.getString("BankID"));
            jtxtBankName.setText(resultset.getString("BankName"));
            jtxtAccountType.setText(resultset.getString("AccountType"));
            jtxtDate.setText(resultset.getString("DateOpened"));
            //jtxtAccountBal.setText(resultset.getString("AcountBalance"));
        } catch (SQLException e) {
        }
}//GEN-LAST:event_jbtnDeptFirstActionPerformed

    private void jbtnDeptNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptNextActionPerformed

        try {
            if (resultset.next()) {
                jtxtAccNum.setText(resultset.getString("AccountNumber"));
                jtxtBankID.setText(resultset.getString("BankID"));
                jtxtBankName.setText(resultset.getString("BankName"));
                jtxtAccountType.setText(resultset.getString("AccountType"));
                jtxtDate.setText(resultset.getString("DateOpened"));
                // jtxtAccountBal.setText(resultset.getString("AcountBalance"));

            } else {
                resultset.previous();
                JOptionPane.showMessageDialog(null, "Reached the end of Records", "Departments Details", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
        }
}//GEN-LAST:event_jbtnDeptNextActionPerformed

    private void jbtnDeptPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptPrevActionPerformed
        // Moves to the previous record of the database
        try {
            if (resultset.previous()) {
                jtxtAccNum.setText(resultset.getString("AccountNumber"));
                jtxtBankID.setText(resultset.getString("BankID"));
                jtxtBankName.setText(resultset.getString("BankName"));
                jtxtAccountType.setText(resultset.getString("AccountType"));
                jtxtDate.setText(resultset.getString("DateOpened"));
                //jtxtAccountBal.setText(resultset.getString("AcountBalance"));
            } else {
                resultset.next();
                JOptionPane.showMessageDialog(null, "Reached the end of Records", "Departments Details", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
        }
}//GEN-LAST:event_jbtnDeptPrevActionPerformed

    private void jbtnDeptLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptLastActionPerformed
        // moves to the last code of the databse
        try {
            resultset.last();
            jtxtAccNum.setText(resultset.getString("AccountNumber"));
            jtxtBankID.setText(resultset.getString("BankID"));
            jtxtBankName.setText(resultset.getString("BankName"));
            jtxtAccountType.setText(resultset.getString("AccountType"));
            jtxtDate.setText(resultset.getString("DateOpened"));
            //jtxtAccountBal.setText(resultset.getString("AcountBalance"));
        } catch (SQLException e) {
        }
}//GEN-LAST:event_jbtnDeptLastActionPerformed

    private void jbtnDeptSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptSearchActionPerformed
        // This code sewarches the databaes and returns results to the interface fields
        Search = JOptionPane.showInputDialog("Enter the Employee's Bank Account Number");
        try {

            resultset = statement.executeQuery("SELECT * FROM banks WHERE AccountNumber='" + Search + "'");
            if (resultset.next()) {
                jtxtAccNum.setText(resultset.getString("AccountNumber"));
                jtxtBankID.setText(resultset.getString("BankID"));
                jtxtBankName.setText(resultset.getString("BankName"));
                jtxtDate.setText(resultset.getString("DateOpened"));
                jtxtAccountType.setText(resultset.getString("AccountType"));
                resultset = statement.executeQuery(sql);

            } else {
                JOptionPane.showMessageDialog(null, "Record Not Found!", "Bank Details Management", JOptionPane.ERROR_MESSAGE);
                resultset = statement.executeQuery(sql);
                resultset.next();
                jtxtAccNum.setText(resultset.getString("AccountNumber"));
                jtxtBankID.setText(resultset.getString("BankID"));
                jtxtBankName.setText(resultset.getString("BankName"));
                jtxtAccountType.setText(resultset.getString("AccountType"));
                jtxtDate.setText(resultset.getString("DateOpened"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Record does not Exist", "Bank Details Management", JOptionPane.ERROR_MESSAGE);

        }
}//GEN-LAST:event_jbtnDeptSearchActionPerformed

    private void jtxtAccountTypeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtAccountTypeFocusLost
        // TODO add your handling code here:
}//GEN-LAST:event_jtxtAccountTypeFocusLost

    private void jbtnDeptUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptUpdateActionPerformed
        // this code updates the bank payemnts relation
        try {
            bankID = jtxtBankID.getText();
            bankName = jtxtBankName.getText();
            accountNum = jtxtAccNum.getText();
            strAccountType = jtxtAccountType.getText();
            dateOfOpening = jtxtDate.getText();

            resultset.updateString("AccountNumber", accountNum);
            resultset.updateString("BankID", bankID);
            resultset.updateString("BankName", bankName);
            resultset.updateString("DateOpened", dateOfOpening);
            resultset.updateString("AccountType", strAccountType);
            resultset.updateRow();
            JOptionPane.showMessageDialog(null, "The Record has been Updated", "Employee Upadate", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
}//GEN-LAST:event_jbtnDeptUpdateActionPerformed

    private void jbtnDeptCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptCancelActionPerformed
        // This code cancels the addition of a new epmloyee bank details
        try {
            resultset.absolute(currentRow++);

            jtxtAccNum.setText(resultset.getString("AccountNumber"));
            jtxtBankID.setText(resultset.getString("BankID"));
            jtxtBankName.setText(resultset.getString("BankName"));
            jtxtAccountType.setText(resultset.getString("AccountType"));
            jtxtDate.setText(resultset.getString("DateOpened"));
            //jtxtNetSalary.setText(resultset.getString("AcountBalance"));
            jbtnDeptDel.setEnabled(true);
            jbtnDeptFirst.setEnabled(true);
            jbtnDeptNext.setEnabled(true);
            jbtnDeptLast.setEnabled(true);
            jbtnDeptPrev.setEnabled(true);
            jbtnDeptUpdate.setEnabled(true);
            jbtnDeptSearch.setEnabled(true);

        } catch (SQLException e) {
            try {
                resultset.next();
            } catch (SQLException f) {
            }
        }
}//GEN-LAST:event_jbtnDeptCancelActionPerformed

    private void jbtnDeptAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptAddNewActionPerformed
        // This code addc record to the databse
        try {
            currentRow = resultset.getRow();
            jtxtAccNum.setText(null);
            jtxtBankID.setText(null);
            jtxtBankName.setText(null);
            jtxtAccountType.setText(null);
            jtxtDate.setText(null);
            // jtxtAccountBal.setText(null);

            jbtnDeptDel.setEnabled(false);
            jbtnDeptFirst.setEnabled(false);
            jbtnDeptNext.setEnabled(false);
            jbtnDeptLast.setEnabled(false);
            jbtnDeptPrev.setEnabled(false);
            jbtnDeptUpdate.setEnabled(false);
            jbtnDeptSearch.setEnabled(false);
        } catch (SQLException e) {
        }
}//GEN-LAST:event_jbtnDeptAddNewActionPerformed

    private void jbtnDeptBankSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptBankSaveActionPerformed
        //  // This code saves the new employee banks details to banks relation
        try {
            bankID = jtxtBankID.getText();
            bankName = jtxtBankName.getText();
            accountNum = jtxtAccNum.getText();
            strAccountType = jtxtAccountType.getText();
            dateOfOpening = jtxtDate.getText();
            resultset.moveToInsertRow();
            statement.executeUpdate("insert into banks values('" + accountNum + "','" + bankID + "','" + bankName + "','" + dateOfOpening + "','" + strAccountType + "')");
            JOptionPane.showMessageDialog(null, "Record has been saved successfully!", "Employees bank Details\n" + "Proceed to add the employee in employees relation", JOptionPane.INFORMATION_MESSAGE);

            resultset = statement.executeQuery(sql);
            resultset.next();
            jtxtAccNum.setText(resultset.getString("AccountNumber"));
            jtxtBankID.setText(resultset.getString("BankID"));
            jtxtBankName.setText(resultset.getString("BankName"));
            jtxtAccountType.setText(resultset.getString("AccountType"));
            jtxtDate.setText(resultset.getString("DateOpened"));

            jbtnDeptDel.setEnabled(true);
            jbtnDeptFirst.setEnabled(true);
            jbtnDeptNext.setEnabled(true);
            jbtnDeptLast.setEnabled(true);
            jbtnDeptPrev.setEnabled(true);
            jbtnDeptUpdate.setEnabled(true);
            jbtnDeptSearch.setEnabled(true);
        } catch (SQLException e) {
            try {
                resultset.next();
            } catch (SQLException f) {
                JOptionPane.showMessageDialog(rootPane, "Dublicate entry made");
            }
        }
}//GEN-LAST:event_jbtnDeptBankSaveActionPerformed

    private void jbtnDeptDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeptDelActionPerformed
        // this code deletes a record parmanently from the relation
        try {
            resultset.deleteRow();
            JOptionPane.showMessageDialog(null, "Record has been Deleted successfully!", "Employees banks details Details", JOptionPane.INFORMATION_MESSAGE);
            resultset = statement.executeQuery(sql);
            resultset.next();
            jtxtAccNum.setText(resultset.getString("AccountNumber"));
            jtxtBankID.setText(resultset.getString("BankID"));
            jtxtBankName.setText(resultset.getString("BankName"));
            jtxtAccountType.setText(resultset.getString("AccountType"));
            jtxtDate.setText(resultset.getString("DateOpened"));
            //jtxtAccountBal.setText(resultset.getString("AcountBalance"));
        } catch (SQLException e) {
            System.out.print(e);
        }
}//GEN-LAST:event_jbtnDeptDelActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // return user to the home interface of the payroll system
        new PayrollHome().setVisible(true);
        this.dispose();
}//GEN-LAST:event_jbtnExitActionPerformed

    private void jtxtBankNamefindRecord(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBankNamefindRecord

}//GEN-LAST:event_jtxtBankNamefindRecord

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanksForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelTitleHome;
    private javax.swing.JMenuBar jMenuBarBanksPayments;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDesignBar2;
    private javax.swing.JButton jbtnDeptAddNew;
    private javax.swing.JButton jbtnDeptBankSave;
    private javax.swing.JButton jbtnDeptCancel;
    private javax.swing.JButton jbtnDeptDel;
    private javax.swing.JButton jbtnDeptFirst;
    private javax.swing.JButton jbtnDeptLast;
    private javax.swing.JButton jbtnDeptNext;
    private javax.swing.JButton jbtnDeptPrev;
    private javax.swing.JButton jbtnDeptSearch;
    private javax.swing.JButton jbtnDeptUpdate;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JMenuItem jmnuBankDetails;
    private javax.swing.JMenuItem jmnuBankReport;
    private javax.swing.JMenu jmnuBanks;
    private javax.swing.JMenuItem jmnuDept;
    private javax.swing.JMenuItem jmnuEmployees;
    private javax.swing.JMenu jmnuHelp;
    private javax.swing.JMenuItem jmnuHome;
    private javax.swing.JMenuItem jmnuItemExit;
    private javax.swing.JMenuItem jmnuPayrollHelp;
    private javax.swing.JMenu jmnuReport;
    private javax.swing.JPanel jpanelBank;
    private javax.swing.JPanel jpanelBank2;
    private javax.swing.JTextField jtxtAccNum;
    private javax.swing.JTextField jtxtAccountType;
    private javax.swing.JTextField jtxtBankID;
    private javax.swing.JTextField jtxtBankName;
    private javax.swing.JTextField jtxtDate;
    // End of variables declaration//GEN-END:variables

}
