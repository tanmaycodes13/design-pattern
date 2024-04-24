package strategy;

import strategy.drivestrategy.normalDriveStrategy;

public class normalRoadVehcile extends vehcile {
    public normalRoadVehcile() {
        super(new normalDriveStrategy());
    }
}
