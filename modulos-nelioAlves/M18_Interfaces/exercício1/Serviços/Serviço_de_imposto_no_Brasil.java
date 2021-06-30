package exercício1.Serviços;

public class Serviço_de_imposto_no_Brasil implements Serviço_de_imposto {

    public double imposto(double montante) {
        if ( montante <= 100.0) {
            return montante * 0.2;
        }
        else {
            return montante * 0.15;
        }
    }

}
