package aqa.core.lesson6.NazarVdovych;

import java.util.Objects;

public class MobilePhone {

        private long id;

        public String Model;
        public String Model1 = "Huawei";
        public int Memory;
        public double Display;
        public int Battery;
        public boolean Phone;


        public MobilePhone(){}

public MobilePhone (boolean Phone, long id, int Battery){
        this.Phone = Phone;
        this.id = id;
        this.Battery = Battery;
        //System.out.println("Телефон");
}
        public MobilePhone(String Model, int Memory,double Display) {
                this.Model = Model;
                this.Memory = Memory;
                this.Display = Display;

                // System.out.println(Model + Memory + Display);
        }

        @Override
        public String toString() {
                return "MobilePhone{"
                        + "Model='" + Model + '\''
                        + ", Memory=" + Memory
                        + ", Display=" + Display
                        + '}';
        }

public String getModel() {
        return Model;
}
public double getDisplay() {
                return Display;
}
public boolean getPhone() {
               return  Phone;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) {
                        return true;
                }
                if (o == null || getClass() != o.getClass()) {
                        return false;
                }

                MobilePhone mobilePhone = (MobilePhone) o;

                if (getDisplay() != mobilePhone.getDisplay()) {
                        return false;
                }
                if (getPhone() != mobilePhone.getPhone()) {
                        return false;
                }
                return getModel() != null
                        ? getModel().equals(mobilePhone.getModel())
                        : mobilePhone.getModel() == null;

        }
        @Override
        public int hashCode() {
                int result = (int) (id ^ (id >>> 32));
                result = 31 * result + Battery;
                return result;
        }

        public String getModel1() {
                return  Model1;
        }

      public int CPU = 2;
        public int getCPU() {
                return CPU;
        }




}


