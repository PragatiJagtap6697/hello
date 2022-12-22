
public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
s.push(20);
s.push(10);
s.push(30);
s.push(16);
//System.out.println(s.pop());
//System.out.println(s.pop());
//System.out.println(s.pop());
//System.out.println(s.pop());
while(!s.isEmpty()) {
	System.out.println(s.pop());
}
	}

}
