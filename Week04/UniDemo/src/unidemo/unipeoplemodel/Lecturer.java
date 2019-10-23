package unidemo.unipeoplemodel;

import unidemo.Course;

public class Lecturer extends UniPeople implements ITeach{

    @Override
    public void setCourseWork(String coursework) {
        if (course != null) {
            this.course.setCoursework(coursework);   
        }            
    }

    @Override
    public void teach() {       
        String objectName = this.getName();
        Course objectCourse = this.getCourse();
        String objectCode = objectCourse.getCode();
        String objectRoom = objectCourse.getRoom();
        System.out.printf("%s is teaching %s in "
                + "room %s",objectName,objectCode,objectRoom);
    }
    
}
