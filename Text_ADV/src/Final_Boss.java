public class Final_Boss extends Creature {
    private float height;
    private float multiplier;

    //Accessor
    public float getHeight() { return height; }
    public float getMultiplier() { return multiplier; }

    //Mutators
    public void setHeight(float height) { this.height = height; }
    public void setMultiplier(float multiplier) { this.multiplier = multiplier; }

    public Final_Boss() {
        super();
        this.height = 0;
        this.multiplier = 0;
    }

    public Final_Boss(float Health, int Intelligence, float Armour, int Strength, String Vulnerability, Weapon Weapon, float height, float multiplier) {
        super(Health, Intelligence, Armour, Strength, Vulnerability, Weapon);
        this.height = height;
        this.multiplier = multiplier;
    }
}
