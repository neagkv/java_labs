package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */


class Movies {

    private int year;
    private int budget;
    private double views;
    private boolean longer_2hrs;
    private char rating;


    public char getRating() {
        return rating;
    }

    public void setRating(char rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public double getViews() {
        return views;
    }

    public void setViews(double views) {
        this.views = views;
    }

    public boolean isLonger_2hrs() {
        return longer_2hrs;
    }

    public void setLonger_2hrs(boolean longer_2hrs) {
        this.longer_2hrs = longer_2hrs;
    }
}


class Movie_Creator{


    public static void main(String[] args) {

         Movies star_wars = new Movies();
         Movies lion_king = new Movies();
         Movies et = new Movies();
         Movies the_Matrix = new Movies();

         star_wars.setBudget(5);
         star_wars.setViews(20);
         star_wars.setLonger_2hrs(true);
         star_wars.setYear(1977);



         lion_king.setYear(1995);
         lion_king.setLonger_2hrs(false);
         lion_king.setViews(18);
         lion_king.setBudget(10);



        setMovieDetails(et);
        setMovieDetails(star_wars, 2500000);
        setMovieDetails(the_Matrix, 'R');

        System.out.println("1st pass Lion King: Year" + " " + lion_king.getYear() + " Longer than 2 hours(Y/N):" +
                lion_king.isLonger_2hrs() + " Views:" + lion_king.getViews() + " Budget:" + lion_king.getBudget());

        changeMovieDetails(lion_king,  1995, 10, 18, false);

        System.out.println("2nd pass Lion King: Year" + " " + lion_king.getYear() + " Longer than 2 hours(Y/N):" +
                lion_king.isLonger_2hrs() + " Views:" + lion_king.getViews() + " Budget:" + lion_king.getBudget());

        changeMovieDetails(lion_king, lion_king.getYear(), lion_king.getBudget(), lion_king.getViews());

        System.out.println("3rd pass Lion King: Year" + " " + lion_king.getYear() + " Longer than 2 hours(Y/N):" +
                lion_king.isLonger_2hrs() + " Views:" + lion_king.getViews() + " Budget:" + lion_king.getBudget());

        changeMovieDetails(lion_king, lion_king.getYear(), lion_king.getBudget());

        System.out.println("4th pass Lion King: Year" + " " + lion_king.getYear() + " Longer than 2 hours(Y/N):" +
                lion_king.isLonger_2hrs() + " Views:" + lion_king.getViews() + " Budget:" + lion_king.getBudget());



    }

    public static void setMovieDetails(Movies movie) {
        movie.setViews(25);
        movie.setBudget(8);
        movie.setLonger_2hrs(true);
        movie.setYear(1988);
        movie.setRating('G');
    }

    public static void setMovieDetails(Movies movie, int views) {
        movie.setViews(views);
        movie.setBudget(8);
        movie.setLonger_2hrs(true);
        movie.setYear(1988);
        movie.setRating('G');
    }

    public static void setMovieDetails(Movies movie, char rating){
        movie.setRating(rating);
    }

    public static void changeMovieDetails(Movies movie, int year, int budget, double views, boolean longer_2hours){
        movie.setYear(year - 15);
        movie.setBudget(budget + 30);
        movie.setViews(views + 25);
        movie.setLonger_2hrs(false);

    }

    public static void changeMovieDetails(Movies movie, int year, int budget, double views){
        movie.setYear(year - 3);
        movie.setBudget(budget + 6);
        movie.setViews(views + 84);
    }

    public static void changeMovieDetails(Movies movie, int year, int budget){
        movie.setYear(year - 18);
        movie.setBudget(budget + 34);

    }







}

