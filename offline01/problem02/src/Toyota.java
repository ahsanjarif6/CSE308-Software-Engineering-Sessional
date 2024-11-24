public class Toyota implements Car{

    @Override
    public String name() {
        return "Toyota";
    }

    @Override
    public String color() {
        return "Red";
    }

    @Override
    public String manufacturingCountry() {
        return "Japan";
    }

    @Override
    public String engine() {
        return "Hydrogen fuel cell";
    }

    @Override
    public String driveTrain() {
        return "rear-wheel";
    }
}
