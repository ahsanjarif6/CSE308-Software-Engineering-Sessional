public class Tesla implements Car{

    @Override
    public String name() {
        return "Tesla";
    }

    @Override
    public String color() {
        return "White";
    }

    @Override
    public String manufacturingCountry() {
        return "USA";
    }

    @Override
    public String engine() {
        return "electric engine";
    }

    @Override
    public String driveTrain() {
        return "all wheels";
    }
}
