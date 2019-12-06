package View;

import Controller.ctrlImovel;
import Model.Imovel;
import Model.Proposta;
import Model.Util;
import Model.Visita;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ViewMostraEventos extends javax.swing.JFrame {

    private ctrlImovel objCtr;

    public ViewMostraEventos(ctrlImovel objCtr) {
        this.objCtr = objCtr;
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
        codigoTF = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eventos no Imóvel");

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

        jLabel3.setText("Cód. Imóvel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dataIniTF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dataFimTF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codigoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dataIniTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dataFimTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        String dataIni, dataFim, codigo;
        Calendar ini = Calendar.getInstance(), fim = Calendar.getInstance();
        int diaIni, mesIni, anoIni;
        int diaFim, mesFim, anoFim;
        int codigoInt;
        String saida = "Visitas:";

        dataIni = dataIniTF.getText();
        dataFim = dataFimTF.getText();
        codigo = codigoTF.getText();

        if (dataIni.isEmpty() || dataFim.isEmpty() || codigo.isEmpty()) {
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

            codigoInt = Integer.parseInt(codigo);
            for (Imovel i : objCtr.getListaImovel()) {
                if (i.getCodigo() == codigoInt) {
                    for (Visita v : i.getListaVisitas()) {
                        if (v.getEstado().equalsIgnoreCase(Util.REALIZADA)) {
                            if (v.getData().compareTo(ini) > 0 && v.getData().compareTo(fim) < 0) {
                                saida += "\n\n" + v.getData().get(Calendar.DAY_OF_MONTH) + "/" + (v.getData().get(Calendar.MONTH) + 1) + "      Corretor: " + v.getCorretor().getNome() + "      Comprador: " + v.getComprador().getNome();
                            }
                        }
                    }
                    saida += "\n\nPropostas:";
                    for (Proposta p : i.getListaPropostas()) {
                        if (p.getData().compareTo(ini) > 0 && p.getData().compareTo(fim) < 0) {
                            saida += "\n\nComprador: " + p.getComprador().getNome() + "     Corretor: " + p.getCorretor().getNome() + "      Valor: R$ " + p.getValor() + "      Estado: " + p.getEstado();
                        }
                    }
                    break;
                }

            }
            TextArea.setText(saida);
        }

    }//GEN-LAST:event_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton btn;
    private javax.swing.JTextField codigoTF;
    private javax.swing.JTextField dataFimTF;
    private javax.swing.JTextField dataIniTF;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
