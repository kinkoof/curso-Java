package contructors;

public class teste {
    public static void main(String[] args) {

        Humano humano1 = new Humano("Lucas", 20, 185);
        Humano humano2 = new Humano("Evelin", 20, 160);

        System.out.println(humano1.nome);
        System.out.println(humano2.altura);

        humano1.beber();
        humano2.comer();

    }


}
