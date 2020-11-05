package com.company;

class Kotik {
    int satiety = 70;

    void play() {
        if (satiety < 70) {
            System.out.println("i want to eat");
        } else {
            System.out.println("play");
        }
    }

    void sleep() {
        if (satiety < 70) {
            System.out.println("i want to eat");
        } else {
            System.out.println("sleep");
        }
    }

    void chaseMouse() {
        if (satiety < 70) {
            System.out.println("i want to eat");
        } else {
        System.out.println("chaseMouse");

       }
    }

    void eat(){
        if (satiety < 70) {
            System.out.println("i want to eat");
        } else {
            System.out.println("eat");
        }
    }

    void jump(){
        if (satiety < 70) {
            System.out.println("i want to eat");
        } else {
            System.out.println("jump");
        }
    }

    void sayMeow(){
        if (satiety < 70) {
            System.out.println("i want to eat");
        } else {
            System.out.println("sayMeow");
        }
    }

    void liveAnotherDay(){
        for ( int count = 24;count>0;count = count - 1){
            play();
            sleep();
            chaseMouse();
            eat();
            jump();
            sayMeow();

       }
    }
}
