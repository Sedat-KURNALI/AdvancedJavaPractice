package TECHNOSTUDY_SAMILBY.gun49.tasks.task1.vehicles;

import TECHNOSTUDY_SAMILBY.gun49.tasks.task1.interfaces.Flying;
import TECHNOSTUDY_SAMILBY.gun49.tasks.task1.interfaces.Sailing;
import TECHNOSTUDY_SAMILBY.gun49.tasks.task1.interfaces.Vehicle;

public class SpaceShip implements Vehicle, Flying, Sailing {
    @Override
    public String fly() {
        return "atmosphere";
    }

    @Override
    public String sail() {
        return "space";
    }

    @Override
    public int speed() {
        return 17000;
    }
}
