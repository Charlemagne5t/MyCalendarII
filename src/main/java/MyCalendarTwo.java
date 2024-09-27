class MyCalendarTwo {
    Node root;

    public MyCalendarTwo() {

    }

    public boolean book(int start, int end) {
        Node res = insert(start, end, root);
        if (root == null) {
            root = res;
        }
        return res != null;
    }

    Node insert(int start, int end, Node node) {
        if (node == null) {
            node = new Node(start, end);
            return node;
        }
        if ((start >= node.start && start < node.end) || (end > node.start && end < node.end)) {
            return null;
        } else if (end <= node.start) {
            Node temp = insert(start, end, node.left);
            if (temp != null && node.left == null) {
                node.left = temp;
            }
            return temp;
        } else if (start >= node.end) {
            Node temp = insert(start, end, node.right);
            if (temp != null && node.right == null) {
                node.right = temp;
            }
            return temp;
        }
        return null;
    }
}


class Node {
    int start;
    int end;
    Node left;
    Node right;


    public Node(int start, int end) {
        this.start = start;
        this.end = end;
    }
}