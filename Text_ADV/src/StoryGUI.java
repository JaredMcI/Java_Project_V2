import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoryGUI extends JFrame {

    public static void start(String text, Creature Enemey,Player User)
    {


        JFrame StoryFrame = new JFrame("Event");
        StoryFrame.setLayout(null);
        StoryFrame.setSize(800, 600);
        StoryFrame.setVisible(true);
        StoryFrame.getContentPane().setBackground(Color.BLACK);

        Container Base = StoryFrame.getContentPane();

        JPanel StoryPanel = new JPanel();
        StoryPanel.setBounds(100,100,600,250);
        JLabel Story = new JLabel(text);
        StoryPanel.add(Story);
        StoryPanel.setBackground(Color.orange);

        JLabel EnemeyLabel = new JLabel("Enemey: ");
        JLabel EnemeyStats = new JLabel(Enemey.toString());
        StoryFrame.add(EnemeyLabel);
        StoryFrame.add(EnemeyStats);


        JPanel OptionPanel = new JPanel();
        OptionPanel.setBounds(100,400,600,50);
        OptionPanel.setBackground(Color.blue);
        GridLayout Grid = new GridLayout(0,3);
        Grid.setHgap(50);
        OptionPanel.setLayout(Grid);
        ImageIcon Attack = new ImageIcon("../../Images/AttackButton.png");
        JButton AttackBTN = new JButton(Attack);
        AttackBTN.setBackground(Color.BLACK);
        AttackBTN.setForeground(Color.white);
        AttackBTN.setBorderPainted(true);

        JButton LeftBTN = new JButton("Left");
        JButton RightBTN = new JButton("Right");
        OptionPanel.add(AttackBTN);
        OptionPanel.add(LeftBTN);
        OptionPanel.add(RightBTN);

        Base.add(StoryPanel);
        Base.add(OptionPanel);

        AttackBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AttackGUI.start(Enemey, User);


            }
        });

    }
}
