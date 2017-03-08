package IterHilel;
//import java.util.Iterator;
public class Main {

    public static void main(String[] args) {
        CollectionLinkedList list = new CollectionLinkedList();
        list.add("first");
        list.add("second");
        list.add("third");

        for (Object o :list){
            System.out.println(o);
            System.out.println();

    }
        System.out.println("Size is: " + list.getSize());


//IteratorLinkedList it = new IteratorLinkedList()
    }
}