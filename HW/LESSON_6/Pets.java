/**
 * Created by admin on 20.02.2017.
 */
public class Pets extends Animal {
    private String name;
    private boolean isVacinated;

    public Pets(int id, int age, double weight, String color, String name, boolean isVacinated){
        super(id,age,weight,color);
        this.name = name;
        this.isVacinated = isVacinated;

    }

    public void setVacinated (boolean vacinated){
        isVacinated = vacinated;
    }

    public String getName(){
        return name;
    }

    public boolean isVacinated(){
        return isVacinated;
    }

    public String saySomething(){
        String say;
        if (this.name != null) {
            say = super.saySomething() + " my name is " + this.name;
        } else say = super.saySomething();

        return say;

    }
}
