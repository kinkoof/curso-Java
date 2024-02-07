package exercicios;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        // arrayList = arrays mutaveis
        // os elementos podem ser adicionados e removidos apos serem compilados
        // pode armazenar reference data types

        ArrayList<String> comida = new ArrayList<String>();

        comida.add("pizza");
        comida.add("hamburger");
        comida.add("hot-dog");

        comida.set(0, "sushi");
        comida.remove(0);
        comida.clear();

        for (int i = 0; i < comida.size(); i++) {
            System.out.println(comida.get(i));

        }

    }
}
