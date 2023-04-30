package src;
import java.util.EmptyStackException;
public class MyLinkedListStack<T> extends MyLinkedList {
    private MyLinkedList<T> myLinkedList;
    MyLinkedListStack() {
        myLinkedList = new MyLinkedList<>();
    }
}
