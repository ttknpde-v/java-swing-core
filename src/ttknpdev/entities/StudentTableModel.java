package ttknpdev.entities;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import ttknpdev.understandui.SixthSwing;

public class StudentTableModel extends AbstractTableModel {

   private List<Student> students = new ArrayList<>();
   
   private final String[] columnNames = new String[]{ // set columns
      "Fullname", "Age", "Year", "GPA"
   };

   private final Class[] columnClass = new Class[]{ // set type of each fields
      String.class, Short.class, Short.class, Float.class
   };

   public StudentTableModel(List<Student> students) {
      this.students = students;
      // fireTableDataChanged();
   }

   @Override
   public Class<?> getColumnClass(int columnIndex) {
      return columnClass[columnIndex]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
   }

   @Override
   public String getColumnName(int column) {
      return columnNames[column]; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
   }

   @Override
   public int getRowCount() {
      // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      return students.size();
   }

   @Override
   public int getColumnCount() {
      // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      return columnNames.length;
   }

   @Override
   public Object getValueAt(int rowIndex, int columnIndex) {
      // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      Student student = students.get(rowIndex);
      switch (columnIndex) {
         case 0:
            return student.getFullname();
         case 1:
            return student.getAge();
         case 2:
            return student.getYear();
         case 3:
            return student.getGpa();
         default:
            break;
      }
      return null;
   }
   
   public void removeRow() {
      try {
         students.remove(students.size()-1);
      } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "there were no data in your table", "warning", JOptionPane.WARNING_MESSAGE);
         throw new RuntimeException(e.getMessage());
      }
    }

}
