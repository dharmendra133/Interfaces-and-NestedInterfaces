package Interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power engine starts here");
    }

    @Override
    public void stop() {
        System.out.println("power engine stops here");
    }

    @Override
    public void accelerate() {
        System.out.println("power engine is accelerated");
    }
}
