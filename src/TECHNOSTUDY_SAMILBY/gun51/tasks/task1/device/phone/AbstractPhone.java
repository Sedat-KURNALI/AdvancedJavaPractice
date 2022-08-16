package TECHNOSTUDY_SAMILBY.gun51.tasks.task1.device.phone;

import TECHNOSTUDY_SAMILBY.gun51.tasks.task1.device.utils.Career;
import TECHNOSTUDY_SAMILBY.gun51.tasks.task1.device.AbstractDevice;

public abstract class AbstractPhone extends AbstractDevice {
    private Career career;


    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }
}
