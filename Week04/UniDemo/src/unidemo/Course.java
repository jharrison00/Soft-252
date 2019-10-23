
package unidemo;

import unidemo.unipeoplemodel.Lecturer;

public class Course {

    private String code = "Unknown";
    private Lecturer teacher;
    private String coursework = "Unknown";
    private String room = "Unknown";
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Lecturer getTeacher() {
        return teacher;
    }

    public void setTeacher(Lecturer teacher) {
        this.teacher = teacher;
    }


    public String getCoursework() {
        return coursework;
    }

    public void setCoursework(String coursework) {
        this.coursework = coursework;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

}
