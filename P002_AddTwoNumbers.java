
package problemsolving_leetcode;

public class P002_AddTwoNumbers {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return  arr;
    }
}

//Another solution with map
/*
class P002_AddTwoNumbers {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();  
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])) {
                arr[1] =  map.get(target - nums[i]);
                arr[0] =i;
                break;
            }
            map.put(nums[i], i);
    }
    return arr;
        }
}
*/