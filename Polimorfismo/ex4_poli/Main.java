package ex4_poli;

public class Main {
    public static void main(String[] args) {

        Motoboy motoboy1 = new Motoboy("Carlos Silva", "15/03/1990", Sexo.MASCULINO, Setor.TI, 2500.00, "AB123456");
        Diretor diretor1 = new Diretor("Ana Souza", "22/07/1985", Sexo.FEMININO, Setor.FINANCEIRO, 8000.00, 1500.00);

        System.out.println(motoboy1);
        System.out.println(diretor1);
    }


}
