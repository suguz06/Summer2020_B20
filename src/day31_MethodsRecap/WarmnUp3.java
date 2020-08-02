package day31_MethodsRecap;
/*

 3. use the methods removeDup and frequency in util class to create
  a thrid method called frequencyOfChars that can find the frequency of all characters from a string
        Ex:
            frequencyOfChars("AAABBBBCCCC");  ===> A3B4C4
            frequencyOfChars("DDEFJJJ"); ===> D2E1F1J3
            please copy paste the method to the util class

 */
public class WarmnUp3 {

    public static void main(String[] args) {

        String st="aabbbcccdddddddd";

      String r=  frequencyOfChars(st);

        System.out.println(r);
    }


    public static String frequencyOfChars(String str) {

        char [] arr1=str.toCharArray();
        String result="";
        //first remove duplicate

        String nonDup="";

        for(char a:arr1){
            if(!nonDup.contains(""+a)) {
                nonDup +=a;
            }
        }

        //check frequency of nonDup chars
        char [] arr=nonDup.toCharArray();
        for( char a: arr) {
            int count=0;

            for(char b: arr1) {
               if(a==b)  count++;
            }  result +=""+a+count;
        } return result;


    }


}
