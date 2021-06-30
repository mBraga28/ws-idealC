package exercício2.Serviços;

import exercício2.Serviços.Serviço_de_pagamento_online;

public class Serviço_de_paypal  implements Serviço_de_pagamento_online {

    private static final double TAXA_PORCENTAGEM = 0.02;
    private static final double JUROS_MENSAIS = 0.01;

    @Override
    public Double taxa_de_pagamento(Double montante) {
        return montante * TAXA_PORCENTAGEM;
    }

    @Override
    public Double juros(Double montante, Integer meses) {
        return montante * JUROS_MENSAIS * meses;
    }
}
