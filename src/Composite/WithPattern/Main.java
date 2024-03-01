package Composite.WithPattern;

import Composite.WithPattern.Directory;
import Composite.WithPattern.File;

public class Main {

    public static void main(String args[]){

        FileSystem firstFile = new File("firstFile");
        Directory firstDirectory = new Directory("firstDirectory");
        FileSystem secondFile = new File("secondFile");
        firstDirectory.add(secondFile);
        firstFile.ls();
        firstDirectory.ls();
    }
}

