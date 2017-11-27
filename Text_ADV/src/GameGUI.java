import javax.swing.*;

public class GameGUI {
    static Weapon Fist = new Weapon(4,"Bludgeon", 1.5);



    public static void start(Player user){
        JOptionPane.showMessageDialog(null,user.toString());


        Creature WolfMan = new Creature(100, 3,0.1,5,"Cutting",Fist);
        StoryGUI.start(user ,"Insert Story here.", WolfMan);






    }
}
