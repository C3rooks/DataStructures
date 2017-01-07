public class Node {
	
	public int data; 
	public Node left; 
	public Node right; 
	
	public Node(int data)
	{

      this.data = data; 
	}
	
	// prints the tree. 
	public void print()
	{
		
	}
	public int getData()
	{
		return data; 
	}
	public Node getLeft()
	{
		return left; 
	}
	public Node getRight()
	{
		return right; 
	}
	public void setLeft(Node left)
	{
		this.left = left; 
	}
	public void setRight(Node right)
	{
		this.right = right; 
	}
	
	
}