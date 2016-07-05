package com.apress.prospring.ch2;

/**
 * Created by Dmytro on 05.07.16.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}
