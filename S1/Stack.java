package S1;

public class Stack {
	private int arr[];
	private int size,top;
	public Stack() {
		size=10;
		arr=new int[size];
		top=-1;
	}
	
	public Stack(int size) {
		this.size=size;
		arr=new int[size];
		top=-1;
	}
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}else
		
			return false;
		
	}
	public boolean isFull() {
		if(top==(size-1)) {
			return true;
			
		}else
			return false;
	}
public boolean push(int data) {
	if(isFull()==false) {
		top=top+1;
		arr [top]=data;
		return true;
	}else {
		return false;
	}
}
public int pop() {
	if(isEmpty()==false) {
		int temp=arr[top];
		top--;
		return temp;
		
	}else
	{
		return -1;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack s=new Stack();
s.push(56);
s.push(5);
s.push(20);
s.push(2);
s.push(90);
while(!s.isEmpty()) {
	System.out.print(s.pop() +" ");
}

	}

}
