public class App {
    public static void main(String[] args){
        // Polimorfismo = um objeto pode se identificar de mais de um tipo

        Carro carro = new Carro();
        Barco barco = new Barco();
        Moto moto = new Moto();

        Veiculo[] Corredores ={carro, barco, moto};

        for (Veiculo veiculos : Corredores) {
            veiculos.ir();
        }

    }
}
