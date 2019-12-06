package Controller;

import Model.*;
import View.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

public class ctrlImovel {

    private ArrayList<Imovel> listaImovel = new ArrayList();
    private ArrayList<Proposta> listaProposta = new ArrayList();

    public ctrlImovel() throws Exception {
        desserializa();
    }

    public void addImovel(int codigo, String tipo, String descricao, String foto, double preco, double comissao, Calendar dataInclusao, Vendedor vendedor) {
        listaImovel.add(new Imovel(codigo, tipo, descricao, foto, preco, comissao, dataInclusao, vendedor));
    }

    public void addVisita(Imovel i, Calendar data, Comprador comprador, Corretor corretor) {
        Visita v = new Visita(data, comprador, corretor);
        for (Imovel p : listaImovel) {
            if (p == i) {
                p.agendaVisita(v);
            }
        }
    }

    public void addProposta(Imovel i, Calendar data, Comprador comprador, Corretor corretor, double valor) {
        Proposta p = new Proposta(data, comprador, corretor, valor);
        for(Imovel a: listaImovel){
            if(i == a){
                a.registraProposta(p);
            }
        }
    }
    
    /*public ArrayList <Imovel> imovelProposta (int codImovel) {
        Imovel im = listaImovel;
        for (int i = 0; i<listaImovel.size(); i++) {
            if (codImovel == im.getCodigo())
            im = listaImovel.get(i);
            for (Proposta p : listaProposta){
               
                }
            }
        }
        return (new ArrayList<Imovel>());   
    }*/

    public void serializa() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("Imoveis.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaImovel);
        objOS.flush();
        objOS.close();
    }

    public void desserializa() throws Exception {
        File objFile = new File("Imoveis.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("Imoveis.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaImovel = (ArrayList<Imovel>) objIS.readObject();
            objIS.close();
        }
    }

    public void mostraImovel(Imovel i, ctrlPrincipal p) {
        new ViewMostraImovel(i, p);
    }
    
    public void julgaProposta(Imovel i, ctrlVenda v){
        new ViewJulgaProposta(i, v);
    }

    public ArrayList<Imovel> getListaImovel() {
        return listaImovel;
    }

}
