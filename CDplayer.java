package Interfaces;

public  class CDplayer implements  MeidaPlayer{
    @Override
    public void start(){
        System.out.println("Starting the media player");
    }
    @Override
    public void stop(){
        System.out.println("Stopping the media player");
    }
}
