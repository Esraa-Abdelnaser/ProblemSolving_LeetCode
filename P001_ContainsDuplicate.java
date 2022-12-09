package problemsolving_leetcode;

import java.util.*;

public class P001_ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setNums = new HashSet<Integer>();
        boolean chk = false;
        for (int i = 0; i < nums.length; i++) {
            if (setNums.contains(nums[i])) {
                chk = true;
                break;
            } else {
                setNums.add(nums[i]);
            }
        }
        return chk;

    }
}
//Time complexity is O(n^2)
/*
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
*/
