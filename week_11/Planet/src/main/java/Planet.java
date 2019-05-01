public class Planet {

    private String name;
    private int size;

    public Planet(String name, int size) {
        this.name = name;
        this.size = size;
    }

        public String getName(){
            return this.name;
        }


        public int getSize(){
            return this.size;
        }

        public void setName(String name) {
        this.name = name;
        }

        public void setSize(int size) {
        this.size = size;
        }

    public String explode(){
        return "Boom! " + this.name + " has exploded.";
        }



}


