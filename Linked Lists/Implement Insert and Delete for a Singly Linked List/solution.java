class Node {
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class List {
	Node head;

	public List() {
		head = null;
	}

	void insert(Node node, int data) {
		if(head == null){
			head = new Node(data);
			return;
		}
		if(node.next == null) {
			node.next = new Node(data);
			return;
		}
		insert(node.next, data);
		return;
	}

	void delete(Node node, int deleteMe) {
		if(head == null)
			return;
		if(head.data == deleteMe){
			head = head.next;
			return;
		}
		if(node.next == null)
			return;
		if(node.next.data == deleteMe){
			node.next = node.next.next;
			return;
		}
		delete(node.next, deleteMe);
		return;
	}

	void printList(Node node) {
		if(node == null)
			return;
		System.out.println(node.data);
		printList(node.next);
	}
}

class Solution {
	public static void main(String[] args) {
		List list = new List();
		list.insert(list.head, 1);
		list.insert(list.head, 2);
		list.insert(list.head, 3);
		list.delete(list.head, 2);
		list.delete(list.head, 1);
		list.printList(list.head);
	}
}