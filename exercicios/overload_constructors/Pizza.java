package exercicios.overload_constructors;

public class Pizza {
    String massa;
    String molho;
    String queijo;
    String sabor;

    Pizza(String massaC, String molhoC, String queijoC, String saborC){
        this.massa = massaC;
        this.molho = molhoC;
        this.queijo = queijoC;
        this.sabor = saborC;
    }

    Pizza(String massaC, String molhoC, String queijoC){
        this.massa = massaC;
        this.molho = molhoC;
        this.queijo = queijoC;
    }

    Pizza(String massaC, String molhoC){
        this.massa = massaC;
        this.molho = molhoC;
    }
}
