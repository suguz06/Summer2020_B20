package day08_LogicalOperators;

public class Practice2 {

    public static void main(String[] args) {

        String firstName = "Conor";
        String lastName = "McNugget";
        int age = 20;
        String citizen1 = "USA";
        String citizen2 = "Turkish";

        boolean eligibleAge = age > 17;
        boolean usCitizen = citizen1 == "USA" || citizen2 == "USA";

        boolean eligibleToVote = eligibleAge && usCitizen;
        String fullName = firstName + " " + lastName;

        System.out.println(fullName+ " is eligible to vote for Trump: " +eligibleToVote);

    }
}
