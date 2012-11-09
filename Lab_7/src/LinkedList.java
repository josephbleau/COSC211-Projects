
public class LinkedList {
	private Node head;
	private int count;
	
	public LinkedList(){
		count = 0;
		head = null;
	}
	
	/* Insert a node into the beginning of the list. */
	public void insert(Node n){
		if(head == null){
			head = n;
		}
		else {
			n.setNext(head);
			head = n;			
		}
		
		count++;
	}
	
	/* Remove a node from the beginning of the list */
	public void pop() {
		
		/* In the case of an empty list, just return. */
		if(head == null) {
			return;
		}
		else if(head.getNext() == null)
		{
			head = null;
			count = 0;
			return;
		}
		else {
			head = head.getNext();
			count--;
		}
	}
	
	public int getCount(){
		return count;
	}
	
	public void printCount(){ 
		System.out.print(count);
	}
	
	public void printContents(){
		Node p = head;
		while(p != null){
			System.out.println(p.getData());
			p = p.getNext();
		}
	}
	
	public void clear(){
		head = null;
		count = 0;
	}
}
