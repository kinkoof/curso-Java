import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("emoji.png");

        label.setIcon(image);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);


        frame.add(label);
        frame.setVisible(true);

    }
}
