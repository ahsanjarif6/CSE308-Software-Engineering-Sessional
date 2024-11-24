package Subscribers;

import Publisher.ABCServer;

import java.util.Scanner;

public class PremiumUser extends Subscriber{

    public PremiumUser(ABCServer abcServer){
        super(abcServer);
        setState(0);
    }

    @Override
    public void notifySubscriber() {
        int previousState = getAbcServer().getPreviousState() ;
        int currentState = getAbcServer().getCurrentState() ;
        // 0 opetational
        // 1 partially down
        // 2 fully down
        if(previousState == 0 && currentState == 1){
            Scanner sc = new Scanner(System.in) ;
            System.out.println("Dear Premium User , ");
            System.out.println("You have 2 options");
            System.out.println("Do you want to use servece from");
            System.out.println("Option 1 : Two servers both ABC and DEF");
            System.out.println("Option 2 : One server DEF");
            int option = sc.nextInt() ;
            setState(option);
        }
        else if(previousState == 0 && currentState == 2){
            setState(2);
        }
        else if(previousState == 1 && currentState == 2){
            setState(2);
        }
        update();
    }

    @Override
    public void update() {
        System.out.println("Dear Premium User , ");
        if(getState() == 0){
            System.out.println("You are using ABC server") ;
        }
        else if(getState() == 1){
            System.out.println("You are using both ABC and DEF servers") ;
        }
        else if(getState() == 2){
            System.out.println("You are using DEF server") ;
        }
    }

}
