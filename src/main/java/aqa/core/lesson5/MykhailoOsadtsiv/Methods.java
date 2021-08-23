package aqa.core.lesson5.MykhailoOsadtsiv;

public class Methods {
    public static void main(String[] args) {
        //Реализуй метод getAverageSalary(double[] salaries), возвращающий среднее значение в массиве salaries.
        //
        //Пример:
        //
        //getAverageSalary(new double[] {1000.00, 500.00}); -> 750.00
        //getAverageSalary(new double[] {100.00, 200.00, 300.00}); -> 200.00
        //getAverageSalary(new double[0]); -> 0.00

    }

    public static double getAverageSalary(double[] salaries) {
        // write your code here
        if (salaries.length == 0) {
            return 0;
        } else {
            double sum = 0;
            for (int i = 0; i < salaries.length; i++) {
                sum += salaries[i];
            }
            return sum / salaries.length;
        }
    }
}
