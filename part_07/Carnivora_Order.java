package part_07;

public class Carnivora_Order extends Mammilia_Class {

    static int numbOfSpecies = 260;
    private int numbOfToes;
    private int numbSetsOfTeeth;

    public Carnivora_Order(boolean hasNotochord, boolean hasNervecord, boolean haspharyngeal_slits,
                           boolean haspostanaltail, int chambersInHeart, int cervicalVertebrate, boolean hasHair,
                           boolean warmblooded, int numbOfToes, int numbSetsOfTeeth) {
        super(hasNotochord, hasNervecord, haspharyngeal_slits, haspostanaltail, chambersInHeart, cervicalVertebrate,
                hasHair, warmblooded);
        this.numbOfToes = numbOfToes;
        this.numbSetsOfTeeth = numbSetsOfTeeth;
    }


    @Override
    void changeEveryParentParameter(){
        System.out.println("Changing Every Parent Parameter");
        setHasNervecord(false);
        setHasNotochord(false);
        setHaspharyngeal_slits(false);
        setHaspostanaltail(false);
        setCervicalVertebrate(1);
        setChambersInHeart(2);
        setWarmblooded(false);
        setHasHair(false);
    }

    void carnivorMeth1(){
        System.out.println("Carnivor Method 1");
    }

    void carnivorMeth2(){
        System.out.println("Carnivor Method 2");
    }

    void carnivorMeth3(){
        System.out.println("Carnivor Method 3");
    }



}
