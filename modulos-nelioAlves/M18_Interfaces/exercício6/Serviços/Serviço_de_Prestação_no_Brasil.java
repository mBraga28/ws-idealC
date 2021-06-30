package exercício6.Serviços;

public class Serviço_de_Prestação_no_Brasil implements Serviço_de_Prestação {

    private double taxa_de_juros;

    public Serviço_de_Prestação_no_Brasil(double taxa_de_juros) {
        this.taxa_de_juros = taxa_de_juros;
    }

    @Override
    public double getTaxa_de_juros() {
        return taxa_de_juros;
    }

/*
    public double pagamento(double montante, int meses){
        if (meses < 1) {
            throw new InvalidParameterException("A quantidade de meses tem que se maior que zero");
        }
        return montante * Math.pow(1.0 + taxa_de_juros / 100.00,meses);
    }
*/
}
