package main.java.P5_D__Dependency_Inversion_Principle.D_right;

import main.java.P5_D__Dependency_Inversion_Principle.IConnection;

public class StudentRepository {

//    public StudentRepository(CustomMySqlConnection conn){
    public StudentRepository(IConnection conn){
        this.connection = conn;
    }

    public void save(){
        connection.insert();
    }

    public void delete(){
        connection.delete();
    }
}

class Main{

    StudentRepository studentRepository = new StudentRepository(c)
}
