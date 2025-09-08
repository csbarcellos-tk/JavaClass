package ex5_poli;

public abstract class Funcionario  implements SalarioFinal{
    protected String nome;
    protected  String cpf;
    protected String dataDenascimento;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, String dataDenascimento, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDenascimento = dataDenascimento;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataDenascimento() {
        return dataDenascimento;
    }

    public void setDataDenascimento(String dataDenascimento) {
        this.dataDenascimento = dataDenascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDenascimento='" + dataDenascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
