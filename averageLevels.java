/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> abc=new ArrayList<>();
        if(root==null)
            return abc;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.offer(root);
        q.offer(null);
        double sum=0;
        int count=0;
        double ans=0;
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp!=null){
              sum+=temp.val;
                count++;
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
                
            }
            else{
                if(!q.isEmpty()){
                    ans=sum/count;
                    abc.add(ans);
                    sum=0;
                    count =0;
                    q.offer(null);
                }
                
            }
        }
        ans=sum/count;
        abc.add(ans);
        return abc;
    }
}