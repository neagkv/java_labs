package part_07;

public class Pinnipedia extends Carnivora_Order {
    static int numbOfSubFamilies = 3;
    private boolean livesInWater = true;
    private boolean eatsFish = true;
    private int numbOfFins = 4;

    public Pinnipedia(boolean hasNotochord, boolean hasNervecord, boolean haspharyngeal_slits, boolean haspostanaltail,
                      int chambersInHeart, int cervicalVertebrate, boolean hasHair, boolean warmblooded, int numbOfToes,
                      int numbSetsOfTeeth, boolean livesInWater, boolean eatsFish, int numbOfFins) {
        super(hasNotochord, hasNervecord, haspharyngeal_slits, haspostanaltail, chambersInHeart, cervicalVertebrate,
                hasHair, warmblooded, numbOfToes, numbSetsOfTeeth);
        this.livesInWater = livesInWater;
        this.eatsFish = eatsFish;
        this.numbOfFins = numbOfFins;
    }

    void sealStuff() {
        System.out.println("Seal Stuff");
    }

    int sealStuff(int x) {
        System.out.println("New Chambers in heart");
        return (getChambersInHeart() - 90000);

    }

    void sealStuff2() {
        System.out.println("More seal stuff");
    }
}





