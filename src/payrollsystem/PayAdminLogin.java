package payrollsystem;
//@author Wycliffe

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class PayAdminLogin extends javax.swing.JFrame
{
    /** Creates new form PayAdminLogin */
    public PayAdminLogin()
    {
        initComponents();
        jLoginTextField.setHorizontalAlignment(JTextField.RIGHT);
        jLoginPasswordField.setHorizontalAlignment(JTextField.RIGHT);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogin = new javax.swing.JPanel();
        jlblLoginlUserName = new javax.swing.JLabel();
        jlblPassword = new javax.swing.JLabel();
        jLoginTextField = new javax.swing.JTextField();
        jLoginPasswordField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLoginOK = new javax.swing.JButton();
        jLoginCancel = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jpnlLoginBar = new javax.swing.JPanel();
        jlblLoginLogo2 = new javax.swing.JLabel();
        jlblLoginTitle = new javax.swing.JLabel();
        jlbLoginlLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));

        jPanelLogin.setBorder(javax.swing.BorderFactory.createTitledBorder("User Login"));
        jPanelLogin.setFocusCycleRoot(true);
        jPanelLogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jlblLoginlUserName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblLoginlUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/PNG/User-01.png"))); // NOI18N
        jlblLoginlUserName.setText("Enter Username");

        jlblPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblPassword.setText("Enter Password");

        jLoginTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginTextFieldActionPerformed(evt);
            }
        });
        jLoginTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLoginTextFieldKeyPressed(evt);
            }
        });

        jLoginPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginPasswordFieldActionPerformed(evt);
            }
        });

        jLoginOK.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLoginOK.setText("OK");
        jLoginOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginOKActionPerformed(evt);
            }
        });

        jLoginCancel.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLoginCancel.setText("Cancel");
        jLoginCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginCancelActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLoginOK, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLoginCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLoginOK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLoginCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlblLoginlUserName)
                            .addComponent(jlblPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLoginPasswordField)
                            .addComponent(jLoginTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)))
                    .addGroup(jPanelLoginLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblLoginlUserName)
                    .addComponent(jLoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLoginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jpnlLoginBar.setBackground(new java.awt.Color(51, 0, 255));
        jpnlLoginBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlblLoginLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/ICO/wybosoft.gif"))); // NOI18N

        jlblLoginTitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jlblLoginTitle.setForeground(new java.awt.Color(255, 255, 255));
        jlblLoginTitle.setText("Wybosoft University College");
        jlblLoginTitle.setToolTipText(" Wybosoft inc. Login");

        jlbLoginlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payrollsystem/ICO/wybosoft.gif"))); // NOI18N

        javax.swing.GroupLayout jpnlLoginBarLayout = new javax.swing.GroupLayout(jpnlLoginBar);
        jpnlLoginBar.setLayout(jpnlLoginBarLayout);
        jpnlLoginBarLayout.setHorizontalGroup(
            jpnlLoginBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlLoginBarLayout.createSequentialGroup()
                .addComponent(jlbLoginlLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(jlblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(jlblLoginLogo2))
        );
        jpnlLoginBarLayout.setVerticalGroup(
            jpnlLoginBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlLoginBarLayout.createSequentialGroup()
                .addGroup(jpnlLoginBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblLoginLogo2)
                    .addComponent(jlbLoginlLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlLoginBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblLoginTitle)
                .addGap(31, 31, 31))
        );

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1153, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );

        jLabel7.setBackground(new java.awt.Color(204, 0, 0));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("Wybosoft University College...A completely integreted Payroll system                                                                              P.O Box 2222-60999, Nairobi-Kenya; E-Mail  Wybosoft@education.edu.ke");
        jLabel7.setToolTipText("Bank Payment details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlLoginBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1133, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(309, 309, 309)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlLoginBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jLoginTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginTextFieldActionPerformed

    private void jLoginOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginOKActionPerformed

  if (evt.getSource() == jLoginOK)
  {
  try {
    Connection conn = null;
    String userName = "root";
    String password = "prof1989*";
    Class.forName ("com.mysql.jdbc.Driver").newInstance();
    String url = "jdbc:mysql://localhost:3306/payroll";
    conn = (Connection) DriverManager.getConnection (url, userName, password);

    try {
        Statement st = (Statement) conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM paylogin WHERE Surname='" + jLoginTextField.getText() +
                "' and password='" + jLoginPasswordField.getText() + "'");

        String uname="",pass="";

        if (rs.next())
        {
            uname=rs.getString("Surname");
            pass=rs.getString("password");

            if (uname.equals(uname) && pass.equals(pass))
            {
             JOptionPane.showMessageDialog( null, "LOGIN IS SUCCESSFUL","Payroll Login",JOptionPane.INFORMATION_MESSAGE);
             new PayrollBackGround().setVisible(true);
             new PayrollLoader().setVisible(true);
             this.dispose();
            }
            else
             {
                new PayAdminLogin().setVisible(true);
             }
        }
        else
        {
         JOptionPane.showMessageDialog(null,"Invalid username or password","Payroll Login",JOptionPane.ERROR_MESSAGE);
        }
        conn.close();
        } 
    catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Invalid username or password", "Payroll Login", JOptionPane.ERROR_MESSAGE);
            jLoginTextField.setText("");
            jLoginPasswordField.setText("");
        }//inner try catch closed
    }
    catch (Exception x)
    {
        JOptionPane.showMessageDialog(null, "Unable to connect to the database", "Connection error", JOptionPane.ERROR_MESSAGE);
    }//outer try catch closed
}//if closed

    if (evt.getSource() == jLoginOK)
    {
        System.getProperties();
    }
   
    }//GEN-LAST:event_jLoginOKActionPerformed

    private void jLoginCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginCancelActionPerformed
        // TODO add your handling code here:
        jLoginTextField.setText(null);
        jLoginPasswordField.setText(null);
        
    }//GEN-LAST:event_jLoginCancelActionPerformed

    private void jLoginTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLoginTextFieldKeyPressed
        

    }//GEN-LAST:event_jLoginTextFieldKeyPressed

    private void jLoginPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginPasswordFieldActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) throws ClassNotFoundException
    {
        try
        {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

        }
        catch (InstantiationException ex)
        {
            Logger.getLogger(PayrollHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger(PayrollHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (UnsupportedLookAndFeelException ex)
        {
            Logger.getLogger(PayrollHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run()
            {
                new PayAdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jLoginCancel;
    private javax.swing.JButton jLoginOK;
    private javax.swing.JPasswordField jLoginPasswordField;
    private javax.swing.JTextField jLoginTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JLabel jlbLoginlLogo;
    private javax.swing.JLabel jlblLoginLogo2;
    private javax.swing.JLabel jlblLoginTitle;
    private javax.swing.JLabel jlblLoginlUserName;
    private javax.swing.JLabel jlblPassword;
    private javax.swing.JPanel jpnlLoginBar;
    // End of variables declaration//GEN-END:variables

}
