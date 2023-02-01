package linked_list;

public class Linked_list {
	
	int maxsize;
	int top;
	String arr[];
	int contain;
	int ind;
	
	public Linked_list(int n){
		maxsize=n;
		arr=new String[maxsize];
		top=-1;
		contain=0;
	}
	
	
	public void add(String str)
	{
		if(top<maxsize)
		{
			top++;
			arr[top]=str;
		}
		else
		{
			maxsize=maxsize+1;
			top++;
			arr[top]=str;
		}
		
		System.out.println("Data added successfully");
	}
	public void remove(int ind)
	{
		if(ind<=top)
		{
			arr[ind]=null;
			top--;
			System.out.println("Data removed successfully");
		}
		else
		{
			System.out.println("Linked list is empty");
		}
		
		
	}
	
	public boolean empty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public boolean contain(String str)
	{
		
		
		for(int i=0;i<=top;i++)
		{
			
			if(arr[i].equals(str))
			{
				return true;
			}
			
		}
		return false;
	}
	
	public int indexof(String str)
	{
		int a=-1;
		for(int i=0;i<=top;i++)
		{
			if(arr[i]==str)
			a=i;
			
		}
		return a;
		
	}

}
