package ex5_poli;

public class Motoboy extends Funcionario {
    private String PlacaDaMoto;

    public Motoboy(String nome, String cpf, String dataDenascimento, double salarioBase, String placaDaMoto) {
        super(nome, cpf, dataDenascimento, salarioBase);
        PlacaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return PlacaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        PlacaDaMoto = placaDaMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "PlacaDaMoto='" + PlacaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDenascimento='" + dataDenascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public double obtendoSalarioFinal() {
        return salarioBase;
    }
}