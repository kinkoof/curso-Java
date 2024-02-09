package encapsulacao;

public class teste {
    public static void main(String[] args) {
        // encapsulacao =os atributos de uma classese serao escondidos ou privados. E so
        // podem ser acessados atravez de methods(getters &)

        Carro carro = new Carro("chevrolet", "camaro", 2020);

        carro.setAno(2024);
        

        System.out.println(carro);


    }
}
