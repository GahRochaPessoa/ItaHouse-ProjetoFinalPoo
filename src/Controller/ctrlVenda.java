package Controller;

import Model.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;

public class ctrlVenda {

    private ArrayList<ImovelProposta> listaVendas = new ArrayList();
    private final String arquivo = "Vendas.dat";

    public ctrlVenda() throws Exception {
        recuperaVendas();
    }

    public void addVenda(Imovel imovel, Proposta proposta) {
        listaVendas.add(new ImovelProposta(imovel, proposta));
    }

    public ArrayList<ImovelProposta> getListaVendas() {
        return listaVendas;
    }

    public void gravaVendas() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream(arquivo);
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaVendas);
        objOS.flush();
        objOS.close();
    }

    public void recuperaVendas() throws Exception {
        File objFile = new File(arquivo);
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream(arquivo);
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaVendas = (ArrayList<ImovelProposta>) objIS.readObject();
            objIS.close();
        }
    }

}
