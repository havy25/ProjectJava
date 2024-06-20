package main;

import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import event.EventImageView;
import event.EventMain;
import event.PublicEvent;
import java.awt.Color;
import model.Model_User_Account;
import service.Service;
import swing.ComponentResizer;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import menu.drawer.Drawer;
import menu.drawer.DrawerController;
import menu.drawer.DrawerItem;
import menu.drawer.EventDrawer;
import form.Report;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        init();
    }
      private DrawerController drawer;

    private void init() {
        drawer = Drawer.newDrawer(this)
                .background(new Color(90, 90, 90))
                .closeOnPress(true)
                .backgroundTransparent(0.3f)
                .leftDrawer(true)
                .enableScroll(true)
                .enableScrollUI(false)
                .headerHeight(160)
                .header(new Header())
                .space(3)
                .addChild(new DrawerItem("User ").icon(new ImageIcon(getClass().getResource("/icon/user2.png"))).build())
                .addChild(new DrawerItem("Đổi mật khẩu").icon(new ImageIcon(getClass().getResource("/icon/cont.png"))).build())
                .addChild(new DrawerItem("Report").icon(new ImageIcon(getClass().getResource("/icon/report.png"))).build())
                .addChild(new DrawerItem("Chat Box").icon(new ImageIcon(getClass().getResource("/icon/income.png"))).build())
                //.addChild(new DrawerItem("Expense").icon(new ImageIcon(getClass().getResource("/icon/expense.png"))).build())
                //.addChild(new DrawerItem("Datas").icon(new ImageIcon(getClass().getResource("/icon/data.png"))).build())
                .addFooter(new DrawerItem("Exit").icon(new ImageIcon(getClass().getResource("/icon/exit.png"))).build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int index, DrawerItem item) {
                        if (drawer.isShow()) {
                            drawer.hide();
                        }
                        if ("Exit".equals(item.getText())) {
                            logout();
                            exit();
                        }
                        if ("Report".equals(item.getText())) {
                            showReportWindow();
                        }
                    }
                })
                .build();
        
        setIconImage(new ImageIcon(getClass().getResource("/icon/icon.png")).getImage());
        ComponentResizer com = new ComponentResizer();
        com.registerComponent(this);
        com.setMinimumSize(new Dimension(900, 500));
        com.setMaximumSize(Toolkit.getDefaultToolkit().getScreenSize());
        com.setSnapSize(new Dimension(10, 10));
        login.setVisible(true);
      //  loading.setVisible(false);
        vIew_Image.setVisible(false);
        home.setVisible(false);
        initEvent();
        Service.getInstance().startServer();
    }

    private void initEvent() {
        PublicEvent.getInstance().addEventMain(new EventMain() {
            @Override
            public void showLoading(boolean show) {
              //  loading.setVisible(show);
            }

            @Override
            public void initChat() {
                home.setVisible(true);
                login.setVisible(false);
                Service.getInstance().getClient().emit("list_user", Service.getInstance().getUser().getUserID());
            }

            @Override
            public void selectUser(Model_User_Account user) {
                home.setUser(user);
            }

            @Override
            public void updateUser(Model_User_Account user) {
                home.updateUser(user);
            }

        });
        PublicEvent.getInstance().addEventImageView(new EventImageView() {
            @Override
            public void viewImage(Icon image) {
                vIew_Image.viewImage(image);
            }

            @Override
            public void saveImage(Icon image) {
                System.out.println("Save Image next update");
            }

        });
    }
    private void logout() {
        // Ngắt kết nối với server
        if (Service.getInstance().getClient() != null && Service.getInstance().getClient().connected()) {
            Service.getInstance().getClient().disconnect();
        }
          // Ẩn menu kéo ra
    drawer.hide();
        // Xóa thông tin người dùng
        Service.getInstance().setUser(null);

 
    }
     private void exit(){
         this.setVisible(false);
         Main main = new Main();
         main.setVisible(true);
}
         private void showReportWindow() {
        Report reportWindow = new Report();
        reportWindow.setVisible(true);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        border = new javax.swing.JPanel();
        background = new javax.swing.JPanel();
        title = new javax.swing.JPanel();
        cmdMinimize = new javax.swing.JButton();
        cmdClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        body = new javax.swing.JLayeredPane();
        home = new form.Home();
        loading = new form.Loading();
        login = new form.Login();
        vIew_Image = new form.VIew_Image();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        border.setBackground(new java.awt.Color(229, 229, 229));

        background.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(229, 229, 229));
        title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titleMouseDragged(evt);
            }
        });
        title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titleMousePressed(evt);
            }
        });

        cmdMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/minimize.png"))); // NOI18N
        cmdMinimize.setBorder(null);
        cmdMinimize.setContentAreaFilled(false);
        cmdMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdMinimize.setInheritsPopupMenu(true);
        cmdMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMinimizeActionPerformed(evt);
            }
        });

        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        cmdClose.setBorder(null);
        cmdClose.setContentAreaFilled(false);
        cmdClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Source Code Pro", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Welcome App-Chat");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu-bar.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 535, Short.MAX_VALUE)
                .addComponent(cmdMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmdClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(cmdMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        body.setLayout(new java.awt.CardLayout());
        body.add(home, "card2");
        body.add(loading, "card5");
        body.add(login, "card5");
        body.setLayer(vIew_Image, javax.swing.JLayeredPane.POPUP_LAYER);
        body.add(vIew_Image, "card3");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(body, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(border, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int pX;
    private int pY;
    private void titleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - pX, this.getLocation().y + evt.getY() - pY);
    }//GEN-LAST:event_titleMouseDragged

    private void titleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titleMousePressed
        pX = evt.getX();
        pY = evt.getY();
    }//GEN-LAST:event_titleMousePressed

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cmdCloseActionPerformed

    private void cmdMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMinimizeActionPerformed
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_cmdMinimizeActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
           if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    public static void main(String args[]) {
        FlatArcIJTheme.setup();
         Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                java.awt.EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Main().setVisible(true);
                    }
                });
            }
        });
        thread.start();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLayeredPane body;
    private javax.swing.JPanel border;
    private javax.swing.JButton cmdClose;
    private javax.swing.JButton cmdMinimize;
    private form.Home home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private form.Loading loading;
    private form.Login login;
    private javax.swing.JPanel title;
    private form.VIew_Image vIew_Image;
    // End of variables declaration//GEN-END:variables
}
