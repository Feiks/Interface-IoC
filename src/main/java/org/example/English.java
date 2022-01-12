package org.example;

public class English implements Language{
    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Bye";
    }
}
