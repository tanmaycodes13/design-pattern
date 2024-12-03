package strategy;

import strategy.drivestrategy.vehcileDriveStrategy;

class vehcile {
    vehcileDriveStrategy driveStrategy;

    public vehcile(vehcileDriveStrategy strategy){
        this.driveStrategy = strategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
