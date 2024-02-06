public class classes_matematicas {
    public static void main(String[] args) {

        double x = 3.14;
        double y = 10;

        double max = Math.max(x, y); // retorna o maior valor
        double min = Math.min(x, y); // reorna o menor valor
        double abs = Math.abs(y); // valor absoluto
        double sqrt = Math.sqrt(y); // raiz quadrada
        double round = Math.round(x); // arredonda o valor
        double ceil = Math.ceil(x); // arredonda pra cima
        double floor = Math.floor(x); // arredonda pra baixo

        System.out.println("maior: " + max + ", menor: " + min);
        System.out.println("absoluto: " + abs);
        System.out.println("raiz quadrada: " + sqrt);
        System.out.println("valor arredondado: " + round);
        System.out.println("valor arredondado pra cima: " + ceil);
        System.out.println("valor arredondado pra baixo: " + floor);

    }

}
