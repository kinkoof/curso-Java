package interfaces;

public class Teste {

    public static void main(String[] args) {
    // Interface = um template que pode ser aplicado a uma classe.
    //             similar a heranca, porem especificando oque uma classe deve fazer
    //             classes podem ter mais de uma interface, heranca pode ter apenas 1 super

    Coelho coelho = new Coelho();
    Falcao falcao = new Falcao();
    Peixe peixe = new Peixe();

    peixe.cacar();
    peixe.correr();

    coelho.correr();
    falcao.cacar();

    }




}
