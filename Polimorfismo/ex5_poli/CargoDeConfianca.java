package ex5_poli;

public abstract class CargoDeConfianca extends Funcionario{

    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String dataDenascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataDenascimento, salarioBase);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
}
