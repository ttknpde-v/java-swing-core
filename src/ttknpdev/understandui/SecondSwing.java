package ttknpdev.understandui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import ttknpdev.frames.MyFrames;

public class SecondSwing {

   private MyFrames myFrame;
   // private MyMathLogic mathLogic;
   private JButton countWordsButton;
   private JLabel labelWordsLength, labelChar;
   private JTextArea textAreaInput;

   public SecondSwing() {
      myFrame = new MyFrames("exercise count words");
      myFrame.setResizable(true);
      // mathLogic = new MyMathLogic();

      labelWordsLength = new JLabel();
      labelChar = new JLabel();
      labelWordsLength.setBounds(85, 50, 120, 30);
      labelChar.setBounds(195, 50, 120, 30);

      labelWordsLength.setText("Words : ");
      labelChar.setText("Character : ");

      countWordsButton = new JButton("count");
      countWordsButton.setBounds(100, 100, 120, 30);

      textAreaInput = new JTextArea();
      textAreaInput.setBounds(60, 150, 200, 200);

      myFrame.add(countWordsButton);
      myFrame.add(labelWordsLength);
      myFrame.add(labelChar);
      myFrame.add(textAreaInput);
      
      countWordsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String result[] = countWords(textAreaInput.getText());
                labelWordsLength.setText(result[0]);
                labelChar.setText(result[1]);
            }
            
            public String[] countWords(String text) {
               String words[] = text.split("\s"); // cut free space
               return new String[]{"Words : "+words.length,"Char : "+text.length()};
           }

        });
   }

}
