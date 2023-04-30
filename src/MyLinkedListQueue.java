package src;
import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> extends MyLinkedList {
    private MyLinkedList<T> myLinkedList;

    MyLinkedListQueue() {
        myLinkedList = new MyLinkedList<>();
    }
    public void enqueue(T element) {
        myLinkedList.add(element);
    }
    public int size() {
        return myLinkedList.size();
    }
    public boolean isEmpty() {
        return myLinkedList.size() == 0;
    }

}