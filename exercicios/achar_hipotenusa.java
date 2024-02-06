import javax.swing.JOptionPane;

public class achar_hipotenusa {
    public static void main(String[] args) {


        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y: "));

       double hipotenusa = Math.sqrt(x*x + y*y);

       JOptionPane.showMessageDialog(null, "A hipotenusa é: " + hipotenusa);



    }

}
