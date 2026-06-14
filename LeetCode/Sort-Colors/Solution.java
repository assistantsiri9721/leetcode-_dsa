1class Solution {
2    public void sortColors(int[] nums) {
3        
4        int i = 0,
5            j = nums.length - 1,
6            k = 0;
7        
8        while(k<=j) {
9            if(nums[k] == 1) {
10                k = k+1;
11            } else if(nums[k] == 2) {
12                int temp = nums[j];
13                nums[j] = nums[k];
14                nums[k] = temp;
15                j = j-1;
16            } else {
17                int temp = nums[i];
18                nums[i] = nums[k];
19                nums[k] = temp;
20                i = i+1;
21                k = k+1;
22            }
23        }
24    }
25}