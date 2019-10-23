package unidemo.unipeoplemodel;

import unidemo.Course;

public abstract class UniPeople {

    protected Course course;
    protected int id;
    protected String name;
    
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
