package maestro;

public class HumanTest {

    public static void main(String[] args) {
        Human hanSolo = new Human();
        Human luke = new Human();

        System.out.println(hanSolo.getHealth());
        System.out.println(luke.getHealth());
        hanSolo.attack(luke);
        System.out.println(luke.getHealth());
    }

}
