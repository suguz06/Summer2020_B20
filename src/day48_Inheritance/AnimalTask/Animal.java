package day48_Inheritance.AnimalTask;

public class Animal { //building the relationship  between the class (parent(super)-child(subclasss) => IS A relation
    public String name;
    public String size;
    public int age;
    public char gender;
    public String breed;
    public double weight;


    // you cannot inherited constructor=> cuz constructor name should be same
    // ==>>same name of class==> then you can not use constructor in sub-class
    public void setInfo(String name, String size, int age, char gender, String breed, double weight){
        this.name=name;
        this.size=size;
        this.age=age;
        this.gender=gender;
        this.breed=breed;
       this.weight= weight;
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }



    public String toString() {
        return "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", gender=" + gender+
        ", breed=" + breed+ ", weight=" + weight;

    }
}
