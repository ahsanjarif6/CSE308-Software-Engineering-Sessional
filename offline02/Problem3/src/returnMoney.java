public class returnMoney extends State{
    public returnMoney(VendinMachine vm) {
        super(vm);
    }

    @Override
    void changeState() {
        int price = vm.getPrice() ;
        int provided = vm.getProvided() ;
        int change = provided - price ;
        System.out.println("Here is your change " + change + " taka");
        vm.setState(new returnProduct(vm));
    }
}
