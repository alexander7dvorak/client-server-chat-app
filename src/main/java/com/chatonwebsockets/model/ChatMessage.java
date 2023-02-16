package com.chatonwebsockets.model;

import lombok.Getter;
import lombok.Setter;

public class ChatMessage {
    @Getter @Setter
    private MessageType type;
    @Getter @Setter
    private String content;
    @Getter @Setter
    private String sender;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE,
        NAME_CHANGE
    }
}