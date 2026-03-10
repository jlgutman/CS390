package lesson8.prob4;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		//1. adds to the end of the list
		public void addLast(String item){
			//implement
			Node node = new Node();
			node.value = item;

			Node current = header;
			while (current.next != null) {
				current = current.next;
			}
			node.previous = current;
			current.next = node;
		}
		// 2. Remove by passing object
		public boolean remove(String item){
			//Implement
			if (header.next == null) return false;

			Node current = header.next;
			while (current != null) {
				if (current.value.equals(item)) {
					current.previous.next = current.next;
					if (current.next != null) {
						current.next.previous = current.previous;
					}
					current.next = null;
					current.previous = null;
					return true;
				}
				current = current.next;
			}
			return false;
		}

		// 3. Remove the First Node

		public boolean removeFirst() {
		  	// Implement
			if (header.next == null) return false;
			Node first = header.next;
			header.next = first.next;
			if (first.next != null) {
				first.next.previous = header;
			}
			first.next = null;
			first.previous = null;
			return true;
		}


		// 4. Prints the list from last to first
		public void printReverse() {
		    // Implement
			if (header.next == null) {
				System.out.println("[Empty List]");
				return;
			}
			Node current = header.next;
			while (current.next != null) {
				current = current.next;
			}
			StringBuilder sb = new StringBuilder("[ ");
			while (current != header) {
				sb.append(current.value).append(" ");
				current = current.previous;
			}
			sb.append("]");
			System.out.println(sb);
		}
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;
			
			public String toString() {
				return value == null ? "null" : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			list.addLast("Bill");
			list.addLast("Tom");
			System.out.println(list);

			// Call all your implemented Methods
			System.out.println("1. addLast===========");
			list.addLast("Carol");
			System.out.println(list);

			System.out.println("2. remove===========");
			System.out.println(list.remove("Harry"));
			System.out.println(list);

			System.out.println("3. removeFirst===========");
			System.out.println(list.removeFirst());
			System.out.println(list);

			System.out.println("4. printReverse===========");
			list.printReverse();
		}
}
