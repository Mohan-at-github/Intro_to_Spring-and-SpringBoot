package com.SpringBoot_Intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mohan {
    public void print(){
        System.out.println("Hii I am from container and Now I am bean ");
    }

        /*
        we're getting wired(creating connection) between laptop and mohan class
        Now Spring frame responsibility to a search laptop object inside the container and give to mohan obj.
         */

    @Autowired
    Laptop laptop;
    public void code(){
        laptop.compile();
    }
}
