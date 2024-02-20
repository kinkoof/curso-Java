import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
public class BarraProgresso {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);


    BarraProgresso(){

        bar.setValue(0);
        bar.setBounds(10,10,380,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli", Font.BOLD, 25));
        bar.setForeground(Color.green);
        bar.setBackground(Color.black);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        carregar();
    }

    public void carregar(){
        int x = 0;

        while (x<= 100) {
            bar.setValue(x);

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            x++;
        }
        bar.setString("Carregado!");
    }

}
