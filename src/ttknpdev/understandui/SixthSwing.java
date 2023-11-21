package ttknpdev.understandui;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import ttknpdev.entities.Student;
import ttknpdev.entities.StudentTableModel;
import ttknpdev.frames.MyFrames;
import ttknpdev.log.MyLog;

public class SixthSwing implements ActionListener, ListSelectionListener {

   // understand Jtable 
   private final MyFrames frame;
   private JTable jTable;
   private JScrollPane jScrollPane;
   private StudentTableModel studentTableModel;
   private List<Student> students;

   public SixthSwing() {
      jTable = new JTable();
      jScrollPane = new JScrollPane();
      studentTableModel = new StudentTableModel(null);
      frame = new MyFrames("testing Jtable component");
   }

   private void understandJTable1() {

      String data[][] = {
         {"101", "Amit", "670000"},
         {"102", "Jai", "780000"},
         {"101", "Sachin", "700000"}
      };

      String column[] = {"ID", "NAME", "SALARY"};

      jTable = new JTable(data, column);

      jScrollPane = new JScrollPane(jTable);

      frame.add(jScrollPane);
      frame.setResizable(true);
      frame.setSize(400, 400);
   }

   // for entity 1
   private void understandJTableWithEntity1() {
      frame.setVisible(true);
      jTable.setModel(studentTableModel);
      jScrollPane.getViewport().add(jTable);
      frame.add(jScrollPane);
      frame.setResizable(true);
      frame.setSize(400, 400);
      
      JButton jButtonRemove = new JButton("remove last student");
      jButtonRemove.setBounds(0, 500, 60, 60);
      // frame.setLayout(new GridLayout());
      frame.add(jButtonRemove, BorderLayout.SOUTH);
      jButtonRemove.addActionListener(this);
   }

   public void reset() {
       jScrollPane.getViewport().add(jTable);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      // studentTableModel.remove();
      System.out.println("clicked");
      // students.remove(students.size()-1); work!
      studentTableModel.removeRow();
      // understandJTableWithEntity1();
      reset();
   }

   // for entity 2
   public void understandJTableWithEntity2() {
      Student s1 = new Student("Peter Parker", (short) 23, (short) 4, 2.6F);
      Student s2 = new Student("Adam Ryder", (short) 20, (short) 3, 3.1F);
      students = new ArrayList<>();
      students.add(s1);
      students.add(s2);
      studentTableModel = new StudentTableModel(students);

      jTable = new JTable();
      jTable.setModel(studentTableModel);
      jTable.setCellSelectionEnabled(true); // can selected once field

      ListSelectionModel selectionModel;
      selectionModel = jTable.getSelectionModel();
      selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      selectionModel.addListSelectionListener(this::valueChanged);

      jScrollPane = new JScrollPane(jTable);
      //jScrollPane.setSize(300, 100);
      jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

      //jScrollPane.setBounds(100,100, 50,100);
      frame.setResizable(true);
      frame.setSize(300, 300);
      frame.add(jScrollPane);
   }

   @Override
   public void valueChanged(ListSelectionEvent e) {
      // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      MyLog.log.warn("runed");
      Object data = null;
      int[] row = jTable.getSelectedRows();
      int[] columns = jTable.getSelectedColumns();
      for (int i = 0; i < row.length; i++) {
         MyLog.log.info("first loop for row lenght ");
         for (int j = 0; j < columns.length; j++) {
            MyLog.log.info("second loop for columns lenght ");
            data = jTable.getValueAt(row[i], columns[j]);
         }
      }
      MyLog.log.info("element " + data + "selected");
   }

   public static void main(String[] args) {
      new SixthSwing().understandJTableWithEntity1();
   }
}
