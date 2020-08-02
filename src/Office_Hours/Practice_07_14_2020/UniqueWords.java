package Office_Hours.Practice_07_14_2020;

public class UniqueWords {

    public static void main(String[] args) {


        String[] arr = {"Java", "C#", "Phyton", "C#", "Phyton"};

        for (String a : arr) {
            int count = 0;
            for (String b : arr) {

                if (a.equals(b)) count++;
            } if(count==1) System.out.println(a);


        }


    }


}
