/**
* @author - Nathaniel Walker
* @version - 1.0
* date: 10/7/2020
*/

/**
* Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
*
* firstLast6([1, 2, 6]) --> true
* firstLast6([6, 1, 2, 3]) --> true
* firstLast6([13, 6, 1, 2, 3]) --> false
*/

package Array_1;

// First_Last_6 class
public boolean First_Last_6(int[] nums) {
	// for loop iterating through array
  	for (int i = 0; i < nums.length; i++) {
  		// if condition for meeting criteria of returning true
    		if (nums[0] == 6 || nums[nums.length - 1] == 6) {
      			return true;
    		}
  	}
  	// return false otherwise
  	return false;
}
