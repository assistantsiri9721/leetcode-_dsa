1class Solution {
2
3        public int[] twoSum(int[] nums, int target) {
4
5            for (int i=0; i<nums.length; i++){
6
7                for(int j =i+1; j<nums.length; j++){
8
9                    if(nums[i] + nums[j] == target){
10                        return new int[] {i, j};
11                    }
12                }
13            }
14        
15
16            return new int [] {};
17
18        }
19}
20
21       
22        
23    
24        
25    
26