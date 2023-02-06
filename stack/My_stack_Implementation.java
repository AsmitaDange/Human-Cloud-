package stack;

public class My_stack_Implementation {
	public static void main(String[] args) {
		My_stack st=new My_stack(5);
		System.out.println(st.empty());
		st.pop();
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println("my stack is : "+ st);
		System.out.println("Peek: "+ st.peek());
		st.pop();
		//System.out.println("now my stack is : "+ st);
	}

}
