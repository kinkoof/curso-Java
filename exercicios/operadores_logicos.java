package exercicios;
import java.util.Random;
import java.util.Scanner;

public class operadores_logicos {
    public static void main(String[] args) {
        /*
         * && = (AND) as duas condiçoes devem ser verdadeiras
         * || = (OR) uma das duas condicoes devem ser verdadeiras
         * ! = (NOT)
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Voce esta jogando um jogo de dados");
        System.out.println("deseja saber as regras? (S/N)");

        String resp = scanner.next();

        if (resp.equals("s") || resp.equals("S")) {
            System.out.println("\nRegras: \nVoce jogara dois dados, se tirar dois numeros iguais, voce ganha, caso contrario, voce perde");
        }

        System.out.println("\naperte (Q) para sair ou (S) para começar");

        String playgame = scanner.next();

        if (playgame.equals("s") || playgame.equals("S")) {

            boolean game = true;

            while (game != false) {

                int dado1 =  random.nextInt(6)+1;
                int dado2 = random.nextInt(6)+1;

                System.out.println("Os numeros dos dados foram: " + dado1 + " e " + dado2);

                if (dado1 == dado2) {
                    System.out.println("parabens voce ganhou!");
                    System.out.println("\naperte (Q) para sair ou (S) para jogar novamente");
                    String playgameagain = scanner.next();

                    if (playgameagain.equals("q") || playgameagain.equals("Q")) {

                        game=false;
                    }

                }
                else{
                    System.out.println("voce perdeu");
                    System.out.println("\naperte (Q) para sair ou (S) para jogar novamente");
                    String playgameagain = scanner.next();

                    if (playgameagain.equals("q") || playgameagain.equals("Q")) {

                        game=false;
                    }

                }

            }




        }


        scanner.close();

    }
}
