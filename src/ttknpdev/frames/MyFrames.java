package ttknpdev.frames;

import java.awt.HeadlessException;
import javax.swing.JFrame;
public class MyFrames extends JFrame{
   public MyFrames(String title) throws HeadlessException {
        super(title);
        // setLocation(250, 285); // location frame when created
        setSize(600,500);  // width , height
        // setLayout(null); // using no layout managers // did not good for netbeans (when use ui did not show)
        setVisible(true); // making the frame visible (adj. มองเห็นได้)
        setResizable(false); // set JFrame that can not change size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set JFrame that any user clicked then JFrame it closed
   }

}
