package component;
public class Menu extends javax.swing.JPanel {
    public Menu() {
        initComponents();
    }
//    // Mở menu
//    private void OpenMenu() {
//        HMenu.setVisible(true);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i= 0; i <= WidthMenu; i++) {
//                    HMenu.setSize(i, HeightMenu);
//                   
//                }
//            }    
//        }).start();
//    };
//     private void CloseMenu() {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i= WidthMenu; i > 0; i -- ) {
//                    HMenu.setSize(i, HeightMenu);
//                }
//                HMenu.setVisible(false);
//            }
//            
//        }).start();
//    } 
    // Mở menu
//    private void OpenMenu() {
//        if (HMenu == null) return;
//        HMenu.setVisible(true);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= WidthMenu; i++) {
//                    final int width = i;
//                    try {
//                        Thread.sleep(2); // Để tạo hiệu ứng mượt hơn
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    javax.swing.SwingUtilities.invokeLater(new Runnable() {
//                        @Override
//                        public void run() {
//                            HMenu.setSize(width, HeightMenu);
//                        }
//                    });
//                }
//            }
//        }).start();
//    }
//
//    private void CloseMenu() {
//        if (HMenu == null) return;
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = WidthMenu; i > 0; i--) {
//                    final int width = i;
//                    try {
//                        Thread.sleep(2); // Để tạo hiệu ứng mượt hơn
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    javax.swing.SwingUtilities.invokeLater(new Runnable() {
//                        @Override
//                        public void run() {
//                            HMenu.setSize(width, HeightMenu);
//                        }
//                    });
//                }
//                javax.swing.SwingUtilities.invokeLater(new Runnable() {
//                    @Override
//                    public void run() {
//                        HMenu.setVisible(false);
//                    }
//                });
//            }
//        }).start();
//    }
     // Mở menu
//    private void OpenMenu() {
//        if (HMenu == null) return;
//        HMenu.setVisible(true);
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i <= WidthMenu; i++) {
//                    final int width = i;
//                    try {
//                        Thread.sleep(2); // Để tạo hiệu ứng mượt hơn
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    javax.swing.SwingUtilities.invokeLater(new Runnable() {
//                        @Override
//                        public void run() {
//                            HMenu.setSize(width, HeightMenu);
//                        }
//                    });
//                }
//            }
//        }).start();
//    }
//
//    private void CloseMenu() {
//        if (HMenu == null) return;
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = WidthMenu; i > 0; i--) {
//                    final int width = i;
//                    try {
//                        Thread.sleep(2); // Để tạo hiệu ứng mượt hơn
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    javax.swing.SwingUtilities.invokeLater(new Runnable() {
//                        @Override
//                        public void run() {
//                            HMenu.setSize(width, HeightMenu);
//                        }
//                    });
//                }
//                javax.swing.SwingUtilities.invokeLater(new Runnable() {
//                    @Override
//                    public void run() {
//                        HMenu.setVisible(false);
//                    }
//                });
//            }
//        }).start();
//    }
      // Mở menu
  // Mở menu
private void OpenMenu() {
    if (HMenu == null) return;
    HMenu.setVisible(true);
    new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = WidthMenu; i >= 0; i--) {
                final int width = i;
                try {
                    Thread.sleep(2); // Để tạo hiệu ứng mượt hơn
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        HMenu.setSize(width, HeightMenu);
                    }
                });
            }
        }
    }).start();
}

private void CloseMenu() {
    if (HMenu == null) return;
    new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i <= WidthMenu; i++) {
                final int width = i;
                try {
                    Thread.sleep(2); // Để tạo hiệu ứng mượt hơn
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                javax.swing.SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        HMenu.setSize(width, HeightMenu);
                    }
                });
            }
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    HMenu.setVisible(false);
                }
            });
        }
    }).start();
}

    
      private int WidthMenu =  212; 
          private int HeightMenu = 371;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JButton();
        HMenu = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        Menu.setText("Menu");
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        HMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("LogOut");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        HMenu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 180, 50));

        jButton3.setText("Edit");
        HMenu.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 180, 50));

        jButton4.setText("Reporrt Error");
        HMenu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 180, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        HMenu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Menu))
            .addGroup(layout.createSequentialGroup()
                .addComponent(HMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CloseMenu();
        //HMenu.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        // TODO add your handling code here:
        OpenMenu();
//        HMenu.setVisible(true);
    }//GEN-LAST:event_MenuActionPerformed

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
        // TODO add your handling code here:
         OpenMenu();
      //  HMenu.setVisible(true);
    }//GEN-LAST:event_MenuMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
           CloseMenu();
    }//GEN-LAST:event_jButton1MouseClicked
        public static void main(String args[]) {
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HMenu;
    private javax.swing.JButton Menu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
