package numberreorg;

class DLNode<T> {

    private T data;  	 // Deque entry
    private DLNode next;  	 // Link to next node
    private DLNode previous; // Link to previous node

    DLNode(T dataPortion) {
        data = dataPortion;
        next = null;
        previous = null;
    }

    DLNode(DLNode previousNode, T dataPortion, DLNode nextNode) {
        data = dataPortion;
        next = nextNode;
        previous = previousNode;
    }

    protected T getData() {
        return data;
    }

    protected void setData(T newData) {
        data = newData;
    }

    protected DLNode getNextNode() {
        return next;
    }

    protected void setNextNode(DLNode nextNode) {
        next = nextNode;
    }

    protected DLNode getPreviousNode() {
        return previous;
    }

    protected void setPreviousNode(DLNode previousNode) {
        previous = previousNode;
    }
}
