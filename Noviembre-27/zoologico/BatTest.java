package zoologico;
import javax.swing.JOptionPane;

public class BatTest {
    public static void main(String[] args) {

        Bat dracula = new Bat();

        System.out.println(dracula.getEnergy());

        dracula.attackTown();
        dracula.attackTown();
        dracula.attackTown();

        System.out.println(dracula.getEnergy());

        dracula.eatHumans();
        dracula.eatHumans();

        System.out.println(dracula.getEnergy());

        dracula.fly();
        dracula.fly();

        System.out.println(dracula.getEnergy());

        String action = "";
        while (action != "exit") {
            action = JOptionPane.showInputDialog("Ingrese la accion");
            switch (action) {
                case "comer":
                    dracula.eatHumans();
                    break;

                default:
                    break;
            }
        }

    }
}
