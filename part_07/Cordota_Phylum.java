package part_07;

interface MyInterface {

    public void myMeth1();
    public void myMeth2();
    public void myMeth3();
}

//interface extending another interface
interface MyInterface2 extends MyInterface {
    public int myMeth1(int i, int x);
    public void myMeth1(int x);
}

interface MyInterface3 {
    public void myMethod6();
    public void myMethod7();
    public void Mymethiod8();
}


public class Cordota_Phylum implements MyInterface2, MyInterface3 {


    @Override
    public void myMeth1() {

    }

    @Override
    public void myMeth2() {

    }

    @Override
    public void myMeth3() {

    }

    @Override
    public int myMeth1(int i, int x) {
        return 0;
    }

    @Override
    public void myMeth1(int x) {

    }

    @Override
    public void myMethod6() {

    }

    @Override
    public void myMethod7() {

    }

    @Override
    public void Mymethiod8() {

    }

    private boolean hasNotochord = true;
    private boolean hasNervecord = true;
    private boolean haspharyngeal_slits = true;
    private boolean haspostanaltail = true;


    public Cordota_Phylum(boolean hasNotochord, boolean hasNervecord, boolean haspharyngeal_slits, boolean haspostanaltail) {
        this.hasNotochord = hasNotochord;
        this.hasNervecord = hasNervecord;
        this.haspharyngeal_slits = haspharyngeal_slits;
        this.haspostanaltail = haspostanaltail;
    }

    public boolean isHasNotochord() {
        return hasNotochord;
    }

    public void setHasNotochord(boolean hasNotochord) {
        this.hasNotochord = hasNotochord;
    }

    public boolean isHasNervecord() {
        return hasNervecord;
    }

    public void setHasNervecord(boolean hasNervecord) {
        this.hasNervecord = hasNervecord;
    }

    public boolean isHaspharyngeal_slits() {
        return haspharyngeal_slits;
    }

    public void setHaspharyngeal_slits(boolean haspharyngeal_slits) {
        this.haspharyngeal_slits = haspharyngeal_slits;
    }

    public boolean isHaspostanaltail() {
        return haspostanaltail;
    }

    public void setHaspostanaltail(boolean haspostanaltail) {
        this.haspostanaltail = haspostanaltail;
    }

    void move(){
        System.out.println("Moving");
    }

    void eat(){
        System.out.println("Eating");
    }

    void sleeping(){
        System.out.println("sleep");
    }

}

class Controller {


    public static void main(String[] args) {

        Cordota_Phylum reptiles = new Cordota_Phylum(true, true, true, true);
        Mammilia_Class squirrel = new Mammilia_Class(true, true, true, true,
                4,7, true, true);
        Carnivora_Order hyena = new Carnivora_Order(true, true, true, true,
                4, 7, true, true, 4, 2);
        Pinnipedia sea_lion = new Pinnipedia(true,true,true,true,
                4, 7, true, true, 4,
                2,true,true,4);

        System.out.println("For reptiles:\n 1.)Have NotoChord\n" + reptiles.isHasNervecord() + "\n" + "2.) Have NerveChord\n"
                + reptiles.isHasNervecord() + "\n" + "3.) Have slits\n" + reptiles.isHaspharyngeal_slits() + "\n" +
                "4.)Has tail\n" + reptiles.isHaspostanaltail());

        System.out.println();

        squirrel.changeEveryParentParameter();

        System.out.println("For squirrels:\n 1.)Have NotoChord\n" + squirrel.isHasNervecord() + "\n" + "2.) Have NerveChord\n"
                + squirrel.isHasNervecord() + "\n" + "3.) Have slits\n" + squirrel.isHaspharyngeal_slits() + "\n" +
                "4.)Has tail\n" + squirrel.isHaspostanaltail());

        System.out.println();

        System.out.println("Squirrels have " + squirrel.getChambersInHeart() + " " + "Chambers in their hearts" + " and"
                + " " + squirrel.getCervicalVertebrate() + " " + "vertebrates");

        System.out.println();


        hyena.changeEveryParentParameter();

        System.out.println("Heyna have " + hyena.getChambersInHeart() + " " + "Chambers in their hearts" + " and"
                + " " + hyena.getCervicalVertebrate() + " " + "vertebrates");

        System.out.println();

        sea_lion.sealStuff();

        System.out.println(sea_lion.sealStuff(sea_lion.getChambersInHeart()));

        System.out.println();


    }
}
