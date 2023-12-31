/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ttknpdev.understandgui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ttknpdev.frames.MyFrames;
/**
 *
 * @author User
 */
public class FirstGUISwing extends javax.swing.JPanel implements ActionListener {

   /**
    * Creates new form FirstGUISwing
    */
   
   public FirstGUISwing() {
      
      initComponents();
   }
   
   /**
    * This method is called from within the constructor to
    * initialize the form. WARNING: Do NOT modify this code.
    * The content of this method is always regenerated by
    * the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabelTitle = new javax.swing.JLabel();
      jTextFieldNumber = new javax.swing.JTextField();
      jLabelResult = new javax.swing.JLabel();
      jButtonTable = new javax.swing.JButton();

      jLabelTitle.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
      jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabelTitle.setText("Multiple Table");
      jLabelTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
      jLabelTitle.setFocusable(false);
      jLabelTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
      jLabelTitle.setPreferredSize(new java.awt.Dimension(355, 38));

      jTextFieldNumber.setFont(new java.awt.Font("sansserif", 1, 38)); // NOI18N
      jTextFieldNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      jTextFieldNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

      jLabelResult.setFont(new java.awt.Font("sansserif", 1, 19)); // NOI18N
      jLabelResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabelResult.setToolTipText("");
      jLabelResult.setVerticalAlignment(javax.swing.SwingConstants.TOP);
      jLabelResult.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

      jButtonTable.setFont(new java.awt.Font("sansserif", 1, 19)); // NOI18N
      jButtonTable.setText("click");
      jButtonTable.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(95, 95, 95)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jLabelResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(94, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(jButtonTable, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(203, 203, 203))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(225, 225, 225))))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(45, 45, 45)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(29, 29, 29)
            .addComponent(jTextFieldNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(28, 28, 28)
            .addComponent(jLabelResult, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButtonTable, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(23, Short.MAX_VALUE))
      );
   }// </editor-fold>//GEN-END:initComponents


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButtonTable;
   private javax.swing.JLabel jLabelResult;
   private javax.swing.JLabel jLabelTitle;
   private javax.swing.JTextField jTextFieldNumber;
   // End of variables declaration//GEN-END:variables

   public static void main(String[] args) {
      FirstGUISwing firstGUISwingObj = new FirstGUISwing();
      MyFrames myFrame = new MyFrames("testing");
      myFrame. setSize(545,600); 
      myFrame.setContentPane(firstGUISwingObj); 
      // firstGUISwingObj.jLabelResult.setText(testTable());
      // work !!
      // You can add content panel by generate this class (new object of this class)
      // add use setContentPane(<object this class>) 
      firstGUISwingObj.display();
   }
   public void display() {
      jButtonTable.addActionListener(this);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      try {
         Integer tableNumber = Integer.parseInt(jTextFieldNumber.getText());
         String table = testTable(tableNumber);
         jLabelResult.setText(table);

      } catch (Exception exception) {
         JOptionPane.showMessageDialog(this, "Your input. It was may wrong!!","Found something",JOptionPane.WARNING_MESSAGE);
      }
   }
   
   public String testTable(int n) {
      String table = "<html><p>";
      for (int i = 1; i <= 8; i++) {
         table+=n+" x "+i+" = "+(n*i)+"<br>";
      }
      table+="</p></html>";
      return table;
   }
}
