import com.sun.source.tree.Tree;

import java.util.Scanner;


//ques1 : inorder traversal
/*class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

class TreeTraversal {
    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.print("Inorder traversal: ");
        inorder(root);
    }
}

 */
// que:2 heighttree
class MainHeightTree {
    static class TreeNode {
        int data;
        TreeNode left, right;
        TreeNode(int value) {
            data = value;
            left = right = null;
        }
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Height of tree is " + height(root));
    }
}




/*// que3: count treenode
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}
   class CountNode{
    public static  int count(TreeNode root){
        if(root==null )return 0;
        return 1+ count(root.left) +count(root.right);
    }
    public static void main(String[] args){
        TreeNode root= new TreeNode(1);
        root.left = new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println("Number of node:"+count(root));
    }
    }

 */

//Q4. Search a node in a binary tree
//class TreeNode
//{
//    int data;
//    TreeNode left,right;
//
//    TreeNode(int value)
//    {
//        data=value;
//        left=null;
//        right=null;
//    }
//}
//class Tree1
//{
//    public static boolean search(TreeNode root,int value)
//    {
//        if(root==null)
//            return true;
//        if(root.data==value)
//            return true;
//        return search(root.left,value)||search(root.right,value);
//    }
//    public static void main(String args[])
//    {
//        TreeNode root=new TreeNode(1);
//        root.left=new TreeNode(2);
//        root.left.left=new TreeNode(4);
//        root.left.left.left=new TreeNode(8);
//        root.left.left.right=new TreeNode(9);
//        root.left.right=new TreeNode(5);
//        root.left.right.left=new TreeNode(10);
//        root.left.right.right=new TreeNode(13);
//
//        root.right=new TreeNode(3);
//        root.right.left=new TreeNode(6);
//        root.right.right=new TreeNode(7);
//        root.right.left.left=new TreeNode(11);
//        root.right.left.right=new TreeNode(12);
//        root.right.right.left=new TreeNode(14);
//        root.right.right.right=new TreeNode(15);
//
//        int val=7;
//        System.out.println(search(root,val));
//    }
//}
// 22-4-25
//Q5. Printing nodes in a particular level
//class Node
//{
//    int data;
//    Node left,right;
//    Node(int data)
//    {
//        this.data=data;
//        left=right=null;
//    }
//}
//class Tree2
//{
//    public static void printLevel(Node root,int k)
//    {
//        if(root==null)
//            return;
//        if(k==1)
//            System.out.print(root.data+" ");
//        else {
//            printLevel(root.left, k - 1);
//            printLevel(root.right, k - 1);
//        }
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(10);
//        root.left=new Node(20);
//        root.right=new Node(30);
//        root.left.left=new Node(40);
//        root.left.right=new Node(50);
//        root.right.left=new Node(60);
//        root.right.right=new Node(70);
//        System.out.println("Nodes at level3:");
//        printLevel(root,3);
//    }
//}

//Q6. Maximum value from the binary tree
//class Node
//{
//    int data;
//    Node left,right;
//    Node(int data)
//    {
//        this.data=data;
//        left=right=null;
//    }
//}
//class Tree2
//{
//    public static int maximum(Node root)
//    {
//        if(root==null)
//            return 0;
//        return Math.max(root.data,(Math.max(maximum(root.left),maximum(root.right))));
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(12);
//        root.left=new Node(24);
//        root.right=new Node(36);
//        System.out.println("Maximum value is:"+maximum(root));
//    }
//}

//Q7. Count Leaf nodes in a binary tree
//class Node
//{
//    int data;
//    Node left,right;
//    Node(int data)
//    {
//        this.data=data;
//        left=right=null;
//    }
//}
//class Tree2
//{
//    public static int countleaves(Node root) {
//        if(root==null)
//            return 0;
//        if(root.left==null && root.right==null)
//            return 1;
//        return countleaves(root.left)+countleaves(root.right);
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(12);
//        root.left=new Node(24);
//        root.right=new Node(36);
//        System.out.println("Number of leaves in binary tree:"+countleaves(root));
//    }
//}

//Q8. Find the total sum of all nodes values in binary tree
//class Node
//{
//    int data;
//    Node left,right;
//    Node(int data)
//    {
//        this.data=data;
//        left=right=null;
//    }
//}
//class Tree2
//{
//    static int sum(Node root)
//    {
//        if(root==null)
//            return 0;
//        return root.data+sum(root.left)+sum(root.right);
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(12);
//        root.left=new Node(24);
//        root.right=new Node(36);
//        System.out.println(sum(root));
//    }
//}

//Q9. Traverse binary tree in postorder
//class Node
//{
//    int data;
//    Node left,right;
//    Node(int data)
//    {
//        this.data=data;
//        left=right=null;
//    }
//}
//class Tree2
//{
//    public static void postorder(Node root)
//    {
//        if(root==null)
//            return;
//        postorder(root.left);
//        postorder(root.right);
//        System.out.print(root.data+" ");
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(12);
//        root.left=new Node(24);
//        root.right=new Node(36);
//        postorder(root);
//    }
//}

//Q10. Insert a new node in the first available position
//class Node
//{
//    int data;
//    Node left,right;
//    Node(int data)
//    {
//        this.data=data;
//        left=right=null;
//    }
//}
//class Tree2
//{
//    public static Node insert(Node root, int value) {
//        Node newNode = new Node(value);
//
//        if (root == null) {
//            return newNode;
//        }
//
//        if (root.left == null) {
//            root.left = newNode;
//            return root;
//        }
//
//        if (root.right == null) {
//            root.right = newNode;
//            return root;
//        }
//
//        Node inserted = insert(root.left, value);
//        if (inserted != null) {
//            return root;
//        }
//
//        insert(root.right, value);
//        return root;
//    }
//
//    public static void preorder(Node root)
//    {
//        if(root==null)
//            return;
//        System.out.print(root.data+" ");
//        preorder(root.left);
//        preorder(root.right);
//    }
//    public static void main(String args[])
//    {
//        Node root=new Node(10);
//        root.left=new Node(20);
//        root.right=new Node(30);
//        preorder(root);
//        System.out.println();
//        insert(root,40);
//        preorder(root);
//    }
//}

/ABSTRACT CLASS (format):
// Abstract class
//abstract class Animal {
//    abstract void makeSound();
//    void eat() {
//        System.out.println("This animal eats food.");
//    }
//}
//class Dog extends Animal {
//    void makeSound() {
//        System.out.println("Bark");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.makeSound();
//        d.eat();
//    }
//}

//INTERFACE FORMAT :
interface Animal {
    void makeSound(); // abstract method
}
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();  // Output: Bark
    }
}

