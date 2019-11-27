package MyTree;

class TreeNode{
	private Object data;
	private TreeNode left;
	private TreeNode right;
	
	public TreeNode(Object data) {
		this.data = data;
		left = null;
		right = null;
	}
	
	public void leftSubTree(TreeNode sub) {
		if(this.left != null) {
			this.left = null;
		}
		this.left = sub;
	}
	
	public void rightSubTree(TreeNode sub) {
		if(this.right != null) {
			this.right = null;
		}
		this.right = sub;
	}
	
	public Object getData() {
		
		return this.data;
	}
	
	public TreeNode getLeft() {
		return this.left;
	}
	
	public TreeNode getRight() {
		return this.right;
	}
}

public class MyTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode leaf_1 = new TreeNode(2);
		TreeNode leaf_2 = new TreeNode(3);
		TreeNode leaf_3 = new TreeNode(4);
		
		root.leftSubTree(leaf_1);
		root.rightSubTree(leaf_2);
		leaf_2.leftSubTree(leaf_3);
		
		try {
		System.out.println(root.getData());
		System.out.println(root.getLeft().getData());
		System.out.println(root.getRight().getData());
		System.out.println(root.getLeft().getLeft().getData());
		}catch(NullPointerException e) {
			System.out.println("Null");
		}
	}
}
