package passing_objects;

public class teste {
    public static void main(String[] args) {

        Garagem garagem = new Garagem();

        Carro carro = new Carro("Mustang", 2000.99);
        Carro carro1 = new Carro("BMW", 3000.54);

        garagem.estacionar(carro1);
    }
}
