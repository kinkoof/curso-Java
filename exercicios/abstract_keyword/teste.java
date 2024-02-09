package abstract_keyword;

public class teste {
    public static void main(String[] args) {
        // classes abstratas nao podem ser instanciadas, mas podem ter uma subclasse
        // methods abstratos sao declarados sem uma implementacao

        Carro carro = new Carro();
        // Veiculo veiculo = new Veiculo();

        carro.ir();

    }

}
