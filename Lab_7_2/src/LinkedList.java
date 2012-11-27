
public class LinkedList<T> {
	private Node<T> head;
	private int count;
	
	public LinkedList(){
		count = 0;
		head = null;
	}
	
	/* Insert a node into the beginning of the list. */
	public void insert(Node<T> n){
		if(head == null){
			head = n;
		}
		else {
			n.setNext(head);
			head = n;			
		}
		
		count++;
	}
	
	public void insertAt(Node<T> node, int loc) {
		if(loc  == 0){ head = node; return; }
		
		Node<T> ptr = head;
		for(int i = 1; i < loc; i++) {
			if(ptr.getNext() != null){ ptr.setNext(ptr.getNext()); } 
			else { return; }
		}
		
		ptr.setNext(node);
	}
	
	public void removeAt(int loc) {
		Node<T> ptr = head;
		
		for(int i = 0; i < loc; i++) {
			if(ptr.getNext() != null) { ptr.setNext(ptr.getNext());}
			else { return; }
		}
		
		if(head == ptr && ptr.getNext() != null) {
			head = ptr.getNext();
			return;
		}
		
		if(ptr.getPrev() != null)
			ptr.getPrev().setNext(ptr.getNext());
		if(ptr.getNext() != null)
			ptr.getNext().setPrev(ptr.getPrev());
		
		return;
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
		Node<T> p = head;
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
