public class CarFactory {
    public Car getCar(String continent){
        if(continent == null){
            return null ;
        }
        if(continent.equalsIgnoreCase("asia")){
            return new Toyota() ;
        }
        else if(continent.equalsIgnoreCase("europe")){
            return new BMW() ;
        }
        else if(continent.equalsIgnoreCase("us")){
            return new Tesla() ;
        }
        else {
            return null ;
        }
    }
}
