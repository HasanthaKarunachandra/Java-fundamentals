import resource.Bus;
import resource.Car;
import resource.Van;
import resource.Vehicle;

public class Factory {
    private static Factory factory=null;

    private Factory(){}

    public static Factory getInstance(){
        if(factory==null){
            factory=new Factory();
        }
        return factory;
    }
    public Vehicle getVehicle(VehicleType vehicleType) {
        switch (vehicleType) {
            case CAR:
                return new Car();
            case BUS:
                return new Bus();
            case VAN:
                return new Van();
            default:
                return null;
        }
    }
}
