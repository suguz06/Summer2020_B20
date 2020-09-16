package day02_printStatements;

public class Box {

    double wid;
    double len;

    public String print() {
        return "wid"+wid+ len;
    }

    public void setInfo(double wid, double len){
        this.len=len;
        this.wid=wid;
    }


}
 class UseBoxes {
     public static void main(String[] args) {
         Box box=new Box();
         box.setInfo(5, 11);
         System.out.println(box.print());
     }
 }