package modificadores_acesso.package2;

import modificadores_acesso.package1.*;

public class Asub extends A {
    public static void main(String[] args) {

        Asub asub = new Asub();

        System.err.println(asub.protectedMessage);

    }
}
