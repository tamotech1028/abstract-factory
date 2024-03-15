package factory;

import ingredients.Roux;
import ingredients.StapleFood;
import ingredients.Topping;

public abstract class Factory {
    abstract public StapleFood getStapleFood();
    abstract public Roux getRoux();
    abstract public Topping getTopping();
}
