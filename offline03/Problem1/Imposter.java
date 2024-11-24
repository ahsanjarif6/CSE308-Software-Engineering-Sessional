public class Imposter implements ImposterInterface{

    public Imposter(){
        
    }

    @Override
    public void maintenance() {
        System.out.println("Damaging the spaceship");
    }
    
}
