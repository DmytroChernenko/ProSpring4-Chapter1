package com.apress.prospring.ch2;

/**
 * Created by Dmytro on 05.07.16.
 */
public class HelloWorldDecopuled {
    public static void main(String[] args) {
        MessageRenderer mr = new StandartOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
