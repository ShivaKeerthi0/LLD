package Composite.WithoutPattern;

public class Main {

    public static void main(String args[]){

        File firstFile = new File("firstFile");
        Directory firstDirectory = new Directory("firstDirectory");
        File secondFile = new File("secondFile");
        firstDirectory.add(secondFile);
        firstFile.ls();
        firstDirectory.ls();
    }
}
