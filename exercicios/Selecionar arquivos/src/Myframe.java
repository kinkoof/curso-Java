import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Myframe extends JFrame implements ActionListener {

    JButton button = new JButton("selecione");

    Myframe() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            JFileChooser fileChooser = new JFileChooser();

            fileChooser.setCurrentDirectory(new File("."));


            // int resp = fileChooser.showOpenDialog(null); // seleciona o arquivo para abrir
            int resp = fileChooser.showSaveDialog(null); // seleciona o arquivo para abrir


            if (resp == JFileChooser.APPROVE_OPTION) {
                File file = new File( fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }

    }

}
