package src;
import java.util.EmptyStackException;
public class MyLinkedListStack<T> extends MyLinkedList {
    private MyLinkedList<T> myLinkedList;
    MyLinkedListStack() {
        myLinkedList = new MyLinkedList<>();
    }
    public void push(T element) {
        myLinkedList.add(element, 0);
    }
}
