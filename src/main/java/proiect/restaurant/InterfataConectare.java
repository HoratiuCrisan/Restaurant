package proiect.restaurant;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Horatiu
 */
public class InterfataConectare extends javax.swing.JFrame {
    Connection Con = null;
    /**
     * Creates new form InterfataConectare
     */
    public InterfataConectare() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        UnameTb = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CustomerBtn = new javax.swing.JButton();
        SgnUpBtn = new javax.swing.JButton();
        PasswordTb = new javax.swing.JPasswordField();
        LgnBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Conectare Restaurant");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(289, 289, 289))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("Nume");

        Password.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(153, 0, 153));
        Password.setText("Parola");

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Conectare");

        CustomerBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        CustomerBtn.setForeground(new java.awt.Color(153, 0, 153));
        CustomerBtn.setText("Continuați ca și client");
        CustomerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerBtnMouseClicked(evt);
            }
        });

        SgnUpBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        SgnUpBtn.setForeground(new java.awt.Color(153, 0, 153));
        SgnUpBtn.setText("Creare cont");
        SgnUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SgnUpBtnActionPerformed(evt);
            }
        });

        LgnBtn.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        LgnBtn.setForeground(new java.awt.Color(153, 0, 153));
        LgnBtn.setText("Conectare");
        LgnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LgnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                            .addComponent(PasswordTb)
                            .addComponent(UnameTb, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CustomerBtn)
                            .addComponent(SgnUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(LgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UnameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SgnUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordTb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LgnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SgnUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SgnUpBtnActionPerformed
        // TODO add your handling code here:
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "HoratiuMySQL2001@");
            Statement stmt = Con.createStatement();
            String SQL = "select * from cont where username='" + UnameTb.getText() + "'";
            ResultSet rs = stmt.executeQuery(SQL);
            if (UnameTb.getText().isEmpty() || PasswordTb.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Informatie incompleta!");
        } else if (rs.next()) {
            JOptionPane.showMessageDialog(this, "Numele este deja utilizat!");
        } else {
            try {
                PreparedStatement Pst = Con.prepareStatement("insert into cont values(?,?)");
                Pst.setString(1, UnameTb.getText());
                Pst.setString(2, Arrays.toString(PasswordTb.getPassword()));
                Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Cont creat!");
                Con.close(); 
            } catch (HeadlessException | SQLException e) {
                System.out.println(e + "");
            }
        }
        } catch (HeadlessException | SQLException e) {
            System.out.println(evt);
        }
        
    }//GEN-LAST:event_SgnUpBtnActionPerformed

    private void CustomerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerBtnMouseClicked
        // TODO add your handling code here:
        try {
            InterfataCaserie objectCaserie = new InterfataCaserie();
            objectCaserie.setUsername("");
            objectCaserie.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_CustomerBtnMouseClicked
    
    
    private void LgnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LgnBtnActionPerformed
        // TODO add your handling code here:
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "HoratiuMySQL2001@");
            Statement stmt = Con.createStatement();
            String SQL = "select * from cont where username='" + UnameTb.getText() + "' and password='" + Arrays.toString(PasswordTb.getPassword()) + "'";
            ResultSet rs = stmt.executeQuery(SQL);
            
        
            if (UnameTb.getText().isEmpty() || PasswordTb.getPassword().length == 0) {
               JOptionPane.showMessageDialog(this, "Informatii insuficiente!");
           }
           else if (rs.next()) {
               InterfataIteme obj = new InterfataIteme();
               obj.setUsername(UnameTb.getText());
               obj.setVisible(true);
               this.dispose();
           }
           else {
               JOptionPane.showMessageDialog(this, "Nume sau parola incorectă");
               UnameTb.setText("");
               PasswordTb.setText("");
           }
        } catch (HeadlessException | SQLException e) {
            System.out.println(evt);
        }
    }//GEN-LAST:event_LgnBtnActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfataConectare.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InterfataConectare().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerBtn;
    private javax.swing.JButton LgnBtn;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordTb;
    private javax.swing.JButton SgnUpBtn;
    private javax.swing.JTextField UnameTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
