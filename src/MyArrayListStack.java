package src;

public class MyArrayListStack extends MyArrayList {
    MyArrayList myArrayList;

    MyArrayListStack() {
        myArrayList = new MyArrayList();
    }
    public void push(Object element) {
        myArrayList.add(element, 0);
    }


}