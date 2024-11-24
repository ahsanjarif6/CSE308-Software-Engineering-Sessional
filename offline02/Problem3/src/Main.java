public class Main {
    public static void main(String[] args) {
        VendinMachine vm = new VendinMachine();
        while (true){
            int items = vm.getNoItems() ;
            if(items == 0){
                System.out.println("No items left");
                break;
            }
            System.out.println(items + " items left");
            vm.setState(new takeOrder(vm));
            while (true){
                vm.getState().changeState();
                if((vm.getState() instanceof returnProduct)){
                    vm.getState().changeState();
                    break;
                }
            }
        }
    }
}
