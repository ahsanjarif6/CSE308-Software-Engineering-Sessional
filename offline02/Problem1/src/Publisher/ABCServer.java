package Publisher;

import Subscribers.Subscriber;

import java.util.List;

public class ABCServer {
    private int previousState ;
    private int currentState ;
    private List<Subscriber> subscribers ;

    public ABCServer(){
        previousState = 0 ;
        currentState = 0 ;
    }


    public int getPreviousState() {
        return previousState;
    }

    public void setPreviousState(int previousState) {
        this.previousState = previousState;
    }

    public int getCurrentState() {
        return currentState;
    }

    public void setCurrentState(int currentState) {
        this.currentState = currentState;
        notifySubscribers();
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public void notifySubscribers(){
        for(Subscriber subscriber : subscribers){
            //notify subscribers
            subscriber.notifySubscriber();
        }
    }
}
