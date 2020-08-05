package day38_JavaRecap;


import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Collections Class:
        Collections.sort()
        Collections.swap()
        Collections.frequency()

        Collections.max()
        Collections.min()
        Collections.replaceAll()

 */
public class Collection_Utility {

    public static void main(String[] args) {

        ArrayList<Character> chars= new ArrayList<>();
        chars.addAll(Arrays.asList('T','A','C', 'R', 'B', 'F'));

        System.out.println(chars);

        Collections.sort(chars);

        System.out.println(chars);
        //Collections.replaceAll()


        System.out.println("===============");

        ArrayList<String > students= new ArrayList<>();
        students.addAll(Arrays.asList("Ali", "Veli", "Deli"));

        Collections.swap(students, 2, 1); // index = -1 gives outof bound execption

        System.out.println(students);

        Collections.swap(students, 0, students.size()-1);

        System.out.println(students);

        System.out.println("=======");


        ArrayList<String> items = new ArrayList<>();

        items.addAll(Arrays.asList("Book", "Coffee", "Coffee", "Egg", "Apple", "Egg", "Battery","Battery","Battery","Battery"));

        int count=Collections.frequency(items, "Battery");

        System.out.println(count);

        ArrayList<String> uniques=new ArrayList<>();

        for(String each: items) {
            if(Collections.frequency(items, each)==1) uniques.add(each);

        }
        System.out.println(uniques);


        ArrayList<String> uniques1=new ArrayList<>();

        uniques1.addAll(items);

        uniques1.removeIf(p-> Collections.frequency(items, p) !=1);
        System.out.println(uniques1);
    }
}
