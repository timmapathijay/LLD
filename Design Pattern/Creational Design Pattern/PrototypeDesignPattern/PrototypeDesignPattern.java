package PrototypeDesignPattern;

public class PrototypeDesignPattern {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection connection = new NetworkConnection();
        connection.setIP("192.14.30.64");
        connection.loadData();
        System.out.println(connection);
        // Using Prototype Design Pattern to create a new object
        try{
            NetworkConnection connection1 = (NetworkConnection) connection.clone();
            NetworkConnection connection2 = (NetworkConnection) connection.clone();
            System.out.println(connection1);
            connection1.getDomains().remove(0);
            System.out.println("After modifying " +connection1);
            System.out.println(connection2);

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
/*
--> Prototype Design Pattern
* 1. Creational Design Pattern
* 2. The concept is to copy an existing object rather than creating a new instance from scratch,
because creating new object may be costly.
* 3. Two types of cloning -> Deep Copy , Shallow Copy 
* */

