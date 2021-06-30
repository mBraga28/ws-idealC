package exercício2.Serviços;

public interface Serviço_de_pagamento_online {

    public Double taxa_de_pagamento(Double montante);

    public Double juros(Double montante, Integer meses);
}
