package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Dev {
    private Computer com;



//    public Dev(){
//        System.out.println("Dev Constructor");
//    }





    public Computer getCom() {
        return com;
    }

//    public void setCom(Computer com) {
//        this.com = com;
//    }

    public void build(){

        System.out.println("Working on Awesome project");
         com.compile();
    }
}
