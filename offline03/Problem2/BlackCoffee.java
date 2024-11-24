
public class BlackCoffee extends Component{

    public BlackCoffee(){
        
    }

    @Override
    public void makeCoffee() {
        list.add(new Toppings("Coffee mugs", 100));
        list.add(new Toppings("Grinded coffee beans", 30));
    }

    
}
