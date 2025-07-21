public class LinkedList<T> {
    Node<T> head;
    public LinkedList(T data){
       head = new Node<>(data);
    }
    public void add(T data){
        Node traverse = head;
        while(traverse.next != null){
            traverse = traverse.next;
        }
        traverse.next = new Node(data);
    }
    public void DisplayList(){
        Node traverse = head;
        System.out.print(head.data);
        System.out.print(" -> ");
        while(traverse.next != null){
            traverse = traverse.next;
            System.out.print(traverse.data);
            if(traverse.next != null) {
                System.out.print(" -> ");
            }

        }
    }

}
