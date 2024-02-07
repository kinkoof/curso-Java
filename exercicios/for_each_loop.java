package exercicios;

import java.util.ArrayList;

public class for_each_loop {
    public static void main(String[] args) {

        //String[] animais = { "gato", "cachorro", "passarinho", "rato" };
        ArrayList<String> animais = new ArrayList<String>();

        animais.add("gato");
        animais.add("cachorro");
        animais.add("passarinho");
        animais.add("rato");

        for (String animal : animais) {
            System.out.println(animal);

        }
    }
}
