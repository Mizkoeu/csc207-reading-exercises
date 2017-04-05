import Tree.Node;

public class Tree<T extends Comparable<T>> {
	private static class Node<T> {
		private T data;
		private Node<T> left;
		private Node<T> right;
		
		public Node(T data, Node<T> left, Node<T> right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}	
	}
	
	private Node<T> root;
	
	public Tree() { root = null; }
	
	public void inorderPrint() {
		inorderPrint(root);
	}
	
	private static <T> void inorderPrint(Node<T> cur) {
		if (cur != null) {
			inorderPrint(cur.left);
			System.out.println(cur.data);
			inorderPrint(cur.right);
		}
	}
	
	public int size (Node<T> parent) {
		if (parent == null) {
			return 0;
		} else {
			return 1 + size(parent.left) + size(parent.right); 
		}
	}
	
	public int size() {
		return size(root);
	}
	
	public void add(T v) {
		root = add(root, v);
	}
	
	public static <T extends Comparable<T>> Node<T> add(Node<T> cur, T v){
		Node<T> ret = new Node<>(v, null, null);
		if (cur == null) {
			return ret;
		} else {
			if (v.compareTo(cur.data) < 0 ) {	
				//left sub-tree
				//cur = new Node<>(cur.data, ret, null);
				cur.left = add(cur.left, v);
			} else {
				//right sub-tree
				//cur = new Node<>(cur.data, null, ret);	
				cur.right = add(cur.right, v);
			}
			return cur;
		}
	}
	
	
}