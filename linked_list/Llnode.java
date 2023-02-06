package linked_list;

public class Llnode {
	
	int data;
	Llnode next;
	
	public Llnode(int data)
	{
		this.data=data;
		this.next=null;
	}
	
	public Llnode insersionatfront(int key,Llnode head)
	{
		Llnode temp=new Llnode(key);
		if(head==null)
		{
			head=temp;
		}
		else
		{
			temp.next=head;
			head=temp;
		}
		return head;
	}
	
	public Llnode insersionatend(int key,int pos,Llnode head)
	{
		Llnode temp=new Llnode(key);
		if (pos==1)
		{
			temp.next=head;
			head=temp;
		}
		else
		{
			Llnode temp1=head;
			for(int i=1;temp1!=null && i<pos;i++)
			
				temp1=temp1.next;
				temp.next=temp1.next;
				temp1.next=temp;
		
		}
		return head;
	}

}
