package Builder;

public class MBAStudentBuilder extends  StudentBuilder{

    public MBAStudentBuilder setCourse(){
        this.course = "MBA";
        return this;
    }
}
