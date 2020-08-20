package Office_Hours.Practices_08_19_2020;

import java.util.ArrayList;

public class PizzaOrder {


    public static void main(String[] args) {

        ArrayList<Pizza> pizzaForBacth20= new ArrayList<>();

        for (int i=0; i<400; ++i) {
            Pizza myOrder = new Pizza();
            myOrder.set("large", 2, 2);
             pizzaForBacth20.add(myOrder);
        }

        System.out.println("Total Number of Pizza: " +pizzaForBacth20.size());
        double total=0;
        for (Pizza each: pizzaForBacth20) {
            total +=each.calCost();
        }

        System.out.println(total);

        System.out.println("==============");

        Pizza pizza1=new Pizza();
        pizza1.set("large", 3, 4);
        Pizza pizza2=new Pizza();
        pizza2.set("Medium", 5, 2);
        System.out.println("=============");
        System.out.println(pizza1.calCost());
        System.out.println(pizza2.calCost());

    }
}
