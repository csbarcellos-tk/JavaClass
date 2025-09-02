package erença.ex6;

import erença.material.Produto;

public class Processo extends Produto {
    private String frequencia;

    public Processo(String marca, String modelo, String frequencia) {
        super(marca, modelo);
        this.frequencia = frequencia;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    @Override
    public String toString() {
        return "Processo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", frequencia='" + frequencia + '\'' +
                '}';
    }

}
