package day03_sequence_Variables;

public class SalaryCalculator {

    public static void main(String[] args) {

        int $salary= 1050000;
        double _tax=0.25;


        System.out.println("Salary net for month is:"
                +  $salary*(1-_tax)/12);

    }
}
