
public class MainClass {
    public static void main(String[] args) {
        System.out.print("HOLA");

        SecondaryClass.PrintHola();

        System.out.println("Finalizando");

        String hola = "     hola    ";
        hola.trim();

        boolean leche = false;
        boolean jugo = false;
        boolean te = false;
        double dinero = 1.75;
        double gaseosa = 1.2;

        if (leche == true) {
            System.out.println("Comprar Leche");
        } else if (jugo == true) {
            System.out.println("Comprar Jugo");
        } else if (te == true) {
            System.out.println("Comprar Té");
        } else if (dinero > gaseosa) {
            System.out.println("Comprar gaseosa");
        }
        else {
            System.out.println("Nos quedamos sin liquido");
        }

    }
}
