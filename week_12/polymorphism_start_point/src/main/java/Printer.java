public class Printer implements iConnect{

    public String print(String data){
        return "printing: " + data;
    }

    public String connect(String data){
        return "connecting to network: " + data;
    }
}