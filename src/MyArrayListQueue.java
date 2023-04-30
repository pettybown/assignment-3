package src;
import java.util.NoSuchElementException;
public class MyArrayListQueue extends MyArrayList{
    private MyArrayList myArrayList;
    MyArrayListQueue() {
        myArrayList = new MyArrayList();
    }
    public void enqueue(Object element) {
        myArrayList.add(element);
    }
    public boolean isEmpty() {
        return myArrayList.size() == 0;
    }
    public int size() {
        return myArrayList.size();
    }
    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return myArrayList.remove(0);
    }

}