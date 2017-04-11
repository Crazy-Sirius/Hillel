package ZooObserver;

/**
 * Created by toor on 11.04.17.
 */
public class MainObserv {

    public static void main(String[] args) {
        System.out.println("Generate Animals");
        Animal animal1 = new Animal(11,26,12,"green");

        System.out.println("Generate STUF");

        Worker director = new Worker(11,"Petrov","Director");
        Worker vet = new Worker (12,"Sidorov","Vet");

      //  animal1.observers.add(director);
        animal1.subscribe(director);

        System.out.println(animal1.observers.toString());
      //  animal1.unsubscribe(director);
        System.out.println(animal1.observers.toString());
        animal1.isHungry = true;
        animal1.notifySubscribers("I am hungry. My ID is " + animal1.getId());
        //director.notifyObserver("lll");
    }
}
