/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esiii_strategy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author mayarasantos
 */
public class FormCliente1 extends javax.swing.JFrame {

    /**
     * Creates new form FormCliente1
     */
    public FormCliente1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JTextField();
        label_Nome = new javax.swing.JLabel();
        cpf = new javax.swing.JTextField();
        label_CPF = new javax.swing.JLabel();
        label_rua = new javax.swing.JLabel();
        label_Bairro = new javax.swing.JLabel();
        label_Num = new javax.swing.JLabel();
        label_Estado = new javax.swing.JLabel();
        rua = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        estado = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        label_Cidade = new javax.swing.JLabel();
        label_Titulo = new javax.swing.JLabel();
        abelParentesco1 = new javax.swing.JLabel();
        Parentesco1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        NomeDependente1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelParentesco2 = new javax.swing.JLabel();
        Parentesco2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        NomeDependente2 = new javax.swing.JTextField();
        Label_CEP = new javax.swing.JLabel();
        cep = new javax.swing.JTextField();
        LabelResultado = new javax.swing.JLabel();
        salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        label_Nome.setText("Nome");

        cpf.setToolTipText("");
        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        label_CPF.setText("CPF");

        label_rua.setText("Rua");
        label_rua.setToolTipText("");

        label_Bairro.setText("Bairro");

        label_Num.setText("Nº");

        label_Estado.setText("Estado");

        bairro.setToolTipText("");

        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });

        label_Cidade.setText("Cidade");

        label_Titulo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        label_Titulo.setText("Cadastro de Cliente");
        label_Titulo.setToolTipText("");

        abelParentesco1.setText("Parentesco");

        Parentesco1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não tem dependente", "Filho(a)", "Cônjuge", "Mãe", "Pai" }));
        Parentesco1.setSelectedIndex(-1);
        Parentesco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parentesco1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Dependentes");

        jLabel2.setText("Nome:");

        jLabel3.setText("Nome:");

        labelParentesco2.setText("Parentesco");

        Parentesco2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não tem dependente", "Filho(a)", "Cônjuge", "Mãe", "Pai" }));
        Parentesco2.setSelectedIndex(-1);
        Parentesco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Parentesco2ActionPerformed(evt);
            }
        });

        Label_CEP.setText("CEP");

        cep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepActionPerformed(evt);
            }
        });

        LabelResultado.setForeground(new java.awt.Color(204, 0, 51));

        salvar.setText("Salvar");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label_CPF)
                                .addGap(33, 33, 33)
                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(NomeDependente2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(labelParentesco2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Parentesco2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(abelParentesco1)
                                            .addGap(18, 18, 18)
                                            .addComponent(Parentesco1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(254, 254, 254))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(NomeDependente1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Estado)
                            .addComponent(label_Cidade)
                            .addComponent(Label_CEP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(estado)
                            .addComponent(cidade))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Bairro)
                            .addComponent(label_rua))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rua)
                                .addGap(39, 39, 39)
                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bairro))
                        .addGap(18, 18, 18)
                        .addComponent(label_Num)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Nome)
                        .addGap(18, 18, 18)
                        .addComponent(nome)
                        .addGap(42, 42, 42))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(LabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_Titulo)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label_Titulo)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Nome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_CPF))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_rua)
                    .addComponent(label_Num)
                    .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Bairro)
                    .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_CEP)
                    .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Estado)
                    .addComponent(estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Cidade))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDependente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(abelParentesco1)
                    .addComponent(Parentesco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NomeDependente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelParentesco2)
                    .addComponent(Parentesco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LabelResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvar)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public FormCliente1(JLabel LabelResultado, JLabel Label_CEP, JTextField NomeDependente1, JTextField NomeDependente2, JLabel Parentesco1, JLabel Parentesco2, JTextField bairro, JTextField cep, JTextField cidade, JTextField cpf, JTextField estado, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JPanel jPanel1, JSeparator jSeparator1, JLabel label_Bairro, JLabel label_CPF, JLabel label_Cidade, JLabel label_Estado, JLabel label_Nome, JLabel label_Num, JLabel label_Titulo, JLabel label_rua, JTextField nome, JTextField numero, JComboBox<String> parestenco1, JComboBox<String> parestenco2, JTextField rua, JButton salvar) {
        this.LabelResultado = LabelResultado;
        this.Label_CEP = Label_CEP;
        this.NomeDependente1 = NomeDependente1;
        this.NomeDependente2 = NomeDependente2;
        this.abelParentesco1 = Parentesco1;
        this.labelParentesco2 = Parentesco2;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.cpf = cpf;
        this.estado = estado;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jPanel1 = jPanel1;
        this.jSeparator1 = jSeparator1;
        this.label_Bairro = label_Bairro;
        this.label_CPF = label_CPF;
        this.label_Cidade = label_Cidade;
        this.label_Estado = label_Estado;
        this.label_Nome = label_Nome;
        this.label_Num = label_Num;
        this.label_Titulo = label_Titulo;
        this.label_rua = label_rua;
        this.nome = nome;
        this.numero = numero;
        this.Parentesco1 = parestenco1;
        this.Parentesco2 = parestenco2;
        this.rua = rua;
        this.salvar = salvar;
    }

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        // TODO add your handling code here:
        ControleCliente controle = new ControleCliente();
        StringBuilder dadosCliente = new StringBuilder();
        dadosCliente.append(this.nome.getText()).append("\n");
        dadosCliente.append(this.cpf.getText()).append("\n");
        dadosCliente.append(this.estado.getText()).append("\n");
        dadosCliente.append(this.cidade.getText()).append("\n");
        dadosCliente.append(this.bairro.getText()).append("\n");
        dadosCliente.append(this.numero.getText()).append('\n');
        dadosCliente.append(this.rua.getText()).append("\n");
        dadosCliente.append(Integer.parseInt(this.cep.getText())).append("\n");
        dadosCliente.append(this.NomeDependente1.getText()).append("\n");
        dadosCliente.append(this.Parentesco1.getSelectedItem().toString()).append("\n");
        dadosCliente.append(this.NomeDependente2.getText()).append("\n");
        dadosCliente.append(this.Parentesco2.getSelectedItem().toString()).append("\n");
       
