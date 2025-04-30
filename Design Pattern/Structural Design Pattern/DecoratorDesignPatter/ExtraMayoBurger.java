public class ExtraMayoBurger extends BurgerDecorator{
    private Burger burger;
    public ExtraMayoBurger(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getBurgerDescription() {
        return this.burger.getBurgerDescription() + " with extra mayo";
    }

    @Override
    public double getBurgerCost() {
        return this.burger.getBurgerCost() + 30.0;
    }
}
