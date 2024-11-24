package Components;

public class GPU extends Component{
    private int memorySize ;
    public GPU(String name , int price , int memorySize){
        super(name , price);
        this.memorySize = memorySize ;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}
