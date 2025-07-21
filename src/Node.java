public class Node<T> {
    T data;
    Node<T> next;
    public Node(T data){
        this.data = data;
    }
    public void setNext(Node<T> node){
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }
}
