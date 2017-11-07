package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */


class TvShows{

    private String name;
    private int seasons;
    private int epsiodes;

    TvShows(String name, int seasons, int epsiodes) {
        this.name = name;
        this.seasons = seasons;
        this.epsiodes = epsiodes;
    }

    TvShows(String name, int seasons) {
        this.name = name;
        this.seasons = seasons;
    }

    TvShows(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpsiodes() {
        return epsiodes;
    }

    public void setEpsiodes(int epsiodes) {
        this.epsiodes = epsiodes;
    }
}



class TvConstructer {

    public static void main(String[] args) {

        TvShows simpsons = new TvShows("The_Simpsons", 30, 700);
        TvShows friends = new TvShows("Friends", 18);
        TvShows got = new TvShows("Game of Thrones");

        simpsons.setEpsiodes(5000);
        friends.setSeasons(15);
        got.setName("G_O_T");


        System.out.println(simpsons.getEpsiodes());
        System.out.println(got.getName());
    }
}

