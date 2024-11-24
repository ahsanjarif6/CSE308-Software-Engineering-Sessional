
public class AdapterDemo {
    public static void main(String[] args) {
        Crewmate crewmate = new Crewmate();
        crewmate.maintenance();
        Imposter imposter = new Imposter();
        imposter.maintenance();
        System.out.println("Damaging the spaceship with ImposterAdapter");
        CrewmateInterface adapter = new ImposterAdapter(imposter);
        adapter.maintenance();
    }
}
