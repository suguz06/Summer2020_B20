package day26_MultiDimArray;

import java.util.Arrays;

public class NestedArrayMultiD {


    public static void main(String[] args) {



        String[] testers = {"Ali", "Sara", "Odessa"};
        String[] Developers = {"Alex", "Sarah", "Oda"};
        String[] PO = {"Allela"};
        String[] SM = {"Nadir"};
        String[] BA = {"Odina"};

        String[][] scrumTeam = {testers, Developers, PO, SM, BA};
        System.out.println(Arrays.deepToString(scrumTeam));

        for(String [] each : scrumTeam) { //each in 2D

            for(String name: each) { //name in 1D

                System.out.println( name);  //print all names
            }
        }

    }
}
