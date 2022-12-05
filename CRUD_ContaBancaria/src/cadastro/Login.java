
package cadastro;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btenter = new javax.swing.JButton();
        btsenha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btlogar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("20222017914");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 100, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText(" INSCRIÇÃO:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("ALUNO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("    CEFET -MG");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, -1));

        btenter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/favicon.png"))); // NOI18N
        btenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btenterActionPerformed(evt);
            }
        });
        getContentPane().add(btenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 50, 30));

        btsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btsenhaKeyPressed(evt);
            }
        });
        getContentPane().add(btsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("SENHA:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, -1));

        btlogar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btlogarKeyPressed(evt);
            }
        });
        getContentPane().add(btlogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 130, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("LOGIN: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 50, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Vanessa");
        jLabel8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel8AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 60, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btenterActionPerformed
        if(btlogar.getText().equals("Vanessa")&& btsenha.getText().equals("20222017914")){
             CadConta conta =new CadConta();
            
             
            conta.setVisible(true);
            this.dispose();
             
              conta.setLocationRelativeTo(null);
              
        }else{
            JOptionPane.showMessageDialog(this,"Dados Inválidos");
           
        }
        
       
    }//GEN-LAST:event_btenterActionPerformed

    private void btlogarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btlogarKeyPressed
         if(KeyEvent.VK_ENTER==evt.getKeyCode()){
           btsenha.requestFocus();    
        }
    }//GEN-LAST:event_btlogarKeyPressed

    private void btsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btsenhaKeyPressed
         if(KeyEvent.VK_ENTER==evt.getKeyCode()){
            btenter.requestFocus();    
        }
    }//GEN-LAST:event_btsenhaKeyPressed

    private void jLabel8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel8AncestorAdded
        
    }//GEN-LAST:event_jLabel8AncestorAdded

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btenter;
    private javax.swing.JTextField btlogar;
    private javax.swing.JTextField btsenha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
