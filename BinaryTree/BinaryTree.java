class BinaryTree {
	
	Node root; 

	public void inOrderTraverse(Node node)
	{
		if(node != null){
		inOrderTraverse(node.left);
		System.out.println(node.data);
		inOrderTraverse(node.right); 
		}
	}
	public void preOrderTraverse(Node node)
	{
		if(node != null)
		{
			System.out.println(node.data);
			preOrderTraverse(node.left);
			preOrderTraverse(node.right);
		}
	}

	public void postOrderTraverse(Node node)
	{
		if(node != null)
		{
			postOrderTraverse(node.left);
			postOrderTraverse(node.right);
			System.out.println(node.data);
		}
	}
	public void insert(int data)
	{
		Node newNode = new Node(data);
		if(root == null)
		{
			root = newNode; 
		}	
		else{
			Node temp = root; 
			Node parent; 

			while(true)
			{
				parent = temp; 
				if(data < temp.data)
				{
					temp = temp.left; 
					if(temp == null)
					{
						parent.left = newNode;
						return;
					}
				}
				else{
					temp = temp.right;
					if(temp == null)
					{
						parent.right = newNode;
						return;
					}
				}
			}
		}																
	}



}																																																																																																																																																																																																												