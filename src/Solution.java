import java.util.HashMap;

public class Solution {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		HashMap<Integer,Integer>mymap=new HashMap<>();
		for (int i=0;i<inorder.length;i++)
		{
			mymap.put(inorder[i],i);
		}
		return divide(inorder,0,inorder.length,postorder,0,postorder.length,mymap);
         
    }
	TreeNode divide(int[]inorder,int is,int ie,int[]postorder,int ps,int pe,HashMap<Integer, Integer>mymap)
	{
		TreeNode root =new TreeNode(postorder[pe]);
		int index=mymap.get(postorder[pe]);
		int leftindex=index-is;
		root.left=divide(inorder,is,index-1,postorder,ps,ps+leftindex,mymap);
		root.right=divide(inorder,index+1,ie,postorder,ps+leftindex,pe-1,mymap);
		return root;
	}
}
