package Interfaces;

public class Car implements Engine,Brake,MeidaPlayer {

    @Override
    public void brake() {
        System.out.println("I am brake from Brake.java interface");
    }

    @Override
    public void start() {
        System.out.println("I am start from Engine or MeidiaPlayaer don't know");

    }

    @Override
    public void stop() {
        System.out.println("I am stop from Engie or MeidiaPlayer don't know");

    }

    @Override
    public void accelerate() {

        System.out.println("I am accelerate from engine");

    }
}
