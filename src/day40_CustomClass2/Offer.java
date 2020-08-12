package day40_CustomClass2;

public class Offer {

    /*
    Attributes:Location, hasBenifit(boolean), salary, WFH(boolean), JobTitle
     */

    String location;
    boolean hasBenefit;
    double salary;
    boolean wfh;
    String jobTitle;

    /*
    Actions:SetInfo, getInfo
     */

    public void setInfo(String offerLocation, boolean offerHasBenefit, double offerSalary, boolean isWFH, String offerJobTitle) {

        location=offerLocation; hasBenefit=offerHasBenefit; salary=offerSalary; wfh=isWFH; jobTitle=offerJobTitle;
    }

    public void getInfo(){
        System.out.println("Location: "+ location+ " offer has benefit: "+ hasBenefit+ " offer salary: "
                + salary+ " wfh: " + wfh+ " offer job title: "+ jobTitle);
    }



}
