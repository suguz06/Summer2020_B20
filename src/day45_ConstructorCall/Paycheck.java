package day45_ConstructorCall;

public class Paycheck {

    public static void main(String[] args) {

        SalaryCalculator salaryOne=new SalaryCalculator(55, 40, 0.09, 0.24);
        System.out.println("salaryOne = " + salaryOne.salary());
        System.out.println("salaryOne.salary() = " + salaryOne.salaryAfterTax());
        System.out.println("salaryOne.federalTax() = " + salaryOne.federalTax());
        System.out.println("salaryOne.stateTax() = " + salaryOne.stateTax());
        System.out.println("===========");
        System.out.println(salaryOne);
    }
}
