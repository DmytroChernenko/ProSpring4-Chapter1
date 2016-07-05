package com.apress.prospring4.ch2;

/**
 * Created by Dmytro on 05.07.16.
 */
public class StandartOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set property messageProvider of class: " +
                            StandartOutMessageRenderer.class.getName()
            );
        }
        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
