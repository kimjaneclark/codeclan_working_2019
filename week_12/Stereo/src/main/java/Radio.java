public class Radio extends Component implements iPlay{

    public Radio (String make, String model)
    {
        super(make, model);

    }

    public String tune(String station){
        return station + " is playing" ;
    }

    public String play(){
        return "Hit Play";
    }




}
