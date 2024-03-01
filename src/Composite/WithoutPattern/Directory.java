package Composite.WithoutPattern;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Directory {

    public ArrayList<Object> contents;  // Here we initiated with Object because it may contain a file or directory;

    public String directoryName ="";
    Directory (String name){
        contents =   new ArrayList();
        this.directoryName = name;

    }
    public void add(Object content){

        contents.add(content);

    }

    // here the issue is that the object may be file or directory that is the main issue.
    public void ls (){
        System.out.println("Directory Name is : "+ this.directoryName);
        for(Object content : contents){

            if(content instanceof  File){
                ((File) content).ls();
            } else {
                ((Directory)content).ls();
            }
        }
    }
}
