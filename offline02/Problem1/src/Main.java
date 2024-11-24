import Publisher.ABCServer;
import Subscribers.PremiumUser;
import Subscribers.RegularUser;
import Subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String ServerState(int state){
        if(state == 0) return "Operational" ;
        if(state == 1) return "Partially down" ;
        return "Fully down" ;
    }

    public static void main(String[] args) {
        ABCServer abcServer = new ABCServer() ;
        RegularUser regularUser = new RegularUser(abcServer) ;
        PremiumUser premiumUser = new PremiumUser(abcServer) ;
        List<Subscriber> list = new ArrayList<Subscriber>() ;
        list.add(regularUser) ;
        list.add(premiumUser) ;
        abcServer.setSubscribers(list);
        while (true){
            int previousState = abcServer.getPreviousState() ;
            int currentState = abcServer.getCurrentState() ;
            System.out.println("ABC server is in " + ServerState(currentState) + " state");
            System.out.println("Previous state was " + ServerState(previousState) + " state");
            System.out.println("Press 0 to change state to Operational state");
            System.out.println("Press 1 to change state to Partially down state");
            System.out.println("Press 2 to change state to Fully down state");
            System.out.println("Press 3 to exit");
            Scanner sc = new Scanner(System.in) ;
            int in = sc.nextInt() ;
            abcServer.setCurrentState(in);
        }
    }
}
