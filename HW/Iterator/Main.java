package Iterator;

/**
 * Created by toor on 08.03.17.
 */
public class Main {
    public static void main(String[] args) {
        ObjectQueue queue = new ObjectQueue();

        for (int i = 0; i < 1; i++){
            queue.push("Строка: "+ i);
        }

        while (queue.getSize() > 0) {
            String s = (String)queue.pull();
            System.out.println(s);
            System.out.println("Size: " + queue.getSize());
        }
    }
}
