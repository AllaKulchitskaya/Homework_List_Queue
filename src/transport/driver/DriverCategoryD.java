package transport.driver;

import transport.Bus;

public class DriverCategoryD extends Driver<Bus> {
    public DriverCategoryD(String name, boolean doesHaveDriverLicense, int experience) {
        super(name, doesHaveDriverLicense, experience);
    }

    @Override
    public void startMoving(Bus transport) {
        transport.startMoving();
    }

    @Override
    public void stopMoving(Bus transport) {
        transport.stopMoving();
    }

    @Override
    public void refillTransport(Bus transport) {
        System.out.println("Водитель " + getName() + " должен заправить автобус");
    }
}
