package Office_Hours.Practice_06_17_2020;

public class Swicth_prac {

    public static void main(String[] args) {


        int ratingRestraun = 3;
        String result = "";

        if (ratingRestraun > 0 && ratingRestraun <= 5) {
            switch (ratingRestraun) {
                case 1:
                    result = "Bad";
                    break;
                case 2:
                    result = "not bad";
                    break;
                default:
                    result = "perfect";
                    break;
                case 3:
                    result = "fair";
                    break;
                case 4:
                    result = "good";
                    break;



            }
            System.out.println(result);
        }else {
            System.out.println("please enter real value");
        }
    }

}
