package day57_Polymorhism.AbstractionTask1;

public interface AndroidAppStrore extends Downloadable {

    /*
    1. create an interface named AndroidAppStore
            variable: AppStoreName
            abstract method: downloadAndroidApp();
1. create an interface named AndroidAppStore
            variable: AppStoreName
            abstract method: downloadAndroidApp();

     */ /// final==> it is immediately initialize variable
    public static final String AppStoreName="Google Play"; //by default variables=> public static final
    public abstract void downloadAndroidApp(); // by default public and abstract


}
