import javax.swing.JFrame;

public class Myframe extends JFrame{

    DragPanel dragPanel = new DragPanel();

    Myframe(){

        this.add(dragPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.setVisible(true);
    }
}
