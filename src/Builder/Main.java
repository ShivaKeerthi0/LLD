package Builder;

public class Main {

    public static void  main(String[] args){

        URLBuilder b = new URLBuilder();

        String url = b.protocol("http://")
                .hostname("localhost")
                .pathParam("/getResturant?").queryParam("&resId=1").URL();
        System.out.println(url);
    }
}
