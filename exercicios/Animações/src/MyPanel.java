import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 600;
    final int PANEL_WEIGHT = 600;
    Image inimigo;
    Image backGround;
    Timer timer;
    int xVelocidade = 5;
    int yVelocidade = 10;
    int x = 0;
    int y = 0;

    MyPanel() {
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_WEIGHT));
        this.setBackground(Color.black);

        inimigo = new ImageIcon("alien.png").getImage();

        timer = new Timer(10, this);
        timer.start();

    }

    public void paint(Graphics g) {

        super.paint(g); // para pintar o background

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(inimigo, x, y, null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH - inimigo.getWidth(null) || x < 0) {
            xVelocidade = xVelocidade * -1;
        }
        x = x + xVelocidade;

        if (y >= PANEL_WEIGHT - inimigo.getHeight(null) || y < 0) {
            yVelocidade = yVelocidade * -1;
        }
        y = y + yVelocidade;
        repaint();
    }
}
