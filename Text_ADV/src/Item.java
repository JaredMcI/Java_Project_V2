public class Item {
    private String Name;
    private static String Type;
    private static double value;
    private double weight;


    //Mutators
    public void setName(String name) { Name = name; }
    public void setType(String type) { Type = type; }
    public void setValue(double value) { this.value = value; }
    public void setWeight(double weight) { this.weight = weight; }

    //Accessors
    public String getName() { return Name; }
    public static String getType() { return Type; }
    public static double getValue() { return value; }
    public double getWeight() { return weight; }

    public String toString() {
        return String.format("%-15s%\n%-15s%\n%-15s%\n%-15s%\n","Item Type: " , getType() , "Item Name: " ,
                getName() , "Item Boost Value: " , getValue() , "Weight: " , getWeight());

    }
    public Item(){
        setName("Unknown");
        setType("Unknown");
        setValue(0);
        setWeight(0);
    }
    public Item(String Name,String Type,double Value,double Weight){
        setName(Name);
        setType(Type);
        setValue(Value);
        setWeight(Weight);
    }


}