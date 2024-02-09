

public class overloaded_methods {
    public static void main(String[] args) {
        // overloaded methods = mesmo nome mas com parametros diferentes

        double x = soma(1.4, 3.0);
        // int y = soma(1, 3, 5);
        // int z = soma(1, 3, 5, 7);

        System.out.println(x);
        // System.out.println(y);
        // System.out.println(z);

    }

    static int soma(int a, int b) {
        System.out.println("overloaded 1");
        return a + b;
    }

    static int soma(int a, int b, int c) {
        System.out.println("overloaded 2");

        return a + b + c;
    }

    static int soma(int a, int b, int c, int d) {
        System.out.println("overloaded 3");

        return a + b + c + d;
    }

    static double soma(double a, int b) {
        System.out.println("overloaded 4");
        return a + b;
    }
    static double soma(double a, double b) {
        System.out.println("overloaded 7");
        return a + b;
    }

    static double soma(double a, int b, int c) {
        System.out.println("overloaded 5");

        return a + b + c;
    }

    static double soma(double a, int b, int c, int d) {
        System.out.println("overloaded 6");

        return a + b + c + d;
    }
}
