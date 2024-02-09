package super_keyword;

public class Pessoa {

    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {

        return this.nome + " " + this.idade; // preferivel usar o this para expecificar que é uma variavel dessa classe
    }
}