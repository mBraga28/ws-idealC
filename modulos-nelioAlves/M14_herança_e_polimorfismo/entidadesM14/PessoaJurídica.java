package entidadesM14;

public class PessoaJurídica extends Contribuintes {

    private Integer número_de_funcionários;

    public PessoaJurídica(String nome, Double rendaAnual, Integer número_de_funcionários) {
        super(nome, rendaAnual);
        this.número_de_funcionários = número_de_funcionários;
    }

    public Integer getNúmero_de_funcionários() {
        return número_de_funcionários;
    }

    public void setNúmero_de_funcionários(Integer número_de_funcionários) {
        this.número_de_funcionários = número_de_funcionários;
    }

    @Override
    public Double imposto() {
           if (getNúmero_de_funcionários() > 10) {
               return getRendaAnual() * 0.14;
           }
           else {
               return getRendaAnual() * 0.16;
           }
    }
}
