package strategy;
import strategy.offRoadVehcile;
import strategy.normalRoadVehcile;

public class strategy {
    public static void main(String[] args) {
        offRoadVehcile obj = new offRoadVehcile();
        obj.drive();
        normalRoadVehcile nobj  = new normalRoadVehcile();
        nobj.drive();
    }
}
