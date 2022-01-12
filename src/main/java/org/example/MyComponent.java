package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
@Autowired
    private MyRepository myRepository;

    public void showAppInfo(){
        System.out.println("Now is :" + myRepository.getSystemDate());
        System.out.println("this App name is: " + myRepository.getAppName());

    }
}
