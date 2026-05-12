import java.util.*;

public class LevelOrder {

    public static List<List<Integer>> levelorder(Node root){

        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<size; i++){
                Node curr = q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                list.add(curr.data);
            }
            res.add(list);
        }
        return res;

    }


}
