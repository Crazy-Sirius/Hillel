/**
 * Created by admin on 20.02.2017.
 */
public class DogGPS extends Dog {
    private boolean isTrained;
    public DogGPS(int id, int age, double weight, String color, String name, boolean isVacinated, boolean isTrained){
        super(id, age, weight, color, name, isVacinated);
        this.isTrained = isTrained;
    }

    public boolean isTrained(){
        return isTrained;
    }

    public String saySomething(){
        String say = null;
        if (isTrained) {
            say = super.saySomething() + " I can take you home.";
        } else say = "I can't do it! You must traine me!";
        return say;
    }


}
