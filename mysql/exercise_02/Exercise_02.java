package mysql.exercise_02;



//
//
//        [3:31]
//        Create a new class that is similar to MySQLAccess - it must be able to do the following things:
//        - connect to the University DB
//        - select * from students
//        - map the resultSet to arrayList of Student POJOs
//        - use an enhanced for loop to iterate over each student calling a custom toString method on each student object




import java.sql.*;
import java.util.ArrayList;

public class Exercise_02 {


    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

    public static void main(String[] args) {

        mysql.exercise_02.Exercise_02 example = new mysql.exercise_02.Exercise_02();


        try {
            example.readDataBase(34, "Bobby", "Jenkins", "English", "bjenks@gmail.com");
        } catch (Exception e) {
            System.out.println("error in readDateBase()" + e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }

    public void readDataBase(int id, String f_name, String l_name, String p_langauge, String email)
            throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connection = DriverManager.getConnection("jdbc:mysql://localhost/University?" +
                    "user=root&password=&useSSL=false");


            // Statements allow to issue SQL queries to the database
            statement = connection.createStatement();

            // Result set get the result of the SQL query
            resultSet = statement.executeQuery("select * from University.students;");

            //writeResultSet(resultSet);
            ArrayList<Students> students = mapResultSetToObjects(resultSet);

            for (Students s : students) {
                System.out.println(s.toString());
            }



        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            close();
        }

    }


    private ArrayList<Students> mapResultSetToObjects(ResultSet resultSet) throws SQLException {

        ArrayList<Students> retList = new ArrayList();

        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            Students s = new Students();
            s.setId(resultSet.getInt("id"));
            s.setF_name(resultSet.getString("f_name"));
            s.setL_name(resultSet.getString("l_name"));
            s.setP_langaue(resultSet.getString("p_language"));
            s.setEmail(resultSet.getString("email"));

            retList.add(s);
        }

        return retList;
    }


    // You need to close the resultSet
    private void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {

        }
    }
}






