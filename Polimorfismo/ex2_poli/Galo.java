package ex2_poli;

public class Galo implements Animal {

    @Override
    public String emitirSom() {
        return "Cocoricó";
    }

    @Override
    public String comer() {
        return "Ração de galo";
    }
}