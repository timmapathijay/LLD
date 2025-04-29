public class SingletonDesignPattern {
    private static SingletonDesignPattern instance;
    private SingletonDesignPattern(){

    }
    public static SingletonDesignPattern getInstance(){
        synchronized (SingletonDesignPattern.class) {
            if(instance == null)
                instance = new SingletonDesignPattern();
        }
        return instance;
    }
}
/*
* Singleton Design Pattern is a Creational Design Pattern.
* 1. Constructor -> Private
* 2. Create object with help of getInstance method , make instance creational block synchronized.
* 3. Create field to hold instance -> Private
*/


/*
-> Ways to Break Singleton Design Pattern
* 1. Reflection API to break singleton pattern.
Solution : 1. If object is their => throw exception from inside constructor 2. Use enum
* 2. Deserialize  (Solution -> implement readResolve method)
* 3. Cloning
* */
