
import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("qual a sua idade?");
        int idade = scanner.nextInt();

        if( idade > 50 ){
            System.out.println("pé na cova");
        }
        else if (idade > 17) {
            System.out.println("vai trabalhar vagabundo");
        }
        else{
            System.out.println("Sai daqui kid");
        }

        scanner.close();

    }
}
