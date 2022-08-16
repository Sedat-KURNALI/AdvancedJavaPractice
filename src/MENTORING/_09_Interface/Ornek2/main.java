package MENTORING._09_Interface.Ornek2;


class dataBaseManager {
    public void addDatabase(IDatabase database) {
        database.add();
    }

    public void deleteDatabase(IDatabase database) {
        database.delete();
    }

    public void getDatabase(IDatabase database) {
        database.get();
    }

    public void updateDatabase(IDatabase database) {
        database.update();
    }
}

public class main {
    public static void main(String[] args) {

        dataBaseManager manager = new dataBaseManager();

        manager.addDatabase(new microsoftDataBase());
        manager.deleteDatabase(new microsoftDataBase());
        manager.getDatabase(new microsoftDataBase());
        manager.updateDatabase(new microsoftDataBase());

        System.out.println("------------------------");

        manager.addDatabase(new googleDataBase());
        manager.deleteDatabase(new googleDataBase());
        manager.getDatabase(new googleDataBase());
        manager.updateDatabase(new googleDataBase());

        System.out.println("----------------------");

        manager.addDatabase(new appleDataBase());
        manager.deleteDatabase(new appleDataBase());
        manager.getDatabase(new appleDataBase());
        manager.updateDatabase(new appleDataBase());
    }
}
