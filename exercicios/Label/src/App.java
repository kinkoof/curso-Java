import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class App {
    public static void main(String[] args) throws Exception {

        ImageIcon image = new ImageIcon("bob.png");
        Border border = BorderFactory.createLineBorder(Color.red, 3);

        JLabel label = new JLabel();
        label.setText("Como voce esta");
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.red);
        label.setFont(new Font("MV boli", Font.PLAIN, 50));
        label.setIconTextGap(-100);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100, 100, 250, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame.setSize(500,500);
        // frame.setLayout(null);

        frame.add(label);
        frame.pack(); // adjusta a tela aos intens dentro
        frame.setVisible(true);
    }
}
