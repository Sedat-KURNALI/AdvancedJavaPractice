package TECHNOSTUDY_SAMILBY.gun51.tasks.task1.device.tv;

import TECHNOSTUDY_SAMILBY.gun51.tasks.task1.device.AbstractDevice;

public abstract class AbstractTV extends AbstractDevice {

    private double diagonal;
    private String os;//operation system

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
