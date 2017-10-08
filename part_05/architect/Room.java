package part_05.architect;

public class Room {

    private int lenght;
    private int width;
    private int height;
    Bed bed;
    Table table;
    Art art;

    public Room(int lenght, int width, int hight, Bed bed, Table table, Art art) {
        this.lenght = lenght;
        this.width = width;
        this.height = hight;
        this.bed = bed;
        this.table = table;
        this.art = art;
    }

    public Room() {
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Art getArt() {
        return art;
    }

    public void setArt(Art art) {
        this.art = art;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHight() {
        return height;
    }

    public void setHight(int hight) {
        this.height = hight;
    }

//    public void createBed(char sheet_Color, char bedSize){
//        Bed myBed = new Bed();
//        myBed.setBedSize(bedSize);
//        myBed.setSheet_Color(sheet_Color);
//    }
//
//    public void createArt(int[] artWork){
//        Art paintings = new Art();
//        paintings.setArtWork(artWork);
//    }
//
//    public void createTable()


}
