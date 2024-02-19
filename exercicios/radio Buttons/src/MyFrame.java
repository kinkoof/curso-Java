import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizza;
    JRadioButton hamburguer;
    JRadioButton cachorroQuente;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizza = new JRadioButton("pizza");
        hamburguer = new JRadioButton("hamburguer");
        cachorroQuente = new JRadioButton("cachorro Quente");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(hamburguer);
        grupo.add(pizza);
        grupo.add(cachorroQuente);

        pizza.addActionListener(this);
        hamburguer.addActionListener(this);
        cachorroQuente.addActionListener(this);

        this.add(cachorroQuente);
        this.add(hamburguer);
        this.add(pizza);
        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizza) {
            System.out.println("pizza");
        }

        else if (e.getSource() == hamburguer) {
            System.out.println("hamburguer");
        }

        else if (e.getSource() == cachorroQuente) {
            System.out.println("cachorro quente");
        }
        else{
            System.out.println("escolha algo");
        }

    }
}
