package src;

public class Main {
    public static void main(String[] args) {
        MyArrayListStack myArrayListStack = new MyArrayListStack();
        myArrayListStack.push(1);
        myArrayListStack.pop();
        myArrayListStack.peek();
        myArrayListStack.size();
        myArrayListStack.isEmpty();

        MyArrayListQueue myArrayListQueue = new MyArrayListQueue();
        myArrayListQueue.enqueue(1);
        myArrayListQueue.dequeue();
        myArrayListQueue.peek();
        myArrayListQueue.size();
        myArrayListQueue.isEmpty();

        MyLinkedListStack myLinkedListStack = new MyLinkedListStack();
        myLinkedListStack.push(1);
        myLinkedListStack.pop();
        myLinkedListStack.peek();
        myLinkedListStack.size();
        myLinkedListStack.isEmpty();

        MyLinkedListQueue myLinkedListQueue = new MyLinkedListQueue();
        myLinkedListQueue.enqueue(1);
        myLinkedListQueue.dequeue();
        myLinkedListQueue.peek();
        myLinkedListQueue.size();
        myLinkedListQueue.isEmpty();
    }
}