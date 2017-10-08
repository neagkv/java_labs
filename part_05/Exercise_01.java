package part_05;

import java.util.ArrayList;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */


class StateController {

    public static void main(String[] args) {

        State tx = new State();
        State ny = new State();

        tx.setPopulation(300000);
        tx.setGdp(5670);
        tx.setArea(60484);
        tx.createCity(6000, "Houston");
        tx.createCity(7000, "Dallas");
        tx.createCounty(800, "Denton_County");
        tx.createCounty(800, "Dallas_County");

        ArrayList<City> texasCities = tx.getCities();
        ArrayList<County> texasCounties = tx.getCounties();


        for(City x : texasCities){
            System.out.println(x.getName() + " " + x.getCityPop());
        }

        for(County x : texasCounties){
            System.out.println(x.getCountyName() + " " + x.getCountyPop());
        }

        ny.setGdp(60000);
        ny.setArea(563773);
        ny.setPopulation(43787);




        System.out.println("The area of Texas is " + tx.getArea() + " " + "and the are of New York is" + ny.getArea());

    }
}


class State {

    private int population;
    private int gdp;
    private int area;

    private ArrayList<City> cities= new ArrayList<>();
    private ArrayList<County> counties= new ArrayList<>();

    int countyCount=0;
    int cityCount=0;

    public ArrayList<County> getCounties() {
        return counties;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public void createCity(int cityPop, String name) {
        City city = new City();
        city.setCityPop(cityPop);
        city.setName(name);

        cities.add(city);
    }

    public void createCounty(int countyPop, String countyname) {
        County county = new County();
        county.setCountyPop(countyPop);
        county.setCountyName(countyname);

        counties.add(county);
    }

}

class City {

    private int cityPop;
    private String name;

    public int getCityPop() {
        return cityPop;
    }

    public void setCityPop(int cityPop) {
        this.cityPop = cityPop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class County {

    private int countyPop;
    private String countyName;


    public int getCountyPop() {
        return countyPop;
    }

    public void setCountyPop(int countyPop) {
        this.countyPop = countyPop;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}

//create an archicht class has  that modifies a room class and has instances of each of the following classes, art, bed, rug
// table