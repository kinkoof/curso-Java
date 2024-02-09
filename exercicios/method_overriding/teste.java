package method_overriding;

public class teste {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro();
        Animal animal = new Animal();

        cao.som();
        animal.som();
    }
}
