public class ExtraChessBurger  extends  BurgerDecorator{
    private Burger burger;
    public ExtraChessBurger(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getBurgerDescription() {
        return this.burger.getBurgerDescription() + " with extra cheese";
    }

    @Override
    public double getBurgerCost() {
        return this.burger.getBurgerCost() + 10.0;
    }
}
