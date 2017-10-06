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

class Herring { //class


    int width; //instance variables
    int forkLength;
    int caudaulLength;




    Herring(int w, int fL, int cL) { //constructor

        width = w;
        forkLength = fL;
        caudaulLength = cL;
    }

    public static void main(String[] args) { //main method .. usually would not construct
        Herring alewife = new Herring(2, 5, 7); // construct new Herring
        Herring blueback = new Herring(2, 6, 8);
        Herring atlantic = new Herring(3, 6, 8);

        Groundfish cod = new Groundfish(3, 5, 8);
        cod.width = 7;
        cod.setWidth(9);
        cod.setForkLength(6);
        //cod.forklength=6; could not run this way because forklength is private
        Groundfish pollock = new Groundfish (4, 7);
        pollock.setCaudaulLength(8);

        Hakes white = new Hakes (7, 8, 10);
        white.setWidth(15);
        System.out.println(white.getWidth());
        int a =white.getWidth();
        System.out.println(a);

    }

    int diffInLength() {    //second method
        return (caudaulLength - forkLength);
    }
}


class Groundfish { //class

    int width; //instance variables
    private int forkLength;
    int caudaulLength;
    Groundfish(){
                            //is is also a constructor
    }

    Groundfish(int width, int forkLength) {
        this.width = width;
        this.forkLength = forkLength;
    }

    Groundfish(int w, int fL, int cL) { //constructor

        width = w;
        forkLength = fL;
        caudaulLength = cL;
    }

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

class Hakes {


    private int width; //instance variables
    int forkLength;
    int caudaulLength;


    Hakes(int w, int fL, int cL) { //constructor

        width = w;
        forkLength = fL;
        caudaulLength = cL;
    }

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









