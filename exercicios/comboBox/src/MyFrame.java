import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox combobox;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animais = { "cachorro", "gato", "macaco" };
        // Integer[] numero = {2, 3,46};

        combobox = new JComboBox(animais);
        combobox.addActionListener(this);
        // combobox.setEditable(true);
        // System.out.println(combobox.getItemCount());
        // combobox.addItem("cavalo");
        // combobox.insertItemAt("porco", 0);
        // combobox.setSelectedIndex(0);
        // combobox.removeItem("gato");
        // combobox.removeItemAt(0);
        // combobox.removeAllItems();


        this.add(combobox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == combobox) {
            //System.out.println(combobox.getSelectedItem());
            System.out.println(combobox.getSelectedIndex());

        }
    }
}
