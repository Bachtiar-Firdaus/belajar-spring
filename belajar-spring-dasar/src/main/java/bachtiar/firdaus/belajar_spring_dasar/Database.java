package bachtiar.firdaus.belajar_spring_dasar;

public class Database {

    private static Database database;

    public static Database getInstance(){
        if(database == null){
            database = new Database();
        }
        return database;
    }

    private Database(){

    }

}
