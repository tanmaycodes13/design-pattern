package strategy;
import strategy.vehcile;
import strategy.drivestrategy.offRoadDriveStrategy;

public class offRoadVehcile extends vehcile {
    
    offRoadVehcile() {
        super(new offRoadDriveStrategy());
    }
}
