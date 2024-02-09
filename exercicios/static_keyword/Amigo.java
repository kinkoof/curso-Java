package static_keyword;

public class Amigo {
    String nome;

    static int numeroAmigo;

    Amigo(String nome) {
        this.nome = nome;
        numeroAmigo++;
    }

    static void mostrarAmigo(){
        System.out.println(numeroAmigo);
    }
}
