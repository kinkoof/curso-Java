package super_keyword;

public class Heroi extends Pessoa {
    boolean capa;

    Heroi(String nome, int idade, boolean capa) {

        super(nome, idade);
        this.capa = capa;
    }

    @Override
    public String toString() {

        return super.toString() + " " + this.capa;
    }

}
