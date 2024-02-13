package exercicios;

public class Xarrays {
    public static void main(String[] args) {
        // arrays sao usados para armazenas varios valores em uma unica variavel

        String[] carros = { "camaro", "corvete", "tesla" };

        carros[0] = "mustang";

        System.out.println(carros[0]);

        // ------------------------------------------------------------------------

        String[] motos = new String[4];

        motos[0] = "Yamaha";
        motos[1] = "Harley";
        motos[2] = "Ducati";

        for (int i = 0; i < motos.length; i++) {
            System.out.println(motos[i]);

        }
    }
}
