// Polimorfismo/ex5_poli/Bonificacao.java
package ex5_poli;

public enum Bonificacao {
    GERENTE(1.2), // exemplo de valor
    DIRETOR(1.5);

    private final double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}