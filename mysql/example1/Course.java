package mysql.example1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Course {


    int id;
    String name;
    int units;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", units=" + units +
                '}';
    }
}
