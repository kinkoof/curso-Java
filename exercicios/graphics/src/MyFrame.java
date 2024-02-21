import javax.swing.JFrame;


public class MyFrame extends JFrame{
    MyPanel panel;

    MyFrame(){

        panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null); // O frame aparece no centro da tela e nao no canto
        this.setVisible(true);
    }


}
