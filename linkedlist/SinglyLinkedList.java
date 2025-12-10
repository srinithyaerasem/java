package linkedLists;

class Node1 {
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedlist {
    int size;
    Node1 head;

    // Insert at beginning
    public void insertionAtFirst(int value) {
        Node1 newnode = new Node1(value);
        newnode.next = head;
        head = newnode;
        size++;
    }

    // Insert at end
    public void insertionAtEnd(int value) {
        Node1 newnode = new Node1(value);

        if (head == null) {
            head = newnode;
        } else {
            Node1 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        size++;
    }

    // Insert at specific position (0-based index)
    public void insertionAtSpecificposition(int value, int pos) {

        if (pos < 0 || pos > size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            insertionAtFirst(value);
            return;
        }

        Node1 newnode = new Node1(value);
        Node1 temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }

    // Delete from beginning
    public void deletionAtFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;
    }

    // Delete from end
    public void deletionAtEnd() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            Node1 temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
    }

    // Delete at specific position
    public void deletionAtSpecificposition(int pos) {

        if (pos < 0 || pos >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            deletionAtFirst();
            return;
        }

        Node1 temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    // Print the list
    public void printList() {
        Node1 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}
public class SinglyLinkedList {
	public static void main(String[] args) {
		
	
        SingleLinkedlist sList = new SingleLinkedlist();

        sList.insertionAtFirst(10);
        sList.insertionAtFirst(20);
        sList.insertionAtEnd(30);
        sList.insertionAtSpecificposition(25, 2); // Insert at index 2

        sList.printList(); // Expected: 20 -> 10 -> 25 -> 30 -> null

        sList.deletionAtSpecificposition(1); // Delete index 1
        sList.printList(); // Expected: 20 -> 25 -> 30 -> null
    }

}
