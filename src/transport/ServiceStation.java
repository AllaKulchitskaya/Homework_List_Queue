package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation {
    private final Queue<Transport> transportQueue = new ArrayDeque<>();

    private void addTransport(Transport transport) {
        transportQueue.offer(transport);
    }

    public void addCar(Car car) {
        addTransport(car);
    }

    public void addTruck(Truck truck) {
        addTransport(truck);
    }

    public void serviceTransport() {
        Transport transport = transportQueue.poll();
        if (transport != null) {
            System.out.println("Транспортное средство " + transport.getBrand() + " проходит обслуживание на станции");
            serviceTransport();
        } else {
            System.out.println("В очереди больше никого нет");
        }
    }
}
