package Subscribers;

import Publisher.ABCServer;

import java.util.Scanner;

public class RegularUser extends Subscriber{

    public RegularUser(ABCServer abcServer){
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
        Scanner sc = new Scanner(System.in) ;
        int option = -1 ;
        if(previousState == 0 && currentState == 1){
            System.out.println("Dear user , ");
            System.out.println("You have two options");
            System.out.println("1.Use ABCServer with limited functionality");
            System.out.println("2.Pay $20 per hour to Enjoy full functionality from DEFServer");
            option = sc.nextInt() ;
            setState(option);
        }
        else if(previousState == 0 && currentState == 2){
            System.out.println("Dear user , ");
            System.out.println("Press 2 if you want to $20 per hour to take service from DEFServer");
            System.out.println("Otherwise press 1");
            option = sc.nextInt() ;
            if(option == 2) setState(option);
            else setState(3);
        }
        else if(previousState == 1 && currentState == 0 && getState() == 2){
            System.out.println("Your bill for using DEFServer: $40");
        }
        else if(previousState == 2 && currentState == 0 && getState() == 2){
            System.out.println("Your bill for using DEFServer: $40");
        }
        else if(getState() == 0 && previousState == 1 && currentState == 2){
            setState(3);
        }
        update();
    }

    @Override
    public void update() {
        System.out.println("Dear user , ");
        if(getState() == 0){
            System.out.println("You are using ABC server") ;
        }
        else if(getState() == 1){
            System.out.println("You are using ABC server with limited functionality") ;
        }
        else if(getState() == 2){
            System.out.println("You are using DEF server") ;
        }
        else if(getState() == 3){
            System.out.println("No service available");
        }
    }
}
