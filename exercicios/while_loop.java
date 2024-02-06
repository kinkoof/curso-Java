package exercicios;
import java.util.Scanner;

public class while_loop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "";

        while (nome.isBlank() || nome.length() <= 2) {

            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();
        }


        do{ // o Do sempre vai realizar pelo menos uma vez o conteudo entre {}
            System.out.print("Digite seu nome: ");
            nome = scanner.nextLine();

        }while (nome.isBlank() || nome.length() <= 2);




        System.out.println("seja bem vindo " + nome);

        scanner.close();
    }

}
