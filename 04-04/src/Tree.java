public class Tree<T extends Comparable<T>> {
	private static class Node<T> {
		private T data;
		private Node<T> left;
		private Node<T> right;

		@SuppressWarnings("unused")
		public Node(T data, Node<T> left, Node<T> right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node<T> root;

	public Tree() { root = null;}

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

}