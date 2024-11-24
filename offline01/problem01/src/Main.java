import Builders.GamingPC;
import Builders.PC1;
import Builders.PCBuilder;
import Products.Product;

public class Main {
    public static void main(String[] args) {
        Director director = new Director() ;
        PCBuilder gamingPc = new GamingPC() ;
        PCBuilder pc1 = new PC1() ;
        director.setPcBuilder(gamingPc);
        director.addRam("Type2");
        director.addGPU("Type1");
        Product product1 = gamingPc.getProduct() ;
        product1.print();
        director.setPcBuilder(pc1);
        director.addRam("Type1");
        Product product2 = pc1.getProduct() ;
        product2.print();
    }
}
