public class OrderCounter {
    public static void main(String[] args){
        Burger burger = new ZingerBurger();
        System.out.println(burger.getBurgerDescription() + " , " + burger.getBurgerCost());
        burger = new ExtraChessBurger(burger);
        System.out.println(burger.getBurgerDescription() + " , " + burger.getBurgerCost());
        burger = new ExtraMayoBurger(burger);
        System.out.println(burger.getBurgerDescription() + " , " + burger.getBurgerCost());

    }
}
/*
Decorator Design Pattern
- Structural Design Pattern
*/
