package objects_OOP;

public class poo {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        Carro meuoutrocarro = new Carro();

        System.out.println(meuCarro.marca);

        System.out.println(meuoutrocarro.marca);

        meuCarro.dirigir();
        meuCarro.freiar();

    }
}
