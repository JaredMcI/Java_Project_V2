import javax.swing.*;
import java.awt.*;


public class CharectarCreationGUI extends JFrame  {

       public void start(){

           JFrame CharectarWindow = new JFrame("Create Your Adventurer");
           FlowLayout layout = new FlowLayout();
           CharectarWindow.setLayout(layout);
           setSize(400,400);
           setVisible(true);


           JLabel Name =new JLabel();
           Name.setText("Name");
           add(Name);
           JTextField NameInput = new JTextField();
           add(NameInput);


           JLabel Height =new JLabel();
           Name.setText("Height:");
           add(Height);
           JTextField HeightInput = new JTextField();
           add(HeightInput);


           JLabel StartWeapon =new JLabel();
           Name.setText("Starting Weapon:");
           add(StartWeapon);
           JTextField StartWeaponInput = new JTextField();
           add(StartWeaponInput);


           JLabel Vulnerability =new JLabel();
           Name.setText("Vulnerability");
           add(Vulnerability);
           JTextField VulnerabilityInput = new JTextField();
           add(VulnerabilityInput);

       }}

