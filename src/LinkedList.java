public class LinkedList<T> {
    Node<T> head;
    public LinkedList(T data){
            head = new Node<>(data);
    }
    public int getSize(){
        int size = 1;
        if(head == null){
            return 0;
        }
        Node<T> traverse = head;
        while(traverse.next != null){
            size++;
            traverse = traverse.next;
        }
        return size;
    }
    public void add(T data,int index) throws NullPointerException{
        if(head == null && index == 0){
            addFirst(data);
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        if(index == getSize()){
            addLast(data);
            return;
        }
        if(index < 0 || index > getSize()){
            System.out.println(index + " is out of bounds!");
            throw(new NullPointerException());
        }
        else{
            System.out.println("ACTIVATE!");
            Node<T> traverse = head;
            int iter = 0;
            while(iter != index - 1){
                iter++;
                traverse = traverse.next;
            }
            Node<T> before = traverse;
            Node<T> curr = traverse.next;
            before.next = new Node<>(data);
            before.next.next = curr;
        }
    }
    public void addFirst(T data){
        Node<T> temp = head;
        head = new Node<>(data);
        head.next = temp;
    }
    public void addLast(T data){
        Node<T> traverse = head;
        while(traverse.next != null){
            traverse = traverse.next;
        }
        traverse.next = new Node<>(data);
    }
    public void removeFirst(){
        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
        }
        if(head.next.next == null){
            head = head.next;
        }

    }
    public void DisplayList(){
        Node<T> traverse = head;
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
