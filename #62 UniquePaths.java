class Solution {
    public int uniquePaths(int m, int n) {
        
//         Approach-1: Recursion
        
//         if(m == 1 || n == 1)
//             return 1;
        
//         return (uniquePaths(m-1, n) + uniquePaths(m, n-1));
        
//         APproach-2: DP
        
//         int[][] storage = new int[m+1][n+1];
        
//         for(int i=1; i<storage.length; i++){
//             for(int j=1; j<storage[0].length; j++){
//                 if(i == 1 || j == 1){
//                     storage[i][j] = 1;
//                 }
//                 else{
//                     storage[i][j] = storage[i-1][j] + storage[i][j-1];
//                 }
//             }
//         }
//         return storage[m][n];
        
//         Approach-3: Combinations
        
        int num = m+n-2;
        int r = m-1;
//         Calculating (num)C(r):
        double res = 1;
        for(int i=1; i<=r; i++){
            res = (res * (num-r+i))/i;
        }
        return (int)res;
    }
}
