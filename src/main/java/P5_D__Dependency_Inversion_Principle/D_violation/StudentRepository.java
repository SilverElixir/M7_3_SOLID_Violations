package main.java.P5_D__Dependency_Inversion_Principle.D_violation;

import main.java.P5_D__Dependency_Inversion_Principle.CustomMySqlConnection;

public class StudentRepository {

    private CustomMySqlConnection connection;

    /**
     * The violation is in repository class because that classes are depend on MySqlConnection.java
     * to finish their method (insert, update, delete). Now, what happen if we need to change MySqlConnection.java
     * to PsqlConnection.java ? We need modify all of classes that depend on MySqlConnection.java,
     * it’s will be very dangerous because we need to modify a lot of class.
     */
    public StudentRepository(CustomMySqlConnection conn){
        this.connection = conn;
    }

    public void save(){
        connection.insert();
    }

    public void delete(){
        connection.delete();
    }
}
