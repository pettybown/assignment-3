package src;
import java.util.EmptyStackException;
public class MyArrayListStack extends MyArrayList {
    MyArrayList myArrayList;

    MyArrayListStack() {
        myArrayList = new MyArrayList();
    }
    public void push(Object element) {
        myArrayList.add(element, 0);
    }
    public boolean isEmpty() {
        return myArrayList.size() == 0;
    }
    public int size() {
        return myArrayList.size();
    }
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return myArrayList.remove(0);
    }


}