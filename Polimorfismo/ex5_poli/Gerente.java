package ex5_poli;

public class Gerente extends CargoDeConfianca implements Contratacao {

    public Gerente(String nome, String cpf, String dataDenascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataDenascimento, salarioBase, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDenascimento='" + dataDenascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.obtendoSalarioFinal() +
                '}';
    }

    @Override
    public double obtendoSalarioFinal() {
        return super.salarioBase * Bonificacao.GERENTE.getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("admitir: com sucesso \n" + funcionario.toString());

    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("demitir: com sucesso \n" + funcionario.toString());

    }
}
