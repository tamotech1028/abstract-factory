package factory;

import ingredients.ButterChicken;
import ingredients.Naan;
import ingredients.Roux;
import ingredients.StapleFood;
import ingredients.TandooriChicken;
import ingredients.Topping;

public class IndianCurryFactory extends Factory {
    @Override
    public StapleFood getStapleFood() {
        // ナンを出荷
        return new Naan();
    }

    @Override
    public Roux getRoux() {
        // バターチキンカレーのルーを出荷
        return new ButterChicken();
    }

    @Override
    public Topping getTopping() {
        // タンドリーチキンを出荷
        return new TandooriChicken();
    }
}
