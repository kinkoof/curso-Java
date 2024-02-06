package exercicios;
import java.util.Scanner;

public class user_imput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt(); scanner.nextLine(); //para limpar o scanner para o nextLine

        System.err.println("Qual sua comida favorita? ");
        String comida = scanner.nextLine();

        System.out.println("Bem vindo " + nome);
        System.out.println("sua idade é: " + idade);
        System.out.println("sua comida preferida é " + comida);

        scanner.close();

    }
}
