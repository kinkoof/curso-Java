package heranca;

public class teste {
    public static void main(String[] args) {
        // processo onde uma classe adquire os atributos e methods de outra
        Carro carro = new Carro();
        Bicicleta bike = new Bicicleta();

        carro.ir();
        bike.parar();

        System.out.println(carro.velocidade +" "+ carro.motor);
        System.out.println(bike.velocidade +" "+ bike.pedal);
    }
}
