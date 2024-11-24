package Components;

public class Ram extends Component{
    private int memorySize ;
    private int frequency ;
    public Ram(String name , int price , int memorySize , int frequency){
        super(name , price);
        this.memorySize = memorySize ;
        this.frequency = frequency ;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
