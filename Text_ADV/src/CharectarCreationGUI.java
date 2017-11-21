import javax.swing.*;
import java.awt.*;


public class CharectarCreationGUI extends JFrame  {

       public static void start(){

           JFrame CharectarWindow = new JFrame("Create Your Adventurer");
           GridLayout layout = new GridLayout(0,2);
           CharectarWindow.setLayout(layout);
           CharectarWindow.setSize(350,150);
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



       }}

