/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numberreorg;

/**
 *
 * @author bosborne
 */
public class DeQue<T> implements DequeInterface<T> {

    private DLNode<T> firstNode; // References node at front of deque
    private DLNode<T> lastNode;  // References node at back of deque

    public DeQue() {
        firstNode = null;
        lastNode = null;
    } 

    public void addToBack(T newEntry) {
        DLNode newNode = new DLNode(lastNode, newEntry, null);

        if (isEmpty()) {
            firstNode = newNode;
        } else {
            lastNode.setNextNode(newNode);
        }

        lastNode = newNode;
    } 

    public void addToFront(T newEntry) {
        DLNode newNode = new DLNode(null, newEntry, firstNode);

        if (isEmpty()) {
            lastNode = newNode;
        } else {
            firstNode.setPreviousNode(newNode);
        }

        firstNode = newNode;
    } 

    public T getBack() {
        T back = lastNode.getData();
        if (!isEmpty()) {
            back = lastNode.getData();
        }
        return back;
    }
    
    public T getFront() {
        T front = null;
        if (!isEmpty()) {
            front = firstNode.getData();
        }
        return front;
    }
    
    public T removeFront() {
        T front = getFront();  // Might throw EmptyQueueException
        assert (firstNode != null);
        firstNode = firstNode.getNextNode();

        if (firstNode == null) {
            lastNode = null;
        } else {
            firstNode.setPreviousNode(null);
        }

        return front;
    } // end removeFront

    public T removeBack() {
        T back = getBack();  // Might throw EmptyQueueException
        assert (lastNode != null);
        lastNode = lastNode.getPreviousNode();

        if (lastNode == null) {
            firstNode = null;
        } else {
            lastNode.setNextNode(null);
        }

        return back;
    } // end removeBack

    public void clear() {
        firstNode = null;
        lastNode = null;
    } // end clear

    public boolean isEmpty() {
        return (firstNode == null) && (lastNode == null);
    } // end isEmpty
}
