import java.util.*;


class Node
{
    int data;
    Node left, right;


    public Node(int item)
    {
        data = item;
        left = right = null;
    }


}


class treeOps
{
    Node root;


    public treeOps(Node root)
    {
        this.root = root;
    }


   


    void preorder(Node node)
    {
        if (node == null)
            return;


        System.out.print(node.data + " "); //n
        preorder(node.left); //l
        preorder(node.right); //r
    }


    void inorder(Node node)
    {
        if (node == null)
            return;


       
        inorder(node.left); //l
        System.out.print(node.data + " "); //n
        inorder(node.right); //r
    }


    void postorder(Node node)
    {
        if (node == null)
            return;


       
        postorder(node.left); //l
       
        postorder(node.right); //r


        System.out.print(node.data + " "); //n
    }


    public void levelOrderTraversal(Node root)
    {
        if (root == null)
        {
            return;
        }


        Queue<Node> queue = new LinkedList<>();
        queue.add(root);


        while (!queue.isEmpty())
        {
            Node currentNode = queue.poll();
            System.out.print(currentNode.data + " ");


            if (currentNode.left != null)
            {
                queue.add(currentNode.left);
            }


            if (currentNode.right != null)
            {
                queue.add(currentNode.right);
            }
        }
    }
}


public class Tree
{
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


System.out.println("traversal of binary tree is:");


        treeOps tree = new treeOps(root);
        System.out.println("levelorder traversal of binary tree is:");
        tree.levelOrderTraversal(root);
    }
}
