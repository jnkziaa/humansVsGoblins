import java.util.Random;

public class Humans {
    private int health;
    private int strength;
    private int positioning;

    private String Name;

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
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public Goblins attack(Goblins goblin){
        Random rand = new Random();
        int randomizedDamage = rand.nextInt(getStrength());
        goblin.setGoblinHealth(goblin.getGoblinHealth() - randomizedDamage);
        System.out.println("Human attacked goblin for " + randomizedDamage + " damage");
        if(goblin.getGoblinHealth() <= 0){
            goblin.setGoblinHealth(0);
        }
        System.out.println("Goblin has " + goblin.getGoblinHealth() + " HP left");
        return goblin;
    }

    public void inventory(){ //hash map of player inventory

    }
}
