package scope_variables;

import java.util.Random;

public class Jogo_dados {

    // Jogo_dados() {
    //     Random random = new Random();

    //     int numero = 0;
    //     rolar(random, numero);
    // }

    // void rolar(Random random, int numero){
    //     numero = random.nextInt(6)+1;
    //     System.out.println(numero);
    // }

//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
    Random random;
    int numero;

    Jogo_dados() {
        random = new Random();
        rolar();
    }

    void rolar(){
        numero = random.nextInt(6)+1;
        System.out.println(numero);
    }




}
