package src;
import java.util.EmptyStackException;
public class MyLinkedListStack<T> extends MyLinkedList {
    MyLinkedList<T> myLinkedList;
    MyLinkedListStack() {
        myLinkedList = new MyLinkedList<>();
    }
    /**
     * push() - method that adds an element to the top of the stack.
     * @param element - element that you need to add.
     */
    public void push(T element) {
        myLinkedList.add(element, 0);
    }
    /**
     * isEmpty() - method that returns true if the stack is empty or false if it is not.
     * @return true if the stack is empty or false if it is not.
     */
    public boolean isEmpty() {
        return myLinkedList.size() == 0;
    }
    /**
     * pop() - method that removes and returns the top element of the stack.
     * @return the top element of the stack
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) myLinkedList.remove(0);
    }
    /**
     * peek() - method that returns the top element of the stack without removing it.
     * @return the top element of the stack without removing it.
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) myLinkedList.get(0);
    }
    /**
     * size() - method that returns the number of elements in the stack.
     * @return the number of elements in the stack.
     */
    public int size() {
        return myLinkedList.size();
    }
}
