/**
 * Created by admin on 20.02.2017.
 */
public class Animal {
        int id;
        int age;
        double weight;
        String color;

        String golos(String say) {//метод
            return "Hello,";
        }
        public Animal( int id, int age, double weight,String color){
            this.id = id;
            this.age = age;
            this.weight = weight;
            this.color = color;

        }
    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {

        return id;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String saySomething(){
        return "Hello,";
    }



}
