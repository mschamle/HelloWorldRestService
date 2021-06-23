package com.schamle.rest;

public class HelloMessage {
    private static String DEFAULT_MESSAGE = "Hello";
    private String name;

    public HelloMessage (){
    }

    public String getGreeting() {
        return DEFAULT_MESSAGE + (name != null ? " " + name : "");
    }

    public void setName(String name) {
        this.name = name;
    }
}
