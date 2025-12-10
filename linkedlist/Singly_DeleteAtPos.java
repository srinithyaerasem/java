package linkedLists;

class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedlist {
    Node2 head = null;
    int size = 0;
    // Insert at end (helper method to build list)
    public void insert(int data) {
        Node2 newNode = new Node2(data);

        if (head == null) {
            head = newNode;
        } else {
            Node2 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
    }
    public void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            head = head.next;
            size--;
            return;
        }
        Node2 temp = head;
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    // Print list
    public void display() {
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class Singly_DeleteAtPos {
	public static void main(String[] args) {
		SinglyLinkedlist list = new SinglyLinkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        System.out.println("Original List:");
        list.display();
        // Delete at position
        list.deleteAtPosition(3); // deletes 30
        System.out.println("After Deleting Position 3:");
        list.display();
    }
}
