package device_management;

import Behaviours.iOutput;

public class Computer {
    private int ram;
    private int hddSize;
    private iOutput outputdevice;

    private Monitor monitor;

    public Computer(int ram, int hddSize, iOutput outputdevice) {
        this.ram = ram;
        this.hddSize = hddSize;
        this.outputdevice = outputdevice;
    }

    public int getRam() {
        return this.ram;
    }

    public int getHddSize() {
        return this.hddSize;
    }

    public iOutput getOutputDevice() {
        return this.outputdevice;
    }

    public String outputData(String data) {
        return this.outputdevice.outputData(data);
    }

    public void setOutputdevice(iOutput outputdevice) {
        this.outputdevice = outputdevice;
    }
}
