package day51_Exceptions.BrowsersTask;

public class BrowserObjects {

    public static void main(String[] args) {

        ChromeBrowser chromeBrowser=new ChromeBrowser();
        FireFoxDriver fireFoxDriver=new FireFoxDriver();
        OperaBrowser operaBrowser=new OperaBrowser();


        chromeBrowser.get("https://www.google.com");
        chromeBrowser.close();

        System.out.println("================");

        OperaBrowser opera = new OperaBrowser();
        opera.get("https://www.google.com/");
        opera.close();

        System.out.println("================");

        fireFoxDriver.get("https://www.google.com/");
        fireFoxDriver.close();
    }
}
