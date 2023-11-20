package ttknpdev.entities;

public class Student {

   private String fullname;
   private Short age;
   private Short year;
   private Float gpa; 
   // private String ;

   public Student(String fullname, Short age, Short year, Float gpa) {
      this.fullname = fullname;
      this.age = age;
      this.year = year;
      this.gpa = gpa;
   }

   public String getFullname() {
      return fullname;
   }

   public void setFullname(String fullname) {
      this.fullname = fullname;
   }

   public Short getAge() {
      return age;
   }

   public void setAge(Short age) {
      this.age = age;
   }

   public Short getYear() {
      return year;
   }

   public void setYear(Short year) {
      this.year = year;
   }

   public Float getGpa() {
      return gpa;
   }

   public void setGpa(Float gpa) {
      this.gpa = gpa;
   }
   
   
}
