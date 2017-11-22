import javax.swing.*;
import java.awt.*;

public class StoryGUI extends JFrame {

    public static void start(String text)
    {


        JFrame StoryFrame = new JFrame("Event");
        StoryFrame.setSize(500, 500);
        StoryFrame.setVisible(true);
        StoryFrame.getContentPane().setBackground(Color.BLACK);

        JPanel StoryPanel = new JPanel();
        StoryPanel.setSize(400,300);
        StoryPanel.setLocation(50,200);
        JLabel Story = new JLabel(text);
        StoryPanel.add(Story);
        StoryPanel.setBackground(Color.orange);

        StoryFrame.add(StoryPanel);



    }
}
