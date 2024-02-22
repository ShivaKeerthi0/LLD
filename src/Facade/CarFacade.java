package Facade;

import java.security.PrivateKey;

public class CarFacade {

    private Engine engine;
    private FuelInjector fi;
    private Igintion ig;


    public CarFacade(){
        this.engine = new Engine();
        this.fi = new FuelInjector();
        this.ig = new Igintion();
    }

    public void startCar(){
        engine.start();
        fi.injectFuel();
        ig.ignite();
    }
}