//        Cliente cliente = new Cliente();
//        cliente.setNome(this.nome.getText());
//        cliente.setCpf(Integer.parseInt(this.cpf.getText()));
//        cliente.getEndereco().getEstado().setNomeEstado(this.estado.getText());
//        cliente.getEndereco().getCidade().setNomeCidade(this.cidade.toString()); 
//        cliente.getEndereco().setBairro(this.bairro.getText());
//        cliente.getEndereco().setNumero(Integer.parseInt(this.numero.getText()));
//        cliente.getEndereco().setLogradouro(this.rua.getText());
//        cliente.getEndereco().setCEP(Integer.parseInt(this.cep.getText()));
//        cliente.getDependente1().getParentesco().setGrauParentesco(this.Parentesco1.getSelectedItem().toString());
//        cliente.getDependente2().setNome(this.Parentesco2.getSelectedItem().toString());
//        cliente.getDependente2().getParentesco().setGrauParentesco(this.Parentesco2.getSelectedItem().toString());
        this.setLabelResultado("Salvo com Sucesso! :)");
        controle.SalvarDadosCliente(dadosCliente);
    }//GEN-LAST:event_salvarActionPerformed

    private void Parentesco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parentesco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Parentesco1ActionPerformed

    private void Parentesco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Parentesco2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Parentesco2ActionPerformed

    private void cepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCliente1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCliente1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelResultado;
    private javax.swing.JLabel Label_CEP;
    private javax.swing.JTextField NomeDependente1;
    private javax.swing.JTextField NomeDependente2;
    private javax.swing.JComboBox<String> Parentesco1;
    private javax.swing.JComboBox<String> Parentesco2;
    private javax.swing.JLabel abelParentesco1;
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField estado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelParentesco2;
    private javax.swing.JLabel label_Bairro;
    private javax.swing.JLabel label_CPF;
    private javax.swing.JLabel label_Cidade;
    private javax.swing.JLabel label_Estado;
    private javax.swing.JLabel label_Nome;
    private javax.swing.JLabel label_Num;
    private javax.swing.JLabel label_Titulo;
    private javax.swing.JLabel label_rua;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField rua;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JLabel getLabel_CEP() {
        return Label_CEP;
    }

    public void setLabel_CEP(javax.swing.JLabel Label_CEP) {
        this.Label_CEP = Label_CEP;
    }

    public String getNomeDependente1() {
        return NomeDependente1.getText();
    }

    public void setNomeDependente1(javax.swing.JTextField NomeDependente1) {
        this.NomeDependente1 = NomeDependente1;
    }

    public String getNomeDependente2() {
        return NomeDependente2.getText();
    }

    public void setNomeDependente2(javax.swing.JTextField NomeDependente2) {
        this.NomeDependente2 = NomeDependente2;
    }
    public javax.swing.JLabel getLabelParentesco1() {
        return abelParentesco1;
    }

    public void setLabelParentesco1(javax.swing.JLabel Parentesco1) {
        this.abelParentesco1 = Parentesco1;
    }

    public javax.swing.JLabel getLabelParentesco2() {
        return labelParentesco2;
    }

    public void setLabelParentesco2(javax.swing.JLabel Parentesco2) {
        this.labelParentesco2 = Parentesco2;
    }

    public javax.swing.JTextField getBairro() {
        return bairro;
    }

    public void setBairro(javax.swing.JTextField bairro) {
        this.bairro = bairro;
    }

    public int getCep() {
        return Integer.parseInt(cep.getText());
    }

    public void setCep(javax.swing.JTextField cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade.getText();
    }

    public void setCidade(javax.swing.JTextField cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf.getText();
    }

    public void setCpf(javax.swing.JTextField cpf) {
        this.cpf = cpf;
    }

    public String getEstado() {
        return estado.getText();
    }

    public void setEstado(javax.swing.JTextField estado) {
        this.estado = estado;
    }

    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(javax.swing.JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public javax.swing.JLabel getLabel_Bairro() {
        return label_Bairro;
    }

    public void setLabel_Bairro(javax.swing.JLabel label_Bairro) {
        this.label_Bairro = label_Bairro;
    }

    public javax.swing.JLabel getLabel_CPF() {
        return label_CPF;
    }

    public void setLabel_CPF(javax.swing.JLabel label_CPF) {
        this.label_CPF = label_CPF;
    }

    public javax.swing.JLabel getLabel_Cidade() {
        return label_Cidade;
    }

    public void setLabel_Cidade(javax.swing.JLabel label_Cidade) {
        this.label_Cidade = label_Cidade;
    }

    public javax.swing.JLabel getLabel_Estado() {
        return label_Estado;
    }

    public void setLabel_Estado(javax.swing.JLabel label_Estado) {
        this.label_Estado = label_Estado;
    }

    public javax.swing.JLabel getLabel_Nome() {
        return label_Nome;
    }

    public void setLabel_Nome(javax.swing.JLabel label_Nome) {
        this.label_Nome = label_Nome;
    }

    public javax.swing.JLabel getLabel_Num() {
        return label_Num;
    }

    public void setLabel_Num(javax.swing.JLabel label_Num) {
        this.label_Num = label_Num;
    }

    public javax.swing.JLabel getLabel_Titulo() {
        return label_Titulo;
    }

    public void setLabel_Titulo(javax.swing.JLabel label_Titulo) {
        this.label_Titulo = label_Titulo;
    }

    public javax.swing.JLabel getLabel_rua() {
        return label_rua;
    }

    public void setLabel_rua(javax.swing.JLabel label_rua) {
        this.label_rua = label_rua;
    }

    public String getNome() {
        return nome.getText();    
    }

    public void setNome(javax.swing.JTextField nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return Integer.parseInt(numero.getText());
    }

    public void setNumero(javax.swing.JTextField numero) {
        this.numero = numero;
    }

    public String getParentesco1() {
        return Parentesco1.getSelectedItem().toString();
    }

    public void setParentesco1(javax.swing.JComboBox<String> parestenco1) {
        this.Parentesco1 = parestenco1;
    }

    public String getParentesco2() {
        return Parentesco2.getSelectedItem().toString();
    }

    public void setParentesco2(javax.swing.JComboBox<String> parestenco2) {
        this.Parentesco2 = parestenco2;
    }

    public String getRua() {
        return rua.getText();
    }

    public void setRua(javax.swing.JTextField rua) {
        this.rua = rua;
    }

    public javax.swing.JButton getSalvar() {
        return salvar;
    }

    public void setSalvar(javax.swing.JButton salvar) {
        this.salvar = salvar;
    }

    public String getLabelResultado() {
        return LabelResultado.getText();
    }

    public void setLabelResultado(String LabelResultado) {
        this.LabelResultado.setText(LabelResultado);
    }
}
