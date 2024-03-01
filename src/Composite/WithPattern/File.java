package Composite.WithPattern;

public class File extends  FileSystem{
    public String filename = "";
    File(String name){
        this.filename = name;
    };

    public void ls(){
        System.out.println(filename);
    }
}
