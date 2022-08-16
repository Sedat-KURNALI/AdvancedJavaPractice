package TECHNOSTUDY_USA.day99.Replit.ReplitMethod;

public class ReplitMethod13 {
    /*
        Create method name is minCostClimbingStairs
        parameter is int array
        return type is int
        On a staircase, the i-th step has some (non-negative cost) cost[i] assigned (0 indexed).
        Once you pay the cost, you can either (climb one or two steps).
        You need to find (minimum cost) to reach (the top) of the floor,
        and you can either (start from the step with index 0, or the step with index 1).

        Example 1:
        Input: cost = [10, 15, 20]
        Output: 15
        Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
        ----------------------------------------
        Example 2:
        Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
        Output: 6
        Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
        -----------------------------------------------
        Note:
        cost will have a length in the range [2, 1000].
        Every cost[i] will be an integer in the range [0, 999].

        i-th step (non-negative cost) cost[i] =  (0 indexed).
        Once you pay the cost, you can either (climb one or two steps).
        You need to find (minimum cost) to reach (the top) of the floor,
        and you can either (start from the step with index 0, or the step with index 1).
        */
/*
        Input: cost = [10, 15/, 20]  length:3
		                   i=1   2   s3
		Output: 15
        Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
        ----------------------------------------
        Example 2:
        Input: cost = [1, 100, 1, [1], 1, 100, 1, 1, 100, 1]
                       i  +1  +2  +3
        Output: 6
        Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[3].
 */
/*
    public static int minCostClimbingStairs(int[] cost) { //i=1 cost 2 /  /
        int count = 0;
        if (cost.length >= 2 && cost.length <= 1000)
            for (int i = 0; i < cost.length; i++) {
                if (cost[i] != 0 && cost[i] >= 0 && cost[i] <= 999 && i + 2 < cost.length) {
                    if (cost[i] <= cost[i + 1]) {
                        if (cost[i] + cost[i + 2] > cost[i + 1]) {
                            count += cost[i + 1];
                        } else {
                            count += cost[i];

                        }
                    } else {
                        count += cost[i + 1];
                        i++;
                    }
                }
            }
        return count;
    }
    */

// solution:1
    public static int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] arr = new int[len];
        arr[0] = cost[0];
        arr[1] = cost[1];
        for (int i = 2; i < len; i++) {
            arr[i] = Math.min(arr[i - 1]+ cost[i], arr[i - 2] + cost[i]);
        }
        return Math.min(arr[len - 1], arr[len - 2]);
    }
    public static void main(String[] args) {
        int[] cost1 = {10, 15, 20};
        //int[] cost2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(cost1));
        //System.out.println(minCostClimbingStairs(cost2));
    }
    /*-------------  solution:2 ------------------------
    public static int minCostClimbingStairs(int[] arr){
        int first=0;
        int second=0;
        for(int i=0; i<arr.length;i++){
            int recent=arr[i]+Math.min(first,second);
            first=second;
            second=recent;
        }
        return Math.min(first,second);
    }
    ---------------------------------------------------*/

    /*---------- solution:3---------------------------
    public int minCostClimbingStairs(int[] i1){
        int total = 0 ;
        for(int i = -1 ; i<i1.length; ){
            if(i+2 >= i1.length) {
                break;
            }else if(i1[i+1]<i1[i+2]){
                total += i1[i+1];
                i=i+1;
            }else if(i1[i+1]>i1[i+2]){
                total += i1[i+2];
                i = i+2;
            }
        }
        return total;
  }
  -------------------------------------------------*/
}
