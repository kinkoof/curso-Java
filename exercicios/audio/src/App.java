import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class App {
    public static void main(String[] args) throws Exception, UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);

        File file = new File("Gymnopedie.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String x = "";

        while (!x.equals("Q")) {
            System.out.println("P = play, S = stop, R = reset, Q = quit ");

            x = scanner.next();
            x = x.toUpperCase();

            switch (x) {
                case "P":
                    clip.start();
                    break;

                case "S":
                    clip.stop();
                    break;

                case "R":
                    clip.setMicrosecondPosition(0);
                    break;

                case "Q":
                    clip.close();
                    break;

                default:
                    System.out.println("escolha uma opcao valida");
                    break;
            }

        }
        scanner.close();
    }
}
