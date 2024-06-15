package com.github.aclijpio;

import com.github.aclijpio.event.Event;
import com.github.aclijpio.event.listener.GlobalEventListener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       GlobalEventListener globalEventListener = new GlobalEventListener();


       globalEventListener.addSingleEvent(new Event(57, "echo 1"));
       globalEventListener.run();
       while(true){

       }
    }
}
