package part_06;
//Sea Birds Class inherits from the Bird class
public class Sea_Birds extends Birds {
    //Unique seabird instance variables
    private boolean brightColors;
    private boolean livesNearSea;

    //SeaBird Constructor calls super for bird variables and uses this.keyword for unique seabird variables
    public Sea_Birds(int legs, int wings, boolean laysEggs, boolean canFly, boolean brightColors, boolean livesNearSea) {
        super(legs, wings, laysEggs, canFly);
        this.brightColors = brightColors;
        this.livesNearSea = livesNearSea;
    }
    //method to set the number of legs int the parent class
    void setLegsFromSub(int legs){
        setLegs(legs);
    }



}




