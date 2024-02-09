package copiar_objetos;

public class teste {
    public static void main(String[] args) {

        Carro carro = new Carro("chevrolet", "camaro", 2020);
        //Carro carro1 = new Carro("ford", "mustang", 2023);
        // carro.setAno(2024);
        // carro1.copy(carro);
        Carro carro1 = new Carro(carro);

        System.out.println(carro);
        System.out.println(carro1);
        System.out.println();
        System.out.println(carro.getAno());
        System.out.println(carro.getMarca());
        System.out.println(carro.getModelo());
        System.out.println();
        System.out.println(carro1.getAno());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());

    }
}
