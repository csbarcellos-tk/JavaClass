package ex4_poli;

public class Diretor extends Funcionario implements Contratacao {

    public void admitir(Funcionario funcionario) {
    }

    public void demitir(Funcionario funcionario) {
    }

    private double premio;

    public Diretor(String nome, String dataNascimento, Sexo sexo, Setor setor, double salario, double premio) {
        super(nome, dataNascimento, sexo, setor, salario);
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "premio=" + premio +
                ", nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", sexo=" + sexo +
                ", setor=" + setor +
                ", salario=" + salario +
                '}';
    }
}
