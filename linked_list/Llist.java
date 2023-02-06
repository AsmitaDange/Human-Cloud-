package linked_list;

public class Llist {
	Node head;
	   int size;
	 public Llist(){
		  this.size=0;
	  }
		class Node {
			String data;
			Node next;

			Node(String data) {
				this.data = data;
				this.next = null;
				size++;
			}
		}

		// add- first,last
		public void addFirst(String data) {
			Node newNode = new Node(data);
			
			if (head == null) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}

		// add-last
		public void addLast(String data) {
			Node newNode = new Node(data);
		
			if (head == null) {
				head = newNode;
				return;
			}
			Node currNode = head;
			while (currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}

		// print
		public void printList() {
			if(head==null)
			{
				System.out.println("List is Empty");
			}
			else
			{
			Node currNode = head;
			System.out.println();
			while (currNode != null) {
				System.out.print(currNode.data + " -> ");
				currNode = currNode.next;
			}
			}
			//System.out.println("NULL");
			
			
		}

		public void deleteFirst() {
		
			try {
				
				head = head.next;
				size--;
				
			}
				catch (Exception e) {
					System.out.println("Delete first : List is empty");
				} 
			
			
		}

		public void deleteLast() {
			try {
			
			if (head.next == null) {
				head = null;
				size--;
				return;
			}
			
			Node secondLast = head;
			Node lastNode = head.next; // head.next=null-> lastNode=null
			while (lastNode.next != null) {
				lastNode = lastNode.next;
				secondLast = secondLast.next;
			}
			secondLast.next = null;
			size--;
			}
			
			catch(Exception e) {
				System.out.println("Delete last : List is Empty");
				return;
			}
			
		}
		public int getSize() {
			System.out.println();
			return size;
		}

}
