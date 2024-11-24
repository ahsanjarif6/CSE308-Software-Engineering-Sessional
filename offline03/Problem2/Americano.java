
public class Americano extends AbstractDecorator {
    public void makeCoffee(){
        super.makeCoffee();
        //list.add(new Toppings("Grinded coffee beans", 30));
        component.list.add(new Toppings("Grinded coffee beans", 30));
    }

    @Override
    public int print(){
        System.out.println("Coffee : Americano");
        System.out.println("Ingredients");
        int cost = 0 ;
        for(Toppings toppings : component.list){
            System.out.println(toppings.getName());
            cost += toppings.getPrice();
        }
        System.out.println("Individual cost: " + cost);
        return cost;
    }
}
