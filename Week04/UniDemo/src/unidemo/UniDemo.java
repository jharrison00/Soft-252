package unidemo;

import unidemo.unipeoplemodel.Admin;
import unidemo.unipeoplemodel.Lecturer;
import unidemo.unipeoplemodel.Student;

public class UniDemo {

    public static void main(String[] args) {
        //Create a new lecturer
        Lecturer teacher = new Lecturer("Lecturer1",1);

        //Create a new student
        Student student = new Student("Student1",2);
        //Create a course
        Course course = new Course();
        //Print details of the student and teacher
        Admin ad = new Admin();
        ad.getDetails(student);
        ad.getDetails(teacher);

    }
    
}
