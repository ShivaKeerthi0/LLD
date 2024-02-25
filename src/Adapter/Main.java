package Adapter;

public class Main {

    public static void main(String [] args){

        // We are assuming that the client requires data in json

        LegacyCode lc = new LegacyCode(); // This generally returns data in xml

        Adapter jsonAdapater = new JsonAdapter(lc);


       System.out.println(jsonAdapater.giveData()); // As we used JsonAdapter the output data is in form of Json

    }
}
