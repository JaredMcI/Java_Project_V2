import javax.swing.*;

public class GameGUI {
        static Creature WolfMan = new Creature();


    public static void start(Player user){
        JOptionPane.showMessageDialog(null,user.toString());
        StoryGUI.start("Insert Story here.", WolfMan);






    }
}
