public class VendinMachine {
    private int noItems ;
    private int price ;
    private int provided ;
    private State state ;

    public VendinMachine() {
        noItems = 5;
        price = 10;
        provided = 0;
        state = new takeOrder(this);
    }

    public int getNoItems() {
        return noItems;
    }

    public void setNoItems(int noItems) {
        this.noItems = noItems;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProvided() {
        return provided;
    }

    public void setProvided(int provided) {
        this.provided = provided;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
