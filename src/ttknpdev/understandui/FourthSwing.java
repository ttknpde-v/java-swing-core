package ttknpdev.understandui;

import java.awt.Checkbox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import ttknpdev.frames.MyFrames;

public class FourthSwing {

   private MyFrames myFrame;
   // We usually add radio buttons in a ButtonGroup so that we can select only one radio button at a time.
   // ButtonGroup() : Use to create a group, in which we can add JRadioButton. We can select only one JRadioButton in a ButtonGroup.
   private ButtonGroup buttonGroupGender;
   private JRadioButton radioButtonMale, radioButtonFemale;
   private JButton buttonSubmit;
   private JLabel labelTitle;
   private JPasswordField passwordFieldInput;
   private Checkbox checkbox1, checkbox2, checkbox3;

   public FourthSwing() {
      // workWithRadioButton();
      // workWithCheckBox();
      workWithPasswordField();
   }

   public void workWithRadioButton() {
      myFrame = new MyFrames("exercise work with radio button");
      myFrame.setResizable(true);

      labelTitle = new JLabel();
      labelTitle.setText("Gender");
      labelTitle.setBounds(30, 50, 120, 50);

      radioButtonFemale = new JRadioButton();
      radioButtonFemale.setBounds(120, 50, 120, 50);
      radioButtonMale = new JRadioButton();
      radioButtonMale.setBounds(250, 50, 80, 50);

      buttonSubmit = new JButton("submit");
      buttonSubmit.setBounds(150, 150, 80, 30);

      buttonGroupGender = new ButtonGroup();
      // Adding "jRadioButton1" and "jRadioButton3" in a Button Group
      buttonGroupGender.add(radioButtonFemale);
      buttonGroupGender.add(radioButtonMale);

      myFrame.add(radioButtonFemale);
      myFrame.add(radioButtonMale);
      myFrame.add(buttonSubmit);
      myFrame.add(labelTitle);

      buttonSubmit.addActionListener(event -> {
         if (radioButtonMale.isSelected()) {
            JOptionPane.showMessageDialog(null, "you're the male");
         } else if (radioButtonFemale.isSelected()) {
            JOptionPane.showMessageDialog(null, "you're the female");
         }
      });
   }

   // private String choose ="";
   public void workWithCheckBox() {
      myFrame = new MyFrames("exercise test CheckBox class");
      myFrame.setResizable(true);

      labelTitle = new JLabel();
      labelTitle.setText("Language you use");
      labelTitle.setBounds(50, 0, 200, 15);

      checkbox1 = new Checkbox();
      checkbox2 = new Checkbox();
      checkbox3 = new Checkbox("C,C++", true);
      checkbox3.setBounds(200, 15, 100, 100);

      checkbox1.setLabel("Java");
      checkbox1.setBounds(0, 15, 100, 100);
      checkbox2.setLabel("Kotlin");
      checkbox2.setState(true); // set state like set active
      checkbox2.setBounds(100, 15, 100, 100);

      buttonSubmit = new JButton("send");
      buttonSubmit.setBounds(0, 80, 250, 250);

      myFrame.add(checkbox1);
      myFrame.add(checkbox2);
      myFrame.add(checkbox3);
      myFrame.add(labelTitle);
      myFrame.add(buttonSubmit);

      // String choose = "";
      checkbox1.addItemListener(new ItemListener() {
         // no lambda
         @Override
         public void itemStateChanged(ItemEvent e) {
            labelTitle.setText("Java is clicked Right?");
            // System.out.println(e.getStateChange());
            System.out.println(e.getItem());
            // choose += "Java";
         }
      });

      checkbox2.addItemListener(item -> {
         labelTitle.setText("Kotlin is clicked Right?");
         // System.out.println(item.getStateChange());
         System.out.println(item.getItem());
         // choose += "Kotlin";
      });

      checkbox3.addItemListener(item -> {
         labelTitle.setText("C,C++ is clicked Right?");
         System.out.println(item.getItem());
         // System.out.println(item.getItemSelectable());
         // choose += "C,C++";
      });

      // System.out.println(choose);
      // labelTitle.setText(choose);
      buttonSubmit.addActionListener(action -> {
         if (checkbox1.getState()) { // when true will do
            System.out.println("Java");
         }
         if (checkbox2.getState()) { // continue will do if true
            System.out.println("Kotlin");
         }
         if (checkbox3.getState()) { // too
            System.out.println("C,C++");
         }
         // end
      });
   }

   public void workWithPasswordField() {
      myFrame = new MyFrames("exercise test JPasswordField");
      myFrame.setResizable(true);

      JLabel labelUsername = new JLabel();
      JLabel labelPassword = new JLabel();

      JTextField textFieldUsername = new JTextField();
      passwordFieldInput = new JPasswordField();

      labelUsername.setText("Username");
      labelPassword.setText("Password");

      labelUsername.setBounds(0, 10, 60, 30);
      textFieldUsername.setBounds(70, 10, 100, 30);

      labelPassword.setBounds(0, 50, 60, 30);
      // **
      passwordFieldInput.setBounds(70, 50, 100, 30);

      myFrame.add(labelUsername);
      myFrame.add(labelPassword);
      myFrame.add(textFieldUsername);
      myFrame.add(passwordFieldInput);

      buttonSubmit = new JButton("send");
      buttonSubmit.setBounds(0, 80, 100, 50);

      myFrame.add(buttonSubmit);

      buttonSubmit.addActionListener((e) -> {
         System.out.println(textFieldUsername.getText());
         System.out.println(passwordFieldInput.getPassword());
         JOptionPane.showConfirmDialog(myFrame, "Username : " + textFieldUsername.getText() + "\n"
                 + "Password : " + Arrays.toString(passwordFieldInput.getPassword()) + "\nRight", "let's confirm", JOptionPane.DEFAULT_OPTION);
      });
   }
}
