package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements  YoutubeTask{
    private List<Observer> subcriberList = new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        subcriberList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subcriberList.remove(observer);

    }

    @Override
    public void notifyChanges() {
        for(Observer obj : subcriberList){
            obj.notified();
        }

    }
}
