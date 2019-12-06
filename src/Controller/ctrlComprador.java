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

/**
 *
 * @author rocha
 */
public class ctrlComprador {
 private ArrayList<Comprador> listaComprador = new ArrayList();
    private final String arquivo = "Comprador.dat";
    

    public ctrlComprador() throws Exception{   
        desserializa();
        
    }
    public void adicionaComprador(String nome, String cpf, String email, String fone, String contatoPref){
        listaComprador.add(new Comprador(nome, cpf, email, fone, contatoPref));
    }

    public ArrayList<Comprador> getListaComprador() {
        return listaComprador;
    }
    
    public void serializa() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("Comprador.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaComprador);
        objOS.flush();
        objOS.close();
    }

    public void desserializa() throws Exception {
        File objFile = new File("Comprador.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("Comprador.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaComprador = (ArrayList<Comprador>) objIS.readObject();
            objIS.close();
        }
    }
    
}    
