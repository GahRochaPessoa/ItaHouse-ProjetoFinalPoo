package View;

import Controller.ctrlPrincipal;
import javax.swing.JOptionPane;

public class ViewPrincipal extends javax.swing.JFrame {

    private ctrlPrincipal objCtr;

    public ViewPrincipal(ctrlPrincipal pCtr) {
        objCtr = pCtr;
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
        Vendedor = new javax.swing.JMenu();
        CadVend = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        corretor = new javax.swing.JMenu();
        CadCorretor = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        comprador = new javax.swing.JMenu();
        CadComprador = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        PessoasCadastradas = new javax.swing.JMenuItem();
        Imovel = new javax.swing.JMenu();
        ImovelCadastrar = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        ExibirCatalogo = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        exibirPropostas = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        VisitasAgendadas = new javax.swing.JMenuItem();
        Relatorio = new javax.swing.JMenu();
        faturamento = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        faturamentoCorretor = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        visitasCorrretor = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        EventosPorImovel = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        RelatorioDeVendas = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        ImovelPorVendedor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Pessoas.setText("Pessoas");

        Vendedor.setText("Vendedor");

        CadVend.setText("Cadastrar");
        CadVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadVendActionPerformed(evt);
            }
        });
        Vendedor.add(CadVend);

        Pessoas.add(Vendedor);
        Pessoas.add(jSeparator1);

        corretor.setText("Corretor");

        CadCorretor.setText("Cadastrar");
        CadCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadCorretorActionPerformed(evt);
            }
        });
        corretor.add(CadCorretor);

        Pessoas.add(corretor);
        Pessoas.add(jSeparator2);

        comprador.setText("Comprador");

        CadComprador.setText("Cadastrar");
        CadComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadCompradorActionPerformed(evt);
            }
        });
        comprador.add(CadComprador);

        Pessoas.add(comprador);
        Pessoas.add(jSeparator4);

        PessoasCadastradas.setText("Pessoas Cadastradas");
        PessoasCadastradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PessoasCadastradasActionPerformed(evt);
            }
        });
        Pessoas.add(PessoasCadastradas);

        jMenuBar1.add(Pessoas);

        Imovel.setText("Imóvel");

        ImovelCadastrar.setText("Cadastrar ");
        ImovelCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImovelCadastrarActionPerformed(evt);
            }
        });
        Imovel.add(ImovelCadastrar);
        Imovel.add(jSeparator3);

        ExibirCatalogo.setText("Exibir Catálogo");
        ExibirCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExibirCatalogoActionPerformed(evt);
            }
        });
        Imovel.add(ExibirCatalogo);
        Imovel.add(jSeparator5);

        exibirPropostas.setText("Propostas");
        exibirPropostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exibirPropostasActionPerformed(evt);
            }
        });
        Imovel.add(exibirPropostas);
        Imovel.add(jSeparator9);

        VisitasAgendadas.setText("Visitas Agendadas");
        VisitasAgendadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitasAgendadasActionPerformed(evt);
            }
        });
        Imovel.add(VisitasAgendadas);

        jMenuBar1.add(Imovel);

        Relatorio.setText("Relatório");

        faturamento.setText("Faturamento");
        faturamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faturamentoActionPerformed(evt);
            }
        });
        Relatorio.add(faturamento);
        Relatorio.add(jSeparator6);

        faturamentoCorretor.setText("Faturamento Corretor");
        faturamentoCorretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faturamentoCorretorActionPerformed(evt);
            }
        });
        Relatorio.add(faturamentoCorretor);
        Relatorio.add(jSeparator7);

        visitasCorrretor.setText("Visitas por Corretor");
        visitasCorrretor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitasCorrretorActionPerformed(evt);
            }
        });
        Relatorio.add(visitasCorrretor);
        Relatorio.add(jSeparator10);

        EventosPorImovel.setText("Eventos por Imóvel");
        EventosPorImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosPorImovelActionPerformed(evt);
            }
        });
        Relatorio.add(EventosPorImovel);
        Relatorio.add(jSeparator11);

        RelatorioDeVendas.setText("Relatório de Vendas");
        RelatorioDeVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelatorioDeVendasActionPerformed(evt);
            }
        });
        Relatorio.add(RelatorioDeVendas);
        Relatorio.add(jSeparator12);

        ImovelPorVendedor.setText("Imóveis por Vendedor");
        ImovelPorVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImovelPorVendedorActionPerformed(evt);
            }
        });
        Relatorio.add(ImovelPorVendedor);

        jMenuBar1.add(Relatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadVendActionPerformed
        objCtr.cadVendedor();
    }//GEN-LAST:event_CadVendActionPerformed

    private void ImovelCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImovelCadastrarActionPerformed
        objCtr.cadImovel();
    }//GEN-LAST:event_ImovelCadastrarActionPerformed

    private void PessoasCadastradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PessoasCadastradasActionPerformed
        objCtr.showPessoas();
    }//GEN-LAST:event_PessoasCadastradasActionPerformed

    private void CadCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadCorretorActionPerformed
        objCtr.cadCorretor();
    }//GEN-LAST:event_CadCorretorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        objCtr.saida();
    }//GEN-LAST:event_formWindowClosing

    private void ExibirCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExibirCatalogoActionPerformed
        objCtr.showImoveis();
    }//GEN-LAST:event_ExibirCatalogoActionPerformed

    private void CadCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadCompradorActionPerformed
        objCtr.cadComprador();
    }//GEN-LAST:event_CadCompradorActionPerformed

    private void exibirPropostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exibirPropostasActionPerformed
       objCtr.showPropostas();
    }//GEN-LAST:event_exibirPropostasActionPerformed

    private void faturamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faturamentoActionPerformed
        objCtr.showFaturamento();
    }//GEN-LAST:event_faturamentoActionPerformed

    private void faturamentoCorretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faturamentoCorretorActionPerformed
        objCtr.showFatCorretor();
    }//GEN-LAST:event_faturamentoCorretorActionPerformed

    private void visitasCorrretorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitasCorrretorActionPerformed
        objCtr.showVisitasCorretor();
    }//GEN-LAST:event_visitasCorrretorActionPerformed

    private void VisitasAgendadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitasAgendadasActionPerformed
        objCtr.showTodasVisitas();
    }//GEN-LAST:event_VisitasAgendadasActionPerformed

    private void EventosPorImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventosPorImovelActionPerformed
        objCtr.showEventos();
    }//GEN-LAST:event_EventosPorImovelActionPerformed

    private void RelatorioDeVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelatorioDeVendasActionPerformed
        objCtr.showVendas();
    }//GEN-LAST:event_RelatorioDeVendasActionPerformed

    private void ImovelPorVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImovelPorVendedorActionPerformed
        objCtr.showImoveisVendedor();
    }//GEN-LAST:event_ImovelPorVendedorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadComprador;
    private javax.swing.JMenuItem CadCorretor;
    private javax.swing.JMenuItem CadVend;
    private javax.swing.JMenuItem EventosPorImovel;
    private javax.swing.JMenuItem ExibirCatalogo;
    private javax.swing.JMenu Imovel;
    private javax.swing.JMenuItem ImovelCadastrar;
    private javax.swing.JMenuItem ImovelPorVendedor;
    private javax.swing.JMenu Pessoas;
    private javax.swing.JMenuItem PessoasCadastradas;
    private javax.swing.JMenu Relatorio;
    private javax.swing.JMenuItem RelatorioDeVendas;
    private javax.swing.JMenu Vendedor;
    private javax.swing.JMenuItem VisitasAgendadas;
    private javax.swing.JMenu comprador;
    private javax.swing.JMenu corretor;
    private javax.swing.JMenuItem exibirPropostas;
    private javax.swing.JMenuItem faturamento;
    private javax.swing.JMenuItem faturamentoCorretor;
    private javax.swing.JMenuBar jMenuBar1;
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
    // End of variables declaration//GEN-END:variables
}
