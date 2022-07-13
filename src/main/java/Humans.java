public class Humans {
    private int health;
    private int strength;
    private int positioning;

    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Humans(int health, int strength, int positioning) {
        this.health = health;
        this.strength = strength;
        this.positioning = positioning;
    }

    public Humans(int health, int strength) {
        this.health = health;
        this.strength = strength;
    }

    public Humans() {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPositioning() {
        return positioning;
    }

    public void setPositioning(int positioning) {
        this.positioning = positioning;
    }
}
