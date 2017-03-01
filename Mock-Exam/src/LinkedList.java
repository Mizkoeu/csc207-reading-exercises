public class LinkedList<T> {
	private Node<T> first;
	
	public LinkedList (Node<T> first) {
		this.first = first;
	}
	
	public void dedupHead() {
		Node<T> comp = first.next;
		Node<T> prev = first;
		while (comp != null) {
			if (comp.value.equals(first.value)) {
				prev.next = comp.next;
				comp = prev.next;
			} else {
				comp = comp.next;
				prev = prev.next;
			}
		}
	}

	public void printList() {
		String s = "";
		Node<T> cur = first;
		while (cur != null) {
			s += cur.value;
			cur = cur.next;
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		Node<Integer> a = new Node<Integer>(3, null);
		Node<Integer> b = new Node<Integer>(8, a);
		Node<Integer> c = new Node<Integer>(3, b);
		Node<Integer> d = new Node<Integer>(2, c);
		Node<Integer> e = new Node<Integer>(3, d);
		Node<Integer> f = new Node<Integer>(2, e);
		Node<Integer> g = new Node<Integer>(3, f);
		LinkedList<Integer> ha = new LinkedList<Integer>(g);
		ha.printList();
		ha.dedupHead();
		ha.printList();
	}
}
