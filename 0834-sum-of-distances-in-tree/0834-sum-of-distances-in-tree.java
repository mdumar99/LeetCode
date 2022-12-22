class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        int[] res = new int[n];
        int[] count = new int[n];
        
        Map<Integer, List<Integer>> tree = new HashMap<>();
        
        for(int i=0; i<n; i++){
            tree.put(i, new ArrayList<>());
        }
        
        for(int[] edge : edges){
            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);
        }
        
        h1(tree, 0, -1, count, res);
        h2(tree, 0, -1, count, res);
        
        return res;
    }
    
    void h1(Map<Integer, List<Integer>> tree, int cur, int pre, int[] count, int[] res){
        count[cur] = 1;
        for(int i : tree.get(cur)){
            if(i==pre) continue;
            h1(tree, i, cur, count, res);
            count[cur] += count[i];
            res[cur] += res[i] + count[i];
        }
    }
    
    void h2(Map<Integer, List<Integer>> tree, int cur, int pre, int[] count, int[] res){
        for(int i : tree.get(cur)){
            if(i==pre) continue;
            res[i] = res[cur] - count[i] + count.length -count[i];
            h2(tree, i, cur, count, res);
        }
    }
}

