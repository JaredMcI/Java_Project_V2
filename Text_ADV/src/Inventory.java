import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Inventory extends Weapon {

    Object[] Inventory = new Object[20];
    private int NextFreePosition = 0;
    private double Weight_Limit = 0;

    public void setWeight_Limit(double weight_Limit) { Weight_Limit = weight_Limit; }
    public double getWeight_Limit() { return Weight_Limit; }

    public void AddItem(Item Item){
        Inventory[NextFreePosition] = Item;
        NextFreePosition++;

    }
    public void addWeapon(Weapon Weapon){
        Inventory[NextFreePosition] = Weapon;
        NextFreePosition++;
    }

    public void useItem(Item Item){
        if (Item.getType().equals("Potion")){
            Creature.setHealth(Creature.getHealth() + Item.getValue());
            //Inventory = List.removeElement(Inventory, Item);              HELP!!!!
        }
        else if (Item.getType().equals("Shield")){
            Creature.setArmour(Creature.getArmour() + Item.getValue());
        }
        else if (Item.getType().equals("Blade Oil")){
            setWeaponDamage(Item.getValue());
        }

    }
    public void EquipWeapon(Weapon Weapon){
        Creature.setWeapon(Weapon);

    }
    public Inventory(double Weight_Limit,Object[] Inventory[]){
        setWeight_Limit(Player.getStrength() * 2);
    }

    @Override
    public String toString() {
        return "Current Inventory: \n" + Arrays.toString(Inventory);
    }

    //Build GUI for Inventory Screen
    public void DisplayInventory(Inventory Inventory){
        JOptionPane.showMessageDialog(null,Inventory.toString(),"Inventory", JOptionPane.INFORMATION_MESSAGE);
    }




}
