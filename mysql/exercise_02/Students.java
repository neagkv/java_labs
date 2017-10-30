package mysql.exercise_02;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Students {


        int id;
        String f_name;
        String l_name;
        String p_langaue;
        String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getP_langaue() {
        return p_langaue;
    }

    public void setP_langaue(String p_langaue) {
        this.p_langaue = p_langaue;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", p_langaue='" + p_langaue + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}





