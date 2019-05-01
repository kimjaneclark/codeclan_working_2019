import java.util.*;

public class Network {
    private String name;
    private ArrayList<iConnect> devices;


    public Network(String name){
        this.devices = new ArrayList<iConnect>();

        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(iConnect device){

        devices.add(device);
    }



    public void disconnectAll(){
        devices.clear();

    }
}