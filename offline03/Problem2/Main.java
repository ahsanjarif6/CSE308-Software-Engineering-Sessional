import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Americano makeAmericano(){
        BlackCoffee blackCoffee = new BlackCoffee();
        Americano americano = new Americano();
        americano.setComponent(blackCoffee);
        americano.makeCoffee();
        return americano;
    }

    public static Espresso makeEspresso(){
        BlackCoffee blackCoffee = new BlackCoffee();
        Espresso espresso = new Espresso();
        espresso.setComponent(blackCoffee);
        espresso.makeCoffee();
        return espresso;
    }

    public static Cappuccino makeCappuccino(){
        MilkCoffee milkCoffee = new MilkCoffee();
        Cappuccino cappuccino = new Cappuccino();
        cappuccino.setComponent(milkCoffee);
        cappuccino.makeCoffee();
        return cappuccino;
    }

    public static Mocha makMocha(){
        MilkCoffee milkCoffee = new MilkCoffee();
        Mocha mocha = new Mocha();
        mocha.setComponent(milkCoffee);
        mocha.makeCoffee();
        return mocha;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List< AbstractDecorator > v = new ArrayList<AbstractDecorator>();
            while(true){
                System.out.println("What do you want to order?:");
                System.out.println("1.Americano");
                System.out.println("2.Espresso");
                System.out.println("3.Cappuccino");
                System.out.println("4.Mocha");
                System.out.println("5.Exit");
                int b = scanner.nextInt();
                if(b == 1){
                    v.add(makeAmericano());
                }
                if(b == 2){
                    v.add(makeEspresso());
                }
                if(b == 3){
                    v.add(makeCappuccino());
                }
                if(b == 4){
                    v.add(makMocha());
                }
                if(b == 5) break ;
            }
        int total = 0 ;
        for(AbstractDecorator ad : v){
            total += ad.print();
        }
        System.out.println("Your total cost is: " + total);
    }    
}
