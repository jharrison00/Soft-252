package unidemo.unipeoplemodel;

import unidemo.Course;


public class Student extends UniPeople {
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    String studentName = this.getName();
    Course studentCourse = this.getCourse();
    String courseCode = studentCourse.getCode();
    String courseRoom = studentCourse.getRoom();
    String courseCoursework = studentCourse.getCoursework();
    
    public void attendClass() {
        System.out.printf("%s is attending %s in room %s"
                ,studentName,courseCode,courseRoom);
    }
    
    public void doCoursework(){
        if (courseCoursework != null) {
                    System.out.printf("%s is doing coursework %s"
                            ,studentName,courseCoursework);
        }
    }
    
}
