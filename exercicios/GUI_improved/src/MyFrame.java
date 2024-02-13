import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyFrame(){

        this.setTitle("Jframe titulo"); //titulo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//para fechar a aplicacao e nao apenas esconder
        this.setResizable(false); //nao deixa redimensionavel
        this.setSize(420, 420); // x, y do frame

        ImageIcon icon = new ImageIcon("bob.png"); //cria um icone
        this.setIconImage(icon.getImage()); // muda o icone

        this.getContentPane().setBackground(Color.MAGENTA); //muda a cor do background
        this.getContentPane().setBackground(new Color(123, 50, 250)); //muda a cor do background
        this.getContentPane().setBackground(new Color(0x123456)); //muda a cor do background


        this.setVisible(true); // deixa o frame visivel
    }
}
