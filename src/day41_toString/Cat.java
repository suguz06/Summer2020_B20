package day41_toString;
/*
Cat:
        attributes:
                name, age, gender, color, breed
        Actions:
                setInfo, eat, drink, toString
                use this. keyword
    Make sure that you can print out the objects of the Cat in the print statement
    CatObjects:
            create 5 objects of Cat and store them into an array variable
            print out the informations of every single cat
                    (DO NOT use getInfo method)
            ArrayList:
                maleCats
                femaleCats
                first approach: apply loop ( both for each loop and for loop)
                second approach: do not use loop

 */
public class Cat {

    String name;
    int  age;
    char gender;
    String color;
    String  breed;

    public void setInfo(String name, int  age, char gender,
            String color, String  breed ){
       this.name=name;
       this.age=  age;
        this .gender=gender;
        this.color= color;
        this.breed=  breed;
    }

    public String toString(){

        return  "Name: "+ name+", age: "+ age+ ", color: "
                + color+ ", gender: "+gender+", breed: "+breed+ " |";
    }


    public void eat(String catFood){


        System.out.println(name+"  is eating "+catFood);
    }
    public void drink(String catDrink){


        System.out.println(name+ "  is drinking "+catDrink);
    }







}
