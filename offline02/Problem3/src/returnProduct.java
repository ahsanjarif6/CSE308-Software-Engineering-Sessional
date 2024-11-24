public class returnProduct extends State{
    public returnProduct(VendinMachine vm) {
        super(vm);
    }

    @Override
    void changeState() {
        System.out.println("Here is your product");
        vm.setNoItems(vm.getNoItems() - 1);
        vm.setProvided(0);
        vm.setPrice(10);
    }
}
