package exercício2.Serviços;

import exercício2.Entidades.Contrato;
import exercício2.Entidades.Prestação;
import exercício2.Serviços.Serviço_de_pagamento_online;

import java.util.Calendar;
import java.util.Date;

public class Serviço_de_contrato {

    private Serviço_de_pagamento_online serviço_de_pagamento_online;

    public Serviço_de_contrato(Serviço_de_pagamento_online serviço_de_pagamento_online) {
        this.serviço_de_pagamento_online = serviço_de_pagamento_online;
    }

    public void processo_de_contrato(Contrato contrato, int meses) {
            double cotaBásica = contrato.getValorTotal() / meses;

           for (int i = 1; i <=meses; i++) {
               Date data_de_vencimento = adicionarMeses(contrato.getData(), i);
               double cotaAtualizada = cotaBásica + serviço_de_pagamento_online.juros(cotaBásica,i);
               double cotaCheia = cotaAtualizada + serviço_de_pagamento_online.taxa_de_pagamento(cotaAtualizada);
               contrato.getPrestações().add(new Prestação(data_de_vencimento, cotaCheia));
           }
    }

    private Date adicionarMeses(Date data, int n) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        cal.add(Calendar.MONTH, n);
        return cal.getTime();
    }
}
