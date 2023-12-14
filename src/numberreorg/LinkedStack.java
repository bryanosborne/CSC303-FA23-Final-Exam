package numberreorg;

import java.util.EmptyStackException;

public final class LinkedStack<T> implements StackInterface<T> {

    private Node<T> topNode;

    public LinkedStack() {
        topNode = null;
    }

    @Override
    public void push(T newEntry) {
        Node newNode = new Node(newEntry, topNode);
        topNode = newNode;
    }

    @Override
    public T pop() {
        T top = peek();
        topNode = topNode.getNextNode();
        return top;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return topNode.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return topNode == null;
    }

    @Override
    public void clear() {
        topNode = null;
    }

}
