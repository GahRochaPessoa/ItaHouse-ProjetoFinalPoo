package View;

import Controller.ctrlImovel;
import Controller.ctrlPessoa;
import Model.Comprador;
import Model.Corretor;
import Model.Imovel;
import Model.Pessoa;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ViewCadastraVisita extends javax.swing.JFrame {

    private ctrlImovel objCtr;
    private ctrlPessoa objCtrPessoa;
    private Imovel i;

    public ViewCadastraVisita(ctrlImovel objCtr, ctrlPessoa objCtrPessoa, Imovel i) {
        this.objCtr = objCtr;
        this.objCtrPessoa = objCtrPessoa;
        this.i = i;
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        horaTF = new java.awt.TextField();
        btn1 = new javax.swing.JButton();
        label5 = new java.awt.Label();
        label1 = new java.awt.Label();
        nomeCompradorTF = new java.awt.TextField();
        label2 = new java.awt.Label();
        nomeCorretorTF = new java.awt.TextField();
        label3 = new java.awt.Label();
        diaTF = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nova Visita");

        btn1.setText("Agendar");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        label5.setText("Hora");

        label1.setText("Nome Comprador");

        label2.setText("Nome Corretor");

        label3.setText("Data");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeCorretorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(horaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeCompradorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeCompradorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeCorretorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String nomeComprador, nomeCorretor, dia, hora;

        nomeComprador = nomeCompradorTF.getText();
        nomeCorretor = nomeCorretorTF.getText();
        dia = diaTF.getText();
        hora = horaTF.getText();
        Comprador comp = null;
        Corretor cor = null;

        if (nomeComprador.isEmpty() || nomeCorretor.isEmpty() || dia.isEmpty() || hora.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos!");
        } else {
            boolean achouComprador = false, achouCorretor = false;
            for (Pessoa p : objCtrPessoa.getListaPessoas()) {
                if (p.getNome().equalsIgnoreCase(nomeComprador) && p instanceof Comprador) {
                    achouComprador = true;
                    comp = (Comprador) p;
                }
                if (p.getNome().equalsIgnoreCase(nomeCorretor) && p instanceof Corretor) {
                    achouCorretor = true;
                    cor = (Corretor) p;
                }
            }
            if (achouComprador == false) {
                JOptionPane.showMessageDialog(this, "Comprador não cadastrado");
            }
            if (achouCorretor == false) {
                JOptionPane.showMessageDialog(this, "Corretor não cadastrado");
            }
            if (achouComprador == true && achouCorretor == true) {

                int diaInt, mesInt, anoInt, horaInt, minInt;

                diaInt = Integer.parseInt(dia.substring(0, 2));
                mesInt = Integer.parseInt(dia.substring(3, 5)) - 1;
                anoInt = Integer.parseInt(dia.substring(6));
                horaInt = Integer.parseInt(hora.substring(0, 2));
                minInt = Integer.parseInt(hora.substring(3));

                Calendar c = Calendar.getInstance();
                c.set(anoInt, mesInt, diaInt, horaInt, minInt, 0);

                objCtr.addVisita(i, c, comp, cor);

                JOptionPane.showMessageDialog(this, "Visita agendada com sucesso!");
                super.dispose();
            }
        }


    }//GEN-LAST:event_btn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private java.awt.TextField diaTF;
    private java.awt.TextField horaTF;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.TextField nomeCompradorTF;
    private java.awt.TextField nomeCorretorTF;
    // End of variables declaration//GEN-END:variables
}
