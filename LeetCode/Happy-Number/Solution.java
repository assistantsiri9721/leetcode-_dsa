1class Solution {
2
3    int squareOfDigits(int n) {
4            int sum = 0; 
5            while(n>0) {
6            int rem = n % 10;
7            sum = sum + (rem * rem);
8            n = n /10;
9        }
10        return sum;
11    }
12        
13    public boolean isHappy(int n) {
14
15        int slow = n,
16            fast = n;
17
18        while(fast != 1) {
19            slow =  squareOfDigits(slow);
20            fast =  squareOfDigits(squareOfDigits(fast));
21
22            if(fast == 1) {
23                return true;
24            } 
25            if (fast == slow) {
26                // break;
27                return false;
28            }
29        }  
30
31        return true;
32        
33    }
34}