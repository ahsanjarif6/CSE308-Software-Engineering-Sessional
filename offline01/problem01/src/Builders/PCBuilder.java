package Builders;

import Components.*;
import Products.Product;

import java.util.ArrayList;
import java.util.List;

public class PCBuilder {
    private Product product ;

    public PCBuilder(){
        product = new Product() ;
    }

    public void addCPU(String name, int price){
        product.add(new CPU(name , price)) ;
    }

    public void addCooler(String name , int price){
        product.add(new Cooler(name , price)) ;
    }

    public void addDvdDrive(String name , int price) {
        product.add(new Drive(name, price));
    }

    public void addRam(String s){
        if(s.equalsIgnoreCase("Type1")) {
            product.add(new Ram("DDR4",2620,8,2666));
        }
        else if(s.equalsIgnoreCase("Type2")) {
            product.add(new Ram("DDR4",2950,8,3200)) ;
        }
    }

    public void addGPU(String s) {
        if (s.equalsIgnoreCase("Type1")) {
            product.add(new GPU("GPU", 6500, 2));
        } else if (s.equalsIgnoreCase("Type2")) {
            product.add(new GPU("GPU", 7600, 4));
        }
    }

    public Product getProduct() {
        return product;
    }
}
