package unidemo.unipeoplemodel;

import unidemo.Course;

public class Lecturer extends UniPeople implements ITeach{

    
    public Lecturer(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    @Override
    public void setCourseWork(String coursework) {
        if (course != null) {
            this.course.setCoursework(coursework);   
        }            
    }

    @Override
    public void teach() {       
        String teacherName = this.getName();
        Course teacherCourse = this.getCourse();
        String courseCode = teacherCourse.getCode();
        String courseRoom = teacherCourse.getRoom();
        System.out.printf("%s is teaching %s in "
                + "room %s",teacherName,courseCode,courseRoom);
    }

    
}
