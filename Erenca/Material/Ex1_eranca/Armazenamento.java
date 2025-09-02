package erença.ex6;

public class Armazenamento {
    private String tipo;
    private String capacidade;

    public Armazenamento(String tipo, String capacidade) {
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Armazenamento{" +
                "tipo='" + tipo + '\'' +
                ", capacidade='" + capacidade + '\'' +
                '}';
    }

}
