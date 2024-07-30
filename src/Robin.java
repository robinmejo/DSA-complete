import Classes.LinkedList;

public class Robin {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.get(3));
        myLinkedList.set(2, 99);

        System.out.println("\nLinked List after set():");
        myLinkedList.prepend(1);
        myLinkedList.insert(0, 0);
        System.out.println(myLinkedList.remove(2).value);
        System.out.println("LL before reverse():");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLL after reverse():");
        myLinkedList.printList();
    }




}

