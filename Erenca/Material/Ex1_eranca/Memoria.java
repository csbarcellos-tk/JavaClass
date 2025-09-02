package erença.ex6;

public class Memoria extends Processo {
    private String capacidade;
    public Memoria(String marca, String modelo, String frequencia, String capacidade) {
        super(marca, modelo, frequencia);
        this.capacidade = capacidade;
    }
    public String getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capacidade='" + capacidade + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
