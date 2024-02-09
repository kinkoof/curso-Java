
public class string_mothods {
    public static void main(String[] args) {
        String nome = "  Lucas de Souza Ferrari ";

        // boolean resultado = nome.equals("Lucas"); //case sensitive
        // boolean resultado = nome.equalsIgnoreCase("Lucas");
        // int resultado =nome.length(); //quantidade de caracteres da string
        // char resultado = nome.charAt(0); //volta a letra na posicao desejada
        // int resultado = nome.indexOf("s"); //retorna a posicao da letra desejada
        // boolean resultado = nome.isEmpty();
        // String resultado = nome.toUpperCase(); // deixa tudo em maiusculo
        // String resultado = nome.toLowerCase(); // deixa tudo em minusculo
        // String resultado = nome.trim(); // retira os espaços atras e na frente do texto
        String resultado = nome.replace("a", "e");


        System.out.println(resultado);
    }
}
