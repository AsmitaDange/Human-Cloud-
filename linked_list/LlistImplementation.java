package linked_list;

public class LlistImplementation {
	public static void main(String[] args) {
		Llist list = new Llist();
		list.deleteFirst();
		list.deleteLast();
		list.printList();
		System.out.println(list.getSize());
		list.addFirst("Asmita");
		list.addFirst("Dange");
		list.addFirst("Asmi");
		list.printList();
		list.addLast("Ashish");
		list.printList();
		list.deleteFirst();
		list.printList();
		System.out.println(list.getSize());
	}

}
