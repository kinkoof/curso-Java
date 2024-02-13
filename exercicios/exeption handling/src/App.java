import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Exception =um evento que ocorre durante a execucao do programa que altera o percurso normal das instruçoes previstas
        Scanner scanner = new Scanner(System.in);
        try{

            System.out.println("digite um numero");
            int x = scanner.nextInt();

            System.out.println("digite outro numero");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.printf("%d dividido por %d é igual a %d\n", x, y, z);


        }
        // catch(ArithmeticException e){
        //     System.out.println("nao é possivel dividir por 0");
        // }
        // catch(InputMismatchException e){
        //     System.out.println("o valor deve ser um numero inteiro");
        // }

        catch(Exception e){
            // para todos os exeptions
            System.out.println("faca corretamente");
        }

        finally{
            System.out.println("sempre vai imprimir");
            scanner.close();
        }
    }
}
