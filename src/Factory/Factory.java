package Factory;

public class Factory  extends  VehicleFactory{

    public Vehicle factory(int wheels){
        if(wheels == 2){
            return  new Twowheeler();
        } else if (wheels ==4) {

            return new Fourwheeler();
        }

        return new Twowheeler() ;
    }
}
