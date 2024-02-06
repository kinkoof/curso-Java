package exercicios;
import javax.swing.JOptionPane;

public class GUI_intro {
    public static void main(String[] args) {

        /*
         * Grafical
         * User
         * Interface
         */

        String name = JOptionPane.showInputDialog("digite seu nome");
        JOptionPane.showMessageDialog(null, "Ola " + name);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("qual a sua idade'?")); // Integer.parseint = converter // string para int
        JOptionPane.showMessageDialog(null, "usa idade é " + idade);

        double altura = Double.parseDouble(JOptionPane.showInputDialog("qual a sua altura'?")); // Double.parseDouble = converter string para double
        JOptionPane.showMessageDialog(null, "usa altura é " + altura);

    }
}
