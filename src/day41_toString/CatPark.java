package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatPark {

    public static void main(String[] args) {

Cat cat1=new Cat();
cat1.setInfo("Van", 3, 'M', "white", "vann");
        Cat[] catPark={cat1,new Cat(), new Cat(),
                new Cat(), new Cat()};

        catPark[1].setInfo("Bella",1,'F',"Black","Bombay");
        catPark[2].setInfo("Leo",3,'M',"Gray","Russian Blue");
        catPark[3].setInfo("Mayo",4,'F',"Yellow","Birman");
        catPark[4].setInfo("Jack",5,'M',"beige","Turkish");

        for (Cat each: catPark) { // every member object print
            System.out.println(each);
        }

        System.out.println("==================");
        //System.out.println(Arrays.toString(catPark)); // all arrays elements print

        ArrayList<Cat> maleCats=new ArrayList<>();
        ArrayList<Cat> femaleCats= new ArrayList<>();

//        for (Cat each: catPark) {
//            if(each.gender=='M') {
//                maleCats.add(each);
//            } else femaleCats.add(each);
//        }
//
//        System.out.println(femaleCats);
//        System.out.println(maleCats);

        // OR removeIf

        maleCats.addAll(Arrays.asList(catPark));
        maleCats.removeIf(p-> p.gender=='F');

        femaleCats.addAll(Arrays.asList(catPark));
        //femaleCats.removeAll(maleCats);
         femaleCats.removeIf(p->p.gender=='M');

        System.out.println("Number of male cats:" +maleCats.size());
        System.out.println("Number of female cats:" +femaleCats.size());

    }
}
