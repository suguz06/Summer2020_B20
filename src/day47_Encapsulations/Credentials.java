package day47_Encapsulations;
/*
task:
    1. create class Credentials
            instance variables:
                    public name
                    public age
                    private username
                    private password
                    getter & setter
                    add a constructor to set name & age

 */
public class Credentials {

    public String name;
    public int age;

    private String userName;
    private String password;

    public static String companyName; // Class level variable,
    // just initiliaze in static block, no inside consructor (many times compile)
    // => in static block one-time
static {
    companyName="Facebook";
    }


   public String getUserName(){
       return userName;
   }
   public String getPassword(){
       return password;
   }

   public void setUserName(String userName){
       this.userName=userName;
   }

   public void setPassword (String password){
       this.password=password;
   }

    public Credentials(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String toString() {
       return "Name: "+ name+ "\nAge: "+ age+
               "\nCompany Name:"+ companyName  + "\nUser name: "
               +userName
+"\nPassword: "+ password ;   }


    public static void main(String[] args) {
        Credentials obj1=new Credentials("Alia", 32);

        obj1.setPassword("ssdd4454");
        System.out.println(obj1.getPassword());


        obj1.setUserName("sssseee");
        System.out.println(obj1.getUserName());

        System.out.println(obj1);
    }


}
