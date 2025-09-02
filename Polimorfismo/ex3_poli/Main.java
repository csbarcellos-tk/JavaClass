package Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Cachorro Cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println(Cachorro.emitirSom());
        System.out.println(gato.emitirSom());
    }
}
