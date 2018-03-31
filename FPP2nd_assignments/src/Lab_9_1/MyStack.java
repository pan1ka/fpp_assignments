package Lab_9_1;

import Lab_9_1.MyStringLinkedList.Node;

public class MyStack {
	private MyStringLinkedList list;

	public MyStack() {
		list = new MyStringLinkedList();
	}

	public String pop() throws Exception{
		
		if(list.header.next == null) 
			throw new IllegalStateException("no element");
		
		Node delElem = list.new Node();
		delElem = list.header.next;

		if (delElem.next == null) { // we don't have next elem after poping elem
			list.header.next = null;
			delElem.previous = null;
		} else { // there is next elem
			list.header.next = delElem.next;
			delElem.next.previous = list.header;
		}

		return delElem.value;
	}

	/*
	 * Return first element without deleting
	 */
	public String peek() {

		if (list.header.next == null)
			return null;

		return list.header.next.value;
	}

	/*
	 * Add first elem.
	 */
	public void push(String s) {

		Node n = list.new Node();
		n.value = s;

		if (list.header.next == null) {
			list.header.next = n;
			n.previous = list.header;
		} else {
			Node old = list.header.next;
			list.header.next = n;
			n.previous = list.header;
			n.next = old;
			old.previous = n;
		}

	}
	
	
	public static void main(String[] args) throws Exception {
		MyStack stack = new MyStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping..."+stack.pop());
		System.out.println("Peeking..."+stack.peek());
		System.out.println("Popping..."+stack.pop());
		System.out.println("Print... "+stack.list);
	}
	
	
}
