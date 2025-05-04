package FacadeDesignPattern;

public class FacadeDesignPattern {
    public static void main(String[] args){
        DVDPlayer dvdPlayer = new DVDPlayer();
        SoundSystem soundSystem = new SoundSystem();
        Light light = new Light();
        Projector projector = new Projector();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer,light,soundSystem,projector);
        homeTheaterFacade.watchMovie("3-idiots");
        homeTheaterFacade.endMovie();


    }
}
/*
Facade Design Pattern
- Structural Design Pattern
- Facade is used when we have to hide the system complexity from the client.
- The Facade Design Pattern is a structural pattern that provides a simplified interface to a
complex subsystem. It's used to hide the complexities of a system and provide a simpler interface to
the client.
*/
