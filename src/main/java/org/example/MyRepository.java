package org.example;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class MyRepository {
public String getAppName(){
    return "Hello Spring App";
}

public Date getSystemDate(){
    return new Date();
}


}
