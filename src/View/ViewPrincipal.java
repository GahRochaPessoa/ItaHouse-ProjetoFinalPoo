package View;

import Controller.ctrlPrincipal;
import javax.swing.JOptionPane;

public class ViewPrincipal extends javax.swing.JFrame {

    private ctrlPrincipal ctrlPrincipal;

    public ViewPrincipal(ctrlPrincipal pCtr) {
        ctrlPrincipal = pCtr;
        initComponents();
        this.setTitle("Ita House");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator8 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        Pessoas = new javax.swing.JMenu();
        Vendedores = new javax.swing.JMenu();
        CadVend = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        corretores = new javax.swing.JMenu();
        CadCorretor = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        compradores = new javax.swing.JMenu();
        CadComprador = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        MostrarPessoas = new javax.swing.JMenuItem();
        Imoveis = new javax.swing.JMenu();
        CadImovel = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        visualizarImoveis = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        visualizarPropostas = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        VisitasAgendadas = new javax.swing.JMenuItem();
        Gerencia = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        CorretorFat = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        visitasCorrretor = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        EventosImovel = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        RelatorioVendas = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Pessoas.setText("Pessoas");

        Vendedores.setText("Vendedores");

        CadVend.setText("Cadastrar");
        CadVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadVendActionPerformed(evt);
            }
        });
        Vendedores.add(CadVend);

        Pessoas.add(Vendedores);
        Pessoas.add(jSeparator1);

        corretores.setText("Corretores");

        CadCorretor.setText("Cadastrar");
        CadCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadCorretorActionPerformed(evt);
            }
        });
        corretores.add(CadCorretor);

        Pessoas.add(corretores);
        Pessoas.add(jSeparator2);

        compradores.setText("Compradores");

        CadComprador.setText("Cadastrar");
        CadComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadCompradorActionPerformed(evt);
            }
        });
        compradores.add(CadComprador);

        Pessoas.add(compradores);
        Pessoas.add(jSeparator4);

        MostrarPessoas.setText("Mostrar Pessoas");
        MostrarPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPessoasActionPerformed(evt);
            }
        });
        Pessoas.add(MostrarPessoas);

        jMenuBar1.add(Pessoas);

        Imoveis.setText("Imóveis");

        CadImovel.setText("Cadastrar Imóvel");
        CadImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadImovelActionPerformed(evt);
            }
        });
        Imoveis.add(CadImovel);
        Imoveis.add(jSeparator3);

        visualizarImoveis.setText("Catálogo");
        visualizarImoveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarImoveisActionPerformed(evt);
            }
        });
        Imoveis.add(visualizarImoveis);
        Imoveis.add(jSeparator5);

        visualizarPropostas.setText("Visualizar Propostas");
        visualizarPropostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarPropostasActionPerformed(evt);
            }
        });
        Imoveis.add(visualizarPropostas);
        Imoveis.add(jSeparator9);

        VisitasAgendadas.setText("Visitas Agendadas");
        VisitasAgendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitasAgendadasActionPerformed(evt);
            }
        });
        Imoveis.add(VisitasAgendadas);

        jMenuBar1.add(Imoveis);

        Gerencia.setText("Gerência");

        jMenuItem1.setText("Total Faturado");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Gerencia.add(jMenuItem1);
        Gerencia.add(jSeparator6);

        CorretorFat.setText("Faturamento de Corretor");
        CorretorFat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorretorFatActionPerformed(evt);
            }
        });
        Gerencia.add(CorretorFat);
        Gerencia.add(jSeparator7);

        visitasCorrretor.setText("Visitas de Corretor");
        visitasCorrretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitasCorrretorActionPerformed(evt);
            }
        });
        Gerencia.add(visitasCorrretor);
        Gerencia.add(jSeparator10);

        EventosImovel.setText("Eventos no Imóvel");
        EventosImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosImovelActionPerformed(evt);
            }
        });
        Gerencia.add(EventosImovel);
        Gerencia.add(jSeparator11);

        RelatorioVendas.setText("Relatório de Vendas");
        RelatorioVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioVendasActionPerformed(evt);
            }
        });
        Gerencia.add(RelatorioVendas);
        Gerencia.add(jSeparator12);

        jMenuItem2.setText("Imóveis de um Vendedor");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Gerencia.add(jMenuItem2);

        jMenuBar1.add(Gerencia);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadVendActionPerformed
        ctrlPrincipal.cadVendedor();
    }//GEN-LAST:event_CadVendActionPerformed

    private void CadImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadImovelActionPerformed
        ctrlPrincipal.cadImovel();
    }//GEN-LAST:event_CadImovelActionPerformed

    private void MostrarPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPessoasActionPerformed
        ctrlPrincipal.showPessoas();
    }//GEN-LAST:event_MostrarPessoasActionPerformed

    private void CadCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadCorretorActionPerformed
        ctrlPrincipal.cadCorretor();
    }//GEN-LAST:event_CadCorretorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            ctrlPrincipal.salvar();
            System.exit(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar!");
        }
    }//GEN-LAST:event_formWindowClosing

    private void visualizarImoveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarImoveisActionPerformed
        ctrlPrincipal.showImoveis();
    }//GEN-LAST:event_visualizarImoveisActionPerformed

    private void CadCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadCompradorActionPerformed
        ctrlPrincipal.cadComprador();
    }//GEN-LAST:event_CadCompradorActionPerformed

    private void visualizarPropostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarPropostasActionPerformed
       ctrlPrincipal.showPropostas();
    }//GEN-LAST:event_visualizarPropostasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ctrlPrincipal.showFaturamento();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void CorretorFatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorretorFatActionPerformed
        ctrlPrincipal.showFatCorretor();
    }//GEN-LAST:event_CorretorFatActionPerformed

    private void visitasCorrretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitasCorrretorActionPerformed
        ctrlPrincipal.showVisitasCorretor();
    }//GEN-LAST:event_visitasCorrretorActionPerformed

    private void VisitasAgendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitasAgendadasActionPerformed
        ctrlPrincipal.showTodasVisitas();
    }//GEN-LAST:event_VisitasAgendadasActionPerformed

    private void EventosImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventosImovelActionPerformed
        ctrlPrincipal.showEventos();
    }//GEN-LAST:event_EventosImovelActionPerformed

    private void RelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioVendasActionPerformed
        ctrlPrincipal.showVendas();
    }//GEN-LAST:event_RelatorioVendasActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        ctrlPrincipal.showImoveisVendedor();
    }//GEN-LAST:event_jMenuItem2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadComprador;
    private javax.swing.JMenuItem CadCorretor;
    private javax.swing.JMenuItem CadImovel;
    private javax.swing.JMenuItem CadVend;
    private javax.swing.JMenuItem CorretorFat;
    private javax.swing.JMenuItem EventosImovel;
    private javax.swing.JMenu Gerencia;
    private javax.swing.JMenu Imoveis;
    private javax.swing.JMenuItem MostrarPessoas;
    private javax.swing.JMenu Pessoas;
    private javax.swing.JMenuItem RelatorioVendas;
    private javax.swing.JMenu Vendedores;
    private javax.swing.JMenuItem VisitasAgendadas;
    private javax.swing.JMenu compradores;
    private javax.swing.JMenu corretores;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem visitasCorrretor;
    private javax.swing.JMenuItem visualizarImoveis;
    private javax.swing.JMenuItem visualizarPropostas;
    // End of variables declaration//GEN-END:variables
}
