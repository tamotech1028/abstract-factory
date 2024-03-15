import curry.Curry;
import curry.IndianCurry;
import curry.porkCutletCurry;
import factory.Factory;
import factory.IndianCurryFactory;
import factory.PorkCutletCurryFactory;

public class Main {
    public static void main(String[] args) {

        // カツカレーを作る
        Curry porkCutletCurry = new porkCutletCurry();
        Factory porkCutletCurryFactory = createFactory(CurryType.PORK_CUTLET);
        porkCutletCurry.addStapleFood(porkCutletCurryFactory.getStapleFood());
        porkCutletCurry.addRoux(porkCutletCurryFactory.getRoux());
        porkCutletCurry.addTopping(porkCutletCurryFactory.getTopping());

        // インドカレーを作る
        Curry indianCurry = new IndianCurry();
        Factory indianCurryFactory = createFactory(CurryType.INDIAN);
        indianCurry.addStapleFood(indianCurryFactory.getStapleFood());
        indianCurry.addRoux(indianCurryFactory.getRoux());
        indianCurry.addTopping(indianCurryFactory.getTopping());
    }

    // それぞれのカレー工場を作るメソッド
    private static Factory createFactory(CurryType curryType) {
        return switch (curryType) {
            case PORK_CUTLET -> new PorkCutletCurryFactory();
            case INDIAN -> new IndianCurryFactory();
            default -> throw new IllegalArgumentException("指定されたカレーは作れません");
        };
    }
}

