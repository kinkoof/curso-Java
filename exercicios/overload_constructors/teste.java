package overload_constructors;

public class teste {
    public static void main(String[] args) {
        // multiplos contrutores com o mesmo nome de classe, mas com parametros
        // diferentes
        Pizza pizza = new Pizza("grossa", "tomate");

        System.out.println("aqui estao os ingredientes da sua pizza: ");
        System.out.println(pizza.massa);
        System.out.println(pizza.molho);

        if (pizza.queijo == null) {
            System.out.println("sem queijo");
        }else{
            System.out.println(pizza.queijo);
        }
        if (pizza.sabor == null) {
            System.out.println("sem sabor");
        }else{
            System.out.println(pizza.sabor);
        }

    }
}