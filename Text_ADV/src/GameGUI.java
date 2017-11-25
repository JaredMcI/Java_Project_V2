import javax.swing.*;

public class GameGUI {
    static Weapon Fist = new Weapon(4,"Bludgeon", 1.5);
    private static Creature WolfMan = new Creature(100, 3,0.1,5,"Cutting",Fist);


    public static void start(Player user){
        JOptionPane.showMessageDialog(null,user.toString());
        StoryGUI.start("Insert Story here.", WolfMan,user);






    }
}
