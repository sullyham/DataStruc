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
    public void remove(int index){
        Node<T> traverse = head;
        if(index < 0 || index > getSize()){
            System.out.println(index + " is out of bounds!");
            throw(new IndexOutOfBoundsException());
        }
        int trav = 0;
        if(index == 0) {
            head = traverse.next;
            return;
        }
        while(trav != index -1){
            trav++;
            traverse = traverse.next;
        }
        Node<T> before = traverse;
        if(traverse.next.next != null){
            Node<T> after = traverse.next.next;
            before.next = after;
        }
        else{
            before.next = null;
        }
    }
    public void removeobject(T data){
        Node<T> traverse = head;
        if(traverse.getData().equals(data)){
            Node<T> temp = traverse.next;
            head = temp;
            return;
        }
            while (traverse.next != null) {
                if (traverse.next.getData() == data) {
                    System.out.println(traverse.next.getData() + " has been found!");
                    break;
                }
                traverse = traverse.next;
            }
            if (traverse.next.getData() != data) {
                throw (new BadMoodException("Object doesn't exist!"));
            }
            Node<T> before = traverse;
            if(traverse.next.next != null){
                Node<T> after = traverse.next.next;
                before.next = after;
                return;
            }
            before.next = null;




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
    public T get(int index){
        Node<T> traverse = head;
        int iter = 0;
        if(index < 0 || index > getSize()){
            System.out.println(index + " is out of bounds!");
            throw(new NullPointerException());
        }
        while(iter != index){
            traverse = traverse.next;
            iter++;
        }
        return traverse.getData();

    }
    public T set(int index, T data){
        T old = get(index);
      return old;
    }
    public boolean contains(T data ){
        return false;
    }
    public int indexOf(T data){
        return 0;
    }
    public void clear(){

    }
    public boolean isEmpty(){
        return false;
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
