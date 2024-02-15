import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JTextField text;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Enviar");
        button.addActionListener(this);

        text = new JTextField();
        text.setPreferredSize(new Dimension(250, 40));
        text.setFont(new Font("Consolas", Font.PLAIN, 35));
        text.setForeground(Color.green);
        text.setBackground(Color.BLACK);
        text.setCaretColor(Color.green);
        text.setText("digite seu nome");





        this.add(text);
        this.add(button);
        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            System.out.println( "Bem vindo " + text.getText());
            text.setEditable(false);
            button.setEnabled(false);
        }
    }


}