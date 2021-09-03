package aqa.core.lesson11.alun;

public class Workers {
    String name;
    int phone;
    int fee;

    public Workers(String name, int phone, int fee) {
        this.name=name;
        this.phone=phone;
        this.fee=fee;

    }

    public static void addWorkers(Workers workers) {
    }

    public String getName() {return name;}
    public int getPhone() {return phone;}
    public int getFee() {return fee;}
    public void setName(String name){this.name=name;}
    public void setPhone(int phone){this.phone=phone;}
    public void setFee(int fee){this.fee=fee;}

    @Override
    public String toString() {
        return "Workers{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", fee='" + fee + '\'' +
                '}';
    }
}
