package ttknpdev.understandui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import ttknpdev.frames.MyFrames;
import ttknpdev.log.MyLog;

public class FirstSwing implements ActionListener{

   private MyFrames myFrame;
   private JLabel labelA, labelB, labelOutput;
   private JTextField textFieldA, textFieldB;
   private JButton plusButton, minusButton, divideButton, multipleButton;

   public FirstSwing() {
            
      plusButton = new JButton();
      minusButton = new JButton();
      divideButton = new JButton();
      multipleButton = new JButton();

      textFieldA = new JTextField();
      textFieldB = new JTextField();

      labelA = new JLabel();
      labelB = new JLabel();
      labelOutput = new JLabel();
      
      MyLog.log.info("created objects");
   }
   
   public void plusNumber () {

        myFrame = new MyFrames("exercise plus two numbers");
        myFrame.setResizable(true);
        
        Font font = new Font("Serif", Font.BOLD, 14);

        // createObjectsOfPlusNumber(); // this case is good

        // set text of JButton
        plusButton.setText("+");
        minusButton.setText("-");
        divideButton.setText("/");
        multipleButton.setText("x");
        // set bounds of JButton
        plusButton.setBounds(0,100,50,50);
        minusButton.setBounds(70,100,50,50);
        divideButton.setBounds(140,100,50,50);
        multipleButton.setBounds(210,100,50,50);


        // set any details for JLabel component
        labelA.setFont(font);
        labelA.setText("Put some integer : ");
        labelA.setSize(130,40);
        labelA.setHorizontalAlignment(SwingConstants.CENTER);

        labelB.setText("Put some integer : ");
        labelB.setBounds(0,50,130,40);
        labelB.setFont(font);
        labelB.setHorizontalAlignment(SwingConstants.CENTER);

        labelOutput.setFont(new Font("Serif", Font.BOLD, 35));
        labelOutput.setBounds(0,160,300,40);
        labelOutput.setText("500 + 5 = 505");

        textFieldA.setBounds(130,5,50,30);
        textFieldB.setBounds(130,55,50,30);

        // add any components to JFrame
        myFrame.add(labelA); myFrame.add(labelB);
        myFrame.add(textFieldA); myFrame.add(textFieldB);
        myFrame.add(plusButton); myFrame.add(minusButton); myFrame.add(divideButton); myFrame.add(multipleButton);


        plusButton.addActionListener(this::actionPerformed);
        minusButton.addActionListener(this::actionPerformed);
        divideButton.addActionListener(this::actionPerformed);
        multipleButton.addActionListener(this::actionPerformed);

    }
   
    @Override
    public void actionPerformed(ActionEvent e) {

        // MyLog.secondSwingGUI.info("is clicked");

        Object source = e.getSource();
        MyLog.log.info(source); //  javax.swing.JButton[,210,100,50x50,alignmentX=0.0,alignmentY=0.5,border=javax.swing.plaf.BorderUIResource$CompoundBorderUIResource@7a5029eb,flags=296,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,disabledSelectedIcon=,margin=javax.swing.plaf.InsetsUIResource[top=2,left=14,bottom=2,right=14],paintBorder=true,paintFocus=true,pressedIcon=,rolloverEnabled=true,rolloverIcon=,rolloverSelectedIcon=,selectedIcon=,text=x,defaultCapable=true]
        String textResult = "";
        // convert string to float
        Float a = Float.valueOf(textFieldA.getText());
        Float b = Float.valueOf(textFieldB.getText());


        if (source == plusButton) {

            textResult+= textFieldA.getText()+" + "+textFieldB.getText()+" = "+(a+b);

        }
        else if (source == minusButton) {

            textResult+= textFieldA.getText()+" - "+textFieldB.getText()+" = "+(a-b);

        }
        else if (source == divideButton) {

            textResult+= textFieldA.getText()+" / "+textFieldB.getText()+" = "+(a/b);


        }
        else if (source == multipleButton) {

            textResult+= textFieldA.getText()+" x "+textFieldB.getText()+" = "+(a*b);


        }

        labelOutput.setText(textResult);
        myFrame.add(labelOutput);

    }
    
}
