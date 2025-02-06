package com.login;
import java.awt.Color;
public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        userlabel1 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginbtn = new javax.swing.JPanel();
        loginbtntxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(null);
        bg.setForeground(new java.awt.Color(153, 153, 153));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 230, 510));

        title.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("INICIAR SESION");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 160, 30));

        userlabel.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        userlabel.setForeground(new java.awt.Color(0, 0, 0));
        userlabel.setText("Usuario");
        bg.add(userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 60, 20));

        usertxt.setBackground(new java.awt.Color(255, 255, 255));
        usertxt.setForeground(new java.awt.Color(153, 153, 153));
        usertxt.setText("ingrese su usuario");
        usertxt.setBorder(null);
        usertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usertxtMousePressed(evt);
            }
        });
        usertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertxtActionPerformed(evt);
            }
        });
        bg.add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 340, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 340, 10));

        userlabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        userlabel1.setForeground(new java.awt.Color(0, 0, 0));
        userlabel1.setText("Constraseña");
        bg.add(userlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 110, 20));

        passtxt.setBackground(new java.awt.Color(255, 255, 255));
        passtxt.setForeground(new java.awt.Color(153, 153, 153));
        passtxt.setText("********");
        passtxt.setBorder(null);
        passtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passtxtMousePressed(evt);
            }
        });
        passtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtActionPerformed(evt);
            }
        });
        bg.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 262, 340, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 340, -1));

        loginbtn.setBackground(new java.awt.Color(102, 102, 255));
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        loginbtntxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbtntxt.setText("Entrar");
        loginbtntxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbtntxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbtntxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginbtnLayout = new javax.swing.GroupLayout(loginbtn);
        loginbtn.setLayout(loginbtnLayout);
        loginbtnLayout.setHorizontalGroup(
            loginbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
        );
        loginbtnLayout.setVerticalGroup(
            loginbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginbtntxt, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertxtActionPerformed
   
    }//GEN-LAST:event_usertxtActionPerformed

    private void passtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtActionPerformed
      
    }//GEN-LAST:event_passtxtActionPerformed

    private void loginbtntxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtntxtMouseEntered
        loginbtn.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_loginbtntxtMouseEntered

    private void loginbtntxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtntxtMouseExited
        loginbtn.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_loginbtntxtMouseExited

    private void usertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertxtMousePressed
        if (usertxt.getText().equals("ingrese su usuario")){
        usertxt.setText("");
        usertxt.setForeground(Color.black);
        }
        if (String.valueOf(passtxt.getPassword()).isEmpty()){
        passtxt.setText("********");
        passtxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usertxtMousePressed

    private void passtxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMousePressed
      if (usertxt.getText().isEmpty()){
        usertxt.setText("ingrese su usuario");
        usertxt.setForeground(Color.gray);
     }
     if (String.valueOf(passtxt.getPassword()).equals("********")){   
        passtxt.setText("");
        passtxt.setForeground(Color.black);
     }
    }//GEN-LAST:event_passtxtMousePressed

   
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginbtn;
    private javax.swing.JLabel loginbtntxt;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userlabel;
    private javax.swing.JLabel userlabel1;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
