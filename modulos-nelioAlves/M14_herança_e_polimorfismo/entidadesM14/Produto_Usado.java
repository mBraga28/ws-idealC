package entidadesM14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto_Usado extends Produto {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataDeFabricação;

    public Produto_Usado(String nome, Double preço, Date dataDeFabricação) {
        super(nome, preço);
        this.dataDeFabricação = dataDeFabricação;
    }

    public Date getDataDeFabricação() {
        return dataDeFabricação;
    }

    public void setDataDeFabricação(Date dataDeFabricação) {
        dataDeFabricação = dataDeFabricação;
    }
    @Override
    public String etiquetaDePreço() {
        return getNome()
                + " (usado) $ "
                + String.format("%.2f", getPreço())
                + " (Data de fabricação: "
                + sdf.format(dataDeFabricação)
                + ")";
    }
}
