package day26_MultiDimArray;

import java.util.Arrays;

public class MultDimm {

    public static void main(String[] args) {




    /*
    tester: {}
    Developer: {}
    SM: {}
    PO: {}
    BA: {}

    scrumTeam= tester, devs, SM,PO,BA
     */

        String[] testers = {"Ali", "Sara", "Odessa"};
        String[] Developers = {"Alex", "Sarah", "Oda"};
        String[] PO = {"Allela"};
        String[] SM = {"Nadir"};
        String[] BA = {"Odina"};

        String[][] scrumTeam = {testers, Developers, PO, SM, BA};
        System.out.println(Arrays.deepToString(scrumTeam));

        System.out.println("==========");
//how to modify

        String[] testers3 = {"Al", "Sa", "Od"};

scrumTeam[0]=testers3; //tester team changed
        scrumTeam[1] [2]="Zeck"; // 3nd dev changed
        scrumTeam[2] [0]="Zecyyyyyk"; //   PO changed

        System.out.println(Arrays.toString(testers));
        System.out.println(Arrays.deepToString(scrumTeam));
    }
}
