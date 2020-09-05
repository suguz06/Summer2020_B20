package day51_Exceptions.BrowsersTask;
/*

Browsers task:
    1. create a class called WebDriver
            actions: get(URL): prints "opening the URL in the default browser"
                     close(): closes the default browser

 */
public class Webdriver {


    //String url;

    public void get(String url){
      //  this.url=url;
        System.out.println("Opening the "+url+" in the default browser");
    }

    public void close(){
        System.out.println("Closes the default browser");
    }

}
