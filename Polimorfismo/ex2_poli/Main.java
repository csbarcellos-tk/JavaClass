package ex2_poli;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal pato = new Pato();

        System.out.println("Cachorro:");
        System.out.println("Som: " + cachorro.emitirSom());
        System.out.println("Comida: " + cachorro.comer());

        System.out.println("\nGato:");
        System.out.println("Som: " + gato.emitirSom());
        System.out.println("Comida: " + gato.comer());

        System.out.println("\nPato:");
        System.out.println("Som: " + pato.emitirSom());
        System.out.println("Comida: " + pato.comer());
    }
}