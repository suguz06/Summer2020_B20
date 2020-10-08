package Office_Hours.Practices_10_07_2020;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) { // iterable is a root interface of Collection frame


        Set<Integer> st=new LinkedHashSet<>(); //keep insertion order
        st.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

          Iterator<Integer> it = st.iterator();

          while (it.hasNext()) {
              Integer each = it.next();
              if (each <5) {
                  it.remove();
              }
          }

        System.out.println(st);


        System.out.println("---------------");
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));


//        for (int i = 0; i <list.size() ; i++) { //give error
//            if(list.get(i)<5) {
//                list.remove(i);
//            }
//
//        }

     //   list.removeIf(p-> p<5); //internally it uses iterable


        Iterator<Integer> it2 = list.iterator();

        while (it2.hasNext()) {
            if (it2.next()<5){
                it2.remove();
            }
        }

        System.out.println(list);


        System.out.println("====================");

        String [] names={"Gokhan", "Hakki", "Ziiadin", "Hakki", "Ramazan", "Beslan",  "Hakki"};

        Set<String > registration=new LinkedHashSet<>();
        registration.addAll(Arrays.asList(names));

        System.out.println("registration = " + registration);


        Iterator<String> it3 = registration.iterator();

        while (it3.hasNext()) {
            if (it3.next().contains("i")){

                it3.remove();
            }
        }

        System.out.println(registration);
    }
}
