

public class wrapper_class {
    public static void main(String[] args) {
        // permite que utilizemos tipos de dados primitivos como referencias
        // são mais lentos de se acessarem

        /*
         * PRIMITIVE | WRAPPER
         * ---------- ---------
         * boolean | Boolean
         * char | Character
         * int | Integer
         * double | Double
         */

        // autoboxing = conversao automatica do java convertendo primitivo em wrapper
        // unboxing = o contrario do autoboxing, converte wrapper em primitivo

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "lucas";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }
}
