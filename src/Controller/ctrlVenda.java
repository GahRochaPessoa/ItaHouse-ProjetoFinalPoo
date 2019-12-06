package Controller;

import Model.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ctrlVenda {

    private ArrayList<ImovelProposta> listaVendas = new ArrayList();

    public ctrlVenda() throws Exception {
        desserializa();
    }

    public void addVenda(Imovel imovel, Proposta proposta) {
        listaVendas.add(new ImovelProposta(imovel, proposta));
    }

    public ArrayList<ImovelProposta> getListaVendas() {
        return listaVendas;
    }

    public void serializa() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("Vendas.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaVendas);
        objOS.flush();
        objOS.close();
    }

    public void desserializa() throws Exception {
        File objFile = new File("Vendas.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("Vendas.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaVendas = (ArrayList<ImovelProposta>) objIS.readObject();
            objIS.close();
        }
    }

}
