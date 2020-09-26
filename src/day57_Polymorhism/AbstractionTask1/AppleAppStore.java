package day57_Polymorhism.AbstractionTask1;

public interface AppleAppStore extends Downloadable {

    public static final String AppStoreName="Apple Store"; // by default => public static final

    //1 abstract method inherited

    abstract void downloadAppleApp();
}
