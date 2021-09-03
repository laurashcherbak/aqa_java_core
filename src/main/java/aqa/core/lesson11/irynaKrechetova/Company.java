package aqa.core.lesson11.irynaKrechetova;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Company {

    private String name;
    private String adress;
    private String phoneNumber;
    private ArrayList<Person> personal = new ArrayList<Person>();
    private double minimal;

    public Company(String name, String adress, String phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setAdress(String adress) {this.adress = adress;}
    public String getAdress() {return adress;}

    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
    public String getPhoneNumber() {return phoneNumber;}

    public ArrayList<Person> getPersonal() {return personal;}
    public void addPerson(String n, double m, String p) throws Exception {
        if(m < minimal) throw new Exception("you have not enough money");
        personal.add( new Person(n, m, p));}
    public void removePerson(Person per) {personal.remove(per);}

    public double getMinimal() {return minimal;}
    public void setMinimal(double minimal) {this.minimal = minimal;}
    public Person getPersonByNqme(String name) {
        for (Person p: personal){
                if (p.getName().equals(name)) return  p;
        }
        return null;
    }

    public double calcAllMoney() {
        double allMoney = 0;
        for(Person per : personal) {
            allMoney = allMoney + per.getMoney();
        }
        return allMoney;
    }

    public double calc() {
        int n = personal.size();
        double calcResult = calcAllMoney()/n;
        return calcResult;
    }

    public String findTheRichest() {

        Comparator<Person> theRichestPerson = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return (int) (p1.getMoney() - p2.getMoney());
            }
        };

        Collections.sort(this.personal, theRichestPerson);
        return this.personal.get(0).getName();
    }
}
