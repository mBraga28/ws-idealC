package exercícioFixação1.entidades;

import java.util.Date;
import java.util.Objects;

public class Entrada_de_Registro { // Log entry

    private String usuário;
    private Date momento;

    public Entrada_de_Registro(String usuário, Date momento) {
        this.usuário = usuário;
        this.momento = momento;
    }

    public String getUsuário() {
        return usuário;
    }

    public void setUsuário(String usuário) {
        this.usuário = usuário;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! (o instanceof Entrada_de_Registro)) return false;
        Entrada_de_Registro that = (Entrada_de_Registro) o;
        return getUsuário().equals(that.getUsuário());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsuário());
    }
}
