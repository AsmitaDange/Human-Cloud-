package stack;

public class My_stack {
	
	int maxsize;
	int top;
	String arr[];
	
	public My_stack(int n){
		maxsize=n;
		arr=new String[maxsize];
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
	
	public void push(String str)
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
		if(!(this.empty()))
		{
			String t=this.peek();
			arr[top]=null;
			top--;
			System.out.println("Data poped successfully");
			return true;
		}
		else
		{
			System.out.println("Stack is empty");
			return false; 
		}
	}
	
	public String peek() 
	{
		if(top>=0)
		{
			return arr[top]; 
		}
		else
		{
			return "Exception: Stack is empty";
		}
		
		
	}
	

}
