import java.util.Stack;

class Node{

	public Comparable data;
	public Node left,right;

	public Node (Comparable data){
		this(data, null, null);
	}

	public Node(Comparable data, Node left, Node right){

		this.data = data;
		this.left = left;
		this.right = right;
	}		
}
class BTree {
	private Node root;

	public BTree() {
		root = null;
	}


	public void add(Comparable key) {
		Node current = root, parent = null;
		while (current != null) {
			if (key.compareTo(current.data) < 0) {
				parent = current;
				current = current.left;
			}

			else{
				parent = current;
				current = current.right;
			}
		}

		if (parent == null)
			root = new Node(key);

		else {
			if (key.compareTo(parent.data) < 0)
				parent.left = new Node(key);

			else
				parent.right = new Node(key);
		}
	}

	public boolean delete(Comparable key) {
        if (root == null)
               return false;
        Node current = root;
        Node parent = root;
        boolean right = true;
        // searching for the node to be deleted
        while (key.compareTo(current.data) != 0) {  
               if (key.compareTo(current.data) < 0) {
				     right = false;
                     parent = current;
                     current = current.left;
               } else {
                     right = true;
                     parent = current;
                     current = current.right;
               }
               if (current == null)
                     return false;
        }

        Node substitute = null;
        //  case 1: Node to be deleted has no children
        if (current.left == null && current.right == null)
               substitute = null;

        //  case 2: Node to be deleted has one child
        else if (current.left == null)
               substitute = current.right;
        else if (current.right == null)
               substitute = current.left;
        else // case 3: Node to be deleted has two children
        {
               Node successor = current.right;
               Node successorParent = current;
               //  searching for the inorder successor of the node to be deleted
               while (successor.left != null) {
                     successorParent = successor;
                     successor = successor.left;
               }
               substitute = successor;
               if (successorParent == current) {
                     if (successor.right == null)
                            successorParent.right = null;
                     else
                            successorParent.right = successor.right;
               } else {
                     if (successor.right == null)
                            successorParent.left = null;
                     else
                            successorParent.left = successor.right;
               }
               successor.right = current.right;
               successor.left = current.left;
               substitute = successor;
        } // case 3 done
        if (current == root) // Replacing the deleted node
               root = substitute;
        else if (right)
               parent.right = substitute;
        else
               parent.left = substitute;
        return true;

 }

	public void displayTree()
	{
		Stack<Node> globalStack = new Stack<Node>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println(
		"......................................................");
		while(isRowEmpty==false)
		{
			Stack<Node> localStack = new Stack<Node>();
			isRowEmpty = true;

			for(int j=0; j<nBlanks; j++)
				System.out.print(' ');

			while(globalStack.isEmpty()==false)
			{
				Node temp = globalStack.pop();
				if(temp != null)
				{
					System.out.print(temp.data);
					localStack.push(temp.left);
					localStack.push(temp.right);

					if(temp.left != null ||
							temp.right != null)
						isRowEmpty = false;
				}
				else
				{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j=0; j<nBlanks*2-2; j++)
					System.out.print(' ');
			}  // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while(localStack.isEmpty()==false)
				globalStack.push( localStack.pop() );
		}  // end while isRowEmpty is false
		System.out.println(
		"......................................................");
	}
	public int Size(){
		return sizeHelper(root);
	}

	private static int sizeHelper(Node current) {
		 if (current == null){
			 return 0;
		 }
		 else {
			 return 1 + sizeHelper(current.left) + sizeHelper(current.right);
		 }
	}
	public Comparable maxKay(){
		Node current = root;
		while (current.right != null){
			current = current.right;
		}return current.data;
	}
	public int maxValue(){
		return  maxValueHelper(root);
	}

