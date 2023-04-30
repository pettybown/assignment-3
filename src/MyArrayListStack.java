package src;
import java.util.EmptyStackException;
public class MyArrayListStack extends MyArrayList {
    MyArrayList myArrayList;

    MyArrayListStack() {
        myArrayList = new MyArrayList();
    }
    /**
     Adds an element to the top of the stack.
     @param element The element to be added.
     */
    public void push(Object element) {
        myArrayList.add(element, 0);
    }
    /**
     * Returns true if the stack is empty or false if it is not.
     * @return true if the stack is empty or false if it is not.
     */
    public boolean isEmpty() {
        return myArrayList.size() == 0;
    }
    /**
     Returns the number of elements in the stack.
     @return The number of elements in the stack.
     */
    public int size() {
        return myArrayList.size();
    }
    /**
     Removes and returns the element at the top of the stack.
     @return The element at the top of the stack.
     @throws EmptyStackException If the stack is empty.
     */
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return myArrayList.remove(0);
    }
    /**
     Returns the element at the top of the stack without removing it.
     @return The element at the top of the stack.
     @throws EmptyStackException If the stack is empty.
     */
    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return myArrayList.get(0);
    }


}