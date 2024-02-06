import java.util.Random;

public class random_numbers {
    public static void main(String[] args) {

        Random random = new Random();

        // int x = random.nextInt(6) +1; // porem sera de 0-5, com o +1 sera de 1-6

        // double y = random.nextDouble(); // numeros de 0 - 1

        boolean z = random.nextBoolean(); //True or False

        System.out.println(z);
    }
}
