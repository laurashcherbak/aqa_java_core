package aqa.core.lesson11.alun;
import java.util.Arrays;

public class Company {
    String nic;
    String adr;
    int tel;
    Workers [] workers;
    int minFee = 200;



    public Company(String nic, String adr, int tel) {
        this.nic=nic;
        this.adr=adr;
        this.tel=tel;
        this.workers=new Workers[5];
    }



    @Override
    public String toString() {
        return "Company{" +
                "name='" + nic + '\'' +
                ", address='" + adr + '\'' +
                ", phone='" + tel + '\'' +
//                ", workers=" + Arrays.toString(workers) +
                '}';
    }
}
