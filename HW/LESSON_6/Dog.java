/**
 * Created by admin on 20.02.2017.
 */
public class Dog extends Pets {
    public Dog(int id, int age, double weight, String color, String name, boolean isVacinated){
        super(id, age, weight, color, name, isVacinated);
    }
    public String saySomething(){
        return super.saySomething() + " Woof";
    }
}
