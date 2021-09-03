package aqa.core.lesson11.nSkrypak;

public class CompanyMain {
    private String name;
    private int telephone;
    private String address;
    Employees[] employee = new Employees[5];

    public String getName() { return name; }
    public void setName(String name) { this.name = "Company!";}
    public int getTelephone() { return telephone; }
    public void setTelephone(int telephone) { this.telephone = 965664455; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = "Lviv, 35 Kopernyka str"; }

    public static void main(String[] args) {
        Employees employee1 = new Employees("Diana", 987657657, 6000.35);
        System.out.println(employee1);
        Employees employee2 = new Employees("Olga", 667890900, 12000.55);
        System.out.println(employee2);
        Employees employee3 = new Employees("Ivan", 677845901, 45000.55);
        System.out.println(employee3);
        Employees employee4 = new Employees("Oksana", 680000900, 4000.55);
        System.out.println(employee4);
        Employees employee5 = new Employees("Olga", 967890933, 18000.55);
        System.out.println(employee5);

    }


}
