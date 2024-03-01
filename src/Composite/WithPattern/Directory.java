package Composite.WithPattern;

import Composite.WithoutPattern.File;

import java.util.ArrayList;

public class Directory extends FileSystem{
    public ArrayList<FileSystem> contents;  // Here we initiated with Object because it may contain a file or directory;

    public String directoryName ="";
    Directory (String name){
        contents =   new ArrayList();
        this.directoryName = name;

    }
    public void add(FileSystem content){

        contents.add(content);

    }

    // here the issue is that the object may be file or directory that is the main issue.
    public void ls (){
        System.out.println("Directory Name is : "+ this.directoryName);
        for(FileSystem content : contents){
            content.ls();
        }
    }
}
