package Classes;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public void removeFirst(){
        if(length==0){
            head=null;
            tail=null;
        }
        else{
            Node temp=head;
            if (head.next != null) {

                head=head.next;
                temp.next=null;
            }
            else{
                head=null;
                tail=null;
            }
            length--;
        }

    }

    public void append(int value) {
        Node newNode2 = new Node(value);
        //head=node.data;
        //tail=node.data;
        if (length == 0) {
            head = newNode2;
            tail = newNode2;
        } else {
            tail.next = newNode2;
            tail = newNode2;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        else {
            Node temp = head;
            Node pre = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;

            }
            tail = pre;
            tail.next = null;
            length--;
            if (length == 0) {
                head = null;
                tail = null;
            }
            return temp;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.data);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.data);
    }

    public void getLength() {
        System.out.println("length: " + length);
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.data);
            System.out.println("Tail: " + tail.data);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
