package View;

import Controller.ctrlVenda;
import Model.Imovel;
import Model.Proposta;
import Model.ImovelProposta;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ViewMostraVendas extends javax.swing.JFrame {

    private ctrlVenda objCtrVenda;

    public ViewMostraVendas(ctrlVenda objCtrVenda) {
        this.objCtrVenda = objCtrVenda;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        dataIniTF = new javax.swing.JTextField();
        dataFimTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botaoPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vendas por Período");

        jLabel1.setText("Data Inicial");

        jLabel2.setText("Data Final");

        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Mostra Vendas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataIniTF, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(dataFimTF, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dataIniTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(dataFimTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        String dataIni, dataFim;
        Calendar ini = Calendar.getInstance(), fim = Calendar.getInstance();
        int diaIni, mesIni, anoIni;
        int diaFim, mesFim, anoFim;
        String saida = "Vendas:";
        double valorImobiliaria = 0, valorCorretores = 0;

        dataIni = dataIniTF.getText();
        dataFim = dataFimTF.getText();

        if (dataIni.isEmpty() || dataFim.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você deve Preencher todos os campos");
        } else {

            diaIni = Integer.parseInt(dataIni.substring(0, 2));
            mesIni = Integer.parseInt(dataIni.substring(3, 5)) - 1;
            anoIni = Integer.parseInt(dataIni.substring(6));

            diaFim = Integer.parseInt(dataFim.substring(0, 2));
            mesFim = Integer.parseInt(dataFim.substring(3, 5)) - 1;
            anoFim = Integer.parseInt(dataFim.substring(6));

            ini.set(anoIni, mesIni, diaIni, 0, 0);
            fim.set(anoFim, mesFim, diaFim, 23, 59);

            for (ImovelProposta im : objCtrVenda.getListaVendas()) {
                if (im.getDataFim().compareTo(ini) > 0 && im.getDataFim().compareTo(fim) < 0) {
                    Imovel i = im.getImovel();
                    Proposta p = im.getProposta();

                    saida += "\n\nImóvel " + i.getCodigo() + " - " + i.getDescricao() + " Vendido por R$ " + p.getValor() + "\nComissão da Imobiliária: R$ " + (p.getValor() * i.getComissao());

                }

            }

            TextArea.setText(saida);
        }

    }//GEN-LAST:event_botaoPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JTextField dataFimTF;
    private javax.swing.JTextField dataIniTF;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
