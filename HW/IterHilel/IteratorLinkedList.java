package IterHilel;
import java.util.Iterator;

/**
 * Created by hillel on 06.03.17.
 */
public class IteratorLinkedList implements Iterator {
    private Element currentElement;


    public IteratorLinkedList(Element currentElement) {
        this.currentElement = currentElement;
    }

    @Override
    public boolean hasNext() {

        return currentElement != null;
    }

    @Override
    public Object next() {
        if (currentElement == null) {
            throw new IndexOutOfBoundsException();
        }
        Object result = currentElement.data;
        currentElement = currentElement.next;
        return result;
    }
}
