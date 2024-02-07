package exercicios;

import java.util.ArrayList;

public class array_list2D {
    public static void main(String[] args) {

        ArrayList<String> comprasMercado = new ArrayList<String>();

        comprasMercado.add("macarrao");
        comprasMercado.add("pao de alho");
        comprasMercado.add("donuts");

        ArrayList<String> comprasQuitanda = new ArrayList<String>();

        comprasQuitanda.add("tomate");
        comprasQuitanda.add("cebola");
        comprasQuitanda.add("pimentao");

        ArrayList<String> comprasBebidas = new ArrayList<String>();

        comprasBebidas.add("coca-cola");
        comprasBebidas.add("fanta");
        comprasBebidas.add("pepsi");

        ArrayList<ArrayList<String>> compras = new ArrayList<ArrayList<String>>();

        compras.add(comprasBebidas);
        compras.add(comprasQuitanda);
        compras.add(comprasMercado);

        System.out.println(compras.get(0).get(2));
    }
}
