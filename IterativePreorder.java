import java.util.*;
public class IterativePreorder {
    public static void prerorder(Node root){
        if(root == null) return;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node curr = s.pop();
            System.out.print(curr.data+" ");
            if(curr.right!=null){
                s.push(curr.right);
            }
            if(curr.left!=null){
                s.push(curr.left);
            }
            
        }
    }
}
