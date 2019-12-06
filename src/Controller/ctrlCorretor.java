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
public class ctrlCorretor {
    private ArrayList<Corretor> listaCorretor = new ArrayList();
    

    public ctrlCorretor() throws Exception{   
        desserializa();
        
    }
    public void adicionaCorretor(String nome, String cpf, String email, String fone, String creci, double percCorretagem){
        listaCorretor.add(new Corretor(nome, cpf, email, fone, creci, percCorretagem));
    }

    public ArrayList<Corretor> getListaCorretor() {
        return listaCorretor;
    }
    
    public void serializa() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream("Corretor.dat");
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaCorretor);
        objOS.flush();
        objOS.close();
    }

    public void desserializa() throws Exception {
        File objFile = new File("Corretor.dat");
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream("Corretor.dat");
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaCorretor = (ArrayList<Corretor>) objIS.readObject();
            objIS.close();
        }
    }
    
}    
