import java.util.ArrayList;
import java.util.List;

abstract class Component{
    public List< Toppings > list ;

    public Component(){
        list = new ArrayList<Toppings>();
    }

    public abstract void makeCoffee();
}