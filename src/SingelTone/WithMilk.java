package SingelTone;

public class WithMilk{
    private SingelTone.Coffee Coffee;

    public WithMilk(SingelTone.Coffee coffee1) {
        Coffee = coffee;
        this.coffee = coffee1;
        this.coffeeWithMilk = coffeeWithMilk;
    }

    public double getCost(){
        return  this.Coffee.getCost() + 1;
    }

    public String getIngredients(){
        return this.Coffee.getIngredients() + ", Milk";
    }

    Coffee coffee = new Coffee();
    WithMilk coffeeWithMilk = new WithMilk(coffee);
}
