package Observer;

import java.util.List;

/**
 * Created by toor on 11.04.17.
 */
public class Subscriber implements Observer {
   String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear subscriber " + name + "\nWe have changes in vacancies: " + vacancies+
          "\n=============================================\n");
    }
}
