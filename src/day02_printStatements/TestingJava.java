package day02_printStatements;


import java.util.*;

public    class TestingJava   {
    public static void main(String[] args) {
        int[] counter = new int[256];
        String s = "zacaabbbcccc";
        for(int i = 0; i < s.length(); i++){
            counter[s.charAt(i)]++;
        }

        for(int i = 0; i < counter.length; i++)
            if(counter[i] > 0)
                System.out.println(((char)i) + " occurs " + counter[i] + " times");



        String s1 = "zaabbbccc";


        Map<Character, Integer> stringHash = new HashMap<Character, Integer>();
        for (char ch : s1.toCharArray()) {
            stringHash.put(ch, stringHash.containsKey(ch) ? (stringHash.get(ch) + 1) : 1);


        }

        System.out.println(stringHash);




        Map<String, Integer> map=new LinkedHashMap<>();

        String s2="abacbdeef";

        List<String> list=new ArrayList<>(Arrays.asList(s2.split(""))); //list of String

        for (String each : list) {
            if (Collections.frequency(list, each)==1) { //choose each frequecny 1
                map.put(each, Collections.frequency(list, each)); // construct map=> each frequency== 1
            }
        }

        System.out.println(map); //{c=1, d=1, f=1}





    }



}

















