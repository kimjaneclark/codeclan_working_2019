package device_management;

import Behaviours.iOutput;

public class Speaker extends SoundDevice implements iOutput {
    public Speaker(int maxVolume) {
        super(maxVolume);
    }

    public String outputData(String data) {
        return playSound(data);
    }
}
