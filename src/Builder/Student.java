package Builder;

public class Student {

    private int age ;
    private String fname;
    private String lname;
    private int roll;

    private String course;
    Student(StudentBuilder sb){
        this.fname = sb.fname;
        System.out.println(sb.fname + " " + this.fname);
        this.lname = sb.lname;
        this.age = sb.age;
        this.course = sb.course;
    }

    public void getDetails(){
        System.out.println("My name is "+this.fname +" "+ this.lname);
        System.out.println("My age is "+this.age);
    }
}
