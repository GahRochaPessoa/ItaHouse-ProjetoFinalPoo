/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ctrlVendedor {
    private ArrayList<Vendedor> listaVendedor = new ArrayList();

    

    public ctrlVendedor() throws Exception{   
        desserializa();
        
    }
    public void adicionaVendedor(String nome, String cpf, String email, String fone, String contatoPref){
        listaVendedor.add(new Vendedor(nome, cpf, email, fone, contatoPref));
    }

    public ArrayList<Vendedor> getListaVendedor() {
        return listaVendedor;
    }
    
    public void serializa() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("Vendedor.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaVendedor);
        objOS.flush();
        objOS.close();
    }

    public void desserializa() throws Exception {
        File objFile = new File("Vendedor.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("Vendedor.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaVendedor = (ArrayList<Vendedor>) objIS.readObject();
            objIS.close();
        }
    }
    
}    
