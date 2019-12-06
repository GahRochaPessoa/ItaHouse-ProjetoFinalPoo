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

public class ctrlPessoa {
    private ArrayList<Pessoa> listaPessoas = new ArrayList();
    private final String arquivo = "Pessoas.dat";
    

    public ctrlPessoa() throws Exception{   
        desserializa();
    }
   

    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }
    
    public void serializa() throws Exception {
        FileOutputStream objFileOS = new FileOutputStream(arquivo);
        ObjectOutputStream objOS = new ObjectOutputStream(objFileOS);
        objOS.writeObject(listaPessoas);
        objOS.flush();
        objOS.close();
    }

    public void desserializa() throws Exception {
        File objFile = new File(arquivo);
        if (objFile.exists()) {
            FileInputStream objFileIS = new FileInputStream(arquivo);
            ObjectInputStream objIS = new ObjectInputStream(objFileIS);
            listaPessoas = (ArrayList<Pessoa>) objIS.readObject();
            objIS.close();
        }
    }
    
    
}
