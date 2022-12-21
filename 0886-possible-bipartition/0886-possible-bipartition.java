class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] cl = new int[n];
        List<Set<Integer>> adjList = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            adjList.add(new HashSet<>());
        }
        
        for(int[] dislike : dislikes){
            int u = dislike[0] - 1;
            int v = dislike[1] - 1;
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        
        for(int i=0; i<n; i++){
            if(cl[i]==0){
                cl[i] = 1;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                while(!queue.isEmpty()){
                    int cur = queue.remove();
                    for(int next : adjList.get(cur)){
                        if(cl[next]==0){
                            cl[next] = -cl[cur];
                            queue.add(next);
                        }else if(cl[next]==cl[cur]){
                            return false;
                        }
                    }
                }
            }
        }
        
        return true;
    }
}

