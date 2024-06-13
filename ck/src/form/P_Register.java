package form;

import event.EventMessage;
import event.PublicEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import model.Model_Message;
import model.Model_Register;

public class P_Register extends javax.swing.JPanel {

    public P_Register() {
        initComponents();

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        cmdRegister = new javax.swing.JButton();
        cmdBackLogin = new javax.swing.JButton();
        lbError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        lbTitle.setBackground(new java.awt.Color(204, 204, 204));
        lbTitle.setFont(new java.awt.Font("sansserif", 1, 30)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Register");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");

        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText("Enter Username");
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");

        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setText("Enter Password");
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirm Password");

        txtRePassword.setForeground(new java.awt.Color(204, 204, 204));
        txtRePassword.setText("Enter Password");
        txtRePassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRePasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRePasswordFocusLost(evt);
            }
        });
        txtRePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRePasswordActionPerformed(evt);
            }
        });

        cmdRegister.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmdRegister.setText("Register");
        cmdRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegisterActionPerformed(evt);
            }
        });

        cmdBackLogin.setBackground(new java.awt.Color(0, 0, 0));
        cmdBackLogin.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        cmdBackLogin.setForeground(new java.awt.Color(15, 128, 206));
        cmdBackLogin.setText("Back Login");
        cmdBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdBackLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmdBackLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmdBackLoginMouseExited(evt);
            }
        });
        cmdBackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackLoginActionPerformed(evt);
            }
        });

        lbError.setFont(new java.awt.Font("sansserif", 0, 11)); // NOI18N
        lbError.setForeground(new java.awt.Color(255, 0, 0));
        lbError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbError.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(cmdRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdBackLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdBackLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbError)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackLoginActionPerformed
        PublicEvent.getInstance().getEventLogin().goLogin();
    }//GEN-LAST:event_cmdBackLoginActionPerformed

    private void cmdRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegisterActionPerformed
          String userName = txtUser.getText().trim();
        String password = String.valueOf(txtPass.getPassword());
        String confirmPassword = String.valueOf(txtRePassword.getPassword());
        if (userName.equals("")) {
            txtUser.grabFocus();
        } else if (password.equals("")) {
            txtPass.grabFocus();
        } else if (!password.equals(confirmPassword)) {
            txtPass.grabFocus();
        } else {
            Model_Register data = new Model_Register(userName, password);
            PublicEvent.getInstance().getEventLogin().register(data, new EventMessage() {
                @Override
                public void callMessage(Model_Message message) {
                    if (!message.isAction()) {
                        lbError.setText(message.getMessage());
                    } else {
                        PublicEvent.getInstance().getEventMain().initChat();
                    }
                }
            });
        }
//        String userName = txtUser.getText().trim();
//        String password = String.valueOf(txtPass.getPassword());
//        String confirmPassword = String.valueOf(txtRePassword.getPassword());
//        if (userName.equals("")) {
//            txtUser.grabFocus();
//        } else if (password.equals("")) {
//            txtPass.grabFocus();
//        } else if (!password.equals(confirmPassword)) {
//            txtPass.grabFocus();
//        } else {
//            Model_Register data = new Model_Register(userName, password);
//            PublicEvent.getInstance().getEventLogin().register(data, new EventMessage() {
//                @Override
//                public void callMessage(Model_Message message) {
//                    if (!message.isAction()) {
//                        lbError.setText(message.getMessage());
//                    } else {
//                        PublicEvent.getInstance().getEventMain().initChat();
//                    }
//                }
//            });
//        }

         
    }//GEN-LAST:event_cmdRegisterActionPerformed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtUserActionPerformed

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        // TODO add your handling code here:
        if (txtUser.getText().equals("Enter Username")){
            txtUser.setText("");
            txtUser.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        // TODO add your handling code here:
        if (txtPass.getText().equals("Enter Password")){
            txtPass.setText("");
            txtPass.setForeground(new Color(153,153,153));
        
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        // TODO add your handling code here:
        if (txtUser.getText().equals("")) {
        txtUser.setText("Enter Username"); 
       txtUser.setForeground(new Color(153,153,153));
    }else {
        txtUser.setForeground(Color.BLACK); // Đảm bảo màu chữ là màu đen khi có nội dung
    }
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        // TODO add your handling code here:
           if (txtPass.getText().equals("")) {
        txtPass.setText("Enter Password"); 
       txtPass.setForeground(new Color(153,153,153));
    }else {
        txtPass.setForeground(Color.BLACK); // Đảm bảo màu chữ là màu đen khi có nội dung
    }
    }//GEN-LAST:event_txtPassFocusLost

    private void txtRePasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRePasswordFocusGained
        // TODO add your handling code here:
         if (txtRePassword.getText().equals("Enter Password")){
            txtRePassword.setText("");
            txtRePassword.setForeground(new Color(153,153,153));
        
        }
    }//GEN-LAST:event_txtRePasswordFocusGained

    private void txtRePasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRePasswordFocusLost
        // TODO add your handling code here:
             if (txtRePassword.getText().equals("")) {
        txtRePassword.setText("Enter Password"); 
       txtRePassword.setForeground(new Color(153,153,153));
             }else {
        txtRePassword.setForeground(Color.BLACK); // Đảm bảo màu chữ là màu đen khi có nội dung
    }
    }//GEN-LAST:event_txtRePasswordFocusLost

    private void cmdBackLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdBackLoginMouseEntered
        // TODO add your handling code here:
        cmdBackLogin.setBackground(new java.awt.Color(255, 255, 255)); // Đổi màu khi hover
        cmdBackLogin.setForeground(new java.awt.Color(0,0,0)); // Đổi màu chữ khi hover
    }//GEN-LAST:event_cmdBackLoginMouseEntered

    private void cmdBackLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdBackLoginMouseExited
        // TODO add your handling code here:
       cmdBackLogin.setBackground(new java.awt.Color(0,0,0)); // Màu gốc
        cmdBackLogin.setForeground(new java.awt.Color(15, 128, 206)); // Màu chữ gốc
    }//GEN-LAST:event_cmdBackLoginMouseExited

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtRePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRePasswordActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBackLogin;
    private javax.swing.JButton cmdRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
