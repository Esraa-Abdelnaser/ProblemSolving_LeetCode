/*
Time Limit Exceeded
308 / 311 test cases passed
*/

package problemsolving_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P005_3Sum {
     public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> listOfTripleList = new ArrayList<>();
        int a=0, b=0, c=0;
        Arrays.sort(nums);
    
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1;k<nums.length;k++){
                    a = nums[i];
                    b = nums[j];
                    c = nums[k];
                    
                    if (a+b+c==0){
                        // Creating innerList 
                        List<Integer> triples = new ArrayList<>();
                        triples.add(a);
                        triples.add(b);
                        triples.add(c);
                        if(listOfTripleList.contains(triples)){
                            continue;
                        } else {
                            listOfTripleList.add(triples);
                        } 
                    }
                }            
            }
        }
        return listOfTripleList; 
    }
}
