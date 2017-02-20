/**
 * Created by admin on 20.02.2017.
 */
public class WildAnimal extends Animal {
    private boolean isPredator;

    public WildAnimal (int id, int age, double weight, String color, boolean isPredator){
        super(id, age, weight, color);
        this.isPredator = isPredator;

    }

    public boolean isPredator(){
        return isPredator;
    }


    public String saySomething() {
        String say;
        if (isPredator) {
            say = super.saySomething() + " I am a wild animal and I am hungry.";
         } else
            {
                say = super.saySomething()+ " I am a wild animal.";
            }
          return say;
    }
}
