
package component;

import java.awt.Color;

public class Chat_Item extends javax.swing.JPanel {

    /**
     * Creates new form Chat_Item
     */
    public Chat_Item() {
        initComponents();
        txt.setEditable(false);
        txt.setBackground(new Color(0, 0, 0, 0));
        txt.setOpaque(false);
    }
    public void setText(String text) {
        txt.setText(text);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new swing.JIMSendTextPane();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        txt.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.JIMSendTextPane txt;
    // End of variables declaration//GEN-END:variables
}
