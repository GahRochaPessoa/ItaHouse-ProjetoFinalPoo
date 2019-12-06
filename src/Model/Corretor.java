
package Model;

public class Corretor extends Pessoa{
    private String creci;
    private double percCorretagem;    
    
    public Corretor(String nome, String cpf, String email, String fone,
                    String creci, double percCorretagem) {
        super(cpf, nome, email, fone);
        this.creci = creci;
        this.percCorretagem = percCorretagem;
    }

    public String getCreci() {
        return creci;
    }

    public double getPercCorretagem() {
        return percCorretagem;
    }    
    
}
