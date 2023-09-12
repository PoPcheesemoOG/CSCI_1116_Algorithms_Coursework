
public class Example {
	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		for (int i = 0; i < 10; i++) {
			int q = (int) (Math.random()*30);
			System.out.print(q + " ");

			tree.insert(new Node (q));
		}
		System.out.print("\n ");
		tree.display();
		
		System.out.println("\nSearch for 14: " + tree.search(14));
		tree.remove(14);
		tree.display();
	}
}
