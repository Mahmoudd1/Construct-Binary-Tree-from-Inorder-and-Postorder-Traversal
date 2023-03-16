import java.util.HashMap;

class sol {
    public Node buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer>mymap=new HashMap<>();
		for (int i=0;i<inorder.length;i++)
		{
			mymap.put(inorder[i],i);
		}
		return divide(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mymap);
         
    }
	Node divide(int[]inorder,int is,int ie,int[]postorder,int ps,int pe,HashMap<Integer, Integer>mymap)
	{
        if (is>ie || ps>pe)
            return null;
        Node root =new Node(postorder[pe]);
		int index=mymap.get(postorder[pe]);
		int leftindex=index-is;
		root.left=divide(inorder,is,index-1,postorder,ps,ps+leftindex-1,mymap);
		root.right=divide(inorder,index+1,ie,postorder,ps+leftindex,pe-1,mymap);
		return root;
	}
	void print(Node root)
	{
		if (root!=null)
		{
			System.out.println(root.val);
			print (root.left);
			print (root.right);
		}
	}
    
}