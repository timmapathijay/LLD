package PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NetworkConnection implements Cloneable{
    private String IP;
    private String data;
    private List<String> domains = new ArrayList<>();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public void loadData() throws InterruptedException {
        this.data = "Certificate Data";
        domains.add("www.google.com");
        domains.add("www.amazon.com");
        domains.add("www.facebook.com");

        Thread.sleep(15000);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Deep copy cloning logic
        NetworkConnection connection = new NetworkConnection();
        connection.setIP(this.IP);
        connection.setData(this.data);
        for(String domain : this.getDomains()){
            connection.getDomains().add(domain);
        }
        return connection;
    }
    @Override
    public String toString() {
        return "NetworkConnection{" +
                "IP='" + IP + '\'' +
                ", data='" + data + '\'' +
                ", domains=" + domains +
                '}';
    }


}
