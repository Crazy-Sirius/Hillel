/**
 * Created by admin on 20.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat (10,2,4.2,"Black",null,false);
        System.out.println(cat.saySomething());


        System.out.println("DogGPS");
        DogGPS dogGPS = new DogGPS(10,25,45.2,"Green", "GooD",true, true);
        System.out.println(dogGPS.saySomething()+ " I am  " + dogGPS.getAge() + " years old.");
        dogGPS.setAge(15);
        System.out.println("You change my age to " + dogGPS.getAge());

        System.out.println("FISH");
        Fish fish = new Fish(11, 20,1,"Ran", true);
        System.out.println(fish.saySomething());



    }

}
