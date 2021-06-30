package exercício2.Entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private Integer número;
    private Date data;
    private Double valorTotal;

    List<Prestação> prestações = new ArrayList<>();

    public Contrato() {
    }

    public Contrato (Integer número, Date data, Double valorTotal) {
        this.número = número;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Integer getNúmero () {
        return número;
    }

    public void setNúmero (Integer número) {
        this.número = número;
    }

    public Date getData () {
        return data;
    }

    public void setData (Date data) {
        this.data = data;
    }

    public Double getValorTotal () {
        return valorTotal;
    }

    public void setValorTotal (Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Prestação> getPrestações() {
        return prestações;
    }

    public void adicionarPrestações(Prestação prestação){
        prestações.add(prestação);
    }

    public void removerPrestações(Prestação prestação){
        prestações.remove(prestação);
    }
}
