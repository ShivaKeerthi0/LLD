package Builder;

public class Main {

    public static void  main(String[] args){

//        URLBuilder b = new URLBuilder();
//
//        String url = b.protocol("http://")
//                .hostname("localhost")
//                .pathParam("/getResturant?").queryParam("&resId=1").URL();
//        System.out.println(url);


        StudentBuilder sb = new EngineerStudentBuilder();

        Student engineeringStudentOne = sb.setAge(29).setRoll(123).build();
        Student engineeringStudentTwo = sb.setRoll(234).setFname("Shiva").setLname("Keerthi").build();
        engineeringStudentTwo.getDetails();
    }
}
