package numberreorg;

/**
 * A class that implements a queue of objects by using a chain of linked nodes
 * that has both head and tail references.
 */
public final class LinkedQueue<T> implements QueueInterface<T> {

    private Node<T> firstNode; // References node at front of queue
    private Node<T> lastNode;  // References node at back of queue

    public LinkedQueue() {
        firstNode = null;
        lastNode = null;
    }

    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry, null);
        if (isEmpty()) {
            firstNode = newNode;
        } else {
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
    }

    @Override
    public T dequeue() {
        T front = null;
        if (!isEmpty()) {
            front = getFront();
            firstNode.setData(null);
            firstNode = firstNode.getNextNode();
        }

        if (firstNode == null) {
            lastNode = null;
        }

        return front;
    }

    @Override
    public T getFront() {
        T front = null;
        if (!isEmpty()) {
            front = firstNode.getData();
        }
        return front;
    }

    @Override
    public boolean isEmpty() {
        return (firstNode == null) && (lastNode == null);
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
    }

    public void display() {
        displayChain(firstNode);
    }

    private void displayChain(Node nodeOne) {
        if (nodeOne != null) {
            System.out.print(nodeOne.getData());
            displayChain(nodeOne.getNextNode());
        }
    }
}
