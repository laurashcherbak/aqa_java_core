package aqa.core.lesson6.NazarVdovych;


    public class Nokia extends MobilePhone {

        public String Model1 = "Xiomi";
        public Nokia (boolean Phone, int Battery,String Model, int Memory,double Display){
            this.Phone = Phone;
            this.Battery = Battery;
            this.Model = Model;
            this.Memory = Memory;
            this.Display = Display;
            //System.out.println("Телефон");
        }

        public Nokia (){

        }



        @Override
        public String getModel1() {
         return  Model1;
        }


            public static void main(String[] arg) {
                MobilePhone Mobile = new MobilePhone();
                Mobile.getCPU();
            }


    }

