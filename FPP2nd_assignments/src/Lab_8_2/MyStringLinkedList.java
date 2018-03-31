package Lab_8_2;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void addFirst(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;

	}

	void printNodes() {
		Node next = header.next;
		if (next == null)
			System.out.println("");
		else {
			String s = next.toString();
			System.out.println(s);
		}
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		@Override
		public String toString() {
			if (value == null)
				return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}

		private StringBuilder toString(StringBuilder sb, Node n) {
			if (n == null)
				return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}

	}

	void insert(String data, int pos) {
		// System.out.println((checkLength()));
		if ((checkLength() + 1) < pos)
			return; // check the availability of that position, in N or N + 1

		Node current = header;
		int currentPos = 0; // assume that header is in the position 0;

		if (pos == 1) { // if it's the very first position
			Node insert = new Node(current.next, current, data);
			current.next = insert; // header's next to insert position
			insert.previous = current; // previous for next to header position.
			return; // done
		}

		while (current.next != null) {
			currentPos++;
			current = current.next;
			if (currentPos == pos) {
				Node insert = new Node(current.previous.next, current.previous, data);

				if (current.previous != null) // insert in previous link to current
					current.previous.next = insert;

				if (current.next != null) // insert to next link to current
					current.next.previous = insert;

				return; // done
			}
		}

		// adding to the end, we have already checked everything.
		Node insert = new Node(null, current, data);
		current.next = insert;
	}

	public boolean remove(String remString) {
		Node current = header;

		while (current.next != null) {
			current = current.next;

			if (current.value == remString) {
				current.previous.next = current.next;

				if (current.next != null) // if it's not the last element
					current.next.previous = current.previous;

				return true;
			}
		}

		return false;
	}

	public int checkLength() {
		Node current = header;
		int x = 0;
		while (current.next != null) {
			current = current.next;
			x++;
		}

		return x;
	}

	public void sort() {
		if (header.next == null)
			return;
		Node current = header;
		while (current.next != null) {
			current = current.next;

			Node nextMinPos = minNode(current);
			swap(current, nextMinPos);

		}
	}

	void swap(Node n1, Node n2) {
		String temp = n1.value;

		n1.value = n2.value;
		n2.value = temp;
	}

	// find minimal element between the indices first and last elem in the list
	public Node minNode(Node n) {
		Node min = n; // assume that it's last elem and not null.

		while (true) {
			if (min.value.compareTo(n.value) > 0) {
				min = n;
			}

			if (n.next == null)
				break;

			n = n.next;
		}

		// return the min itself
		//System.out.println("MIN:" + min.value);
		return min;
	}

	boolean search(String val) {
		boolean b = recurse(0, checkLength(), val);
		return b;
	}

	boolean recurse(int a, int b, String val) {
		int mid = (a + b) / 2;
		if (getNodeOnPos(mid).value == val)
			return true;
		if (a > b)
			return false;
		if (getNodeOnPos(mid).value.compareTo(val) < 0)
			return recurse(mid + 1, b, val);
		return recurse(a, mid - 1, val);
	}

	// find minimal element between the indices first and last elem in the list
	public Node getNodeOnPos(int pos) {
		Node current = header; // assume that it's last elem and not null.
		
		int currentPos = 0;
		while (current.next!=null) {
			current = current.next;
			currentPos++;
			//System.out.println("current:" + current.value);
			if(currentPos==pos)
				break;
		}

		// return the min itself
		//System.out.println("MIN:" + min.value);
		return current;
	}

	public static void main(String[] args) {
		/*
		 * MyStringLinkedList list = new MyStringLinkedList(); list.addFirst("F");
		 * list.addFirst("E"); list.addFirst("D"); list.addFirst("C");
		 * list.addFirst("B"); list.addFirst("A"); list.insert("X", 7); list.insert("L",
		 * 8); list.insert("O", 1); list.printNodes();
		 * System.out.println("removing O is: " + list.remove("O"));
		 * System.out.println("removing A is: " + list.remove("A"));
		 * System.out.println("removing C is: " + list.remove("C"));
		 * System.out.println("removing H is: " + list.remove("H")); list.printNodes();
		 */
		MyStringLinkedList listNodes = new MyStringLinkedList();
		listNodes.addFirst("big");
		listNodes.addFirst("small");
		listNodes.addFirst("tall");
		listNodes.addFirst("short");
		listNodes.addFirst("round");
		listNodes.addFirst("square");
		listNodes.addFirst("enormous");
		listNodes.addFirst("tiny");
		listNodes.addFirst("gargantuan");
		listNodes.addFirst("lillioutian");
		listNodes.addFirst("numberless");
		listNodes.addFirst("none");
		listNodes.addFirst("vast");
		listNodes.addFirst("miniscule");
		listNodes.printNodes();

		listNodes.sort();
		listNodes.printNodes();
		
		System.out.println(listNodes.search("number")); // false
		System.out.println(listNodes.search("tiny")); // true
		System.out.println(listNodes.search("vast")); // true
		System.out.println(listNodes.search("big")); // true
		
	}
}
