

import java.util.Scanner;

public class nest_loop {
    public static void main(String[] args) {
        // ninho de loop = um loop dentro de um loop
        Scanner scanner = new Scanner(System.in);

        int linha;
        int coluna;
        String simbolo = "";

        System.out.println("digite o numero de linha: ");
        linha = scanner.nextInt();

        System.out.println("digite o numero de colunas: ");
        coluna = scanner.nextInt();

        System.out.println("Qual simbolo deseja usar?");
        simbolo = scanner.next();

        for (int i = 1; i <= linha; i++) {
            System.out.println();
            for (int j = 1; j <= coluna; j++) {
                System.out.print(simbolo);

            }
        }

        scanner.close();

    }
}
