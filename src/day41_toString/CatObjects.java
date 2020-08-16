package day41_toString;


// sout(cats[0] ) or  sout(cats[0].toString() )   !!!!! both of works
// if you write toString() method it is implicilty works, no need to call as similar getInfo()
import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects {


    public static void main(String[] args) {


        Cat [] cats={new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

    cats[0].setInfo("Sunny",5,'F',"White","LiHua");
        cats[1].setInfo("Suy",5,'M',"Gray","LiHua");
        cats[2].setInfo("Sun",3,'F',"Gray","LiHua");
        cats[3].setInfo("Sune",2,'F',"Black","LiHua");
        cats[4].setInfo("Sut",4,'M',"Gray","LiHua");

for (Cat a: cats) {
        System.out.println(a); }

        System.out.println("=================");

        ArrayList<Cat> maleCats=new ArrayList();
        ArrayList <Cat> femaleCats=new ArrayList();

        // one way for loop
//        for (Cat each: cats) {
//            if (each.gender=='F') {
//                femaleCats.add(each);
//            } else  maleCats.add(each);
//        }
//
//        System.out.println();
//
//        for (Cat a: maleCats) {
//            System.out.println(a); }
//        System.out.println("====");
//        for (Cat a: femaleCats) {
//            System.out.println(a); }

        // second way

        maleCats.addAll(Arrays.asList(cats));
        maleCats.removeIf(p->p.gender=='F');
        femaleCats.addAll(Arrays.asList(cats));
        femaleCats.removeIf(p->p.gender=='M');


        for (Cat a: maleCats) {
            System.out.println("Male cat:" +a); }

        System.out.println("====");
        for (Cat a: femaleCats) {
            System.out.println("Female Cat:" +a ); }


      cats[1].eat("meat");
        cats[2].drink("milk");

    }
}
