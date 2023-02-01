package array_list;

public class Array_list_Implementation {
	public static void main(String[] args) {
		My_Array_list ar= new My_Array_list(10);
		ar.add("Cat");
		ar.add("Dog");
		ar.add("Monkey");
		ar.add("Donkey");
		ar.add("Cow");
		ar.add("Crow");
		System.out.println(ar.empty());
		System.out.println();
		System.out.println("Array_List :\n" );
		for(int i=0;i<=ar.top;i++)
		{
			System.out.print(ar.arr[i]+"\n");
		}
		ar.remove(2);
		System.out.println();
		System.out.println("new_Array_List :" );
		for(int i=0;i<=ar.top;i++)
		{
			System.out.print(ar.arr[i]+"\n");
		}
	
		//System.out.println("Is cow contain: "+ar.contain("Cow"));
		
		
	}

}
