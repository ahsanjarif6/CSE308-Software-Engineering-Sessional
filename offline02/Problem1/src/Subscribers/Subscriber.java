package Subscribers;


import Publisher.ABCServer;

public abstract class Subscriber {
    private ABCServer abcServer ;
    private int state ;

    public Subscriber(ABCServer abcServer){
        this.abcServer = abcServer ;
    }

    public ABCServer getAbcServer() {
        return abcServer;
    }

    public void setAbcServer(ABCServer abcServer) {
        this.abcServer = abcServer;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public abstract void notifySubscriber();
    public abstract void update() ;

}
