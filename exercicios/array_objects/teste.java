package exercicios.array_objects;

public class teste {
    public static void main(String[] args) {

        // Comida[] geladeira = new Comida[3];

        Comida comida1 = new Comida("carne");
        Comida comida2 = new Comida("frango");
        Comida comida3 = new Comida("peixe");

        Comida[] geladeira = {comida1, comida2, comida3}; /* */

        // geladeira[0] = comida1;
        // geladeira[1] = comida2;
        // geladeira[2] = comida3;

        for (int i = 0; i < geladeira.length; i++) {
            System.out.println(geladeira[i].nome);
        }



    }
}
