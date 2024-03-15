package curry;

import ingredients.Roux;
import ingredients.StapleFood;
import ingredients.Topping;

public abstract class Curry {
    abstract public void addStapleFood(StapleFood stapleFood);
    abstract public void addRoux(Roux roux);
    abstract public void addTopping(Topping topping);
}
