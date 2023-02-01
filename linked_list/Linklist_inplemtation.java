package linked_list;


public class Linklist_inplemtation {
	public static void main(String[] lsgs) {
		
		Linked_list ls= new Linked_list(10);
		ls.add("Cat");
		ls.add("Dog");
		ls.add("Monkey");
		ls.add("Donkey");
		ls.add("Cow");
		ls.add("Crow");
		System.out.println(ls.empty());
		System.out.println();
		System.out.println("Linked_List :\n" );
		for(int i=0;i<=ls.top;i++)
		{
			System.out.print(ls.arr[i]+"\n");
		}
		ls.remove(2);
		System.out.println();
		System.out.println("Linked_List :" );
		for(int i=0;i<=ls.top;i++)
		{
			System.out.print(ls.arr[i]+"\n");
		}
	
		//System.out.println("Is cow contain: "+ls.contain("Cow"));
		
		
	}

}
