package com.messaging.springWebSockets.models;

import lombok.Data;

@Data
public class Message {
    private String from;
    private String text;
}
