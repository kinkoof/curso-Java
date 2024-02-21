import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {
        // Jpanel  = um GUI componente que funciona como um container para outros componentes

        ImageIcon icon = new ImageIcon("definicoes.png");


        JLabel labelGreen = new JLabel();
        labelGreen.setText("Hello word! mas verde");
        labelGreen.setIcon(icon);
        labelGreen.setVerticalAlignment(JLabel.BOTTOM);
        labelGreen.setHorizontalAlignment(JLabel.RIGHT);
        labelGreen.setBounds(100,100, 100, 75);

        JLabel labelVermelho = new JLabel();
        labelVermelho.setText("Hello word! mas vermelho");
        labelVermelho.setVerticalAlignment(JLabel.BOTTOM);
        labelVermelho.setHorizontalAlignment(JLabel.RIGHT);



        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);


        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);



        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        greenPanel.add(labelGreen);


        frame.setVisible(true);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

    }
}
