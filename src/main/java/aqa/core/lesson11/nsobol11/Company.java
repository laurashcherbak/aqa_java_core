package aqa.core.lesson11.nsobol11;

public class Company {
    private Employee emp;

    {
        String name;
    int phone;
        Employee []emp;
        int minSalary=1000;

       // public Company(String name, String adress, int phone,Employee[]emp){
         //   this.name = name;
           // this.adress = adress;
            //this.phone = phone;
            //this.emp=emp;
        }
        //task1
        public String getMaxSalary(){
            int maxSalary=0;
            String name="";
            for(int i=0; i< emp.length;i++){
                if (emp[i].getSalary() >= maxSalary) {
                    maxSalary = emp[i].getSalary();
                    name = emp[i].getName();
                }
            }return name;
        }
        //task2
        public void addNew(Employee person) throws Exception{
//task6
            if(minSalary> person.getSalary()){
                throw new Exception("Salary is too little");
            }
            Employee arr=new Employee[emp.length+1];
            for (int i=0;i<emp.length; i++){
                arr[i]=emp[i];
            }
            arr[emp.length+1]=person;
            this.emp=arr;
        }
        //task3
        public void fireOne(Employee bad){
            Employee arr1=new Employee[emp.length-1];
            int index=0;
            for (int i=0;i<emp.length; i++){
                if(bad != emp[i]){
                    arr1[index]=emp[i];
                    index++;
                }
            }
            this.emp=arr1;
        }

        //task4
        public int getExpenses(){
            int expenses =0;

            for(int i=0; i<emp.length;i++){
                expenses+=emp[i].getSalary();
            }
            return expenses;
        }
        //task5
        public int avgSalary(){
            return getExpenses()/ emp.length;
        }

    }
