package exercicios;

public class methods {
    public static void main(String[] args) {
        // methods = um bloco de codigo que é executado sempre que for chamado

        // String nome = "lucas";
        // int idade = 20;

        // hello(nome, idade);

        int x = 3;
        int y = 4;

        int z = soma(x, y);
        soma(30, -80);

        System.out.println(z);
        System.out.println(soma(x, y));


    }

    // static void hello(String nomes, int dados) {
    // System.out.println("hello word!");
    // System.out.println("ola " + nomes);
    // System.out.println("voce tem " + dados + " anos");

    static int soma(int a, int b) {
        // int z = a + b;
        // System.out.println(z);
        // return z;
        return a + b;

    }

    // }
}
