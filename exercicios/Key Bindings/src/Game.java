import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

public class Game {

    JFrame frame;
    JLabel label;

    Action cima;
    Action baixo;
    Action esq;
    Action dir;

    Game() {
        frame = new JFrame("key demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.red);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        cima = new Cima();
        baixo = new Baixo();
        esq = new Esq();
        dir = new Dir();

        label.getInputMap().put(KeyStroke.getKeyStroke('w'), "cima");
        label.getActionMap().put("cima", cima);

        label.getInputMap().put(KeyStroke.getKeyStroke('s'), "baixo");
        label.getActionMap().put("baixo", baixo);

        label.getInputMap().put(KeyStroke.getKeyStroke('a'), "esq");
        label.getActionMap().put("esq", esq);

        label.getInputMap().put(KeyStroke.getKeyStroke('d'), "dir");
        label.getActionMap().put("dir", dir);

        frame.add(label);
        frame.setVisible(true);

    }

    public class Cima extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    public class Baixo extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    public class Esq extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());
        }
    }

    public class Dir extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }

}
