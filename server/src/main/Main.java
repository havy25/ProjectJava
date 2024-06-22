
package main;

import connection.DatabaseConnection;
import service.Service;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;



public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        init();
    }
     private void init() {
        setIconImage(new ImageIcon(getClass().getResource("/icon/logoServer.png")).getImage());
         setTitle("Start Server!");
          StopServer.setEnabled(false);
            StartServer.setEnabled(true);
    // Đăng ký sự kiện WindowListener cho cửa sổ chính
    this.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent windowEvent) {
            confirmCloseWindow(); // Gọi phương thức xác nhận khi đóng cửa sổ
        }
    });
     }
     private boolean serverRunning = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        StartServer = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        StopServer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txt.setEditable(false);
        txt.setBackground(new java.awt.Color(204, 204, 255));
        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        StartServer.setText("Khỏi động máy chủ");
        StartServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartServerMouseClicked(evt);
            }
        });
        StartServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartServerActionPerformed(evt);
            }
        });

        jTextField1.setText("9999");

        StopServer.setText("Dừng máy chủ");
        StopServer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StopServerMouseClicked(evt);
            }
        });
        StopServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopServerActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/server.png"))); // NOI18N

        jLabel2.setText("Port:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StartServer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StopServer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StopServer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StartServer, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void StopServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopServerActionPerformed
       
    }//GEN-LAST:event_StopServerActionPerformed

    private void StartServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartServerActionPerformed
   
    }//GEN-LAST:event_StartServerActionPerformed

    private void StartServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartServerMouseClicked
        // TODO add your handling code here:
          try {
            DatabaseConnection.getInstance().connectToDatabase();
            Service.getInstance(txt).startServer();
            // Cập nhật trạng thái và giao diện người dùng
        serverRunning = true;
        StartServer.setEnabled(false);
        StopServer.setEnabled(true);
        } catch (SQLException e) {
            txt.append("Error : " + e + "\n");
        }
    }//GEN-LAST:event_StartServerMouseClicked
    // Phương thức để hiển thị hộp thoại xác nhận khi đóng cửa sổ
private void confirmCloseWindow() {
    int confirm = JOptionPane.showConfirmDialog(this, "Đóng máy chủ luôn nhé!", "Xác nhận", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        // Dừng máy chủ
        try {
            Service.getInstance(txt).stopServer();
        } catch (Exception e) {
            txt.append("Error : " + e + "\n");
        }
    } else {
        // Người dùng chọn No hoặc đóng hộp thoại
        // Không có hành động gì
    }
}
    private void StopServerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopServerMouseClicked
        // TODO add your handling code here:
          try {
            Service.getInstance(txt).stopServer();
            // Cập nhật trạng thái và giao diện người dùng
        serverRunning = false;
        StopServer.setEnabled(false);
        StartServer.setEnabled(true);
        } catch (Exception e) {
            txt.append("Error : " + e + "\n");
        }
    }//GEN-LAST:event_StopServerMouseClicked
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StartServer;
    private javax.swing.JButton StopServer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
