import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener{

    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);


        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("voce clicou o mouse");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("voce entrou com o mouse");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("voce saiu com o mouse");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("voce apertou o botao");
        label.setBackground(Color.yellow);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("voce soltou o botao");
        label.setBackground(Color.green);

    }
}
