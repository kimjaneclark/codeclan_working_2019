public class Bear {

    private String name;
    private int age;
    private double weight;
    private char thirsty;

    public Bear(String name, int age, double weight, char thirsty){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.thirsty = thirsty;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean readyToHibernate()
    {
        if(weight >= 80.00){
            return true;
        }else{
            return false;
        }
    }

    public char getThirsty() {
        return thirsty;
    }
}
