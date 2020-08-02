package day11_NestedIf;

public class Ternary_Practices1 {

    public static void main(String[] args) {

        int age = 23;
        String ciziten = "USA";

        String voteStatus = (age > 18 && ciziten == "USA") ? "can Vote" : "cannot vote";

        System.out.println(voteStatus);

    }

}
