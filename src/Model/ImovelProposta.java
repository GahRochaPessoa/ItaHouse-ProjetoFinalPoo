
package Model;

import java.io.Serializable;
import java.util.Calendar;

public class ImovelProposta implements Serializable {
    private Imovel imovel;
    private Calendar dataFim;
    private Proposta proposta;

    public ImovelProposta(Imovel imovel, Proposta proposta){
        this.imovel = imovel;
        this.dataFim = dataFim;
        this.proposta = proposta;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Calendar getDataFim() {
        return dataFim;
    }

    public Proposta getProposta() {
        return proposta;
    }
    
    
    
}
