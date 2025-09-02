package ex8;

public class Main {
    public static void main(String[] args) {
        Engenheiro engenheiro = new Engenheiro("João Silva", "caua@gmail.com", 5000.0f,
                new Endereco("Rua A", "123", "Apto 1", "12345-678", "Cidade X"), "CREA12345");

        Medico medico = new Medico("Maria Souza", "eloisa@gmail", 7000.0f,
                new Endereco("Avenida B", "456", "Sala 2", "98765-432", "Cidade Y"), "CRM67890");

        System.out.println(engenheiro);
        System.out.println(medico);


    }
}
