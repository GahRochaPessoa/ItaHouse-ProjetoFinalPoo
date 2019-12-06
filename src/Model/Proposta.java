
package Model;

import java.io.Serializable;
import java.util.*;

public class Proposta implements Serializable {
    private Calendar data;
    private Comprador comprador;
    private Corretor corretor;
    private double valor;
    private String estado;
    private int codImovel;

    public Proposta(Calendar data, Comprador comprador, Corretor corretor, double valor) {
        this.data = data;
        this.comprador = comprador;
        this.corretor = corretor;
        this.valor = valor;
        this.estado = Util.SUBMEDITA;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Calendar getData() {
        return data;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public double getValor() {
        return valor;
    }

    public String getEstado() {
        return estado;
    }
    
}
