package numberreorg;

class Node<T> {

    private T data; // Entry in bag
    private Node next; // Link to next node

    Node(T dataPortion) {
        this(dataPortion, null);
    }

    Node(T dataPortion, Node nextNode) {
        data = dataPortion;
        next = nextNode;
    }

    protected T getData() {
        return data;
    }

    protected void setData(T newData) {
        data = newData;
    }

    protected Node getNextNode() {
        return next;
    }

    protected void setNextNode(Node nextNode) {
        next = nextNode;
    } 

    @Override
    public String toString() {
        return "Node{" + "data=" + data + ", next=" + next + '}';
    }
    
    
}
