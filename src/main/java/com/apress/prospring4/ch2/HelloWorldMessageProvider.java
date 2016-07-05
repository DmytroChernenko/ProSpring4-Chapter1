package com.apress.prospring4.ch2;

/**
 * Created by Dmytro on 05.07.16.
 */
public class HelloWorldMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello, World";
    }
}
