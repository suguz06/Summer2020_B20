package Office_Hours.Practice_09_08_2020;

public class Credentials {

    private String userName="Cybertek";
    private  String pasword="CyberTek1234";


    public String getUserName() { //read only => return type => public method
        return userName;
    }

    public void setUserName(String userName) { // modify => void type=>  one arg needed=> private arg
        this.userName = userName;
    }

    public String getPasword() {//read only
        return pasword;
    }

    public void setPasword(String pasword) { //modify only
        this.pasword = pasword;
    }
}
