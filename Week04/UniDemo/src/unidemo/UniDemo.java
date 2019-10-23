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
        course.setCode("Soft-252");
        course.setRoom("SMB-104");

        //Print details of the student and teacher
        Admin ad = new Admin();
        ad.getDetails(student);
        ad.getDetails(teacher);

        //Associate both the lecturer and the student with the course
        ad.assignCourse(teacher, course);
        ad.assignCourse(student, course);
        ad.getDetails(student);
        ad.getDetails(teacher);

    }
    
}
