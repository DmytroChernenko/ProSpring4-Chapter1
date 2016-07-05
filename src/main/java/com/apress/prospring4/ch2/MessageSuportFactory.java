package com.apress.prospring4.ch2;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * Created by Dmytro on 05.07.16.
 */
public class MessageSuportFactory {

    private static MessageSuportFactory instance;

    private Properties props;
    private MessageProvider provider;
    private MessageRenderer renderer;

    private MessageSuportFactory() {
        props = new Properties();

        try {
            props.load(new FileInputStream(
                    "msf.properties"));

            String rendererClass = props.getProperty("renderer.class");
            String providerClass = props.getProperty("provider.class");

            renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
            provider = (MessageProvider) Class.forName(providerClass).newInstance();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static {
        instance = new MessageSuportFactory();
    }

    public static MessageSuportFactory getInstance() {
        return instance;
    }


    public MessageProvider getProvider() {
        return provider;
    }

    public MessageRenderer getRenderer() {
        return renderer;
    }
}
