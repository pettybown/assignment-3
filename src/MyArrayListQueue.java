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
}