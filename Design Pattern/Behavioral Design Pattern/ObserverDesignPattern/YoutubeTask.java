package ObserverDesignPattern;

public interface YoutubeTask {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyChanges();
}
