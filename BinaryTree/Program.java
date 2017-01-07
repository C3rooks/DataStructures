/******************************************************
* Author: Corey Crooks								  *
* Date: 1/7/2017									  *
* Purpose: General class for a Binary Tree &		  *
*		   Traversal algorithms.					  *
*******************************************************/
import java.util.Random;

class Program{
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree(); 

		/*
		tree.insert(5);
		tree.insert(10);
		tree.insert(15);
		tree.insert(1);
		tree.insert(6); 
		tree.insert(3); 
		tree.inOrderTraverse(tree.root);

		*/
	

		StopWatch sw = new StopWatch(); 
		int loop = 5000000;
		System.out.println("Starting timer for: " + loop + " values");
		sw.start(); 
		int counter = 0;
		while(counter < loop)
		{
			Random r = new Random(); 
			tree.insert(r.nextInt(50000));
			counter++; 
		}
		sw.stop(); 
		System.out.println("Elapsed Time:" + sw.getElapsedTime().toMillis() + "ms");
		//tree.inOrderTraverse(tree.root);

	}

}