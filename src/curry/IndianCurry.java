package curry;

import ingredients.Roux;
import ingredients.StapleFood;
import ingredients.Topping;

public class IndianCurry extends Curry {

    private StapleFood stapleFood;
    private Roux roux;
    private Topping topping;

    @Override
    public void addStapleFood(StapleFood stapleFood) {
        this.stapleFood = stapleFood;
    }

    @Override
    public void addRoux(Roux roux) {
        this.roux = roux;
    }

    @Override
    public void addTopping(Topping topping) {
        this.topping = topping;
    }
}
