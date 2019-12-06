/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ctrlImovel;
import Model.Imovel;
import Model.Util;
import Model.Visita;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ViewMostraTodasVisitas extends javax.swing.JFrame {

    private Visita visita;
    private int index = 0;
    private DefaultListModel listModel = new DefaultListModel();
    private ctrlImovel objCtr;

    public ViewMostraTodasVisitas(ctrlImovel objCtr) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        cancelarVisita = new javax.swing.JButton();
        visitasConcluidas = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visitas Pendentes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setViewportView(lista);

        cancelarVisita.setText("Cancelar Visita");
        cancelarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVisitaActionPerformed(evt);
            }
        });

        visitasConcluidas.setText("Visitas Concluídas");
        visitasConcluidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitasConcluidasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Visitas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(visitasConcluidas))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(visitasConcluidas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(cancelarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lista.removeAll();

        ArrayList<Visita> array = new ArrayList();

        for (Imovel i : objCtr.getListaImovel()) {
            for (Visita v : i.getListaVisitas()) {
                if (v.getEstado().equalsIgnoreCase(Util.AGENDADA)) {
                    listModel.addElement("Imóvel: " + i.getCodigo() + "      Corretor: " + v.getCorretor().getNome() + "      Data: " + v.getData().get(Calendar.DAY_OF_MONTH) + "/" + (v.getData().get(Calendar.MONTH) + 1) + "  " + v.getData().get(Calendar.HOUR_OF_DAY) + ":" + v.getData().get(Calendar.MINUTE));
                    array.add(v);
                }
            }
        }

        lista.setModel(listModel);
        lista.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    if (lista.getSelectedIndex() != -1) {
                        index = lista.getSelectedIndex();
                        visita = array.get(index);
                    }

                }
            }
        });
    }//GEN-LAST:event_formWindowOpened

    private void visitasConcluidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitasConcluidasActionPerformed
        for (Imovel i : objCtr.getListaImovel()) {
            for (Visita v : i.getListaVisitas()) {
                if (v == visita) {
                    v.setEstado(Util.REALIZADA);
                    listModel.remove(index);
                    lista.setModel(listModel);
                    break;
                }
            }
        }

    }//GEN-LAST:event_visitasConcluidasActionPerformed

    private void cancelarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVisitaActionPerformed
       for (Imovel i : objCtr.getListaImovel()) {
            for (Visita v : i.getListaVisitas()) {
                if (v == visita) {
                    v.setEstado(Util.CANCELADA);
                    listModel.remove(index);
                    lista.setModel(listModel);
                    break;
                }
            }
        }
    }//GEN-LAST:event_cancelarVisitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarVisita;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lista;
    private javax.swing.JButton visitasConcluidas;
    // End of variables declaration//GEN-END:variables
}
