

import java.util.Scanner;

public class printf {
    public static void main(String[] args) {
        // printf()= um metodo adicional de controlar, formatar, e mostrar o texto no
        // console
        // dois argumentos = formato string + (objeto, variavel, valor)
        // % [flags] [precision] [width] [conversion-character]

        Scanner scanner = new Scanner(System.in);

        String mystring = "lucas";
        double mydouble = 1000;
        // char mychar = '@';
        // boolean myboolean = true;

        // [conversion-character]
        // System.out.printf("exemplo: %d \n", 123); // %d = numeros decimais
        // System.out.printf("ola %s \n", mystring); // %s = string
        // System.out.printf("Ponto Flutuante: %f\n", mydouble); // %.2f = double
        // System.out.printf("Caractere: %c\n", mychar); // %c = char
        // System.out.printf("Booleano: %b\n", myboolean); // %b = boolean

        System.out.println("\n");
        // [width] numero minimo que sera mostrado
        System.out.printf("hello %3s", mystring);

        System.out.println("\n");
        // [precision] numero de casas decimais quando for double
        System.out.printf("voce tem %.2f reais", mydouble);

        System.out.println("\n");
        // [flags] adicona um efeito
        /*
         * - : left-justify
         * + : adiciona um (+) ou (-) no numero
         * 0 : zero padded
         * , : separador de numeros maiores que 1000
         */
        System.out.printf("voce tem %,+.2f reais", mydouble);

        scanner.close();

    }
}
