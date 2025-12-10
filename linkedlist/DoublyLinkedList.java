package linkedLists;


class Node{
	Node prev;
	int data;
	Node next;
	Node(int value){
		this.prev= this.next=null;
		this.data=value;
	}
}

class Demo{
	private int size;
	private Node head;
	private Node tail;
	public void insertAtBegining(int value) {
		Node newNode=new Node(value);
		//if list is empty
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		// list is not empty
		
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		size++;
		
	}
	public void insertAtEnd(int value) {
		Node newNode=new Node(value);
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		// list is not empty
		tail.next=newNode;
		newNode.prev=tail;
		tail=newNode;
		size++;
		
			
	}
	public void insertAtSpecificPosition(int pos, int value) {
		Node newNode=new Node(value);
		Node temp=head;
		if(head==null) {
			head=newNode;
			tail=newNode;
			return;
		}
		for(int i=0;i<=pos-1;i++) {
			temp=temp.next;
		}
		temp.prev.next=newNode;
		newNode.prev=temp.prev;
		newNode.next=temp;
		temp.prev=newNode;
		
		
		
	}
	
	public void deleteAtBegining() {
		if (head == null) {
            System.out.println("List is empty");
            return;
        }
		if (head.next == null) {
	        head = null;
	        tail = null;
	        size--;
	        return;
	    }

		head.next.prev=null;
		head=head.next;

		
		
	}
	
	public void deleteAtEnd() {
		 if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
		 if (head.next == null) {
		        head = null;
		        tail = null;
		        size--;
		        return;
		    }
		    // Move tail backward
		    tail = tail.prev;
		    tail.next = null;
		    size--;

	}
	
	
	public void deleteAtSpecificPosition(int index) {
		if (head == null) {
	        System.out.println("List is empty");
	        return;
	    }

	    if (index < 1 || index > size) {
	        System.out.println("Invalid position");
	        return;
	    }

	    // Case 1: delete at beginning
	    if (index == 1) {
	        deleteAtBegining();
	        return;
	    }

	    // Case 2: delete at end
	    if (index == size) {
	        deleteAtEnd();
	        return;
	    }

	    // Case 3: delete in the middle
	    Node temp = head;
	    for (int i = 0; i < index; i++) {
	        temp = temp.next;
	    }

	    temp.prev.next = temp.next;
	    temp.next.prev = temp.prev;

	    size--;
		
	}
	
	
	public void printForward() {
		Node temp=head;
		System.out.print("null-->");
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	public void printBackward() {
		Node temp=tail;
		System.out.print("null-->");
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.prev;
		}
		System.out.println("null");
	}
	
	
}

public class DoublyLinkedList {
	
	public static void main(String[] args) {
		Demo d= new Demo();
		d.insertAtBegining(10);
		d.insertAtBegining(15);
		d.insertAtBegining(20);
		d.insertAtBegining(25);
		d.insertAtEnd(30);
		d.insertAtSpecificPosition(2, 18);
		System.out.println("Original List");
		d.printForward();
		d.deleteAtBegining();
		System.out.println("List after deleting at Begining");
		d.printForward();
		d.deleteAtEnd();
		System.out.println("List after deleting at End");
		d.printForward();
		d.deleteAtSpecificPosition(3);
		System.out.println("List after deleting at Specific Position");
		d.printForward();
//		d.printBackward();
	}

}




