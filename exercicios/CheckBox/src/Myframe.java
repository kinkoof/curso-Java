import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;

public class Myframe  extends JFrame implements ActionListener{
    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon vIcon;

    Myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        xIcon = new ImageIcon("excluir.png");
        vIcon = new ImageIcon("aceitar.png");

        button = new JButton();
        button.setText("enviar");
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("eu nao sou um robo");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
        checkBox.setIcon(xIcon);
        checkBox.setSelectedIcon(vIcon);


        this.add(checkBox);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println(checkBox.isSelected());

        }
    }

}
