package transport.driver;

import transport.Truck;

public class DriverCategoryC extends Driver<Truck> {
    public DriverCategoryC(String name, boolean doesHaveDriverLicense, int experience) {
        super(name, doesHaveDriverLicense, experience);
    }

    @Override
    public void startMoving(Truck transport) {
        transport.startMoving();
    }

    @Override
    public void stopMoving(Truck transport) {
        transport.stopMoving();
    }

    @Override
    public void refillTransport(Truck transport) {
        System.out.println("Водитель " + getName() + " должен заправить грузовик");
    }
}
