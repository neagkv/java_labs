package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */


class Outty{

    private int length;
    private int height;
    private int width;
    private int volume;


    public Outty(int length, int height, int width) {
        this.length = length;
        this.height = height;
        this.width = width;

    }

    public Outty() {
    }

    void createOuttyObj() {

        Outty obj = new Outty(10, 20, 35);
        Inny inny = new Inny();
        inny.innyMeth();
        inny.innyMeth2();
        obj.volume = (this.height * this.width * this.length);                  //pass by reference
        System.out.println("The volume of the Outty Object is " + obj.volume);
        System.out.println("The volume of the Inny Object is " + inny.innyMeth2());
        System.out.println("The height of the Inny object is " + inny.innyMeth());


    }


    public static void main(String[] args) {
        Outty obj2 = new Outty();
        obj2.createOuttyObj();


    }


    public int getLength() {
        return length;
    }

    public void setLenght(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    class Inny{

        int innyMeth() {
            setHeight(10);
            System.out.println(getHeight());
            return (getHeight() + 5);

        }

        int innyMeth2() {
            setLenght(700);
            setWidth(34);
            System.out.println(getLength());
            volume = (getLength() * getHeight() * getWidth());
            return(volume);
        }




        }
    }

