package unidemo.unipeoplemodel;

import unidemo.Course;

public class Admin {
    public void assignCourse(UniPeople person,Course course){
        person.setCourse(course);
        if (person instanceof Lecturer) { 
            course.setTeacher((Lecturer) person); //Casts person into class type Lecturer
        }
    }

    public void getDetails(UniPeople person){
            String name = person.getName();
            int id = person.getId();
            Course course = person.getCourse();
            if (course != null) {
                String courseCode = course.getCode();
                System.out.printf("Name: %s %n ID: %i %n Course: %s"
                        ,name,id,courseCode);
            }
            else {
                System.out.printf("Name: %s %nID: %i %nCourse: N/A"
                        ,name,id);
            }

            
            
    }
}
