class Node
{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinarySearch {

    Node root;

    BinarySearch()
    {
        root = null;
    }


    public Node insert(int data)
    {
        if(root == null)
        {
            root = new Node(data);
        }
        else if(data < root.data)
        {
            root.left = insert(data); 
        }
        else if(data > root.data)
        {
            root.right = insert(data);
        }

        return root;
    }

    Node search(Node root, int data) {
        // Base Cases: root is null or key is present at root
        if (root == null || root.data == data)
            return root;
 
        // Key is greater than root's key
        if (root.data < data)
            return search(root.right, data);
 
        // Key is smaller than root's key
        return search(root.left, data);
    }

    public static void main(String args[])
    {
        BinarySearch key = new BinarySearch();
        key.insert(8);
        key.insert(12);
        key.insert(10);
        key.insert(17);
    }
    
}