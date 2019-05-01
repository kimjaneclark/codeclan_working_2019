package device_management;

import Behaviours.iOutput;

public class Monitor extends VideoDevice implements iOutput {
    public Monitor(int screenSize, int pixels) {
        super(screenSize, pixels);
    }

    public String outputData(String data) {
        return display(data);
    }
}
