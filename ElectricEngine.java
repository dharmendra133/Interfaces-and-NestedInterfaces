package Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric engine starts here");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stops here");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerates here");
    }
}
