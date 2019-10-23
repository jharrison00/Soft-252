package unidemo.unipeoplemodel;

public class Student extends UniPeople {
    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    public void attendClass() {
        String studentName = this.name;
        String courseCode = course.getCode();
        String courseRoom = course.getRoom();
        System.out.printf("%s is attending %s in room %s\n"
                ,studentName,courseCode,courseRoom);
    }
    
    public void doCoursework(){
        String studentName = this.name;
        String courseCoursework = course.getCoursework();
        if (courseCoursework != null) {
                    System.out.printf("%s is doing coursework %s"
                            ,studentName,courseCoursework);
        }
    }
    
}
