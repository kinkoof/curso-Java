
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class MyFrame extends JFrame{

    JButton button;
    JLabel label;

    MyFrame(){
       // ImageIcon icon = new ImageIcon("definicoes.png");

        label = new JLabel("OMAGAD");
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(100, 100, 300, 200);
        //button.addActionListener(e -> System.out.println("Hello, Word!"));
        //button.addActionListener(e -> button.setEnabled(false)); //permite clicar apenas 1 x
        button.addActionListener(e -> label.setVisible(true));
        button.setText("Botão");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont((new Font("Comic Sans", Font.BOLD, 25)));
        button.setForeground(Color.CYAN);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);

    }



}
