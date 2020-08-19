package Office_Hours.Practices_08_19_2020;



/**
 * Create a class named Pizza that stores information about a single pizza.
 *         Attributes:
 *             size, NumOfCheeseTopping, NumOfPepperoniTopping
 *         Actions:
 *             set(): sets all info of the pizza
 *             calcCost(): calculates the price and returns it as double
 *             toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
 *             Pizza cost is determined by:
 *                     Small: $10 + $2 per topping
 *                     Medium: $12 + $2 per topping
 *                     Large: $14 + $2 per topping
 *
 *
 */
public class Pizza {

String size;
int numOfCheeseTopping;
int numOfPepperoniTopping;


public void set(String size, int numOfCheeseTopping, int numOfPepperoniTopping){

    this.size=size;
    this.numOfCheeseTopping= numOfCheeseTopping;
    this.numOfPepperoniTopping=numOfPepperoniTopping ;
}

public double calCost(){
    double total=0;

    if (size.equalsIgnoreCase("small")) {
        total = 10+ 2*(numOfCheeseTopping+numOfPepperoniTopping);
    } else if (size.equalsIgnoreCase("medium")) {
        total = 12+ 2*(numOfCheeseTopping+numOfPepperoniTopping);
    } else if (size.equalsIgnoreCase("large")) {
        total = 14+ 2*(numOfCheeseTopping+numOfPepperoniTopping);
    }

    return total;
}

public String toString(){
    return  "Pizza size: "+ size+ "\nNumber of cheese topping "+ numOfCheeseTopping+
            "\nNumber of pepperoni topping "+ numOfPepperoniTopping+ "\nTotal price: "+ calCost();
}

    public static void main(String[] args) {
        Pizza p1=new Pizza();
        p1.set("medium", 2, 1);

        //System.out.println(p1.calCost());

        System.out.println("==============");
        System.out.println(p1);
        System.out.println("===============");

    }


}
