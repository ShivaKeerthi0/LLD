package Builder;

public class EngineerStudentBuilder  extends StudentBuilder{


    public StudentBuilder setCourse(){
        this.course = "Engineering";

        return this;
    }
}
