package Interfaces;

public class niceCar {
    private Engine engine;

    private MeidaPlayer player=new CDplayer();
    public niceCar(){
        engine=new PowerEngine();
    }

   public niceCar(Engine engine){
        this.engine=engine;
   }

   public void start(){
        engine.start();
   }

   public void StartMusic(){
        player.start();
   }

   public void stopMusic(){
        player.stop();
   }

   public void upgradeEngine(){
        engine=new ElectricEngine();
   }
}
