package day08_LogicalOperators;
/*
   3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?

                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;

 */


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PostAndPre {
    public static void main(String[] args) {

        int a = 200;
        int b = -a++ + - --a * a-- % 2;

        System.out.println(b);
        System.out.println(a);

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;



        System.out.println(z);
    }


}
