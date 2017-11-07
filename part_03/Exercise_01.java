package part_03;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/


//class

class Herring {

    //instance variables
    int width;
    int forkLength;
    int caudaulLength;



    //constructor
    Herring(int w, int fL, int cL) {

        width = w;
        forkLength = fL;
        caudaulLength = cL;
    }

    //main method .. usually would not construct
    public static void main(String[] args) {

        //construct new Herring objects
        Herring alewife = new Herring(2, 5, 7);
        Herring blueback = new Herring(2, 6, 8);
        Herring atlantic = new Herring(3, 6, 8);

        //construct a new groundfish object
        Groundfish cod = new Groundfish(3, 5, 8);
        //set width of the cod object
        cod.width = 7;
        //set width of the cod object using setters
        cod.setWidth(9);
        //set the fork length of the cod
        cod.setForkLength(6);
        //cod.forklength = 6; could not run this way because forklength is private

        //construct a new groundfish object called pollock
        Groundfish pollock = new Groundfish (4, 7);

        //set the caudual length of the pollock
        pollock.setCaudaulLength(8);

        //create a new hake object called hake
        Hakes white = new Hakes (7, 8, 10);
        //set the width of hake object using getters/setters
        white.setWidth(15);
        //this will not print anything
        System.out.println(white.getWidth());
        //set a = the width of the white Hake object
        int a = white.getWidth();
        //print out a
        System.out.println(a);
    }
}

//groundfish class

class Groundfish {

    //instance variables
    int width;
    private int forkLength;
    int caudaulLength;

    //empty cod constructor

    Groundfish(){

    }

    //two parameter groundfish constructor
    Groundfish(int width, int forkLength) {
        this.width = width;
        this.forkLength = forkLength;
    }

    //three parameter groundfish constructor
    Groundfish(int w, int fL, int cL) {

        width = w;
        forkLength = fL;
        caudaulLength = cL;
    }

    //getters/setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getForkLength() {
        return forkLength;
    }

    public void setForkLength(int forkLength) {
        this.forkLength = forkLength;
    }

    public int getCaudaulLength() {
        return caudaulLength;
    }

    public void setCaudaulLength(int caudaulLength) {
        this.caudaulLength = caudaulLength;
    }
}


//hake class
class Hakes {

    //instance variables
    private int width;
    int forkLength;
    int caudaulLength;


    //full hake constructor
    Hakes(int w, int fL, int cL) {

        width = w;
        forkLength = fL;
        caudaulLength = cL;
    }


    //getters/setters
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getForkLength() {
        return forkLength;
    }

    public void setForkLength(int forkLength) {
        this.forkLength = forkLength;
    }

    public int getCaudaulLength() {
        return caudaulLength;
    }

    public void setCaudaulLength(int caudaulLength) {
        this.caudaulLength = caudaulLength;
    }
}









