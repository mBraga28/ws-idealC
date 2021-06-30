package exercício4.dispositivos;

public class EscaneadoraConcreta extends Dispositivos implements Escaneadora {

    public EscaneadoraConcreta(String número_do_serial) {
        super(número_do_serial);
    }

    @Override
    public void processoDoc(String doc) {
        System.out.println("Processando escaneadora: " + doc);
    }

    @Override
    public String escanear() {
        return "Conteúdo escaneado";
    }
}
