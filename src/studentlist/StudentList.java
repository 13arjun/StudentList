/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author test
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Student s1 = new Student();
        s1.setName("Arjun");
        
         Student s2 = new Student();
        s2.setName("Singh");
        
         Student s3 = new Student();
        s3.setName("Dhillon");

         Student s4 = new Student();
        s3.setName("xyz");
        
        Student[] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = s2;
        studentList[2] = s3;
        studentList[3] = s4;
        
        for (Student s: studentList){
            System.out.println(s.getName());
        }
        
        
        
    }
    
}
