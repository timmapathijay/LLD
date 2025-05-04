package FacadeDesignPattern;

class DVDPlayer{
    public void on(){
        System.out.println("DVD Player is ON");
    }
    public void play(String movie){
        System.out.println("Playing " +movie + " movie");
    }
    public void off(){
        System.out.println("DVD Player is OFF");
    }
}
class Projector{
    public void on(){
        System.out.println("Projector is ON");
    }
    public void wideScreen(){
        System.out.println("Projector is Widescreen mode");
    }
    public void off(){
        System.out.println("Projector is OFF");
    }
}
class SoundSystem{
    public void on(){
        System.out.println("SoundSystem is ON");
    }
    public void volume(int volume){
        System.out.println("SoundSystem set to volume "+volume);
    }
    public void off(){
        System.out.println("SoundSystem is OFF");
    }
}
class Light{
    public void on(){
        System.out.println("Lights ON");
    }
    public void off(){
        System.out.println("Lights OFF");
    }
}