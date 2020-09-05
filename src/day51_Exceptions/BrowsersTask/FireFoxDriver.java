package day51_Exceptions.BrowsersTask;
/*
 3. creata a class called FirefoxBrowser
            actions: get(URL): opens the URL in Firefox browser
                     close(): closes the Firefox browser

 */
public class FireFoxDriver extends Webdriver{


    public void get(String url){
        System.out.println("Opening the "+url+" in the firefox browser");
    }

    public void close(){
        System.out.println("Closes the firefox browser");
    }
}
