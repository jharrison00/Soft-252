package unidemo.unipeoplemodel;

import unidemo.Course;


public class Student extends UniPeople {
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    String studentName = this.getName();
    Course studentCourse = this.getCourse();

    
    public void attendClass() {
        String courseCode = studentCourse.getCode();
        String courseRoom = studentCourse.getRoom();
        System.out.printf("%s is attending %s in room %s"
                ,studentName,courseCode,courseRoom);
    }
    
    public void doCoursework(){
        String courseCoursework = studentCourse.getCoursework();
        if (courseCoursework != null) {
                    System.out.printf("%s is doing coursework %s"
                            ,studentName,courseCoursework);
        }
    }
    
}
