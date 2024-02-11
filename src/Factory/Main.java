package Factory;

public class Main {

    public static  void main(String args[]){

        VehicleFactory vf = new Factory();

        Vehicle vehicle = vf.factory(4);

        vehicle.printVehicleInfo();
    }

}
