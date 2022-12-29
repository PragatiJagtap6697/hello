package DLL;

public class DLL {
private Node head;
public DLL() {
	head=null;
}
public boolean insertAtEnd(int data) {
	Node newNode=new Node(data);
	if(newNode==null) {
		return false;
	}
	if(head==null) {
		head=newNode;
		return true;
	}
	Node temp=head;
	while(temp.getNext()!=null) {
		temp=temp.getNext();
	}
	temp.setNext(newNode);
	newNode.setPrev(temp);
	return true;
}
public void display() {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.getData()+ " ");
		temp=temp.getNext();
	}
	System.out.println();
}
public boolean insert(int data,int position) {
	if(position <=0 || (head==null && position >1 )) {
		return false;
		
	}
	Node newNode=new Node(data);
	if(position==1) {
		if(head==null) {
			newNode.setNext(head);
			head.setPrev(newNode);
		}
		head=newNode;
		return true;
		
	}
	Node prev=head;
	for(int i=1; i<position-1;i++) {
		prev=prev.getNext();
		if(prev==null) {
			return false;
		}
	}
	newNode.setPrev(prev);
	if(prev.getNext()!=null) {
		newNode.setNext(prev.getNext());
		prev.getNext().setPrev(newNode);
	}
	prev.setNext(newNode);
	return true;
	}
public boolean deletebyposition(int position) {
	if(head==null) {
		return false;
	}
	if(position==1) {
		head=head.getNext();
		if(head!=null) {
			head.setPrev(null);
		}
		return true;
	}
	Node del=head;
	for(int i=1; i<position-1;i++) {
		del=del.getNext();
		if(del==null) {
			return false;
		}
	}
	del.getPrev().setNext(del.getNext());
	if(del.getNext()!=null) {
		del.getNext().setPrev(del.getPrev());
	}
	return true;
	}
}


