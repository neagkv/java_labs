package part_06;
//Seagull class which inherits from the seabirds class which inherits from the birds class
public class Sea_Gulls extends Sea_Birds {

    //unique seagull instance variables
    boolean isSeaGull;
    boolean counterShading;
    int weight;

    //Seagull constructor
    public Sea_Gulls(int legs, int wings, boolean laysEggs, boolean canFly, boolean brightColors, boolean livesNearSea, boolean isSeaGull, boolean counterShading, int weight) {
        super(legs, wings, laysEggs, canFly, brightColors, livesNearSea);
        this.isSeaGull = isSeaGull;
        this.counterShading = counterShading;
        this.weight = weight;
    }

    //creating a method with the same name as one in a class in which in inherits allows you to override
    @Override
    void makeBirdSounds() {
        //This call to the super allows the method in the parent class to still run
        super.makeBirdSounds();
        //This is the fuction that will preform as a result of the new method
        System.out.println("Sea Gull Sounds");
    }

    /* another example of a overriding method, this time no call to super so the fuctions of the parent method will
        not preform
     */

    void doBirdThings() {
        System.out.println("Doing Seagull things");
    }
}
