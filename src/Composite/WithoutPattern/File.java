package Composite.WithoutPattern;

public class File {

    public String filename = "";
    File(String name){
        this.filename = name;
    };

    public void ls(){
        System.out.println(filename);
    }
}
