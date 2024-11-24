import java.util.Scanner;

public class takeOrder extends State{


    public takeOrder(VendinMachine vm) {
        super(vm);
    }

    @Override
    void changeState() {
        if(vm.getNoItems() == 0){
            System.out.println("No more items left");
        }
        else {
            int price = vm.getPrice() ;
            int provided = vm.getProvided() ;
            if(provided > price){
                vm.setState(new returnMoney(vm));
            }
            else if(provided == price){
                vm.setState(new returnProduct(vm));
            }
            else {
                int need = price - provided ;
                System.out.println("Please provide " + need + " taka to buy the item");
                Scanner sc = new Scanner(System.in) ;
                int input = sc.nextInt() ;
                input += provided ;
                vm.setProvided(input);
            }
        }
    }
}
