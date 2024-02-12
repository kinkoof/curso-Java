import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("Qual animal voce quer?"  );
        System.out.println("1 = cachorro / 2 = gato");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("voce escolheu o cachorro");

            animal = new Cachorro();
            animal.som();
        }
        else if(escolha == 2){

            System.out.println("voce escolheu o gato");
            animal = new Gato();
            animal.som();
        }
        else{
            System.out.println("voce nao escolheu uma opção valida e ficou com uma quimera criada pelo homem e abandonada por deus");
            animal = new Animal();
            animal.som();
        }

        scanner.close();


    }
}
