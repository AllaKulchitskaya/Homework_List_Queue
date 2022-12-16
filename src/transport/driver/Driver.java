package transport.driver;

import transport.StringUtils;
import transport.Transport;

public abstract class Driver <T extends Transport> {
    private final String name;
    private boolean doesHaveDriverLicense;
    private int experience;

    public Driver(String name, boolean doesHaveDriverLicense, int experience) {
        if (StringUtils.isValid(name)) {
            System.out.println("Имя не указано");
        }
        this.name = name;
        this.doesHaveDriverLicense = doesHaveDriverLicense;
        setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public boolean DoesHaveDriverLicense() {
        return doesHaveDriverLicense;
    }

    public void setDoesHaveDriverLicense(boolean doesHaveDriverLicense) {
        this.doesHaveDriverLicense = doesHaveDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            experience = 2;
        }
        this.experience = experience;
    }

    public abstract void startMoving(T transport);
    public abstract void stopMoving(T transport);
    public abstract void refillTransport(T transport);

    public void printDriverInformation(T transport) {
        System.out.println("Водитель " + name + " управляет " + transport.getBrand() +
                " и будет участвовать в заезде");
    }

    @Override
    public String toString() {
        return name;
    }
}
