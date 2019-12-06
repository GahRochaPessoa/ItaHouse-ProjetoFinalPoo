package Model;

public class Vendedor extends Pessoa {

    private String contatoPref;

    public Vendedor(String nome, String cpf, String email, String fone, 
                    String contatoPref) {
        super(cpf, nome, email, fone);
        this.contatoPref = contatoPref;
    }

    public String getContatoPref() {
        return contatoPref;
    }

}
