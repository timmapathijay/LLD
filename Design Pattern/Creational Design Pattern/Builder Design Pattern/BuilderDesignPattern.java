package BuilderDesignPattern;

public class BuilderDesignPattern {
    public static void main(String[] args){
        User user = new User.UserBuilder()
                .setUserId("004")
                .setEmailId("jayalaxmitj@gmail.com")
                .setUserName("T Jay Lakshmi")
                .build();
        System.out.print(user.toString());

    }
}
/*
Builder Design Pattern
- Creational Design Pattern
- While creating object when object contain many attributes there are many problem exists:-
1. We have to pass many arguments to create object.Some parameters might be optional.
2. Factory class takes all responsibility for creating object. If the object is heavy then all the
complexity is the part of factory class.

- So in builder pattern we create object step by step & finally returning final object with desired
values of attributes.

*/
