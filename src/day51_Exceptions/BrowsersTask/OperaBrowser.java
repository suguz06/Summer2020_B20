package day51_Exceptions.BrowsersTask;


/*
4. create a class called OperaBrowser
            actions: get(URL): opens the URL in Opera browser
                     close(): closes the Opera browser

 */
public class OperaBrowser extends Webdriver {

    public void get(String url){
        System.out.println("Opening the "+url+" in the opera browser");
    }

    public void close(){
        System.out.println("Closes the opera browser");
    }


}
