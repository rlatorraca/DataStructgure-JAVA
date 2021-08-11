package ca.com.rlsp.FIFO;

public class Node {

    private Object object;
    private Node nodeReference;

    public Node() {
    }

    public Node(Object object) {
        this.object = object;
        this.nodeReference = null;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getNodeReference() {
        return nodeReference;
    }

    public void setNodeReference(Node nodeReference) {
        this.nodeReference = nodeReference;
    }
}
