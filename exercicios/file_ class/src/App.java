import java.io.File;
public class App {
    public static void main(String[] args) throws Exception {

        File file = new File("mensagem.txt");
        file.createNewFile();

        if (file.exists()) {
            System.out.println("existe");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            file.delete();


        }
        else{
            System.out.println("nao existe");
        }
    }
}
