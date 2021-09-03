package aqa.core.lesson11.irynaKrechetova;

public class Main {

    public static void main(String[] args) throws Exception {

        Company hell = new Company("Hell", "Tartar", "666");

        hell.setMinimal(1000);
        hell.addPerson("Alice", 1200, "123");
        hell.addPerson("Bob", 1300, "234");
        hell.addPerson("Cecile", 1020, "345");
        System.out.println(hell.calcAllMoney());
        System.out.println(hell.findTheRichest());
        System.out.println(hell.calc());

        hell.removePerson(hell.getPersonByNqme("Bob"));

        try {hell.addPerson("Devil", 666, "6666");}
        catch (Exception e) {
            e.printStackTrace();
        }



    }

}
