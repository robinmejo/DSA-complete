package Classes;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
    public static int romanToInteger(String s){
        Map<Character, Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=0;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i+1<s.length() && map.get(s.charAt(i+1))>map.get(c)){
                n+=map.get(s.charAt(i+1))-map.get(c);
                i+=1;
            }
            else{
                n+=map.get(c);
            }

        }
        return n;
    }
    public static boolean isPalindrome(int x) {
        if(x==0){
            return true;
        }
        if(x<0 || x % 10==0){
            return false;
        }
        int reverse_int=0;
        //121
        while (x > reverse_int){
            //pop=1,2,1
            int pop=x%10;
            //12,1,0
            x=x/10;
            //reverse_int=1,12
            reverse_int=(reverse_int * 10)+pop;
        }
        if(x==reverse_int || x==(reverse_int/10)){
            return true;
        }
        else{
            return false;
        }
    }
}
