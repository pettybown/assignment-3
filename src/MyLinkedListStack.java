package src;
import java.util.EmptyStackException;
public class MyLinkedListStack<T> extends MyLinkedList {
    MyLinkedList<T> myLinkedList;
    MyLinkedListStack() {
        myLinkedList = new MyLinkedList<>();
    }
    public void push(T element) {
        myLinkedList.add(element, 0);
    }
    public boolean isEmpty() {
        return myLinkedList.size() == 0;
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) myLinkedList.remove(0);
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) myLinkedList.get(0);
    }
    public int size() {
        return myLinkedList.size();
    }
}
