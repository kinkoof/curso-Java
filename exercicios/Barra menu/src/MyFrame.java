import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menu = new JMenuBar();

    JMenu file = new JMenu("file");
    JMenu edit = new JMenu("edit");
    JMenu help = new JMenu("help");

    JMenuItem loadItem = new JMenuItem("load");
    JMenuItem saveItem = new JMenuItem("save");
    JMenuItem exitItem = new JMenuItem("exit");




    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        file.add(loadItem);
        file.add(saveItem);
        file.add(exitItem);

        menu.add(file);
        menu.add(edit);
        menu.add(help);

        this.setJMenuBar(menu);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("arquivo carregado");

        }
        else
    }

}
