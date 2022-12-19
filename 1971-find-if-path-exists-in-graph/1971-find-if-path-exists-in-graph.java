class Solution {
    int[] arr;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i;
        }
        for(int[] x: edges){
            arr[find(x[0])] = find(x[1]);
        }
        return find(source)==find(destination);
    }
    
    public int find(int x){
        if(arr[x]!=x){
            arr[x] = find(arr[x]);
        }
        return arr[x];
    }
}