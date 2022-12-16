package transport;

public class Mechanic<T extends Transport> {
    private final String name;
    private final String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }


    public boolean service(T transport) {
        return transport.goThroughDiagnostics();
    }

    public void fixing(T transport) {
        transport.fixing();
    }

    @Override
    public String toString() {
        return name + " из " + company;
    }
}
