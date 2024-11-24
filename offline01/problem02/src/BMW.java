public class BMW implements  Car{

    @Override
    public String name() {
        return "BMW";
    }

    @Override
    public String color() {
        return "Black";
    }

    @Override
    public String manufacturingCountry() {
        return "Germany";
    }

    @Override
    public String engine() {
        return "electric engine";
    }

    @Override
    public String driveTrain() {
        return "rear-wheel";
    }
}
