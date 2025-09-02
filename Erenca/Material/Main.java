package erença.material;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Ana", 28,
                "2023-10-01", "Cartão de Crédito");

        clt clt1 = new clt("Carlos", 35,
                "12345", "Desenvolvedor", 7500.00);

        System.out.println(cliente1.toString());
        System.out.println(clt1.toString());
    }

}
