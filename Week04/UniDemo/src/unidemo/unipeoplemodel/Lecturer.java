package unidemo.unipeoplemodel;

public class Lecturer extends UniPeople implements ITeach{

    @Override
    public void setCourseWork(String coursework) {
        if (course != null) {
            this.course.setCoursework(coursework);   
        }            
    }

    @Override
    public void teach() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }


    
}
