package strategy.drivestrategy;

import strategy.drivestrategy.vehcileDriveStrategy;

public class normalDriveStrategy implements vehcileDriveStrategy {
    @Override
    public void drive(){
        System.out.println("Normal Drive strategy");
    }
}
