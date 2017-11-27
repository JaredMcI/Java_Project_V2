import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AttackGUI extends JFrame {

    public static void start(Player User,Creature Enemey){

    JFrame AttackFrame = new JFrame("Battle!!");
    GridLayout grid = new GridLayout(3,0);
        AttackFrame.setLayout(grid);
        AttackFrame.setSize(800, 600);
        AttackFrame.setVisible(true);
        AttackFrame.getContentPane().setBackground(Color.BLACK);


        JPanel EnemeyPanel = new JPanel();
        EnemeyPanel.setBackground(Color.BLUE);
        JPanel UserPanel = new JPanel();
        UserPanel.setBackground(Color.RED);
        JPanel ButtonsPanel = new JPanel();


        JTextArea EnemyStat = new JTextArea(Enemey.toString());
        EnemyStat.setLineWrap(true);
        EnemyStat.setBounds(50,50,600,180);
        EnemyStat.setBackground(Color.black);
        EnemyStat.setForeground(Color.white);
        EnemeyPanel.setBackground(Color.black);
        EnemeyPanel.add(EnemyStat);

        JTextArea UserStat = new JTextArea(User.toString());
        UserStat.setLineWrap(true);
        UserStat.setBounds(50,50,600,180);
        UserPanel.setBackground(Color.black);
        UserStat.setBackground(Color.black);
        UserStat.setForeground(Color.white);
        UserPanel.add(UserStat);

        JButton Strike = new JButton("Strike");
        JButton Retreat = new JButton("Retreat");
        Strike.setBounds(50,50,100,70);
        Retreat.setBounds(200,50,100,70);
        ButtonsPanel.setBackground(Color.black);


        ButtonsPanel.add(Strike);
        ButtonsPanel.add(Retreat);



        AttackFrame.add(EnemeyPanel);
        AttackFrame .add(UserPanel);
        AttackFrame.add(ButtonsPanel);

        Strike.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User.Attack(Enemey);
                Enemey.Attack(User);
            }
        });
        Retreat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                User.setHealth(User.getHealth()*0.9);
            }
        });
    }}
