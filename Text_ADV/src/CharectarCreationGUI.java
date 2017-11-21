import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CharectarCreationGUI extends JFrame  {

       public static void start(){

           JFrame CharectarWindow = new JFrame("Create Your Adventurer");
           GridLayout layout = new GridLayout(0,2);
           CharectarWindow.setLayout(layout);
           CharectarWindow.setSize(350,180);
           CharectarWindow.setVisible(true);
           CharectarWindow.getContentPane().setBackground(Color.BLACK);


           JLabel Name =new JLabel();
           Name.setText("Name");
           Name.setForeground(Color.WHITE);
           CharectarWindow.add(Name);
           JTextField NameInput = new JTextField();
           CharectarWindow.add(NameInput);


           JLabel Height =new JLabel();
           Height.setText("Height:");
           Height.setForeground(Color.WHITE);
           CharectarWindow.add(Height);
           JTextField HeightInput = new JTextField();
           CharectarWindow.add(HeightInput);


           JLabel StartWeapon =new JLabel();
           StartWeapon.setText("Starting Weapon:");
           StartWeapon.setForeground(Color.WHITE);
           CharectarWindow.add(StartWeapon);
           JTextField StartWeaponInput = new JTextField();
           CharectarWindow.add(StartWeaponInput);


           JLabel Vulnerability =new JLabel();
           Vulnerability.setText("Vulnerability");
           Vulnerability.setForeground(Color.WHITE);
           CharectarWindow.add(Vulnerability);
           JTextField VulnerabilityInput = new JTextField();
           CharectarWindow.add(VulnerabilityInput);


           JButton Confirm = new JButton("Create");
           CharectarWindow.add(Confirm);
           Confirm.setBackground(Color.gray);

           Confirm.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   JFrame BackStoryWindow = new JFrame("Whats your story?");
                   GridLayout layoutB = new GridLayout(0,3);
                   BackStoryWindow.setLayout(layoutB);
                   BackStoryWindow.setSize(500,200);
                   BackStoryWindow.setVisible(true);

                   JButton Thief = new JButton("Lonely Thief");
                   BackStoryWindow.add(Thief);
                   Thief.setBackground(Color.gray);

                   JButton Farmer = new JButton("Lost Farmer");
                   BackStoryWindow.add(Farmer);
                   Farmer.setBackground(Color.gray);

                   JButton Soldier = new JButton("Wandering Mercenary");
                    BackStoryWindow.add(Soldier);
                   Soldier.setBackground(Color.gray);
               }
           });

       }}

