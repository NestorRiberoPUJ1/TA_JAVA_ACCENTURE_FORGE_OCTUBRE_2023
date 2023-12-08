
public class Bat extends Mammal {

    public Bat() {
        this.energy = 300;
    }

    public void fly() {
        System.out.println("Sonido volando");
        this.energy -= 50;
    }

    public void eatHumans() {
        System.out.println("Comiendo humanos");
        this.energy += 25;
    }

    public void attackTown() {
        System.out.println("Sonido ciudad en llamas");
        this.energy -= 100;
    }

}
