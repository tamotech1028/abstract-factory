package factory;

import ingredients.PorkCutlet;
import ingredients.Rice;
import ingredients.Roux;
import ingredients.SolidRoux;
import ingredients.StapleFood;
import ingredients.Topping;

public class PorkCutletCurryFactory extends Factory {

    @Override
    public StapleFood getStapleFood() {
        // 米を出荷
        return new Rice();
    }

    @Override
    public Roux getRoux() {
        // 固形ルーを出荷
        return new SolidRoux();
    }

    @Override
    public Topping getTopping() {
        // とんかつを出荷
        return new PorkCutlet();
    }
}
