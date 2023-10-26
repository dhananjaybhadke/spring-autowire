package com.springcore;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

    private Heart heart;


    public Human() {
    }
    @Autowired
    public Human(Heart heart) {
        this.heart = heart;
        System.out.println("Human constructor is called who has heart as argument");
    }
    // Setter injection
//    @Autowired
//    public void setHeart(Heart heart) {
//        this.heart = heart;
//        System.out.println("Setter method is called..");
//    }

    public void startPumping(){
        if(heart != null){
            heart.pump();

        } else {
            System.out.println("You are dead");
        }

    }
}
