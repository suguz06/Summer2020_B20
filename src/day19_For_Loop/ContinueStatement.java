package day19_For_Loop;


// continue is a skipment of current value
// continue ==>> only in loop works
public class ContinueStatement {

    public static void main(String[] args) {

//
//        for(int i=1; i<=5;i++){
//
//            if(i==3 || i==4) continue; // jumps to the next iteration
//
//            System.out.print(i+" ");
//        }
//        System.out.println("===========");
//
//        for (char ch='a'; ch<='f';ch++) {
//
//            if(ch=='c'|| ch=='f') continue;
//
//            System.out.print(ch+" ");
//        }
//        // odd numbers using continue
//        System.out.println();
// for(int i=1; i<=100; ++i) {
//     if(i%2==0)continue;
//     System.out.print(i+" ");
// }
//        System.out.println();
////even numbers
//        for(int i=1; i<=100; ++i) {
//            if (i % 2 != 0) continue;
//            System.out.print(i + " ");
//        }

        System.out.println();
        System.out.println();

        String resultEven="";
        String resultOdd="";
        for(int i=1; i<=100; ++i) {
//            if(i%2==0) {continue;}
//            resultOdd +=i+" ";

            if(i%2 !=0){continue;}
            resultEven +=i+" ";
        }
        System.out.println(resultEven);
        System.out.println(resultOdd);




    }

}
