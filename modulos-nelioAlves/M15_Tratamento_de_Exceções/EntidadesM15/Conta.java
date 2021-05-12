package EntidadesM15;

public class Conta {

    private Integer número;
    private String titular;
    private Double saldo;
    private Double saqueLimite;

    public Conta(){
    }

    public Conta(Integer número, String inquilino, Double saldo, Double saqueLimite) {
        this.número = número;
        this.titular = inquilino;
        this.saldo = saldo;
        this.saqueLimite = saqueLimite;
    }

    public Integer getNúmero() {
        return número;
    }

    public void setNúmero(Integer número) {
        this.número = número;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaqueLimite() {
        return saqueLimite;
    }

    public void setSaqueLimite(Double saqueLimite) {
        this.saqueLimite = saqueLimite;
    }

    public void deposito(double montante) {
        saldo += montante;
    }

    public void saque(double montante) {
        saqueValidação(montante);
        saldo -= montante;
    }

    public void saqueValidação(double montante) {
          if (montante > getSaqueLimite()) {
              System.out.println("Erro de saque: A quantia excede o limite de saque");
          }
          if (montante > getSaldo()) {
              System.out.println("Erro de saque: Saldo insuficiente");
          }
    }


}
