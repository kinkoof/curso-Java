public class switchs {
    public static void main(String[] args) {

        String dia = "segunda";

        switch (dia) {
            case "Domingo":
                System.out.println("é domingo");
                break;

            case "segunda":
                System.out.println("é segunda");
                break;

            case "terça":
                System.out.println("é terça");
                break;

            case "quarta":
                System.out.println("é quarta");
                break;

            case "quinta":
                System.out.println("é quinta");
                break;

            case "sexta":
                System.out.println("é sexta");
                break;

            case "sabado":
                System.out.println("é sabado");
                break;

            default:
                System.out.println("poe um dia ae");
                break;
        }
    }
}
