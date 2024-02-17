package Builder;

public abstract class StudentBuilder {

    public int age ;
    public String fname="";
    public String lname="";
    public int roll;

    public String course="";

    public StudentBuilder setAge(int age){
        this.age =  age;
        return  this;
    }

    public StudentBuilder setFname(String fname){
        this.fname = fname;
        System.out.println(this.fname);
        return this;
    }
    public StudentBuilder setLname(String lname){
        this.lname = lname;
        return this;
    }
    public StudentBuilder setRoll(int roll){
        this.roll = roll;
        return this;
    }

    public abstract StudentBuilder setCourse();

    public Student build(){
        return new Student(this);
    }
}

