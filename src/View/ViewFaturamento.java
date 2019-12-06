package View;

import Controller.ctrlVenda;
import Model.Imovel;
import Model.Proposta;
import Model.ImovelProposta;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ViewFaturamento extends javax.swing.JFrame {

    private ctrlVenda objCtrVenda;

    public ViewFaturamento(ctrlVenda objCtrVenda) {
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
        btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faturamento Total");

        jLabel1.setText("Data Início");

        jLabel2.setText("Data Fim");

        btn.setText("Buscar");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Faturamento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataIniTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataFimTF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dataIniTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataFimTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        String dataIni, dataFim;
        Calendar ini = Calendar.getInstance(), fim = Calendar.getInstance();
        int diaIni, mesIni, anoIni;
        int diaFim, mesFim, anoFim;
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

            for (ImovelProposta im  : objCtrVenda.getListaVendas()) {
                if (im.getDataFim().compareTo(ini) > 0 && im.getDataFim().compareTo(fim) < 0) {
                    Imovel i;
                    Proposta p;
                    double valorTotal = 0;
                    i = im.getImovel();
                    p = im.getProposta();

                    valorTotal = p.getValor() * i.getComissao();
                    valorCorretores += valorTotal * p.getCorretor().getPercCorretagem();
                    valorImobiliaria += valorTotal - (valorTotal * p.getCorretor().getPercCorretagem());

                }

            }
            
            String saida = "Valor faturado pela imobiliária no período: R$ " + valorImobiliaria + "\nValor Repassado para os corretores: R$ " + valorCorretores; ;
            TextArea.setText(saida);
        }

    }//GEN-LAST:event_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton btn;
    private javax.swing.JTextField dataFimTF;
    private javax.swing.JTextField dataIniTF;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
