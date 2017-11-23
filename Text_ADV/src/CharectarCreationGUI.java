import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CharectarCreationGUI extends JFrame  {

    static double health;
    static double armour ,PlayerHeight;
    static int intelligence, charisma, Dexterity,Strength;
    static Weapon StartingWeapon;
    static String Vulnerability;
    static Player user;

       public static void start() {

           JFrame CharectarWindow = new JFrame("Create Your Adventurer");
           GridLayout layout = new GridLayout(0, 2);
           CharectarWindow.setLayout(layout);
           CharectarWindow.setSize(350, 180);
           CharectarWindow.setVisible(true);
           CharectarWindow.getContentPane().setBackground(Color.BLACK);

           CharectarWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

           JLabel Name = new JLabel();
           Name.setText("Name");
           Name.setForeground(Color.WHITE);
           CharectarWindow.add(Name);
           JTextField NameInput = new JTextField();
           CharectarWindow.add(NameInput);


           JLabel Height = new JLabel();
           Height.setText("Height:");
           Height.setForeground(Color.WHITE);
           CharectarWindow.add(Height);
           JTextField HeightInput = new JTextField();
           CharectarWindow.add(HeightInput);


          // JLabel StartWeapon = new JLabel();
           //StartWeapon.setText("Starting Weapon:");
          // StartWeapon.setForeground(Color.WHITE);
          // CharectarWindow.add(StartWeapon);
          // JTextField StartWeaponInput = new JTextField();
          // CharectarWindow.add(StartWeaponInput);



           JButton Confirm = new JButton("Create");
           CharectarWindow.add(Confirm);
           Confirm.setBackground(Color.gray);


           Confirm.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   PlayerHeight = Double.parseDouble(HeightInput.getText());


                   JFrame BackStoryWindow = new JFrame("Who are you??");
                   GridLayout layoutB = new GridLayout(0,3);
                   BackStoryWindow.setLayout(layoutB);
                   BackStoryWindow.setSize(500,200);
                   BackStoryWindow.setVisible(true);

                   BackStoryWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                   JButton Thief = new JButton("Lonely Thief");
                   BackStoryWindow.add(Thief);
                   Thief.setBackground(Color.gray);
                   Thief.setForeground(Color.white);

                   JButton Farmer = new JButton("Lost Farmer");
                   BackStoryWindow.add(Farmer);
                   Farmer.setBackground(Color.gray);
                   Farmer.setForeground(Color.white);

                   JButton Soldier = new JButton("Wandering Mercenary");
                    BackStoryWindow.add(Soldier);
                   Soldier.setBackground(Color.gray);
                   Soldier.setForeground(Color.white);

                   Thief.addActionListener(new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           health = 90;
                           armour = 0.1;
                           intelligence = 8;
                           charisma = 4;
                           Strength = 3;
                           Dexterity = 7;
                           Vulnerability = "Cutting";
                           StartingWeapon = new Weapon(10, "Piercing", 11.5);
                           BackStoryWindow.dispose();
                           CharectarWindow.dispose();
                           user = new Player(health, intelligence, armour, Strength, Vulnerability, StartingWeapon, charisma, Dexterity, NameInput.getText(), PlayerHeight);
                           GameGUI.start(user);
                       }
                   });
                   Farmer.addActionListener(new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           health = 100;
                           armour = 0.15;
                           intelligence = 3;
                           charisma = 7;
                           Strength = 8;
                           Dexterity = 3;
                           Vulnerability = "Piercing";
                           StartingWeapon =  new Weapon(13, "Bludgeon", 13.5);
                           BackStoryWindow.dispose();
                           CharectarWindow.dispose();
                           user = new Player(health, intelligence, armour, Strength, Vulnerability, StartingWeapon, charisma, Dexterity, NameInput.getText(), PlayerHeight);
                           GameGUI.start(user);
                       }
                   });
                   Soldier.addActionListener(new ActionListener() {
                       @Override
                       public void actionPerformed(ActionEvent e) {
                           health = 100;
                           armour = 0.25;
                           intelligence = 2;
                           charisma = 2;
                           Strength = 8;
                           Dexterity = 7;
                           Vulnerability = "Bludgeon";
                           StartingWeapon =  new Weapon(11, "Cutting", 8.5);
                           BackStoryWindow.dispose();
                           CharectarWindow.dispose();
                           user = new Player(health, intelligence, armour, Strength, Vulnerability, StartingWeapon, charisma, Dexterity, NameInput.getText(), PlayerHeight);

                           GameGUI.start(user);
                       }
                   });

               }
           });

             }}

