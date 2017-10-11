package part_06;
//SuperClass
public class Birds {

    //private instance variable for Bird Class
    private int legs;
    private int wings;
    private boolean laysEggs;
    private boolean canFly;


    // Getters/Setters
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public boolean isLaysEggs() {
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs) {
        this.laysEggs = laysEggs;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }


    //Bird Constructor
    public Birds(int legs, int wings, boolean laysEggs, boolean canFly) {
        this.legs = legs;
        this.wings = wings;
        this.laysEggs = laysEggs;
        this.canFly = canFly;
    }
    //Overloaded Bird Constructor
    public Birds(int legs) {
        this.legs = legs;
    }

    //Bird Method 1
    void makeBirdSounds(){
        System.out.println("Bird Sounds");
    }
    //Bird Method 2
    void doBirdThings(){
        System.out.println("Doing Bird Things");
    }
}

//Test Class
class BirdDemo {

    //main method where the program begins
    public static void main(String[] args) {
        //Create Bird object
        Birds cardinal = new Birds(2,2, true,true);
        //Create Bird object using the overloaded constructor
        Birds ostirch = new Birds(2);
        //Create Sea_bird object with unique seabird parameters
        Sea_Birds penguin = new Sea_Birds(2, 3, false, false, false, false);
        //create sea_Gull object with unique seagull parameters
        Sea_Gulls black_back = new Sea_Gulls(2,2,true,true,false,false,true,true,2);
        //Get the legs variable with getters and setters
        System.out.println("The Cardinal has" + " " + cardinal.getLegs() + " " + "legs");
        //Uses method in the seabirds class to change the number of legs in the superclass
        penguin.setLegsFromSub(8);
        //inherited the method in the seabirds class, can also change the number of legs in the superclass
        black_back.setLegsFromSub(400);
        //Test
        System.out.println("The Penguin has" + " " + penguin.getLegs() + " " + "legs");
        System.out.println("The Black back seagull has" + " " + black_back.getLegs() + " " + "legs");


        //both penguin and black back inherit makeBirdsSounds from the Bird class
        penguin.makeBirdSounds();

        /* black_back overrides makeBirdSounds but calls the super so it can still use it
            while also preforming a new method
         */
        black_back.makeBirdSounds();

        //call the Bird method on the Bird object
        cardinal.doBirdThings();
        //call the bird method on the seabird object
        penguin.doBirdThings();

        /* call the bird method on the seagull object
            this method is overridden and because it does
            not call the super it will not preform
         */
        black_back.doBirdThings();



    }
}

