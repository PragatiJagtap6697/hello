
public class Stack {
private int arr[];
private int size,top;
public Stack() {
	size=10;
	arr=new int [size];
	top=-1;
}
public Stack(int s) {
	size=s;
	arr=new int [size];
	top=-1;
}
public boolean isEmpty() {
	if(top==-1)
		return true;
	else
		return false;
}
public boolean isFull() {
	if(top==(size-1)) 
		return true;
		else
			return false;
	
}
public boolean push(int element) {
	if(isFull()==false) {
		top=top+1;
		arr[top]=element;
		return true;
	}
		else
			return false;
		
		
	}
public int pop() {
	if(isEmpty()==false) {
		int temp=arr[top];

		top=top-1;
		return temp;
	}
	else
		return -1;
}

}

