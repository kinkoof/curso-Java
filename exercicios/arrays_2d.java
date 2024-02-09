

public class arrays_2d {
    public static void main(String[] args) {

        // 2D arrays = um array de um array

        String[][] carros = new String[3][3];

        carros[0][0] = "camaro";
        carros[0][1] = "corvete";
        carros[0][2] = "silverado";
        carros[1][0] = "mustang";
        carros[1][1] = "ranger";
        carros[1][2] = "f-150";
        carros[2][0] = "ferrari";
        carros[2][1] = "lambo";
        carros[2][2] = "tesla";

        for (int i = 0; i < carros.length; i++) {
            System.out.println();
            for (int j = 0; j < carros[i].length; j++) {
                System.out.println(carros[i][j]);

            }
        }

        // ------------------------------------------------------------

        String[][] motos = {{ "Yamaha YZF-R1", "Harley-Davidson Sportster", "Ducati Panigale V4" },
                            { "Kawasaki Ninja ZX-10R", "Honda CBR600RR", "Suzuki GSX-R750" },
                            { "BMW S1000RR", "Yamaha MT-09", "Ducati Monster 821" } };

        for (int i = 0; i < motos.length; i++) {
            System.out.println();
            for (int j = 0; j < motos[i].length; j++) {
                System.out.println(motos[i][j]);

            }
        }

    }
}