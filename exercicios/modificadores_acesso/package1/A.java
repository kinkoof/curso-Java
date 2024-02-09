package modificadores_acesso.package1;

import modificadores_acesso.package2.*;

public class A {

    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
