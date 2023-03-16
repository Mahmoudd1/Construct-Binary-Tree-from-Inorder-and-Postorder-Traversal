import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Sol2 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		TreeNode root=new TreeNode(postorder[postorder.length-1]);
		Set<Integer>myset=new HashSet<>();
		Queue<TreeNode>myq=new LinkedList<>();
		HashMap<Integer,Integer>mymap1=new HashMap<>();
		HashMap<Integer,Integer>mymap2=new HashMap<>();
		for (int i=0;i<inorder.length;i++)
		{
			mymap1.put(inorder[i],i);
			mymap2.put(postorder[i],i);
		}
		
		TreeNode temp;
		int postion=0;
		myq.add(root);
		boolean flag=false;
		myset.add(root.val);
		while(!myq.isEmpty())
		{
			temp=myq.poll();
			postion=mymap2.get(temp.val);
			while (postion>0)
			{
				postion--;
			}
		}
		
        return root;
    }
}
