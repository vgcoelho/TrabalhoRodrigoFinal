package cadastro;

import database.DB;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CadConta extends javax.swing.JFrame {

    DB banco = new DB();
    DefaultTableModel model;
    String colunas[] = {"Código", "nome","saldo","data"};
    private double SaldoNovo=0;
    

    public CadConta() {
        initComponents();

        model = new DefaultTableModel(null, colunas);
        jTable1.setModel(model);
    }

    public void listar() {
        fieldCodigo.setText("");
        btnome.setText("");
        fielddeposito.setText("");
        tbdata.setText("");
        deconta.setText("");
        paraconta.setText("");
        btvalor.setText("");

        List<Conta> lista = banco.getContas();

        model.setRowCount(0);
        for (Conta conta : lista) {
            System.out.println(conta);
            model.addRow(new Object[]{conta.getId(),
                conta.getNome(),
                conta.getSaldo(),
                conta.getData(),});
              
        }
        jTable1.setModel(model);
    }

    public Conta selecionaRegistro() {
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex >= 0) {

            Conta contaSelecao = new Conta();
            contaSelecao.setId(Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString()));
            contaSelecao.setNome((model.getValueAt(selectedRowIndex, 1).toString()));
            contaSelecao.setSaldo(Double.parseDouble(model.getValueAt(selectedRowIndex, 2).toString()));
            contaSelecao.setData((model.getValueAt(selectedRowIndex, 3).toString()));
            
            return contaSelecao;
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um item");
        }

        return null;
    }
    
    public Conta pesquisaRegistro(){
        
        fieldCodigo.setText("");
        btnome.setText("");
        fielddeposito.setText("");
        tbdata.setText("");
        

        Conta conta = banco.getContaById(Integer.parseInt(btbusca.getText()));

        model.setRowCount(0);
      
            System.out.println(conta);
            model.addRow(new Object[]{conta.getId(),
                conta.getNome(),
                conta.getSaldo(),
                conta.getData(),});
              
        
        jTable1.setModel(model);
        
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btvalor = new javax.swing.JTextField();
        paraconta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        deconta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        transfere = new javax.swing.JButton();
        btbusca = new javax.swing.JTextField();
        btpesquisa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoExcluir = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoInserir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fieldCodigo = new javax.swing.JTextField();
        btnome = new javax.swing.JTextField();
        fielddeposito = new javax.swing.JTextField();
        tbdata = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Valor:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 70, -1));

        btvalor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvalorActionPerformed(evt);
            }
        });
        getContentPane().add(btvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 70, -1));

        paraconta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(paraconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 90, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Para : Conta ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 80, -1));

        deconta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deconta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decontaActionPerformed(evt);
            }
        });
        getContentPane().add(deconta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 90, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("De : Conta ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 70, -1));

        transfere.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        transfere.setText("Transferir");
        transfere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfereActionPerformed(evt);
            }
        });
        getContentPane().add(transfere, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        btbusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbuscaActionPerformed(evt);
            }
        });
        getContentPane().add(btbusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 110, -1));

        btpesquisa.setForeground(new java.awt.Color(255, 255, 255));
        btpesquisa.setText("Pesquisar ");
        btpesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(btpesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Data:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 37, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Data", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 152));

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        botaoAlterar.setText("Alterar");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });
        getContentPane().add(botaoInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Depositar:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Nome:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Código:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        fieldCodigo.setEnabled(false);
        getContentPane().add(fieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 121, -1));

        btnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnomeActionPerformed(evt);
            }
        });
        btnome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnomeKeyPressed(evt);
            }
        });
        getContentPane().add(btnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, -1));

        fielddeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fielddepositoActionPerformed(evt);
            }
        });
        fielddeposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fielddepositoKeyPressed(evt);
            }
        });
        getContentPane().add(fielddeposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 120, -1));

        tbdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbdataActionPerformed(evt);
            }
        });
        getContentPane().add(tbdata, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        if(Double.parseDouble(fielddeposito.getText()) > 0){
        Conta conta = new Conta();
        conta.setNome(btnome.getText());
        conta.setSaldo(Double.parseDouble(fielddeposito.getText().replace(",", ".")));
        conta.setData(tbdata.getText());
        System.out.println(conta);
        banco.insert(conta);

        listar();
        }else{
            JOptionPane.showMessageDialog(null,"O valor de deposito não pode ser menor que 0 (zero)! ");
        }
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        Conta conta = selecionaRegistro();
        if (conta != null) {
            fieldCodigo.setText(String.valueOf(conta.getId()));
            btnome.setText(String.valueOf(conta.getNome()));
            fielddeposito.setText(String.valueOf(conta.getDeposito()));
            tbdata.setText(String.valueOf(conta.getData()));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
        if(Double.parseDouble(fielddeposito.getText()) > 0){
            Conta conta = selecionaRegistro();
            if (conta != null) {
                conta = banco.getContaById(Integer.parseInt(fieldCodigo.getText()));
                conta.setNome(btnome.getText());
                conta.setSaldo(Double.parseDouble(fielddeposito.getText()) + conta.getSaldo());
                conta.setData(tbdata.getText());
                listar();
                JOptionPane.showMessageDialog(null, "Registro Salvo no Banco de Dados");
            }
        }else{
            JOptionPane.showMessageDialog(null,"O valor de deposito não pode ser menor que 0 (zero)! ");
        }

    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        Conta conta = selecionaRegistro();
        if (conta != null) {
            if (banco.delete(conta.getId())) {
                listar();
            }
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void tbdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbdataActionPerformed
        
    }//GEN-LAST:event_tbdataActionPerformed

    private void fielddepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fielddepositoActionPerformed
        
    }//GEN-LAST:event_fielddepositoActionPerformed

    private void transfereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfereActionPerformed
    btvalor.setText( btvalor.getText().replaceAll(",","."));   //Tira a virgula e coloca ponto para que nao gere erros...
    
    if((deconta.getText().length()== 0) || (paraconta.getText().length()== 0) || (btvalor.getText().length()== 0) )
    {
        JOptionPane.showMessageDialog(null,"Por Favor, preencha todos os campos para realizar transferência! ");
    }else{
        if(Double.parseDouble(btvalor.getText()) < 0){
            JOptionPane.showMessageDialog(null,"O valor de transferência não pode ser menor que 0 (zero)! ");
         }else{
            
            
            Conta conta;
            conta = banco.getContaById(Integer.parseInt(deconta.getText()));

            if(conta == null){
                JOptionPane.showMessageDialog(null,"Esta Conta de Origem Não Existe ");

            }else{
                 SaldoNovo = conta.getSaldo() - Double.parseDouble(btvalor.getText());
                 conta.setSaldo(SaldoNovo);
                 Conta conta2;
                 conta2 = banco.getContaById(Integer.parseInt(paraconta.getText()));
                    if(conta2 == null){
                        JOptionPane.showMessageDialog(null,"Esta Conta de Destino Não Existe ");
                    }else{
                        SaldoNovo = conta2.getSaldo() + Double.parseDouble(btvalor.getText());
                        conta2.setSaldo(SaldoNovo);
                        JOptionPane.showMessageDialog(null,"Transferência Realizada com Sucesso!");
                        listar(); 
            }    
    }}}
           
    }//GEN-LAST:event_transfereActionPerformed

    private void btnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnomeActionPerformed
        
    }//GEN-LAST:event_btnomeActionPerformed

    private void btnomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnomeKeyPressed
        if(KeyEvent.VK_ENTER==evt.getKeyCode()){
            fieldCodigo.requestFocus();    
        }
    }//GEN-LAST:event_btnomeKeyPressed

    private void fielddepositoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fielddepositoKeyPressed
         if(KeyEvent.VK_ENTER==evt.getKeyCode()){
            tbdata.requestFocus();    
        }
    }//GEN-LAST:event_fielddepositoKeyPressed

    private void btpesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpesquisaActionPerformed
        // TODO add your handling code here:
        
        if( (btbusca.getText().length()!=0))
        {
        Conta conta = pesquisaRegistro();
        if (conta != null) {
            conta = banco.getContaById(Integer.parseInt(fieldCodigo.getText()));
            conta.setNome(btnome.getText());
            conta.setSaldo(Double.parseDouble(fielddeposito.getText()));
            conta.setData(tbdata.getText());

            JOptionPane.showMessageDialog(null, "Registro Salvo no Banco de Dados");
        }
        }else{
            listar();
        }
    }//GEN-LAST:event_btpesquisaActionPerformed

    private void btbuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbuscaActionPerformed
        
    }//GEN-LAST:event_btbuscaActionPerformed

    private void decontaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decontaActionPerformed
        
    }//GEN-LAST:event_decontaActionPerformed

    private void btvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvalorActionPerformed
        
    }//GEN-LAST:event_btvalorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JTextField btbusca;
    private javax.swing.JTextField btnome;
    private javax.swing.JButton btpesquisa;
    private javax.swing.JTextField btvalor;
    private javax.swing.JTextField deconta;
    private javax.swing.JTextField fieldCodigo;
    private javax.swing.JTextField fielddeposito;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField paraconta;
    private javax.swing.JTextField tbdata;
    private javax.swing.JButton transfere;
    // End of variables declaration//GEN-END:variables
}
