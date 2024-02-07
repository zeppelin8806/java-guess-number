package demos;

import demos.vehicle.*;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    public static void main(String[] args) {

        Car myCivic = new Car("silver", 4);
        RacingCar ferrari = new RacingCar("red", 4);
        Bicycle kona = new Bicycle("blue", 2);

        /*
         * Polymorphism with Inheritance
         */
        List<Vehicle> myVehicles = new ArrayList<>();
        myVehicles.add(myCivic);
        myVehicles.add(ferrari);
        myVehicles.add(kona);

        myCivic.park();
        myVehicles.get(0).getColor();

        // The first object is a Car, but park() can't be used
        // because myVehicles holds a list of Vehicle, which doesn't
        // have a park() method.
        //myVehicles.get(0).park();

        /*
         * Polymorphism with Interfaces
         */
        List<Drivable> drivableThings = new ArrayList<>();
        drivableThings.add(myCivic);
        drivableThings.add(ferrari);

        // A Bicycle object doesn't implement the Drivable interface
        // so it can't be added to List<Drivable>
        //drivableThings.add(kona);

        // Can add this b/c all objects here are grouped
        // by the Drivable interface they all implement
        drivableThings.add(new HotAirBalloon());

        drivableThings.get(0).drive();
        //drivableThings.get(0).park();
    }
}
