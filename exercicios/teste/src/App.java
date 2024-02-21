import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("emoji.png");

        label.setIcon(image);
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}
