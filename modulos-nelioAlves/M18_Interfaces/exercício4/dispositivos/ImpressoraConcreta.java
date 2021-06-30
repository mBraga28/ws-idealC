package exercício4.dispositivos;

public class ImpressoraConcreta extends Dispositivos implements Impressora{

    public ImpressoraConcreta(String número_do_serial) {
        super(número_do_serial);
    }

    @Override
    public void processoDoc(String doc) {
        System.out.println("Processando impressora: " + doc);
    }

    @Override
    public void imprimir(String doc) {
        System.out.println("Imprimindo: " + doc);
    }
}
