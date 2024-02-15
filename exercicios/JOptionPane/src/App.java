import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // JOptionPane = pop up uma caixa de dialogo que informa algo ou pede o valor de alguma coisa

        JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.ERROR_MESSAGE);
       /*  while (true) {
            JOptionPane.showMessageDialog(null, "Mensagem", "Titulo", JOptionPane.WARNING_MESSAGE);

        }*/

        int resposta = JOptionPane.showConfirmDialog(null, "Voce esta programando?", null, JOptionPane.YES_NO_OPTION);
        String nome = JOptionPane.showInputDialog("qual o seu nome?");

        if (resposta == 0) {
            System.out.println("parabens");
        }
        else if (resposta == 1) {
            System.out.println("Vai estuda");
        }
        else{
            System.out.println("vai estuda mano");
        }

        String[] respostas = {"Nao, voce é incrivel", "Obrigado", "-Se envergonha"};

        System.out.println(nome);

        JOptionPane.showOptionDialog(
            null,
            "voce é incrivel",
            "Mensagem secreta",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            respostas,
            0);


    }
}
