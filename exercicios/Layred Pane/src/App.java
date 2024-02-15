import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class App {
    public static void main(String[] args) throws Exception {
        // JLayredPane = container que providencia uma terceira dimensao
        //               para posicionar componentes


        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50, 50, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100, 100, 200, 200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150, 150, 200, 200);

        JLabel label4 = new JLabel();
        label4.setOpaque(true);
        label4.setBackground(Color.magenta);
        label4.setBounds(200, 200, 200, 200);

        JLabel label5 = new JLabel();
        label5.setOpaque(true);
        label5.setBackground(Color.yellow);
        label5.setBounds(250, 250, 200, 200);



        JLayeredPane layPane = new JLayeredPane();
        layPane.setBounds(0, 0, 500, 500);


        // layPane.add(label1, JLayeredPane.DEFAULT_LAYER);
        // layPane.add(label2, JLayeredPane.PALETTE_LAYER);
        // layPane.add(label3, JLayeredPane.MODAL_LAYER);
        // layPane.add(label4, JLayeredPane.POPUP_LAYER);
        // layPane.add(label5, JLayeredPane.DRAG_LAYER);

        layPane.add(label1, Integer.valueOf(20));
        layPane.add(label2, Integer.valueOf(1));
        layPane.add(label3, Integer.valueOf(2));
        layPane.add(label4, Integer.valueOf(13));
        layPane.add(label5, Integer.valueOf(4));



        JFrame frame = new JFrame("JlayredPane");
        frame.add(layPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);






        frame.setVisible(true);
    }
}
