package exercício4.dispositivos;

public class ComboDispositivo extends Dispositivos implements Escaneadora, Impressora {

    public ComboDispositivo(String número_do_serial) {
        super(número_do_serial);
    }

    @Override
    public void processoDoc(String doc) {
        System.out.println("Processando o combo: " + doc);
    }

    @Override
    public String escanear() {
        return "Resultado do combo escaneado ";
    }

    @Override
    public void imprimir(String doc) {
        System.out.println("Imprimindo o combo: " + doc);
    }
}
