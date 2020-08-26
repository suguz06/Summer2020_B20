package day45_ConstructorCall;


/*
Task02:
        Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate,
                    fedralTaxRate
                add a constructor can initialize those fields
                instance methods:
                    salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
                    stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
                    federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)

                    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()

 */
public class SalaryCalculator {

     double hourlyRate;
     int weeklyHour;
     double stateRate;
     double federalRate;

    public SalaryCalculator(double hourlyRate, int weeklyHour, double stateRate, double federalRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHour = weeklyHour;
        this.stateRate = stateRate;
        this.federalRate = federalRate;
    }

    public double salary(){
        return  hourlyRate*weeklyHour*48;
    }

    public double stateTax() {
        return  salary()*stateRate;
    }
    public double federalTax(){
        return salary()*federalRate;
    }
    public double salaryAfterTax() {
        return salary()-stateTax()-federalTax();
    }
    public String toString( ){
    return "Hourly rate: "+ hourlyRate+ "\nweekly hours: "+ weeklyHour+
          "\nState Tax:" + stateTax()+ "\nFederal Tax: "+ federalTax() +"\nsalary after tax: "+ salaryAfterTax();
    }



}
