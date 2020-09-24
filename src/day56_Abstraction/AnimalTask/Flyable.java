package day56_Abstraction.AnimalTask;

public interface Flyable { // another way for abstraction
    // give unique methods (not common for animals) => specific implementation or actions=> uncommon actions=> use when need to inplement in subclass

      boolean hasWings=true; // every variable and methods are public==> it is only acses modifires
//if you can not give=> it automatically give public
    abstract void fly(); // it gives public Accses automatically in interface


class B implements Flyable {

    @Override
    public void fly() { // can not protetected => since interface all public => in override it should be same or more visible=> hence just one option is PUBLIC

    }
}


}
