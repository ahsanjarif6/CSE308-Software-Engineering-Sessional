package Products;

import Components.Component;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class Product {
    public List<Component>componentList ;
    private int basePrice ;
    private int additionalPrice ;
    public Product(){
        componentList = new ArrayList<Component>() ;
        basePrice = 70000 ;
        additionalPrice = 0 ;
    }

    public void add(Component component){
        componentList.add(component) ;
    }

    public void print(){
        System.out.println("Base parts:\n1 TB HDD and MotherBoard , Price : 70000 Tk");
        System.out.println("Additional parts:");
        additionalPrice = 0 ;
        for(Component c : componentList){
            additionalPrice += c.getPrice() ;
                System.out.println(c.getName() + " , Price : " + c.getPrice());
        }
        System.out.println("Total additional price: , Price: " + additionalPrice);
        int total = basePrice + additionalPrice;
        System.out.println("Total Price: " + total);
    }
}
