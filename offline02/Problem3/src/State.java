public abstract class State {
    protected VendinMachine vm ;

    public State(VendinMachine vm) {
        this.vm = vm;
    }

    abstract void changeState() ;
}
