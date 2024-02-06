package exercicios;
public class swapVariables {

    public static void main(String[] args) {

        String x = "Lucas";
        String y = "Evelin";
        String temp;

        System.out.println("X: " + x); //sysout = System.out.println
        System.out.println("Y: " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("X: " + x); //sysout = System.out.println
        System.out.println("Y: " + y);
    }
}