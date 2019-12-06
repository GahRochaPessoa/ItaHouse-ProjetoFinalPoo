/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.*;
import Model.*;
import javax.swing.JFrame;

public class ViewMostraPessoas extends javax.swing.JFrame {
    
    private ctrlVendedor objctrlVendedor;
    private ctrlCorretor objctrlCorretor;
    private ctrlComprador objctrlComprador;
    
    public ViewMostraPessoas(ctrlVendedor ctrlVendedor, ctrlCorretor ctrlCorretor, ctrlComprador ctrlComprador) {
        this.objctrlVendedor = ctrlVendedor;
        this.objctrlCorretor = ctrlCorretor;
        this.objctrlComprador = ctrlComprador;
        initComponents();
        
        String saida="";
        for(Vendedor v : ctrlVendedor.getListaVendedor()){
            if(v instanceof Vendedor){
                saida+= "Nome: " + v.getNome() + "\nTipo: Vendedor\nCPF: " + v.getCpf() + "\nEmail: "+ v.getEmail() +"   Fone: "+ v.getFone();
            }
        }
            
        for(Corretor cor : ctrlCorretor.getListaCorretor()){
            if(cor instanceof Corretor){
                saida+= "\n\nNome: " + cor.getNome() + "\nTipo: Corretor\nCPF: " + cor.getCpf() + "\nEmail: "+ cor.getEmail() +"   Fone: "+ cor.getFone();
            }
        }
        
        for(Comprador comp : ctrlComprador.getListaComprador()){
            if(comp instanceof Comprador){
                saida+= "\n\nNome: " + comp.getNome() + "\nTipo: Comprador\nCPF: " + comp.getCpf() + "\nEmail: "+ comp.getEmail() +"   Fone: "+ comp.getFone();
            }
            
            saida+="\n\n";
        }
        
        mostrarVisitas.setText(saida);
        this.setTitle("Pessoas cadastradas");
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mostrarVisitas = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        mostrarVisitas.setColumns(20);
        mostrarVisitas.setRows(5);
        jScrollPane1.setViewportView(mostrarVisitas);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Pessoas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea mostrarVisitas;
    // End of variables declaration//GEN-END:variables
}
