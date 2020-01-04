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
            String courseCode;
            System.out.println("ID:"+id);
            System.out.println("Name: "+name);

            if (course != null){
            courseCode = course.getCode();
            System.out.println("Course: "+courseCode+"\n");
            }
            else
                System.out.println("Course: N/A \n");                                           
        }                       
    }
