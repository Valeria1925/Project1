package com.company;


class Kotik {
    int satiety = 100;

    void play() {
        if (satiety < 50) {
            System.out.println("i want to eat");
            eat();
        } else {
            System.out.println("play");
            satiety = satiety - 10;
        }
    }

    void sleep() {
        if (satiety < 50) {
            System.out.println("i want to eat");
            eat();
        } else {
            System.out.println("sleep");
            satiety = satiety - 10;
        }
    }

    void chaseMouse() {
        if (satiety < 50) {
            System.out.println("i want to eat");
            eat();
        } else {
            System.out.println("chaseMouse");
            satiety = satiety - 10;
       }
    }

    void eat(int satietyFrom, String food){
        System.out.println("We fed a cat, food: " + food + ", satiety: " + satietyFrom);
        satiety = satietyFrom;
    }

    void eat(int satietyFrom) {
        System.out.println("We fed a cat" + ", satiety: " + satietyFrom);
        satiety = satietyFrom;

//        eat(satietyFrom, "fish");
    }

    void eat() {
        eat(100, "fish");
    }

    void jump(){
        if (satiety < 50) {
            System.out.println("i want to eat");
            eat();
        } else {
            System.out.println("jump");
            satiety = satiety - 10;
        }
    }

    void sayMeow(){
        if (satiety < 50) {
            System.out.println("i want to eat");
            eat();
        } else {
            System.out.println("sayMeow");
            satiety = satiety - 10;
        }
    }

    void liveAnotherDay(){
        int from = 1;
        int to = 6;

        for ( int count = 24; count > 0; count = count - 1){
            double random = Math.random();
            int random_number1 = from + (int) (random * to);

//            System.out.println(random_number1);

            switch (random_number1) {
                case 1:
                    play();
                    break;
                case 2:
                    sleep();
                    break;
                case 3:
                    chaseMouse();
                    break;
//                case 4:
//                    eat();
//                    break;
                case 5:
                    jump();
                    break;
                case 6:
                    sayMeow();
                    break;
                default:
                    break;
            }



        }
    }
}
