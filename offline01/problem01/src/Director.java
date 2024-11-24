import Builders.PCBuilder;

public class Director {
    private PCBuilder pcBuilder ;

    public void setPcBuilder(PCBuilder pcBuilder) {
        this.pcBuilder = pcBuilder;
    }

    public void addRam(String s){
        pcBuilder.addRam(s);
    }

    public void addGPU(String s){
        pcBuilder.addGPU(s);
    }
}
