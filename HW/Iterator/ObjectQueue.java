package Iterator;

/**
 * Created by toor on 08.03.17.
 */
public class ObjectQueue {
    private ObjectBox head = null;
    private ObjectBox tail = null;
    private int size = 0;


    public void push(Object obj){
        ObjectBox ob = new ObjectBox();
        ob.setObject(obj);
        if (head == null) {
            head = ob;
        } else {
            tail.setNext(ob);
        }
        tail = ob;
      size++;
    }
    public Object pull(){
        if (size == 0) {
            return null;
        }
        Object obj = head.getObject();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        size--;
        return obj;

    }

    public int getSize(){
        return size;

    }
    public Object getElementByIndex(int i){
      return null;
    }
    private class ObjectBox {

        private Object object;
        private ObjectBox next;

        public Object getObject(){
            return object;
        }
        public void setObject(Object object){
            this.object = object;
        }

        public ObjectBox getNext(){
            return next;
        }

        public void setNext(ObjectBox next){
            this.next = next;
        }
    }

}
