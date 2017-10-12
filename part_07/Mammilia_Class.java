package part_07;

public class Mammilia_Class  extends Cordota_Phylum {

    private int chambersInHeart;
    private int cervicalVertebrate;
    private boolean hasHair;
    private boolean warmblooded;

    public Mammilia_Class(boolean hasNotochord, boolean hasNervecord, boolean haspharyngeal_slits,
                          boolean haspostanaltail, int chambersInHeart, int cervicalVertebrate,
                          boolean hasHair, boolean warmblooded) {
        super(hasNotochord, hasNervecord, haspharyngeal_slits, haspostanaltail);
        this.chambersInHeart = chambersInHeart;
        this.cervicalVertebrate = cervicalVertebrate;
        this.hasHair = hasHair;
        this.warmblooded = warmblooded;
    }


    public int getChambersInHeart() {
        return chambersInHeart;
    }

    public void setChambersInHeart(int chambersInHeart) {
        this.chambersInHeart = chambersInHeart;
    }

    public int getCervicalVertebrate() {
        return cervicalVertebrate;
    }

    public void setCervicalVertebrate(int cervicalVertebrate) {
        this.cervicalVertebrate = cervicalVertebrate;
    }

    public boolean isHasHair() {
        return hasHair;
    }

    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public boolean isWarmblooded() {
        return warmblooded;
    }

    public void setWarmblooded(boolean warmblooded) {
        this.warmblooded = warmblooded;
    }

    void changeEveryParentParameter(){
        System.out.println("Changing Every Parent Parameter");
        setHasNervecord(false);
        setHasNotochord(false);
        setHaspharyngeal_slits(false);
        setHaspostanaltail(false);

    }

    void mammalMeth2(){
        System.out.println("mammal method 2");
    }

    void mammalMeth3(){
        System.out.println("mammal method 3");
    }



}
