//Returns an Array of Running sums through the Array
//Author Liam Aspell 29/10/2020

public class runningSumOf1dArray {
        public int[] runningSum(int[] nums) {
            int[] newNums = new int[nums.length];
            for(int i = 0; i < nums.length; i++){
                if(i == 0){
                    newNums[i] = nums[i];
                }
                else{
                    for(int j = 0; j <= i; j++){
                        newNums[i] += nums[j];
                    }
                }
            }
            return newNums;
        }
    }
