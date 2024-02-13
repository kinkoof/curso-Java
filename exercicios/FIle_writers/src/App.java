
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        try {
            FileWriter writer = new FileWriter("poema.txt");
            writer.write("rosas sao vermelhas \nvioletas sao azuis \nsua cara me encanta \nseu corpo me seduz");
            writer.append("\n(poema legal)");
            writer.close();
        }
        catch(IOException e ){
            e.printStackTrace();
        }
    }
}
