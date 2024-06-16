package form;

import event.EventLogin;
import event.EventMessage;
import event.PublicEvent;
import model.Model_Login;
import model.Model_Message;
import model.Model_Register;
import model.Model_User_Account;
import service.Service;
import io.socket.client.Ack;
import main.Header;

public class Login extends javax.swing.JPanel {

    public Login() {
        initComponents();
        init();
    }

    private void init() {
         P_Login login = new P_Login();
        P_Register register = new P_Register();  
        Header Panel = new Header();
        PublicEvent.getInstance().addEventLogin(new EventLogin() {
            @Override
            public void login(Model_Login data) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        PublicEvent.getInstance().getEventMain().showLoading(true);
                        Service.getInstance().getClient().emit("login", data.toJsonObject(), new Ack() {
                            @Override
                            public void call(Object... os) {
                                if (os.length > 0) {
                                    boolean action = (Boolean) os[0];
                                    if (action) {
                                        Service.getInstance().setUser(new Model_User_Account(os[1]));
                                        PublicEvent.getInstance().getEventMain().showLoading(false);
                                        PublicEvent.getInstance().getEventMain().initChat();
                                    } else {
                                        //  password wrong
                                        PublicEvent.getInstance().getEventMain().showLoading(false);
                                    }
                                } else {
                                    PublicEvent.getInstance().getEventMain().showLoading(false);
                                }
                            }
                        });

                    }
                }).start();
            }

            @Override
            public void register(Model_Register data, EventMessage message) {
                Service.getInstance().getClient().emit("register", data.toJsonObject(), new Ack() {
                    @Override
                    public void call(Object... os) {
                        if (os.length > 0) {
                            Model_Message ms = new Model_Message((boolean) os[0], os[1].toString());
                            if (ms.isAction()) {
                                Model_User_Account user = new Model_User_Account(os[2]);
                                Service.getInstance().setUser(user);
                            }
                            message.callMessage(ms);
                            //  call message back when done register
                        }
                    }
                });
            }

            @Override
            public void goRegister() {
                slide.show(1);
                login.setVisible(false);
            register.setVisible(true);
                
            }

            @Override
            public void goLogin() {
                slide.show(0);
                register.setVisible(false);
            login.setVisible(true);
            }
        });
       
        slide.init(login, register);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox1 = new swing.PictureBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        slide = new swing.PanelSlide();
        pic = new swing.PictureBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/configuration.png"))); // NOI18N
        add(pictureBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 190, 240));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        slide.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout slideLayout = new javax.swing.GroupLayout(slide);
        slide.setLayout(slideLayout);
        slideLayout.setHorizontalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        slideLayout.setVerticalGroup(
            slideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(slide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 70, 340, 410));

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/login_image1.png"))); // NOI18N

        javax.swing.GroupLayout picLayout = new javax.swing.GroupLayout(pic);
        pic.setLayout(picLayout);
        picLayout.setHorizontalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        picLayout.setVerticalGroup(
            picLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 130, 340, 290));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("@Copyright Tham & Vy");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 270, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/earth.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 530));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private swing.PictureBox pic;
    private swing.PictureBox pictureBox1;
    private swing.PanelSlide slide;
    // End of variables declaration//GEN-END:variables
}
