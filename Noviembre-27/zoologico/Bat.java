package zoologico;
/*  Clase Murcielago para control energía */
public class Bat {
    private int energy;

    public Bat() {
        this.energy = 300;
    }

    public void fly() {
        System.out.println("*sonido de murcielago al despegar*");
        this.energy -= 50;
    }

    public void eatHumans() {
        System.out.println("Ok, no importa");
        this.energy += 25;
    }

    public void attackTown() {
        System.out.println("*sonido de pueblo en llamas*");
        this.energy -= 100;
    }

    /* Getters y Setters */
    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}