package transport;

public class Truck extends Transport implements Competitive {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик заканчивает движение");
    }

    @Override
    public boolean goThroughDiagnostics() {
        System.out.println("Грузовику " + getBrand() + " нужно пройти диагностику");
        return true;
    }

    @Override
    public void fixing() {
        System.out.println("Грузовик " + getBrand() + " отправлен в ремонт");
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString();
    }

    @Override
    public void PitStop() {
        System.out.println("Грузовику нужен пит-стоп");
    }

    @Override
    public double getBestLapTime() {
        return (Math.random() * 10);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (Math.random() * 150);
    }
}
