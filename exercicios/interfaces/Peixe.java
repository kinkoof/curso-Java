package interfaces;

public class Peixe implements Presa, Predador{

    @Override
    public void cacar() {
        System.out.println("O peixe esta cacando");
    }

    @Override
    public void correr() {
        System.out.println("O peixe esta fugindo");
    }

}
