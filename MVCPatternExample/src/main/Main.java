package main;

import model.Student;
import view.StudentView;
import controller.StudentController;

public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("1", "John Doe", "A");

        
        StudentView view = new StudentView();

        
        StudentController controller = new StudentController(student, view);

        
        controller.updateView();

      
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("B");

        
        controller.updateView();
    }
}
