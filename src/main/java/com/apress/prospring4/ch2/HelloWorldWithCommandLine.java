package com.apress.prospring4.ch2;

/**
 * Created by Dmytro on 05.07.16.
 */
public class HelloWorldWithCommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            System.out.println("Hello, World!");
        }
    }
}
