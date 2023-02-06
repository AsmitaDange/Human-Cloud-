package queue;

public class My_queue {
	
	int maxsize;
	int top,rare;
	String arr[];
	
	public My_queue(int n){
		maxsize=n;
		arr=new String[maxsize];
		top=-1;
		rare=0;
		
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
	
	public void put(String str)
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
		System.out.println("data added successfully");
	}
	
	public boolean poll()
	{
		try
		{
			//String t=this.peek();
			arr[rare]=null;
			rare++;
			System.out.println("data removed successfully");
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Queue is empty");
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
			return null;
		}
		
	}

}
