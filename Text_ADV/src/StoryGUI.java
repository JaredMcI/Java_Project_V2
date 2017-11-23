import javax.swing.*;
import java.awt.*;

public class StoryGUI extends JFrame {

    public static void start(String text, Creature Enemey)
    {


        JFrame StoryFrame = new JFrame("Event");
        StoryFrame.setLayout(null);
        StoryFrame.setSize(800, 600);
        StoryFrame.setVisible(true);
        StoryFrame.getContentPane().setBackground(Color.BLACK);

        Container Base = StoryFrame.getContentPane();

        JPanel StoryPanel = new JPanel();
        StoryPanel.setBounds(100,100,600,150);
        JLabel Story = new JLabel(text);
        StoryPanel.add(Story);
        StoryPanel.setBackground(Color.orange);

        JLabel EnemeyLabel = new JLabel("Enemey: ");
        JLabel EnemeyStats = new JLabel(Enemey.toString());
        StoryFrame.add(EnemeyLabel);
        StoryFrame.add(EnemeyStats);


        JPanel OptionPanel = new JPanel();
        OptionPanel.setBounds(100,400,200,50);
        GridLayout Grid = new GridLayout(0,2);
        OptionPanel.setLayout(Grid);
        JButton AttackBTN = new JButton("Attack");
        JButton InventoryBTN = new JButton("Inventory");
        OptionPanel.add(AttackBTN);
        OptionPanel.add(InventoryBTN);

        Base.add(StoryPanel);
        Base.add(OptionPanel);
    }
}
