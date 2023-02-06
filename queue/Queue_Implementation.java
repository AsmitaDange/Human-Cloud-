package queue;

public class Queue_Implementation {
	public static void main(String[] args) {
		My_queue q=new My_queue(5);
		q.put("Peacock");
		q.put("cock");
		q.put("crow");
		q.put("Hen");
		q.put("owl");
		System.out.println(q.empty());
		System.out.println("My queue: ");
		for(int i=q.rare;i<q.top;i++)
		{
			System.out.println(q.arr[i]);
		}
		q.poll();
		System.out.println("\nQueue After poll: ");
		for(int i=q.rare;i<q.top;i++)
		{
			System.out.println(q.arr[i]);
		}
		System.out.println(q.peek());
		
		
	}

}
