package part_05.architect;

public class Architect {
    public static void main(String [] args){

        Room myRoom = new Room();
        myRoom.setHight(8);
        myRoom.setLenght(12);
        myRoom.setWidth(10);

        Bed bed = new Bed('q', 'w');
        myRoom.setBed(bed);

        Table table = new Table(10,10,10);
        myRoom.setTable(table);

        //...


        /// Or use constructor as seen below
        Bed bed2 = new Bed('q', 'w');
        Table table2 = new Table(10,10, 10);
        Art art2 = new Art("Picaso", true);
        Room myRoom2 = new Room(15, 10, 8, bed2, table2, art2);



    }
}


//create all pojos
//in controller method create an instance of each pojo
//create room
//