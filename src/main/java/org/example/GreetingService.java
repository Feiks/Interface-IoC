package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    @Autowired
    private Language language;


    public GreetingService() {

    }

    public void Hello(){
        String boom = language.getGreeting();
        System.out.println("yehaa " + boom);
    }
}
