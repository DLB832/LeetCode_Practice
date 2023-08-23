/*
 * ACCEPTED.
 * Complexity: O(n^2)
 * Runtime: 33ms
 * Memory: 43.9 MBs
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        //for each element in the nums array, we need to check the sum of that element and each other element. Should return the INDICIES of the array and NOT the values
        int i = 0;
        int j = 1; //j starts at 1 since we do not want to ever add the same element
        int result1 = 0;
        int result2 = 0;
        while (i < nums.length) {
            j = i + 1; //reset j to be the next indicy past i
            while (j < nums.length) {
                if (nums[i] + nums[j] == target){
                    result1 = i;
                    result2 = j;
                }
                j++;
            }
            i++;
        }
        //needs to return an int[] with the values in any order. 
        int [] solution = new int[2]; // new array of size 2
        solution[0] = result1; 
        solution[1] = result2;
        return solution;
    }
}