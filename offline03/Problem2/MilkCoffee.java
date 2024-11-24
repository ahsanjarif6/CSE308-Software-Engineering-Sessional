

public class MilkCoffee extends Component{

    public MilkCoffee(){

    }

    @Override
    public void makeCoffee() {
        list.add(new Toppings("Coffee mugs", 100));
        list.add(new Toppings("Grinded coffee beans", 30));
        list.add(new Toppings("Milk", 50));
    }

    
}
