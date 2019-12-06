package Controller;

import View.ViewCadastraVendedor;
import View.ViewMostraPropostas;
import View.ViewMostraImoveisVendedor;
import View.ViewMostraVendas;
import View.ViewCadastraVisita;
import View.ViewFaturamentoCorretor;
import View.ViewCadastraImovel;
import View.ViewMostraPessoas;
import View.ViewMostraImoveis;
import View.ViewCadastraCorretor;
import View.ViewMostraEventos;
import View.ViewFaturamento;
import View.ViewMostraVisitas;
import View.ViewCadastraProposta;
import View.ViewMostraTodasVisitas;
import View.ViewCadastraComprador;
import View.ViewPrincipal;
import Model.Imovel;

public class ctrlPrincipal {

    private ctrlPessoa objControlePessoa;
    private ctrlImovel objCtrImovel;
    private ctrlComprador objCtrComprador;
    private ctrlCorretor objCtrCorretor;
    private ctrlVendedor objCtrVendedor;
    private ViewPrincipal objLimPrincipal;
    private ctrlVenda objCtrVenda;

    public ctrlPrincipal() {
        objLimPrincipal = new ViewPrincipal(this);

        try {
            objCtrComprador = new ctrlComprador();
            objCtrCorretor = new ctrlCorretor();
            objCtrVendedor = new ctrlVendedor();
            objCtrImovel = new ctrlImovel();
            objCtrVenda = new ctrlVenda();
        } catch (Exception e) {
            System.out.println("erro na abertura de arquivo");
        }

    }

    public void salvar() throws Exception {
        objCtrComprador.serializa();
        objCtrCorretor.serializa();
        objCtrVendedor.serializa();
        objCtrImovel.serializa();
        objCtrVenda.serializa();
    }

    public void cadVendedor() {
        new ViewCadastraVendedor(objCtrVendedor);
    }

    public void cadComprador() {
        new ViewCadastraComprador(objCtrComprador);
    }

    public void cadImovel() {
        new ViewCadastraImovel(objCtrImovel, objCtrVendedor.getListaVendedor());
    }

    public void showPessoas() {
        new ViewMostraPessoas(objCtrVendedor, objCtrCorretor, objCtrComprador);
    }

    public void cadCorretor() {
        new ViewCadastraCorretor(objCtrCorretor);
    }

    public void showImoveis() {
        new ViewMostraImoveis(objCtrImovel, this);
    }

    public void agendaVisita(Imovel i) {
        new ViewCadastraVisita(objCtrImovel, objControlePessoa, i);
    }

    public void cadastraProposta(Imovel i) {
        new ViewCadastraProposta(objCtrImovel, objControlePessoa, i);
    }

    public void showPropostas() {
        new ViewMostraPropostas(objCtrImovel, this);
    }

    public void showFaturamento() {
        new ViewFaturamento(objCtrVenda);
    }

    public void showFatCorretor() {
        new ViewFaturamentoCorretor(objCtrVenda);
    }

    public void showVisitasCorretor() {
        new ViewMostraVisitas(objCtrImovel);
    }

    public void showTodasVisitas() {
        new ViewMostraTodasVisitas(objCtrImovel);
    }

    public void showEventos() {
        new ViewMostraEventos(objCtrImovel);
    }

    public void showVendas() {
        new ViewMostraVendas(objCtrVenda);
    }

    public void showImoveisVendedor(){
        new ViewMostraImoveisVendedor(objCtrImovel);
    }

    public ctrlImovel getObjCtrImovel() {
        return objCtrImovel;
    }

    public ctrlPessoa getObjCtrPessoa() {
        return objControlePessoa;
    }

    public ViewPrincipal getObjLimPrincipal() {
        return objLimPrincipal;
    }

    public ctrlVenda getObjCtrVenda() {
        return objCtrVenda;
    }
    

    
    public static void main(String[] args){
        new ctrlPrincipal();
    }

}
