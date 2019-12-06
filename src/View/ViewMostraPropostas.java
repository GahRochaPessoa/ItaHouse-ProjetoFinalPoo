package View;

import Controller.ctrlImovel;
import Controller.ctrlPrincipal;
import Model.Imovel;
import Model.Proposta;
import Model.Util;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ViewMostraPropostas extends javax.swing.JFrame {

    private ctrlImovel objCtr;
    private ctrlPrincipal objCtrPrincipal;

    public ViewMostraPropostas(ctrlImovel objCtr, ctrlPrincipal objCtrPrincipal) {
        this.objCtr = objCtr;
        this.objCtrPrincipal = objCtrPrincipal;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoImoveisPendentes = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Imovéis com proposta pendentes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        resultadoImoveisPendentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(resultadoImoveisPendentes);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Imóveis com Propostas Pendentes");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Propostas Pendentes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        resultadoImoveisPendentes.removeAll();
        DefaultListModel listModel = new DefaultListModel();
        ArrayList<Imovel> array = new ArrayList();

        for (Imovel i : objCtr.getListaImovel()) {
            if (i.getEstado().equalsIgnoreCase(Util.ATIVO) && !i.getListaPropostas().isEmpty()) {
                for (Proposta p : i.getListaPropostas()) {
                    if (p.getEstado().equalsIgnoreCase(Util.SUBMEDITA)) {
                        listModel.addElement("Código: " + i.getCodigo() + "    Descrição: " + i.getDescricao());
                        array.add(i);
                        break;
                    }
                }

            }
        }

        resultadoImoveisPendentes.setModel(listModel);
        resultadoImoveisPendentes.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    if (resultadoImoveisPendentes.getSelectedIndex() != -1) {
                        int index = 0;
                        index = resultadoImoveisPendentes.getSelectedIndex();
                        objCtr.julgaProposta(array.get(index), objCtrPrincipal.getObjCtrVenda());
                    }

                }
            }
        });
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList resultadoImoveisPendentes;
    // End of variables declaration//GEN-END:variables
}
