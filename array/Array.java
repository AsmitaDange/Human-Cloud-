package array;

public class Array {
	
	int maxsize;
	int top;
	int arr[];
	
	public Array(int n){
		maxsize=n;
		arr=new int[maxsize];
		top=-1;
		
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
	
	public void add(int str)
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
		System.out.println("Data added Successfully");
	}
	
	
	
	

}
