package day24_Array;


/*
for each loop=> we must have a data strcuture==> already iterated
strating from 0 to end of data structures==> order fixed
1-Array
2-Collection
3-Map

for( datatype each: Data collection) =>data type and collection must same
 */
public class ForEachLoop {
    public static void main(String[] args) {

int[] arr={1,2,3,5,60};
  for(int i=0;i<=arr.length-1;++i){
      System.out.print(arr[i]+ " ");
  }
        System.out.println("");
   // for each=>     for(Data type each:  Collection of Data)
        // each represent every single elemenys in collection{}
        System.out.println("=====");



for(int each:arr) { //each represents the elements
    System.out.print(each+ " ");
}

        System.out.println("");
String[] names={"aa","bb","cc","dddd"};

        for (String each:
             names) {
            System.out.println(each);

        }



    }
}
