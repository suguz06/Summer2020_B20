package Office_Hours.Packages_07_13_2020;

public class FrequncyForEACH {
    public static void main(String[] args) {



    int [] str= {1, 2, 2, 3, 4, 4, 5};


    for(int each :str) {
        int a = each;
        int count = 0;

        for (int each1 : str) {
            int b = each1;
            if (b == a) {
                count++;
            }
        }
        System.out.println(a+ " "+ count);
    }

} }
