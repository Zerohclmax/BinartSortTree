package SortTree;

public class SortTree {
    public static void main(String[] args) {
        int[] arr = {7, 3, 10, 12, 5, 1, 9, 2};
        BinarTree tree = new BinarTree();
        for (int i : arr) {
            Node node = new Node(i);
            tree.add(node);
        }
        tree.in_orde();
    }
}

class BinarTree {
    Node root;

    public void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    public void in_orde() {
        if (root == null) {
            System.out.println("树为空");
        } else {
            root.in_order();
        }
    }
}

class Node {
    int value;
    Node Left;
    Node Right;

    public Node(int value) {
        this.value = value;
    }

    public void add(Node node) {
        if (node == null) {
            return;
        }
        if (this.value > node.value) {
            if (this.Left == null) {
                this.Left = node;
            } else {
                this.Left.add(node);
            }
        }
        if (this.value < node.value) {
            if (this.Right == null) {
                this.Right = node;
            } else {
                this.Right.add(node);
            }
        }

    }

    @Override
    public String toString() {
        return "Node{" +
                value +
                '}';
    }

    public void in_order() {
        if (this.Left != null) {
            this.Left.in_order();
        }
        System.out.println(this);
        if (this.Right != null) {
            this.Right.in_order();
        }
    }
}
