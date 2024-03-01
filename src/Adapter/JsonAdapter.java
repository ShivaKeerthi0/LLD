package Adapter;

public class JsonAdapter extends  Adapter{

    private LegacyCode lc;
    JsonAdapter(LegacyCode lc){
        this.lc= lc;
    }
    public String giveData(){

        String data = lc.giveData();

        // logic to convert data to json;

        return "returned Json Data";

    }
}
