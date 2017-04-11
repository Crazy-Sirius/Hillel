package ZooObserver;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;
/**
 * Created by admin on 20.02.2017.
 */
public class Animal implements Observable {
        int id;
        int age;
        double weight;
        String color;
        boolean isHungry = false;
        boolean isIll = false;
    List<Observer> observers = new ArrayList<>();

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

    @Override
    public void subscribe(Observer observer) {
      this.observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
       this.observers.remove(observer);
    }

    @Override
    public void notifySubscribers(String event) {
        for (Observer observer : observers) {
            if (isHungry) {
            System.out.println("I am hungry!");
        }
        }

    }

    }


