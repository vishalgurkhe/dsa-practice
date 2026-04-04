package collectionsImpl;

class Node<T>{
	T data;
	Node next;
	
	public Node(T data) {
		this.data=data;
		this.next=null;
	}

	
	
}

public class LinkedListImpl<T> {
	
	private Node<T> head;
	
	public int getSize(Node head) {
		int count=0;
		
		while(head!=null) {
			count++;
			head=head.next;
		}
		
		return count;
	}
	
	public void traverseList(Node head) {
		System.out.println("Traversing  a list ");
		StringBuilder sb=new StringBuilder("|");
		while(head!=null) {
			sb.append("  "+head.data+"  |");
			head=head.next;
		}
		System.out.println(sb.toString());
	}
	
	public void traverseReverseList(Node head) {
		
		if(head!=null) {
			traverseReverseList(head.next);
			System.out.println(head.data);
		}
		
	}
	
	
	public Node  insertAtPos(Node head,T data,int pos) {
		
		Node orgHead=head;
		int size = this.getSize(head);
		System.out.println("Size is >> "+size);
		if (pos>getSize(head) || pos<0) {
			System.out.println("Position not exists");
			return head;
		}
		
		Node newNode=new Node(data);
		if(pos==0) {
			System.out.println("Position is Zero hence adding add head postion ");
			newNode.next=head;	
			head=newNode;
			return newNode;
		}
		
		Node prev=head;
		int i=0;
		while(i<pos-1) {
			prev=prev.next;
			i++;
			System.out.println("i > "+i+" prev >" +prev.data);
		}
		
		// Link new node to the next node
		newNode.next = prev.next;
		// Link prev to the new node
		prev.next = newNode;
		
		return head;
	}
	
	public Node deleteAtPos(int pos,Node head) {
		Node prev=head;
		if(pos==0) {
			head=head.next;
			return head;
		}
		
		int i=0;
		while(i<pos-1) {
			prev=prev.next;
			i++;
			System.out.println("i > "+i+" prev >" +prev.data);
		}
		prev.next=prev.next.next;
		return head;
	}
	
	public boolean elementIsPresent(T data,Node head) {
		
		while(head!=null) {
			System.out.println("head.data >> "+head.data);
			if(head.data==data) {
				return true;
				}
			head=head.next;	
		}
		return false;
		
	}
	
	private Node returnElementAtPos(Node head, int pos) {
		
		Node prev=head;
		int i=0;
		while(i<pos) {
			System.out.println("I >> "+i);
			prev=prev.next;
			i++;
		}
		return prev;
		

	}
	
	public static void main(String[] args) {
		Node head=new Node(10);
		Node n1=new Node(12);
		Node n2=new Node(14);
		Node n3=new Node(15);
		head.next=n1;
		n1.next=n2;
		n2.next=n3;
		
		LinkedListImpl<Integer> list=new LinkedListImpl();
		System.out.println(list.getSize(head));
		list.traverseList(head);
		list.traverseReverseList(head);
		//Here assigning value to Head bcz we are updating head
		head = list.insertAtPos(head, 23, 3);
		list.traverseList(head);
		
		head = list.deleteAtPos(4,head);
		list.traverseList(head);	
		
		boolean elementIsPresent = list.elementIsPresent(56, head);
		System.out.println(elementIsPresent);
		
		Node returnElementAtPos = list.returnElementAtPos(head,2);
		System.out.println(" elements at position >> "+returnElementAtPos.data);
	}

	

}
