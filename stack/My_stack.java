package stack;

public class My_stack {
	
	int maxsize;
	int top;
	int arr[];
	
	public My_stack(int n){
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
	
	public void push(int str)
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
	
	public boolean pop()
	{
		try
		{
			int t=this.peek();
			//arr[top]=null;
			top--;
			System.out.println("Data poped successfully");
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Stack is empty");
			return false; 
		}
	}
	
	public int peek() 
	{
		if(top>=0)
		{
			return arr[top]; 
		}
		else
		{
			return -1;
		}
		
		
	}
	

}
