
public class LinkedList<T> {
	private Node<T> head;
	private int count;
	
	public LinkedList(){
		head = null;
	}
	
	/* Insert a node into the beginning of the list. */
	public void insert(Node<T> n){
		if(head == null){
			head = n;
			n.setPrev(null);
			n.setNext(null);
		}
		else {
			n.setNext(head);
			head.setPrev(n);
			head = n;		
			n.setPrev(null);	
		}
		
		count++;
	}
	
	public void insertAt(Node<T> node, int loc) {
		if(loc  == 0){ 
			if(head != null) 
				node.setNext(head);
			node.setPrev(null);
			head = node; 
			count++;
			return; 
		}
		
		Node<T> ptr = head;
		for(int i = 1; i < loc; i++) {
			if(ptr.getNext() != null){ ptr = ptr.getNext(); }
		}
		
		node.setNext(ptr.getNext());
		node.setPrev(ptr);
		ptr.setNext(node);

		count++;
	}
	
	public void removeAt(int loc) {
		if( loc < 0 || loc >= count)
			return;
		else {
			count--;
			
			if(loc == 0) {
				if(head.getNext() != null) {
					head = head.getNext();
					head.setPrev(null);
				}
			} else {
				Node<T> ptr = head;
				
				for(int i = 0; i < loc; i++) {
					if(ptr.getNext() != null) ptr = ptr.getNext();
				}
				
				if(ptr.getPrev() != null)
					ptr.getPrev().setNext(ptr.getNext());
				if(ptr.getNext() != null)
					ptr.getNext().setPrev(ptr.getPrev());
			}
		}
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
