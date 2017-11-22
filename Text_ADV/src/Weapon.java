public class Weapon{
    private static double Damage;
    private String Damage_Type;
    private double weight;

    //Mutators
    public static void setDamage(double Damage) { Damage = Damage; }
    public void setDamage_Type(String damage_Type) { Damage_Type = damage_Type; }
    public void setWeight(double weight) { this.weight = weight; }

    //Accessors
    public static double getDamage() { return Damage; }
    public String getDamage_Type() { return Damage_Type; }
    public double getWeight() { return weight; }


    public String toString() {
        return "Damage: " + getDamage() + "Damage Type: " +
                getDamage_Type() + "Weight: " + getWeight();
    }
    public Weapon(){
        setDamage(0);
        setDamage_Type("Unknown");
        setWeight(0);
    }
    public Weapon(double Damage, String Damage_Type, double weight){
        setDamage(Damage);
        setDamage_Type(Damage_Type);
        setWeight(weight);
    }
    public static void setWeaponDamage(Double Blade_Oil) {
        Weapon.setDamage(Blade_Oil);
    }
}

