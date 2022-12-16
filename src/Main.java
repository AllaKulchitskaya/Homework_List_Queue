import transport.*;
import transport.driver.DriverCategoryB;
import transport.driver.DriverCategoryC;
import transport.driver.DriverCategoryD;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DriverCategoryB igor = new DriverCategoryB("Комаров Игорь Андреевич",
                true, 10);
        DriverCategoryB petr = new DriverCategoryB("Васнецов Петр Игоревич", true, 15);
        DriverCategoryC alexey = new DriverCategoryC("Власов Алексей Васильевич",
                true, 12);
        DriverCategoryC oleg = new DriverCategoryC("Пасечников Олег Федорович", true, 23);
        DriverCategoryD anatoly = new DriverCategoryD("Ирисов Анатолий Александрович",
                true, 19);
        DriverCategoryD grigory = new DriverCategoryD("Долохов Григорий Александрович", true, 18);

        Mechanic<Car> vladimir = new Mechanic<Car>("Коростылев Владимир", "Компания1");
        Mechanic<Transport> fedor = new Mechanic<>("Воробьев Федор", "Компания2");
        Mechanic<Bus> michail = new Mechanic<>("Евтушенко Михаил", "Компания3");
        Mechanic<Truck> leonid = new Mechanic<>("Руденко Леонид", "Компания 4");
        Mechanic<Transport> dmitry = new Mechanic<>("Горбенко Дмитрий", "Компания5");

        Sponsor sponsor1 = new Sponsor("Острикова Инна Владимировна", 4_000_000);
        Sponsor sponsor2 = new Sponsor("Компания noname", 1_000_000);
        Sponsor sponsor3 = new Sponsor("Яковлев Алексей Сергеевич", 3_000_000);

        Car kia = new Car("KIA", "Soul", 2);
        kia.addDriver(igor);
        kia.addMechanic(vladimir, fedor);
        kia.addSponsor(sponsor1, sponsor3);
        Car corvette = new Car("Chevrolet Corvette", "C6", 6.2);
        corvette.addDriver(petr);
        corvette.addMechanic(vladimir);
        corvette.addSponsor(sponsor2, sponsor3);
        Truck valdai = new Truck("Валдай", "Next", 2.8);
        valdai.addDriver(alexey);
        valdai.addMechanic(leonid);
        valdai.addSponsor(sponsor1);
        Truck dongFeng = new Truck("DongFeng", "Captain-T", 2.2);
        dongFeng.addDriver(oleg);
        dongFeng.addMechanic(leonid, dmitry);
        dongFeng.addSponsor(sponsor3, sponsor2);
        Bus hyundai = new Bus("Hyundai", "Aero Town", 7.5);
        hyundai.addDriver(anatoly);
        hyundai.addMechanic(michail, dmitry);
        hyundai.addSponsor(sponsor1);
        Bus volvo = new Bus("Volvo", "8900", 7.7);
        volvo.addDriver(grigory);
        volvo.addMechanic(michail, fedor);
        volvo.addSponsor(sponsor2, sponsor3);

        List<Transport> transports = List.of(kia, corvette,
                valdai, dongFeng,
                hyundai, volvo);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addCar(kia);
        serviceStation.addCar(corvette);
        serviceStation.addTruck(valdai);
        serviceStation.addTruck(dongFeng);
        serviceStation.serviceTransport();


        for (Transport transport : transports) {
            printRaceInformation(transport);
        }
    }

    private static void printRaceInformation(Transport transport) {
        System.out.println("Автомобиль " + transport.getBrand() + ", водитель: " + transport.getDrivers() +
                ", механики: " + transport.getMechanics() + ", спонсоры: " + transport.getSponsors());
    }
}