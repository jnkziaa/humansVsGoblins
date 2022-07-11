public class Goblins {
   private int goblinHealth;
   private int goblinStrength;
   private int goblinPosition;

    public Goblins(int goblinHealth, int goblinStrength, int goblinPosition) {
        this.goblinHealth = goblinHealth;
        this.goblinStrength = goblinStrength;
        this.goblinPosition = goblinPosition;
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
}
