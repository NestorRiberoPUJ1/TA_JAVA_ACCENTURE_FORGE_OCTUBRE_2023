/* package guardiaZoologico; */

public class ZooTest {

    public static void main(String[] args) {

        Gorilla kingkong= new Gorilla();

        kingkong.throwSomething();
        kingkong.throwSomething();
        kingkong.throwSomething();
        
        kingkong.eatBananas();
        kingkong.eatBananas();

        kingkong.climb();

        kingkong.displayEnergy();


        Bat dracula = new Bat();

        dracula.attackTown();
        dracula.attackTown();
        dracula.attackTown();

        dracula.eatHumans();

        dracula.fly();
        dracula.fly();

        dracula.displayEnergy();
    }

}
