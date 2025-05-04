package FacadeDesignPattern;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Light light;
    private SoundSystem soundSystem;
    private Projector projector;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Light light, SoundSystem soundSystem,
                             Projector projector) {
        this.dvdPlayer = dvdPlayer;
        this.light = light;
        this.soundSystem = soundSystem;
        this.projector = projector;
    }

    public void watchMovie(String movieName){
        System.out.println("Get ready to watch movie...!!!");
        projector.on();
        projector.wideScreen();
        dvdPlayer.on();
        soundSystem.on();
        soundSystem.volume(5);
        light.off();
        dvdPlayer.play(movieName);
    }
    public void endMovie(){
        System.out.println("Shutting movie....!!");
        light.on();
        projector.off();
        soundSystem.off();
        dvdPlayer.off();
    }
}
