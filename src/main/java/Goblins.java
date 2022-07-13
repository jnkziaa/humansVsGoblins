import java.util.Random;

public class Goblins {
   private int goblinHealth;
   private int goblinStrength;
   private int goblinPosition;

    public Goblins(int goblinHealth, int goblinStrength, int goblinPosition) {
        this.goblinHealth = goblinHealth;
        this.goblinStrength = goblinStrength;
        this.goblinPosition = goblinPosition;
    }

    public Goblins(int goblinHealth, int goblinStrength) {
        this.goblinHealth = goblinHealth;
        this.goblinStrength = goblinStrength;
        randomizedGoblinPosition();
    }

    public Goblins() {

    }

    public int getGoblinHealth() {
        return goblinHealth;
    }

    public void setGoblinHealth(int goblinHealth) {
        this.goblinHealth = goblinHealth;
    }

    public int getGoblinStrength() {
        return goblinStrength;
    }

    public void setGoblinStrength(int goblinStrength) {
        this.goblinStrength = goblinStrength;
    }

    public int getGoblinPosition() {
        return goblinPosition;
    }

    public void setGoblinPosition(int goblinPosition) {
        this.goblinPosition = goblinPosition;
    }

    public void randomizedGoblinPosition(){
        Random random = new Random();
        int randomGoblinPosition = random.nextInt(99);
        setGoblinPosition(randomGoblinPosition);
    }

    public Humans attack(Humans human){
        Random rand = new Random();
        int randomizedAttack = rand.nextInt(getGoblinStrength());
        human.setHealth(human.getHealth() - randomizedAttack);
        System.out.println("Goblin attacked human for " + randomizedAttack + " damage");
        System.out.println("Human has " + human.getHealth() + " HP left");
        return human;
    }

    public Drops goblinDrops(){
        Drops weapon = new Weapon();
        Drops potion = new Potion();

        return weapon;
    }
}