	public int maxValueHelper(Node current) {
		if (current == null){
			return -1;
		}
		else {
			int maxLeft = maxValueHelper(current.left);
			int maxRight = maxValueHelper(current.right);
			int currentData = (int) current.data;
			return Math.max(Math.max(maxLeft,maxLeft),currentData);
		}
	}
	public int minValueHelper(Node current) {
		if (current == null){
			return -1;
		}
		else {
			int maxLeft = minValueHelper(current.left);
			int maxRight = minValueHelper(current.right);
			int currentData = (int) current.data;
			return Math.min(Math.min(maxLeft,maxLeft),currentData);
		}
	}
	public boolean isBST(){
		return isBSTHelperh(root);
	}
	/*public boolean isBSTHelper(Node current){
		if (current == null){
			return true;
		}
		else {
			if ((int)current.right.data<(int)current.data){
				if ((int)current.right.data<(int)root.data){
					return false;
				}
				else isBSTHelper(current.right);
			}
			else {
				return false;
			}
			if ((int)current.left.data>(int)current.data){
					if ((int)current.left.data>(int)root.data){
						return false;
					}
					else isBSTHelper(current.left);
			}
			else return false;
		}
	}*/
	public boolean isBSTHelperh(Node current){
		if (current == null){
			return true;
		}
		else {
			int maxValue = maxValueHelper(current.left);
			int minValue = minValueHelper(current.left);
			if (maxValue > (int) current.data){
				return false;
			}
			if (minValue < (int) current.data){
				return false;
			}
			return isBSTHelperh(current.left) && isBSTHelperh(current.right);
		}
	}
	public void preorder(){
		Stack stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()){
			Node temp = (Node) stack.pop();
			System.out.println(temp.data);
			if (temp.right!= null){
				stack.push(temp.right);
			}
			if (temp.left!= null){
				stack.push(temp.left);
			}
		}
	}
	public int heightRec(){
		return heightRech(root);
	}

	private int heightRech(Node current) {
		if (current == null){
			return -1;
		}
		else {
			int max = Math.max(heightRech(current.left), heightRech(current.right));
			return 1 + max;
		}
	}
	public int heightiter(){
		LinkList currentlevel = new LinkList();
		int level = -1;
		currentlevel.insertLast(root);
		while (!currentlevel.isEmpty()){
			LinkList nextlevel = new LinkList();
			while (!currentlevel.isEmpty()){
				Node current = (Node) currentlevel.removeFirst();
				if (current.left!=null){
					nextlevel.insertLast(current.left);
				}
				if (current.right!=null){
					nextlevel.insertLast(current.right);
				}
			}
			level++;
			currentlevel = nextlevel;
		}
		return level;
	}
	public void printlevel(int level){
		printlevelh(root, level);
	}
	private void printlevelh(Node node, int level) {
		if (node == null){
			return;
		}
		else {

		}
	}
	public void breadthTraversal() {
		LinkList a = new LinkList();
		Node node = root;
		while (node != null){
			Node temp = root;
			if (temp.left != null && temp.right != null){
				a.insertLast(node.left);
				a.insertLast(node.right);
				System.out.print(temp.data);
				System.out.print(temp.left.data);
				System.out.print(temp.right.data);
				temp = (Node) a.removeFirst();
			}
			if (temp.right!=null && temp.left == null){
				a.insertLast(node.right);
				System.out.print(temp.data);
				System.out.print(temp.right.data);
				temp = (Node) a.removeFirst();
			}
			if (temp.left!=null && temp.right == null){
				a.insertLast(node.left);
				System.out.print(temp.data);
				System.out.print(temp.left.data);
				temp = (Node) a.removeFirst();
			}
			if (temp.left==null && temp.right == null){
				System.out.print(temp.data);
				a.removeFirst();
			}
		}
	}
	public int height(){
		int i = 0;
		int k = 0;
		return heighth(root, i);
	}

	private int heighth(Node node, int i) {
		if (node == null){
			return 0;
		}
		else {
			heighth(node.right, i++);
			heighth(node.left, i++);
			return i;
		}
	}
	public void printrange(int a, int b){
		printrangeh(root, a, b);
	}

	private void printrangeh(Node node, int a, int b) {
		if (node == null){
			return;
		}
		else {
			if ((int)node.data >= a &&  (int)node.data <= b){
				System.out.print(node.data + " ");
			}
			printrangeh(node.left, a, b);
			printrangeh(node.right, a, b);
		}
	}
	public String leftRightPath(){
		return leftRightPathH(root, "", false);
	}

	private String leftRightPathH(Node node, String s, boolean b) {
		if(node == null){
			return s;
		}else {
			if (!b) {
				s = s + " " + (int) node.data;
				return leftRightPathH(node.left,s,true);
			}
			else {
				s = s + " " + (int) node.data;
				return leftRightPathH(node.right,s,false);
			}
		}
	}
}