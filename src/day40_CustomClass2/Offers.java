package day40_CustomClass2;

/*
Offer
        Attribute:
            salary, Location, hasPTO, isFullTime, WFH, jobTitle, benifit
        Actions:
            setOfferInfo
            getOfferInfo
        MUST use this keyword

 */
public class Offers {

    double salary;
    String location;
    boolean hasPTO;
    boolean isFullTime;
    boolean WFH;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary, String location,
                             boolean hasPTO,
                             boolean isFullTime,
                             boolean WFH,
                             String jobTitle,
                             boolean hasBenefit) {
        this.salary = salary;
        this.location = location;
        this.isFullTime = isFullTime;
        this.WFH = WFH;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
    }

    public void getOfferInfo(){ //display the information offer

        System.out.println("------------------------");
        System.out.println("Salary: "+ salary +" Location: "
        +location+ " Full-time: " + isFullTime+ " Work From Home: "+
                WFH+ " Job Title: "+ jobTitle
                +" Benefits: "+ hasBenefit);
        System.out.println("++++++++++++++++++++++++");
    }


}
