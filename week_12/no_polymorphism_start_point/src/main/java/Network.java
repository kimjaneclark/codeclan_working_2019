import java.util.*;

public class Network {
    private String name;
    private ArrayList<Desktop> devicesDesktops;
    private ArrayList<Printer> devicesPrinters;

    public Network(String name){
        this.devicesDesktops = new ArrayList<Desktop>();
        this.devicesPrinters = new ArrayList<Printer>();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devicesDesktops.size() + devicesPrinters.size();
    }

    public void connect(Desktop desktop){
        devicesDesktops.add(desktop);
    }

    public void connect(Printer printer){
        devicesPrinters.add(printer);
    }

    public void disconnectAll(){
        devicesDesktops.clear() + devicesPrinters.clear();
    }
}