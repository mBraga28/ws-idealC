package exercício6.Serviços;

import java.security.InvalidParameterException;

public interface Serviço_de_Prestação {

    double getTaxa_de_juros();

    default double pagamento(double montante, int meses){
        if (meses < 1) {
            throw new InvalidParameterException("A quantidade de meses tem que se maior que zero");
        }
        return montante * Math.pow(1.0 + getTaxa_de_juros() / 100.00,meses);
    }
}
