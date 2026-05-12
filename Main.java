import java.util.*;


public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        System.out.println("Preorder Traversal:");
        Preorder.preorder(root);
        System.out.println();

        System.out.println("Inorder Traversal:");
        Inorder.inorder(root);
        System.out.println();

        System.out.println("Postorder Traversal:");
        Postorder.postorder(root);
        System.out.println();

        System.out.println("Level Order Traversal:");
        List<List<Integer>> res = LevelOrder.levelorder(root);
        for(List<Integer> list : res){
            for(int i : list){
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }
}
