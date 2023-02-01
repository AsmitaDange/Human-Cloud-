package stack;

public class My_stack_Implementation {
	public static void main(String[] args) {
		My_stack st=new My_stack(5);
		System.out.println(st.empty());
		st.push("Asmita");
		st.push("Dange");
		st.push("Asmi");
		System.out.println("my stack is : "+ st);
		System.out.println("Peek: "+ st.peek());
		st.pop();
		//System.out.println("now my stack is : "+ st);
	}

}
