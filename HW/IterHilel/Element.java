package IterHilel;
/**
 * Created by hillel on 06.03.17.
 */
public class Element {
    Element next;
    Object data;
    public Element (Element next, Object data) {
        this.next = next;
        this.data = data;
    }

//public boolean equals (Object obj) {return data.equals(((Element)obj.data)}
}
