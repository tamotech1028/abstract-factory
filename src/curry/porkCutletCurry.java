package curry;

import ingredients.Roux;
import ingredients.StapleFood;
import ingredients.Topping;

public class porkCutletCurry extends Curry {

    private StapleFood stapleFood;
    private Roux roux;
    private Topping topping;

    public porkCutletCurry() {
    }

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
