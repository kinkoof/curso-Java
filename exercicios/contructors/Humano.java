package exercicios.contructors;

public class Humano {

    String nome;
    int idade;
    double altura;

    Humano(String construtor_nome, int construtor_idade, double contrutor_altura){

        this.nome = construtor_nome;
        this.idade = construtor_idade;
        this.altura = contrutor_altura;
    }

    void comer(){
        System.out.println(this.nome + " esta comendo\n" );

    }

    void beber(){
        System.out.printf("%s esta bebendo\n", this.nome);
    }

}
