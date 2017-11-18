public class Creature {

        private static double Health;
        private int Intelligence;
        private static double Armour;
        private static int Strength;
        private String Vulnerability;
        private static Weapon Weapon;

        //Mutators
    public static void setHealth(double health) { Health = health; }
    public void setIntelligence(int intelligence) { Intelligence = intelligence; }
    public static void setArmour(double armour) { Armour = armour; }
    public void setStrength(int strength) { Strength = strength; }
    public void setVulnerability(String vulnerability) { Vulnerability = vulnerability; }
    public static void setWeapon(Weapon weapon) { Weapon = weapon; }

    //Accessor
    public static double getHealth() { return Health; }
    public int getIntelligence() { return Intelligence; }
    public static double getArmour() { return Armour; }
    public static int getStrength() { return Strength; }
    public String getVulnerability() { return Vulnerability; }
    public static Weapon getWeapon() { return Weapon; }

    //ToString
    public String toString() {
        return "Health: " +getHealth()+"Intelligence: "+getIntelligence()+ "Armour: "+getArmour()+ "Strength: "+
                getStrength()+"Vulnerability: " +getVulnerability()+"Weapon: "+getWeapon();
    }

    public Creature(){
        setHealth(0);
        setIntelligence(0);
        setArmour(0);
        setStrength(0);
        setVulnerability("Unknown");
        setWeapon(Weapon);
    }
    public Creature(double Health,int Intelligence,double Armour,int Strength,String Vulnerability,Weapon Weapon){
        setHealth(Health);
        setIntelligence(Intelligence);
        setArmour(Armour);
        setStrength(Strength);
        setVulnerability(Vulnerability);
        setWeapon(Weapon);
}



}