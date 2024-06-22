package main;

import service.Service;

public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
       updateUserNameFromService();
    }

      public void updateUserName(String userName) {
        jLabel1.setText(userName);
    }
      // Phương thức để cập nhật tên người dùng từ Service
    public void updateUserNameFromService() {
        String userName = Service.getInstance().getUsername();
        if (userName != null) {
            jLabel1.setText(userName);
        } else {
            jLabel1.setText("Your Account"); // Hoặc giá trị mặc định phù hợp nếu userName là null
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        imageAvatar1 = new main.ImageAvatar();

        setBackground(new java.awt.Color(89, 168, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Your Account");

        imageAvatar1.setBackground(new java.awt.Color(204, 204, 255));
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(imageAvatar1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private main.ImageAvatar imageAvatar1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
