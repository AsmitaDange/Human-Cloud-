package console_switch_programs;

import java.util.Scanner;

import array_list.*;
import linked_list.*;
import queue.My_queue;
import stack.My_stack;

public class Console_switch {
	public static void main(String[] args) {
		My_Array_list ar=new My_Array_list(10);
		Linked_list ls=new Linked_list(5);
		My_queue q=new My_queue(5);
		My_stack st=new My_stack(5);
		Scanner sc= new Scanner(System.in);
		do
		{
		System.out.println("Enter any one of the option from following\n1.Array List\n2.Linked List\n3.Stack\n4.Queue\n");
		int n=sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("Which opration you want to perform on Array List:\n1.add\n2.remove\n3.contains\n4.empty\n5.indexof");
			int m=sc.nextInt();
			
			switch(m)
			{
			case 1:
				System.out.println("Enter String to add in Array List");
				String s=sc.next();
				ar.add(s);
				break;
			case 2:
				System.out.println("Enter which index data you have to remove");
				int i=sc.nextInt();
				ar.remove(i);
				break;
			case 3:
				System.out.println("Enter data you want to check whether it contains or not");
				String str=sc.next();
				System.out.println(ar.contain(str));
				break;
			case 4:
				System.out.println(ar.empty());
				break;
			case 5:
				System.out.println("Enter data to check index of that data");
				str=sc.next();
				System.out.println(ar.indexof(str));
				break;
			default:
				System.out.println("Please enter valid operation");
				break;
			}
			break;
			
		case 2:
			System.out.println("Which opration you want to perform on Linked List:\n1.add\n2.remove\n3.contains\n4.empty\n5.indexof");
			int o=sc.nextInt();
			
			switch(o)
			{
			case 1:
				System.out.println("Enter String to add in Linked List");
				String s=sc.next();
				ls.add(s);
				break;
			case 2:
				System.out.println("Enter which String data you have to remove");
				int i=sc.nextInt();
				ls.remove(i);
				break;
			case 3:
				System.out.println("Enter data you want to check whether it contains or not");
				String str=sc.next();
				System.out.println(ls.contain(str));
				break;
			case 4:
				System.out.println(ls.empty());
				break;
			case 5:
				System.out.println("Enter data to check index of that data");
				str=sc.next();
				System.out.println(ls.indexof(str));
				break;
			default:
				System.out.println("Please enter valid operation");
				break;
			}
			break;
			
		case 3:
			System.out.println("Which opration you want to perform on Stack:\n1.empty\n2.push\n3.pop\n4.peek\n");
			int s=sc.nextInt();
			switch(s)
			{
			case 1:
				System.out.println(st.empty());
				break;
			case 2:
				System.out.println("Enter which index data you want to add into stack");
				String i=sc.next();
				st.push(i);
				break;
			case 3:
				st.pop();
				break;
			case 4:
				System.out.println(st.peek());
				break;
			default:
				System.out.println("Please enter valid operation");
				break;
			}
			break;
			
		case 4:
			System.out.println("Which opration you want to perform on queue:\n1.empty\n2.put\n3.poll\n4.peek\n");
			int u=sc.nextInt();
			switch(u)
			{
			case 1:
				System.out.println(q.empty());
				break;
			case 2:
				System.out.println("Enter which String data you want to add into queue");
				String i=sc.next();
				q.put(i);
				break;
			case 3:
				q.poll();
				break;
			case 4:
				System.out.println(q.peek());
				break;
			default:
				System.out.println("Please enter valid operation");
				break;
			}
			break;
			
		default :
			System.out.println("Please enter valid operation");
			break;
			}
		
		System.out.println("Enter 1 to continue or 2 to exit\n");
		
			
		}while(sc.nextInt()==1);
	}

}
