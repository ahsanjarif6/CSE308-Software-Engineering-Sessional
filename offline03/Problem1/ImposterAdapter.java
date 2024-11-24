public class ImposterAdapter implements CrewmateInterface{

    Imposter imposter;

    public ImposterAdapter(Imposter imposter){
        this.imposter = imposter;
    }

    @Override
    public void maintenance() {
        imposter.maintenance();
    }

}