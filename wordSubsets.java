class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] newc=count("");
        for(String x:B){
            int [] temp= count(x);
            for(int i=0;i<26;i++){
                newc[i]=Math.max(temp[i],newc[i]);
            }
        }
        
        List<String> ans=new ArrayList();
        search: for (String a: A) {
            int[] aCount = count(a);
            for (int i = 0; i < 26; ++i)
                if (aCount[i] < newc[i])
                    continue search;
            ans.add(a);
        }

        return ans;
    }
    public int[] count(String B){
            int arr[]=new int[26];
            for(int i=0;i<B.length();i++){
             arr[B.charAt(i)-'a']+=1;    
            }
        return arr;
    }
}