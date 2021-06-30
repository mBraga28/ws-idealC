package exercício4.dispositivos;

public abstract class Dispositivos {

    public String número_do_serial;

    public Dispositivos(String número_do_serial) {
        this.número_do_serial = número_do_serial;
    }

    public String getNúmero_do_serial() {
        return número_do_serial;
    }

    public void setNúmero_do_serial(String número_do_serial) {
        this.número_do_serial = número_do_serial;
    }

    public abstract void processoDoc(String doc);
}
