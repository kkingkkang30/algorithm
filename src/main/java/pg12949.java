public class pg12949 {

    public static void main(String[] args) {
        //int[][]arr1 = new int[][]{{1, 4}, {3, 2},{4,1}};
       // int[][]arr2 = new int[][]{{3,3},{3,3}};
        int[][]arr1 = new int[][]{{2, 3,2}, {4, 2,4},{3,1,4}};
        int[][]arr2 = new int[][]{{5,4,3},{2,4,1},{3,1,1}};
        int[][] ans = solution(arr1,arr2);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(solution(arr1,arr2));
    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {

        //[[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]	[[15, 15], [15, 15], [15, 15]]
        //[[2, 3, 2], [4, 2, 4], [3, 1, 4]]	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	[[22, 22, 11], [36, 28, 18], [29, 20, 14]]
        int[][] answer = new int[arr1.length][arr2[0].length];

        int arrR = arr1.length;
        int arr2R = arr2.length;
        int arr2C = arr2[0].length;

            for (int i = 0; i < arrR; i++) {
                for (int j = 0; j < arr2C; j++) {
                    for (int k = 0; k < arr2R; k++) {
                        answer[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
        return answer;
    }
}
