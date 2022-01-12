package org.example;

public class Vietnamiese implements Language{

     @Override
    public String getGreeting() {
        return "Ni hao";
    }

    @Override
    public String getBye() {
        return "Zaychen";
    }
}
