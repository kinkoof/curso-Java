import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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

        loadItem.setMnemonic(KeyEvent.VK_L); // l para carregar
        saveItem.setMnemonic(KeyEvent.VK_S); // S para salvar
        exitItem.setMnemonic(KeyEvent.VK_E); // e para sair

        file.setMnemonic(KeyEvent.VK_F); // alt + f para o file


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
        else if (e.getSource() == saveItem) {
            System.out.println("arquivo salvo");
        }
        else if (e.getSource() == exitItem) {
            System.out.println("saindo...");
            //this.dispose();
            System.exit(0);
        }
    }

}
