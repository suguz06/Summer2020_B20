package day42_Static;

import java.util.ArrayList;
import java.util.Arrays;

/*
Create a class called Server

            Attributes:
                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
            Actions: (all void methods)

                setInfo(): sets all of the instance variables with some values taken from the parameters.
                takeOrder(): server's name + "is taking an order"
                cleanTable(): server's name + "is cleaning the table"
                toString(): Returns (String) all the information of a Server
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */
public class Server {

    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;




    public void setInfo(String name, int employeeID, double hourlyRate, boolean fullTime){

        this.name= name;
        this.employeeID=employeeID;
        this.hourlyRate= hourlyRate;
        this.fullTime= fullTime;
    }
    public void takeOrder(){
        System.out.println(name+ " is taking order");
    }

    public void cleanTable(){
        System.out.println(name+ " is cleaning the table");
    }

    public String toString(){
        return name+" "+ employeeID+ " "+ hourlyRate+ "  full-time: "+fullTime;
    }



}
/*
   Create a class called Chef

            Attributes:
                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
            Actions: (all void methods)

                setInfo(): sets all of the instance variables with some values taken from the parameters.
                makeOrder(): chef's name + "is making an order"
                washDishes(): chef's name + "is washing the dishes"
                toString(): Returns (String) all the information of a Chef
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
 */


class Chef{
    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public void setInfo(String name, int employeeID, double hourlyRate, boolean fullTime){

        this.name= name;
        this.employeeID=employeeID;
        this.hourlyRate= hourlyRate;
        this.fullTime= fullTime;
    }
    public void makeOrder(){
        System.out.println(name+ " is making order");
    }

    public void washDishes(){
        System.out.println(name+ " is washing the dishes");
    }

    public String toString(){
        return name+" "+ employeeID+ " "+ hourlyRate+ "  full-time: "+fullTime;
    }
}

/*
Create a class called Restaurant

            Attributes:
                Owner (String), Location (String), numberOfStars (int)
                Servers (ArrayList of Server objects)
                Chefs (ArrayList of Chef objects)
            Actions: (all void methods)

                setInfo(): sets the owner, location, and number of stars with the given parameters
                hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
                hireServer(Server [] servers): accepts an array of Server objects and adds all of them to the Servers ArrayList
                hireServer(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept the given parameters/information of a Server and will add the given Server to the ArrayList of Servers

                hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
                hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them to the Chef ArrayList
                hireChef(String name, int employeeID, double hourlyRate, boolean fullTime): this overloaded version accept the given parameters/information of a Chef and will add the given Chef to the ArrayList of Chefs

                toString(): Return (String) of all the information of a Restaurant object. No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs along side the other information

        - Extra optional tasks
                terminateEmployee(String title, int employeeID): Create a method that will accept a String title which can only be "server" or "chef". If any other String is given it is invalid and the no action should be done (an error message can be given "invalid employee type"). Once you know which type of employee you are terminating use their given employeeID in the correct ArrayList type and remove them (you can give a message if you want: "$name was terminated").

 */

class Restaurant{
    String owner;
    String location;
    int numberOfStars;
   ArrayList<Server> Servers =new ArrayList<>();
   ArrayList<Chef> Chefs =new ArrayList<>();

   public void setInfo(String owner,String location, int numberOfStars){
       this.owner= owner;
       this.location=location;
       this.numberOfStars=numberOfStars;
   }
   public void hireSever(Server server) {
       Servers.add(server);
   }
    public void hireSever(Server[] servers) {
        Servers.addAll(Arrays.asList(servers));
    }

    public void hireServer(String name, int employeeID, double hourlyRate, boolean fullTime) {
        Server s1=new Server();
        s1.setInfo(name, employeeID, hourlyRate, fullTime);

       Servers.add(s1);
    }

    public void hireChef(Chef chef) {
       Chefs.add(chef);
    }
    public void hireChef(Chef[] chefs) {
        Chefs.addAll(Arrays.asList(chefs));
    }

    public void hireChef(String name, int employeeID, double hourlyRate, boolean fullTime) {
        Chef s1=new Chef();
        s1.setInfo(name, employeeID, hourlyRate, fullTime);

        Chefs.add(s1);
    }


    public void terminateEmployee(String title, int employeeID){

       if(title.equals("server")   ) {
           Servers.removeIf(p->p.employeeID==employeeID);
       }
        if(title.equals("chef")   ) {
            Chefs.removeIf(p->p.employeeID==employeeID);
        }
      else {
        System.out.println("invalid employee type");
    }

}

public String  toString(){
       return "owner "+owner+ " location "+ location+ " number of Stars "+ numberOfStars;
}

}

class LocalRestaurant{

    public static void main(String[] args) {

        Restaurant r1=new Restaurant();
        r1.setInfo("Jon", "TX", 5);

        Server[] servers={new Server(), new Server()};

        servers[0].setInfo("Veli", 1212,12,false);
        servers[1].setInfo("Ali", 1122, 10, true);

        ArrayList<Server> servers1=new ArrayList<>();
        servers1.addAll(Arrays.asList(servers));

        Chef [] chefs= {new Chef(),new Chef()};
        chefs[0].setInfo("Keeli", 3212,22,false);
        chefs[1].setInfo("Zelli", 3122, 30, true);

        ArrayList<Chef> chefs1=new ArrayList<>();
        chefs1.addAll(Arrays.asList(chefs));

        System.out.println(chefs1);
        System.out.println(servers1);
        System.out.println(r1);



    }
}