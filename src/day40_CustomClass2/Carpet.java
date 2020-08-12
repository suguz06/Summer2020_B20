package day40_CustomClass2;

public class Carpet {

    /*
     instance variables:
                        width, length, unitPrice, isPersian (boolean)
                instance methods:
                        customOrder(): sets the carpet' width, length, unitprice, & isParsian
                        calcCost(): should be able to caculate the total cost of the carpet and return it as double
                        getCarpetInfo: should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()

     */


    double width, length, unitPrice;
    boolean isPersian;

    public  void setCarpetInfo(double carpetWidth, double carpetLength, double carpetUnitPrice, boolean carpetIsPersian) {
        width=carpetWidth; length=carpetLength; unitPrice=carpetUnitPrice; isPersian=carpetIsPersian;
    }

    public void getInfo(){
        System.out.println("Carpet width: "+ width+ " Carpet length: "+ length+ " Carpet unit price: "+ unitPrice+ " Carpet is persian: "+ isPersian);
    }

    public double calCost(boolean isPersianTurkey) {
        double totalCost= width*length*unitPrice;
if(isPersianTurkey) totalCost +=200;
        return totalCost;
    }



}
