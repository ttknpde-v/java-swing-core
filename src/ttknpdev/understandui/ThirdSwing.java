package ttknpdev.understandui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import ttknpdev.frames.MyFrames;

public class ThirdSwing {

   private MyFrames myFrame;
   private JButton button1, button2;
   private JLabel imageLabel;
   private ImageIcon imageJava, imageGit;

   public ThirdSwing() {
      myFrame = new MyFrames("exercise change image");
      myFrame.setResizable(true);
      
      button1 = new JButton("java icon image");
      button1.setBounds(0, 10, 120, 30);

      button2 = new JButton("git icon image");
      button2.setBounds(160, 10, 120, 30);

      // imageIcon =  new ImageIcon("B:\\practice-java-one\\LearnJavaCore\\lab-understand-java-gui\\lab-understand-java-gui\\images\\java.png");
      // way to create image icon and resize it
      Image imagePath1,imagePath2;
      imagePath1 = new ImageIcon("B:\\practice-java-two-netbeans\\sample-netbeans-for-gui\\images\\java.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
      imagePath2 = new ImageIcon("B:\\practice-java-two-netbeans\\sample-netbeans-for-gui\\images\\git.png").getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);

      imageJava = new ImageIcon(imagePath1);
      imageGit = new ImageIcon(imagePath2);

      imageLabel = new JLabel(); // label for image
      // imageLabel.setIcon(imageGit);

      button1.addActionListener(action -> {
         imageLabel.setIcon(imageJava);
      });

      button2.addActionListener(action -> {
         imageLabel.setIcon(imageGit);
      });

      imageLabel.setBounds(0, 60, 150, 150);

      myFrame.add(button1); myFrame.add(button2);
      myFrame.add(imageLabel);
   }

}
