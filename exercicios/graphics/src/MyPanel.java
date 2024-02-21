import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class MyPanel extends JPanel {
    Image image;

    MyPanel() {
        image = new ImageIcon("sky.jpg").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawImage(image, 0, 0, null);

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));
        g2D.drawLine(0, 0, 500, 500);

        g2D.setPaint(Color.red);
        g2D.fillRect(50, 50, 100, 200);

        g2D.setPaint(Color.green);
        g2D.drawOval(200, 70, 70, 100);


        g2D.setPaint(Color.red);
        g2D.fillArc(250, 250, 100, 100, 0, 180);

        g2D.setPaint(Color.black);
        g2D.drawArc(250, 250, 100, 100, 0, 180);

        g2D.setPaint(Color.white);
        g2D.fillArc(250, 250, 100, 100, 180, 180);

        g2D.setPaint(Color.black);
        g2D.drawArc(250, 250, 100, 100, 180, 180);

        g2D.drawLine(250, 300, 350, 300);

        g2D.setPaint(Color.DARK_GRAY);
        g2D.fillOval(290, 290, 20, 20);


        int[] xPoints = {50,70,35};
        int[] yPoints = {30,50,30};
        g2D.drawPolygon(xPoints,yPoints,3);

        g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
        g2D.drawString("Voce é muito bom", 50, 70);


    }
}
