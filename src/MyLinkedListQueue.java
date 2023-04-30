package src;
import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> extends MyLinkedList {
    private MyLinkedList<T> myLinkedList;

    MyLinkedListQueue() {
        myLinkedList = new MyLinkedList<>();
    }
    /**
     * enqueue() - method that adds an element to the back of the queue.
     * @param element - element that you need to add.
     */
    public void enqueue(T element) {
        myLinkedList.add(element);
    }
    /**
     * dequeue() - method that removes and returns the front element of the queue.
     * @return the front element of the queue.
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) myLinkedList.remove(0);
    }
    /**
     * peek() - method that returns the front element of the queue without removing it.
     * @return the front element of the queue without removing it.
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) myLinkedList.get(0);
    }
    /**
     * size() - method that returns the number of elements in the queue.
     * @return the number of elements in the queue.
     */
    public int size() {
        return myLinkedList.size();
    }
    /**
     * isEmpty() - method that returns true if the queue is empty or false if it is not.
     * @return true if the queue is empty or false if it is not.
     */
    public boolean isEmpty() {
        return myLinkedList.size() == 0;
    }

}