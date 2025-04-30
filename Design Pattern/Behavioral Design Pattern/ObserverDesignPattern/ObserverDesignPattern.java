package ObserverDesignPattern;

public class ObserverDesignPattern {
    public static void main(String[] args){
        YoutubeTask learnCodeWithJaya = new YoutubeChannel();
        Observer venky = new Subscriber("T Venkatesh Kumar");
        learnCodeWithJaya.subscribe(venky);
        Observer susheela = new Subscriber("T Susheela Rani");
        learnCodeWithJaya.subscribe(susheela);

        learnCodeWithJaya.notifyChanges();
        

    }
}
