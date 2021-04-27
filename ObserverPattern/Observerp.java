package com.observer.observer;
//interface that defines the behaviors of the subscriber
public interface Observer {
    //method will allow observer to get latest message
    public void update();
    // method will allow the observer to subscribe to a subject
    public void setSubject(Subject subject);

}