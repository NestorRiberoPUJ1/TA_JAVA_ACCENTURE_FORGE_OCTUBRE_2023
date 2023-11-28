package maestro;

public class Human {

    private int strength;
    private int stealth;
    private int intelligence;
    private int health;

    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;
    }

    public void attack(Human humanVictim) {
        /* humanVictim.setHealth(human.getHealth() - this.strength); */
        humanVictim.receiveAttack(this.strength);
    }

    public void receiveAttack(int attackStrength) {
        this.health -= attackStrength;
    }

    /* Getters y Setters */
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
