package day44_Constructor;
/*
1. Create a class named Pizza that stores information about a single pizza.
        Attributes:
            size, NumOfCheeseTopping, NumOfPepperoniTopping
        Actions:
            set(): sets all info of the pizza
            calcCost(): calculates the price and returns it as double
            toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
            Pizza cost is determined by:
                    Small: $10 + $2 per topping
                    Medium: $12 + $2 per topping
                    Large: $14 + $2 per topping

 */
public class warmUp {
}

class Pizza{

    String size;
    int numOfCheeseTopping;
    int numOfPeppereoniTopping;

    public void set(    String size, int numOfCheeseTopping, int numOfPeppereoniTopping){
        this.size= size;
        this.numOfCheeseTopping= numOfCheeseTopping;
        this.numOfPeppereoniTopping= numOfPeppereoniTopping;

    }

    public double calCost(){
        double total=0;
        int perTopping=2;
        if(size.equals("Small")) {
            total=10+ perTopping*(numOfCheeseTopping+ numOfPeppereoniTopping);
        }  else if(size.equals("Medium")) {
            total=12+ perTopping*(numOfCheeseTopping+ numOfPeppereoniTopping);
        }  else if(size.equals("Large")) {
            total=14+ perTopping*(numOfCheeseTopping+ numOfPeppereoniTopping);
        }

        return total;
    }

    public String toString(){
        return "size: "+ size +" number of Cheese: "+ numOfCheeseTopping
                + " number of Pepperoni: "+numOfPeppereoniTopping+ " total cost "+ calCost();
    }

    public static void main(String[] args) {
        Pizza obj1=new Pizza();

        obj1.set("Small", 2, 1);
        System.out.println(obj1.calCost());
        System.out.println(obj1);
        System.out.println("-=----------------");

        Pizza obj2=new Pizza();
        obj2.set("Large", 2, 2);
        System.out.println(obj2.calCost());
        System.out.println(obj2);

    }

}