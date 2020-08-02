package Office_Hours.Practice_07_15_2020;

public class freqWord2 {

    public static void main(String[] args) {

        String str="JavaJavajavaJAVA".toLowerCase();
        //str=str.toLowerCase();

        //count java

        int count=0;

        while(str.contains("java")) {

            str =str.replaceFirst("java", " ");
            count++;
        }

        System.out.println(count);

    }
}
