/* package guardiaZoologico; */

public class Mammal {
    protected int energy;

    public Mammal() {
        this.energy = 100;
    }

    public void displayEnergy() {
        System.out.println(this.energy);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

}
