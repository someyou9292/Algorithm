package easy_MaximumDepthOfBinaryTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		this.val = x;
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
	
}
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        return depthSearch(root, 0);
    }
    
    public int depthSearch(TreeNode node, int depth){
        if(node == null){
            return depth;
        }
        
        if(node.left != null && node.right != null){
           return Math.max( depthSearch(node.left, depth+1),depthSearch(node.right, depth+1));
        }else if(node.left != null){
            return depthSearch(node.left, depth+1);
        }else{
               return depthSearch(node.right, depth+1);
        }
    }
}

public class MaximumDepthOfBinaryTree {
	public static void main(String[] args) {
		Solution st = new Solution();
		TreeNode root = new TreeNode(3);
		TreeNode ch_1 = new TreeNode(9);
		TreeNode ch_2 = new TreeNode(20);
		TreeNode ch_3 = new TreeNode(15);
		TreeNode ch_4 = new TreeNode(7);
		TreeNode ch_5 = new TreeNode(2);
		TreeNode ch_6 = new TreeNode(4);
		TreeNode ch_7 = new TreeNode(1);
		TreeNode ch_8 = new TreeNode(10);
		
		root.leftSubTree(ch_1);
		root.rightSubTree(ch_2);
		ch_2.leftSubTree(ch_3);
		ch_2.rightSubTree(ch_4);
		ch_4.leftSubTree(ch_5);
		ch_4.rightSubTree(ch_6);
		ch_6.leftSubTree(ch_7);
		ch_6.rightSubTree(ch_8);
		
		System.out.println(st.maxDepth(root));
	}
}
