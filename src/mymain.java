
public class mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []inorder = {9,3,15,20,7};
		int []postorder = {9,15,7,20,3};
		sol solution =new sol();
		Node root =solution.buildTree(inorder, postorder);
		
		solution.print(root);
	}
	

}
