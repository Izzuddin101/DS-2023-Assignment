import java.io.Serializable;


public class Node<T> implements Serializable{
    private T data;
    private Node nextNode;

    public Node(T data) {
        this.data = data;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public T getData() {
        return this.data;
    }

    public T setData(T data) {
        return this.data = data;
    }

    public Node setNextNode(Node nextNode) {
        return this.nextNode = nextNode;
    }

    public String toString() {
        return "Data: " + this.data;
    }
}
