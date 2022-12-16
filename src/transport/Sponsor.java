package transport;

public class Sponsor {
    private final String name;
    private final int contribution;

    public Sponsor(String name, int contribution) {
        this.name = name;
        this.contribution = contribution;
    }

    public String getName() {
        return name;
    }

    public int getContribution() {
        return contribution;
    }

    public void makeContribution() {
        System.out.println("Заезд спонсирован " + getName() + ", сумма составляет " + getContribution() + " рублей");
    }

    @Override
    public String toString() {
        return name + " с суммой " + contribution + " рублей";
    }
}
