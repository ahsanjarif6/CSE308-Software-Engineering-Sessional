public class Cappuccino extends AbstractDecorator {
    public void makeCoffee(){
        super.makeCoffee();
        component.list.add(new Toppings("Cinnamon powder", 50));
    }

    @Override
    public int print(){
        System.out.println("Coffee : Cappuccino");
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
