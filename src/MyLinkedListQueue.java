package src;
import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> extends MyLinkedList {
    private MyLinkedList<T> myLinkedList;

    MyLinkedListQueue() {
        myLinkedList = new MyLinkedList<>();
    }
}