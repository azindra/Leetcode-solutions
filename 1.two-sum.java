import java.util.*;
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
      return new int[] {};
            
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
                int s= sc.nextInt();
                
                int[] arr = new int[s];
                for(int i =0;i<s;i++){
                    arr[i]= sc.nextInt();

                }
                int target = sc.nextInt();
                int[] result = twoSum(arr,target);
                System.out.println(Arrays.toString(result));
            
        }
        
    }


