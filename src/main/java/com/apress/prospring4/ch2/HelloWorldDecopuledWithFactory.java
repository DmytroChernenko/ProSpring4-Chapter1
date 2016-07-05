package com.apress.prospring4.ch2;

/**
 * Created by Dmytro on 05.07.16.
 */
public class HelloWorldDecopuledWithFactory {
    public static void main(String[] args) {
        MessageRenderer mr = MessageSuportFactory.getInstance().getRenderer();
        MessageProvider mp = MessageSuportFactory.getInstance().getProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }
}
