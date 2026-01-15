package h1;

public class Node {
	Node next;
	
	Node(Node next){
		this.setNext(next);
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
